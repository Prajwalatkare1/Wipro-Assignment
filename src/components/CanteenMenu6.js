import React from "react";
import CanteenItem from "./CanteenItem6";

const CanteenMenu = () => {
  return (
    <div style={{ margin: "20px", fontFamily: "Arial" }}>
      <h2>Canteen Name: Campus Food Court</h2>
      <p>Location: Block A, Ground Floor</p>
      <p>Open Hours: 8:00 AM - 8:00 PM</p>

      <h3>Canteen Menu:</h3>
      <ul>
        <CanteenItem name="Idli" price={30} category="Breakfast" available={true} />
        <CanteenItem name="Dosa" price={50} category="Breakfast" available={true} />
        <CanteenItem name="Vada" price={20} category="Snack" available={false} />
        <CanteenItem name="Poori" price={40} category="Breakfast" available={true} />
        <CanteenItem name="Meals" price={120} category="Lunch" available={true} />
      </ul>
    </div>
  );
};

export default CanteenMenu;
