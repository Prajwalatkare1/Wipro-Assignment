import React, { Component } from "react";

//  Functional Component 
// Child component that only displays the list of television models
function TelevisionList({ models }) {
  return (
    <div>
      <h3>Television Models</h3>
      <ul>
        {models.map((model, index) => (
          <li key={index}>{model}</li>
        ))}
      </ul>
    </div>
  );
}


//  Class Component 
// Parent component that manages state (list of models + input box)
class TelevisionManager extends Component {
  constructor(props) {
    super(props);
    // Initial state with a few default models
    this.state = {
      models: ["Samsung QLED", "LG OLED", "Sony Bravia"],
      newModel: "" // input box value
    };
  }

  // Update newModel in state whenever user types in input box
  handleChange = (event) => {
    this.setState({ newModel: event.target.value });
  };

  // Add a new model to the list when "Add" button is clicked
  addModel = () => {
    if (this.state.newModel.trim() !== "") {
      this.setState((prevState) => ({
        // Spread operator copies old models, then adds the new one
        models: [...prevState.models, prevState.newModel],
        newModel: "" // clear input box
      }));
    }
  };

  render() {
    return (
      <div>
        <h2>Television Manager</h2>

        {/* Input box for entering new television model */}
        <input
          type="text"
          value={this.state.newModel}      // controlled input
          onChange={this.handleChange}     // calls handleChange when typing
          placeholder="Enter TV model"
        />

        {/* Button to add new model */}
        <button onClick={this.addModel}>Add</button>

        {/* Pass models array to child component */}
        <TelevisionList models={this.state.models} />
      </div>
    );
  }
}

export default TelevisionManager;
