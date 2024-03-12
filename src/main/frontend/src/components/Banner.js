import React from "react";

export default function Banner() {
  const env = process.env;
  env.PUBLIC_URL = env.PUBLIC_URL || "";

  return (
    <section id="banner">
      <div className="container">
        <div className="banner">
          <img
            src={`${env.PUBLIC_URL}/assets/img/cosmetic_banner01.jpg`}
            alt="banner01"
          />
        </div>

        <div className="row"></div>
      </div>
    </section>
  );
}
