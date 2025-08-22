import React, { Component } from "react";//imports react and component class
import "bootstrap/dist/css/bootstrap.min.css";

class AccessoriesForm extends Component {
  constructor(props) { //initializes component state
    super(props); //calls parent constructor
    this.state = { //stores form values
      accessoryName: "",
      description: "",
      category: "Electronics",
      brand: "",
      inStock: false,
      warranty: "",
      submittedData: [] // to store all submitted entries
    };
  }

  // Handle input changes for all controls
  handleChange = (event) => { //single function to handle all inputs
    const { name, value, type, checked } = event.target;//used this to access the field

    // Checkbox uses checked instead of value
    this.setState({
      [name]: type === "checkbox" ? checked : value,
    });
  };

  // Handle form submission
  handleSubmit = (event) => {
    event.preventDefault(); // prevents page reloading

    const newEntry = {
      accessoryName: this.state.accessoryName,
      description: this.state.description,
      category: this.state.category,
      brand: this.state.brand,
      inStock: this.state.inStock ? "Yes" : "No",
      warranty: this.state.warranty,
    };

    this.setState((prevState) => ({
      submittedData: [...prevState.submittedData, newEntry], //copies current state into submitteddata
      accessoryName: "", //table will display this submitteddata
      description: "",
      category: "Electronics",
      brand: "",
      inStock: false,
      warranty: ""
    }));
  };

  render() {
    return (
      <div className="container mt-4">
        <h2 className="mb-3">Accessories Form</h2>

        {/* FORM */}
        <form onSubmit={this.handleSubmit}>
          {/* Text */}
          <div className="mb-3">
            <label className="form-label">Accessory Name</label>
            <input
              type="text"
              className="form-control" // input bound to state.accessoryname
              name="accessoryName"
              value={this.state.accessoryName}
              onChange={this.handleChange}
              required
            />
          </div>

          {/* Textarea */}
          <div className="mb-3">
            <label className="form-label">Description</label>
            <textarea
              className="form-control"
              name="description"
              value={this.state.description} //same as above bound to state.description
              onChange={this.handleChange}
              required
            />
          </div>

          {/* Select Dropdown  to state.category*/}
          
          <div className="mb-3">
            <label className="form-label">Category</label>
            <select
              className="form-select"
              name="category"
              value={this.state.category}
              onChange={this.handleChange}
            >
              <option value="Electronics">Electronics</option>
              <option value="Furniture">Furniture</option>
              <option value="Clothing">Clothing</option>
              <option value="Sports">Sports</option>
            </select>
          </div>

          {/* Radio Buttons */}
          <div className="mb-3">
            <label className="form-label">Brand</label><br />
            <div className="form-check form-check-inline">
              <input
                type="radio"
                className="form-check-input"
                name="brand"
                value="Samsung"
                checked={this.state.brand === "Samsung"}
                onChange={this.handleChange}
              />
              <label className="form-check-label">Samsung</label>
            </div>
            <div className="form-check form-check-inline">
              <input
                type="radio"
                className="form-check-input"
                name="brand"
                value="LG"
                checked={this.state.brand === "LG"}
                onChange={this.handleChange}
              />
              <label className="form-check-label">LG</label>
            </div>
            <div className="form-check form-check-inline">
              <input
                type="radio"
                className="form-check-input"
                name="brand"
                value="Sony"
                checked={this.state.brand === "Sony"}
                onChange={this.handleChange}
              />
              <label className="form-check-label">Sony</label>
            </div>
          </div>

          {/* Checkbox */}
          <div className="mb-3 form-check">
            <input
              type="checkbox"
              className="form-check-input"
              name="inStock"
              checked={this.state.inStock}
              onChange={this.handleChange}
            />
            <label className="form-check-label">Available in Stock</label>
          </div>

          {/* Number */}
          <div className="mb-3">
            <label className="form-label">Warranty (in years)</label>
            <input
              type="number"
              className="form-control"
              name="warranty"
              value={this.state.warranty} //numeric value stored 
              onChange={this.handleChange}
              required
            />
          </div>

          {/* Submit */}
          <button type="submit" className="btn btn-primary">Submit</button>
        </form>

        {/* TABLE shows only when form is submitted */}
        {this.state.submittedData.length > 0 && (
          <div className="mt-4">
            <h3>Submitted Data</h3>
            <table className="table table-bordered table-striped">
              <thead className="table-dark">
                <tr>
                  <th>Accessory Name</th>
                  <th>Description</th>
                  <th>Category</th>
                  <th>Brand</th>
                  <th>In Stock</th>
                  <th>Warranty</th>
                </tr>
              </thead>
              <tbody>
                {this.state.submittedData.map((item, index) => ( //displays stored submitteddata
                  <tr key={index}>
                    <td>{item.accessoryName}</td>
                    <td>{item.description}</td>
                    <td>{item.category}</td>
                    <td>{item.brand}</td>
                    <td>{item.inStock}</td>
                    <td>{item.warranty}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        )}
      </div>
    );
  }
}

export default AccessoriesForm;
// used controlled components (inputs bound to state)

//One universal handleChange updates state for all inputs
//On submit,  saved data in submittedData and displayed it in a Bootstrap table