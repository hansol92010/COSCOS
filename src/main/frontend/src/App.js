import "./App.css";
import "./Reset.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import Header from "./components/layout/Header";
import Footer from "./components/layout/Footer";
import Login from "./pages/Login";
import { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [cosmetic, setCosmetic] = useState([]);

  useEffect(() => {
    axios
      .get("/coscos")
      .then((response) => setCosmetic(response.data))
      .catch((error) => console.log(error));
  }, []);

  return (
    <BrowserRouter>
      <Header />
      <Routes>
        <Route path="/" element={<Home cosmetic={cosmetic} />} />
        <Route path="/member/login" element={<Login />} />
      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
