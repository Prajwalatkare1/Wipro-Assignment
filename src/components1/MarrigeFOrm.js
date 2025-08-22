import React, { Component } from "react";
import "bootstrap/dist/css/bootstrap.min.css"; // Import Bootstrap CSS

class MarriageForm extends Component { //Declares a new class component named MarriageForm that inherits behavior from React’s Component
  constructor(props) {  //The class constructor runs when the component instance is created receives props from any parent
    super(props); // calls parent class constructor
    this.state = { // initializes state this stores data
      brideName: "",
      groomName: "",
      date: "",
      venue: "",
      submitted: false, // flag to check if form was submitted
    };
  }

  // Handles input change for all fields
  handleChange = (event) => {
    this.setState({ [event.target.name]: event.target.value }); //updates statee with property name event.target.name
  };
  //this single method can update any field (brideName, groomName, date, venue) depending on which input changed

  // Handles form submission
  handleSubmit = (event) => {  //an arrow function assigned as a method,it receives the event object from an inputs onChange.
    event.preventDefault(); //to prevent page refresh
    this.setState({ submitted: true }); 
  };

  render() {
    return (
      <div className="container mt-4">
        {/* Form Section */}
        <div className="card p-4 mb-4 shadow">
          <h2 className="text-center mb-3">Marriage Form</h2>
          <form onSubmit={this.handleSubmit}> {/*The onSubmit prop ties to handleSubmit so when user clicks submit (or presses Enter) we handle it*/}
            
            {/* Bride Name */}
            <div className="form-group mb-3">
              <label>Bride Name</label>
              <input
                type="text"
                name="brideName"
                value={this.state.brideName}
                onChange={this.handleChange} //updates state on every keystroke.
                className="form-control"
                placeholder="Enter bride name" // text shown when empty.
                required
              />
            </div>

            {/* Groom Name */}
            <div className="form-group mb-3">
              <label>Groom Name</label>
              <input
                type="text"
                name="groomName"
                value={this.state.groomName}
                onChange={this.handleChange}
                className="form-control"
                placeholder="Enter groom name"
                required
              />
            </div>

            {/* Marriage Date */}
            <div className="form-group mb-3">
              <label>Marriage Date</label>
              <input
                type="date"
                name="date"
                value={this.state.date}
                onChange={this.handleChange}
                className="form-control"
                required
              />
            </div>

            {/* Venue */}
            <div className="form-group mb-3">
              <label>Venue</label>
              <input
                type="text"
                name="venue"
                value={this.state.venue}
                onChange={this.handleChange}
                className="form-control"
                placeholder="Enter venue"
                required
              />
            </div>

            {/* Submit Button */}
            <button type="submit" className="btn btn-primary w-100">
              Submit
            </button>
          </form>
        </div>

        {/* Marriage Details Section */}
        {this.state.submitted && (   //if submitted is true, then will show what's inside the parentheses; otherwise render nothing
          <div className="card p-4 shadow">
            <h3 className="mb-3">Marriage Details</h3>
            <p><strong>Bride Name:</strong> {this.state.brideName}</p>
            <p><strong>Groom Name:</strong> {this.state.groomName}</p>
            <p><strong>Date:</strong> {this.state.date}</p>
            <p><strong>Venue:</strong> {this.state.venue}</p>
          </div>
        )}
      </div>
    );
  }
}

export default MarriageForm;
