import React from "react";
import GroceryList from "./components/Question1";
import Car from "./components/Question2";
import Question from "./components/Question3";
import SweetsList from "./components/Question4";
import JuiceList7 from "./components/JuiceList7";
import Restaurant8 from "./components/Restaurant8";

import './App.css';
import Electronics from "./components/Question5";
import CanteenMenu from "./components/CanteenMenu6";
import TempleList9 from "./components/TempleList9";
import TailorShop from "./components/TailorShop10";

function App() {
  const groceries = ["rice", "wheat", "sugar", "milk", "oil"];

  return (
    <div className="App">
      {/* Question 1 Code Output */}
      <h2>Grocery List</h2>
      <GroceryList items={groceries} />

      {/* Question 2 Code Output */}
      <h2>Car Details</h2>
      <Car brand="Toyota" model="Fortuner" color="Black" year="2022" />

      {/* Question 3 code output*/}
      <Question/>

       {/* Question4code output*/}
       <SweetsList />

       {/*Question 5 code output*/}
       <Electronics/>

      { /*Question 6 code output*/}
      <CanteenMenu/>

      { /*Question 7output*/}
      <JuiceList7/>

      {/* Question 8 code output*/}
      <Restaurant8/>

      {/* question 9 code output*/}
      <TempleList9/>

      {/* question 10 code output*/}
      <TailorShop/>


    </div>
  );
}

export default App;
