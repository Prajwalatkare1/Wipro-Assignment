import React, { Component } from "react";
import MenuItem8 from "./MenuItem8";

class Restaurant8 extends Component {
  render() {
    return (
      <div style={{ margin: "30px" }}>
        <h2>Restaurant Name: Spice Hub</h2>
        <p>Location: Block B, First Floor</p>
        <p>Open Hours: 10:00 AM - 10:00 PM</p>

        <h3>Restaurant Menu:</h3>
        <ul>
          <MenuItem8 name="Paneer Butter Masala" price={150} category="Main Course" available={true} />
          <MenuItem8 name="Chicken Biryani" price={200} category="Main Course" available={true} />
          <MenuItem8 name="Masala Dosa" price={80} category="Breakfast" available={true} />
          <MenuItem8 name="Gulab Jamun" price={40} category="Dessert" available={false} />
          <MenuItem8 name="Veg Thali" price={120} category="Combo" available={true} />
        </ul>
      </div>
    );
  }
}

export default Restaurant8;
