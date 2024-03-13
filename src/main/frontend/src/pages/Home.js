import React from "react";
import CosmeticList from "../components/CosmeticList";

export default function Home() {
  const filename = "innisfree_bija(18000).jpg";
  return (
    <div id="content">
      <div className="container">
        <div className="row">
          <div className="cosmetic_latest">
            <CosmeticList filename={filename} />
          </div>
          <div className="cosmetic_best">
            <CosmeticList filename={filename} />
          </div>
        </div>
      </div>
    </div>
  );
}
