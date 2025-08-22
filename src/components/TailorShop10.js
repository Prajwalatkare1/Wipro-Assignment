import React from "react";
import ServiceCard from "./ServiceCard10";

function TailorShop() {
  const services = [
    {
      serviceName: "Shirt",
      price: 500,
      fabricsAvailable: ["Cotton", "Linen", "Silk"]
    },
    {
      serviceName: "Pants",
      price: 700,
      fabricsAvailable: ["Denim", "Cotton", "Polyester"]
    },
    {
      serviceName: "Lehenga",
      price: 3000,
      fabricsAvailable: ["Silk", "Georgette", "Velvet"]
    },
    {
      serviceName: "Blouse",
      price: 800,
      fabricsAvailable: ["Cotton", "Silk", "Chiffon"]
    }
  ];

  return (
    <div className="container mt-4">
      <h2 className="text-center mb-4">Tailoring Services</h2>
      <div className="row">
        {services.map((service, index) => (
          <ServiceCard key={index} service={service} />
        ))}
      </div>
    </div>
  );
}

export default TailorShop;
