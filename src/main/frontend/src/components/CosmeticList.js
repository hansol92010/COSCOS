import React from "react";
import CosmeticItem from "./CosmeticItem";

export default function CosmeticList({ cosmetics }) {
  return (
    <section className="cosmetics">
      <h2>최신 상품</h2>
      <div className="cosmeticList_box">
        {cosmetics &&
          cosmetics.map((item) => (
            <CosmeticItem key={item.productNo} cosmetic={item} />
          ))}
      </div>
    </section>
  );
}
