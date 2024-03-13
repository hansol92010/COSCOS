import React from "react";

export default function CosmeticItem({ filename }) {
  return (
    <article className="cosmeticItem">
      <div className="cosmeticItem_img">
        <img src={`/coscos/display?filename=${filename}`} alt="test" />
      </div>
      <div className="cosmeticItem_info">
        <div className="cosmeticItem_price">15,000</div>
        <div className="cosmeticItem_name">블루베리 토너</div>
      </div>
    </article>
  );
}
