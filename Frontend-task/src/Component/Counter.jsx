import { useEffect, useState } from "react";

function Counter(){
    const [count,setCount] = useState(0);
    const [name, setName] = useState("Thamizh");

    useEffect(() => {
        console.log("count mounted!")
    },[])

    useEffect(() => {
        console.log("count changed!")
    },[count])

    useEffect(() => {
        return () => {
            console.log("Component will Unmount");
        };
    },[count])

    return(
        <>
            <h1>Counter: {count}</h1>
            <button style={{backgroundColor:"purple", color:"white",marginBottom:"30px"}} onClick={() => setCount(count+1)}>click me</button>
            <p onClick={() => setName("chen")}>{name}</p>
        </>
    );
}
export default Counter;