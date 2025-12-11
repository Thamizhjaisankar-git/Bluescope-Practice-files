import axios from "axios";

export default function Secure() {
  const secureCall = async () => {
    const token = localStorage.getItem("token");

    const res = await axios.get("http://localhost:8080/secure", {
      headers: { Authorization: `Bearer ${token}` }
    });

    alert(res.data);
  };

  return (
    <div>
      <h2>Protected API</h2>
      <button onClick={secureCall}>Call Secure API</button>
    </div>
  );
}
