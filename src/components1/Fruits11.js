import React, { Component } from "react";//We import Component because we’re making a class component (Fruits) which extends Component

// Functional Component - displays the list  this is a child component 
function FruitList({ fruits }) {  // takes fruits as props from parent Fruits
  return (
    <div>
      <h3>FruitList</h3>
      <ul>
        {fruits.map((fruit, index) => (  //arrow function (used to make code shorter and cleaner)
          <li key={index}>{fruit}</li>  //keys help React identify items uniquely in a list.
        ))}
      </ul>
    </div>
  );
}

// Class Component - manages state
class Fruits extends Component {  //parent component (it manages the state fruitlist and text input)
  constructor(props) { // constructore runs first when the component is created 
    super(props); // calls parent class constructor
    this.state = {   //(state is like a memory)
      fruits: ["Apple", "Banana", "Orange"],
      newFruit: ""
    };
  }

  handleChange = (event) => {
    this.setState({ newFruit: event.target.value });
  };
// runs when user clicks the button
  addFruit = () => {   
    if (this.state.newFruit.trim() !== "") { //first checks that input is not empty
      this.setState((prevState) => ({
        fruits: [...prevState.fruits, prevState.newFruit],
        newFruit: ""
      }));
    } //new fruits will get added dynamically
  };

  render() { //it describes whtat should appear on screen
    return (
      <div>
        <h2>Fruits</h2>
        <input
          type="text"
          value={this.state.newFruit}
          onChange={this.handleChange}  //onChange is a React event handler for input elements handleChange is a method in our class.

//It receives an event object (automatically passed by React when the input changes)//
          placeholder="Enter fruit"
        />
        <button onClick={this.addFruit}>Add</button>   {/*calls method to add fruit*/}

        {/* Pass fruits array to child */}
        <FruitList fruits={this.state.fruits} />
      </div>
    );
  }
}

export default Fruits;

//Difference between functional and class components here?//

{/*Class (Fruits) → manages state and logic.

Functional (FruitList) → just receives props and displays them */}
