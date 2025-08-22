import React from "react";

const CanteenItem = ({ name, price, category, available }) => {
  return (
    <li>
      {name} - Price: ₹{price} – Category: {category} –{" "}
      {available ? "Available" : "Not Available"}
    </li>
  );
};

export default CanteenItem;
