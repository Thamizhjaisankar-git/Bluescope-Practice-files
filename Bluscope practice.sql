CREATE DATABASE Bluescope;

use Bluescope;

CREATE TABLE Bluescope_Trainees(
trainee_id int primary key,
Name varchar(30) not null, 
DOB date not null, 
YOP year not null, 
Mobileno varchar(15) unique,
email varchar(100) unique,
date_of_join datetime,
gender enum("Male","Female","other"),
isActive boolean default true,
skillsets set('Python','Java','React','SQL'));

INSERT INTO Bluescope_Trainees 
(trainee_id, Name, DOB, YOP, Mobileno, email, date_of_join, gender, isActive, skillsets) VALUES
(1, 'Thamizh', '2003-05-15', 2024, '9876543210', 'thamizh@gmail.com', '2025-01-10 09:30:00', 'Female', true, 'Java,SQL'),
(2, 'Priya', '2002-11-22', 2023, '9876501234', 'priya@gmail.com', '2025-02-05 10:15:00', 'Female', true, 'Python,React,SQL'),
(3, 'Arun', '2001-03-12', 2022, '9998877665', 'arun@gmail.com', '2025-03-01 08:45:00', 'Male', false, 'Java,Python'),
(4, 'Keerthana', '2003-09-08', 2024, '8907654321', 'keerthana@gmail.com', '2025-01-20 11:00:00', 'Female', true, 'React,SQL'),
(5, 'Vijay', '2002-07-25', 2023, '9001234567', 'vijay@gmail.com', '2025-02-15 09:00:00', 'Male', true, 'Python,Java,React');


SELECT * FROM Bluescope_Trainees;

SELECT * FROM Bluescope_Trainees WHERE Name LIKE "%a%";

SELECT Name, DOB FROM Bluescope_Trainees WHERE isActive;

UPDATE Bluescope_Trainees SET DOB='2003-09-11' WHERE Name="Thamizh";

SELECT * FROM Bluescope_Trainees WHERE Name = "Thamizh";

-- add column-- 
ALTER TABLE Bluescope_Trainees ADD COLUMN Completion_status enum("To Do", "Doing","Done");
-- drop column-- 
ALTER TABLE Bluescope_Trainees DROP COLUMN Completion_status;
-- add col with int data type
ALTER TABLE Bluescope_Trainees ADD COLUMN score int;
-- modify the datatype of score coln
ALTER TABLE Bluescope_Trainees MODIFY score double;
-- change the coln name and datatype
ALTER TABLE Bluescope_Trainees CHANGE COLUMN score grade int;

ALTER TABLE Bluescope_Trainees ADD CONSTRAINT PK_KEY UNIQUE KEY(grade);

ALTER TABLE Bluescope_Trainees drop grade;

SELECT * FROM Bluescope_Trainees WHERE isActive and gender = "Female";


create table dummy(
dummy_id int primary key, 
name varchar(30), 
age int, 
trainee_id int, 
foreign key(trainee_id) references Bluescope_Trainees(trainee_id));

insert into dummy values(101, "Thamizh", 22, 1),(102, "Priya", 23, 2);
select * from dummy;
select * from Bluescope_Trainees;
select b.trainee_id, b.Name, d.age from Bluescope_Trainees b join dummy d on b.trainee_id = d.trainee_id;
select b.trainee_id, b.Name, d.age from Bluescope_Trainees b left join dummy d on b.trainee_id = d.trainee_id;
select b.trainee_id, b.Name, d.age from Bluescope_Trainees b right join dummy d on b.trainee_id = d.trainee_id;
-- ..............
alter table dummy add column age int;
insert into dummy (name, age) values("Thamizh",28),("sang yan",25);
select * from dummy;
delete from dummy;
delete from dummy where name="sang yan";

drop table dummy;
select * from dummy;

drop table Bluescope_Trainees; 