import Login from "./Login";
import Secure from "./Secure";
import './App.css'
import CustomLogo from "./CustomLogo";

function App() {

  return (
    <>
     <h1>hello..</h1>
      <div>
        <CustomLogo /><br/>
        <CustomLogo style={{backgroundColor:"green", color:"white"}}>JL</CustomLogo><br/>
        <CustomLogo src="/admin1.png" />
        {/* <Login />
        <hr />
        <Secure /> */}
      </div>
    </>
  )
}

export default App
