import { useState, useEffect } from "react";
import axios from "axios";

export default function Login() {
  const [username, setU] = useState("");
  const [password, setP] = useState("");

  const login = async () => {
    const res = await axios.post("http://localhost:8080/login", {
      username,
      password
    });

    if (res.data.token) {
      localStorage.setItem("token", res.data.token);
      alert("Login successful!");
    } else {
      alert("Invalid credentials");
    }
  };


  return (
    <div>
      <h2>Login</h2>
      <input placeholder="Username" onChange={e => setU(e.target.value)} />
      <input placeholder="Password" onChange={e => setP(e.target.value)} />
      <button onClick={login}>Login</button>
    </div>
  );
}

