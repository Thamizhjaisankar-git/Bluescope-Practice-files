import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Counter from './Component/Counter'
import Users from './Component/Users'
import FetchAPI from './Component/FetchAPI'
import XMR from './Component/XHR'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
          {/* <h1>Helloo..</h1> */}
          <Counter />
          <user-card name="Thamizh" email="thamizh@example.com"></user-card>
          <hr></hr>
          <Users name="Thamizh" age="22" city="Chennai" />
          <FetchAPI />
          <XMR />
      </div>
      
    </>
  )
}

export default App
