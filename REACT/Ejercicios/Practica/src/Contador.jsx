import React, { useState, Fragment } from "react";

const Contador = () => {
  const [numero, setNumero] = useState(0);

  const aumentar = () => {
    setNumero(numero + 1);
  };

  return (
    <Fragment>
      <h3>Mi primer contador de clicks {numero}</h3>
      <button onClick={aumentar}>Sumar clicks</button>
    </Fragment>
  );
};

export default Contador;
