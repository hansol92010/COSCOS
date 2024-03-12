import React from "react";
import { Link } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faTwitter,
  faFacebook,
  faInstagram,
  faYoutube,
} from "@fortawesome/free-brands-svg-icons";

export default function Footer() {
  const env = process.env;
  env.PUBLIC_URL = env.PUBLIC_URL || "";

  return <footer id="footer"></footer>;
}
