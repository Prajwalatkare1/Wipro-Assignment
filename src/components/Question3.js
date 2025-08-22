import React, { useState } from "react";

const Question = () => {
  // Initial phone details
  const [phone, setPhone] = useState({
    brand: "Apple",
    model: "iPhone 15",
    price: 79999,
  });

  // Function to increase price
  const increasePrice = () => {
    setPhone({ ...phone, price: phone.price + 1000 }); // Increase by ₹1000
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1> Phone Details</h1>
      <h3>Brand: {phone.brand}</h3>
      <h3>Model: {phone.model}</h3>
      <h3>Price: ₹{phone.price}</h3>
      <button
        onClick={increasePrice}
        style={{
          backgroundColor: "dodgerblue",
          color: "white",
          padding: "10px 20px",
          fontSize: "16px",
          border: "none",
          borderRadius: "8px",
          cursor: "pointer",
        }}
      >
        Increase Price
      </button>
    </div>
  );
};

export default Question;
