import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Counter from './Component/Counter'
import Users from './Component/Users'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
          {/* <h1>Helloo..</h1> */}
          <Counter />
          <hr></hr>
          <Users name="Thamizh" age="22" city="Chennai" />
      </div>
      
    </>
  )
}

export default App
