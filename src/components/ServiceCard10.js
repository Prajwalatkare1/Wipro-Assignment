import React from "react";

function ServiceCard({ service }) {
  return (
    <div className="col-md-4 mb-3">
      <div className="card shadow-sm">
        <div className="card-body">
          <h5 className="card-title">{service.serviceName}</h5>
          <p className="card-text">Price: ₹{service.price}</p>

          <h6>Fabrics Available:</h6>
          <ul>
            {service.fabricsAvailable.map((fabric, index) => (
              <li key={index}>{fabric}</li>
            ))}
          </ul>
        </div>
      </div>
    </div>
  );
}

export default ServiceCard;
