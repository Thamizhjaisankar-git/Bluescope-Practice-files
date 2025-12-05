import express from "express";
import rateLimit from "express-rate-limit";

const app = express();

const apiLimiter = rateLimit({
  windowMs: 1 * 60 * 1000,    
  max: 60,                    
  message: "Too many requests, please try again after a minute."
});

app.use("/api/", apiLimiter);

app.get("/api/restaurants", (req, res) => {
  res.json({ message: "Restaurant list" });
});

app.listen(3000, () => console.log("Server running"));




