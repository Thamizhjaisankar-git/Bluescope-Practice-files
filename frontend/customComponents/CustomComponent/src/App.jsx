import './App.css'
import CustomButton from './CustomBotton'

function App() {
  function handleSubmit(){
    alert("The button is clicked!");
  }

  return (
    <>
       <div>
        <h1>hello..</h1>
        <CustomButton label="Click me!" onClick={handleSubmit} />
        <CustomButton label="Save" backgroundColor="lightgreen" onClick={handleSubmit} />
       </div>
    </>
  )
}

export default App
