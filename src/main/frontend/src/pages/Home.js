import React from "react";
import CosmeticList from "../components/CosmeticList";

export default function Home({ latestCosmetics, salesCosmetics }) {
  return (
    <div id="content">
      <div className="container">
        <div className="row">
          <div className="cosmetic_latest">
            <CosmeticList cosmetics={latestCosmetics} />
          </div>
          <div className="cosmetic_best">
            <CosmeticList cosmetics={latestCosmetics} />
          </div>
        </div>
      </div>
    </div>
  );
}
