import React, { Component } from "react";

class MenuItem8 extends Component {
  render() {
    const { name, price, category, available } = this.props;
    return (
      <li>
        {name} - ₹{price} ({category}){" "}
        {available ? "Available" : "Not Available"}
      </li>
    );
  }
}

export default MenuItem8;
