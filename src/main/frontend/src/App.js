import axios from "axios";
import { useEffect, useState } from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";

import "./App.css";
import "./Reset.css";

import Home from "./pages/Home";
import Header from "./components/layout/Header";
import Footer from "./components/layout/Footer";
import Login from "./pages/Login";

function App() {
  const [latestCosmetics, setLatestCosmetics] = useState([]);
  const [salesCosmetics, setSalesCosmetics] = useState([]);

  useEffect(() => {
    const latest = async () => {
      axios
        .get("/coscos/latest")
        .then((response) => setLatestCosmetics(response.data))
        .catch((error) => console.log(error));
    };
    latest();
  }, []);

  return (
    <BrowserRouter>
      <Header />
      <Routes>
        <Route path="/" element={<Home latestCosmetics={latestCosmetics} />} />
        <Route path="/coscos/login" element={<Login />} />
      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
