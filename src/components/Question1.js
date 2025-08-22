import React from "react";


function GroceryList({items}){
  return (
    <div>
      <h1>Groceries List :</h1>
      <ul>
        {items.map((item, index) => (
          <li key={index}>{item}</li> // each list item has a unique key
        ))}
      </ul>
      <button onClick={() => alert("Groceries Added to Cart!")}>
        Add to Cart
      </button>

      
    </div>
  );
}

export default GroceryList;