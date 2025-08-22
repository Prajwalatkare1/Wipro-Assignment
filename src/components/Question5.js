import React, { useState } from "react";

const Electronics = () => {
  // useState hooks for item details
  const [name, setName] = useState("Laptop");
  const [brand, setBrand] = useState("Dell");
  const [price, setPrice] = useState(5500);

  // function to change brand
  const changeBrand = () => {
    setBrand("HP");
  
  };

  // function to increase price
  const increasePrice = () => {
    setPrice(price + 500); // increases price by ₹500
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h2>Electronic Item Details</h2>
      <p>
        <strong>Name:</strong> {name}
      </p>
      <p>
        <strong>Brand:</strong> {brand}
      </p>
      <p>
        <strong>Price:</strong> ₹{price}
      </p>

      <button onClick={changeBrand} style={{ marginRight: "10px" }}>
        Change Brand
      </button>
      <button onClick={increasePrice} style={{ backgroundColor: "blue", color: "white" }}>
        Increase Price
      </button>
    </div>
  );
};

export default Electronics;
