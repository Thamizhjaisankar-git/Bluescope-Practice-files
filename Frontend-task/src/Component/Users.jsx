function Users(props){
    return(
        <>
        <h2>This is props</h2>
        <div style={{backgroundColor:"lightgreen", padding:"20px 50px",marginTop:"30px",borderRadius:"10px"}}>
            <h2>Name: {props.name}</h2>
            <p>Age: {props.age}</p>
            <p>city: {props.city}</p>
        </div>
        
           
        </>
    );
}
export default Users;