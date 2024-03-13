import React from "react";
import CosmeticItem from "./CosmeticItem";

export default function CosmeticList({ filename }) {
  return (
    <section className="cosmetics">
      <h2>최신 상품</h2>
      <div className="cosmeticList_box">
        <CosmeticItem filename={filename} />
        <CosmeticItem filename={filename} />
        <CosmeticItem filename={filename} />
        <CosmeticItem filename={filename} />
      </div>
    </section>
  );
}
