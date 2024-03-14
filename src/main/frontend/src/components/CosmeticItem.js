import React from "react";

export default function CosmeticItem({ cosmetic }) {
  return (
    <article className="cosmeticItem">
      <div className="cosmeticItem_img">
        <img
          src={`/coscos/display?filename=${cosmetic.fileName}.jpg`}
          alt="test"
        />
      </div>
      <div className="cosmeticItem_info">
        <div className="cosmeticItem_price">{cosmetic.productPrice}</div>
        <div className="cosmeticItem_name">{cosmetic.productName}</div>
      </div>
    </article>
  );
}
