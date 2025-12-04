import { useState } from 'react'
import './App.css'
import Counter from './Component/Counter'
import Users from './Component/Users'
import FetchAPI from './Component/FetchAPI'
import XMR from './Component/XHR';
import User-card from './Component/User-card';

function App() {

  return (
    <>
      <div>
          <Counter />
          <User-card name="Thamizh" email="thamizh@example.com">Hello..</User-card>
          <hr></hr>
          <Users name="Thamizh" age="22" city="Chennai" />
          <FetchAPI />
          <XMR />
      </div>
      
    </>
  )
}

export default App
