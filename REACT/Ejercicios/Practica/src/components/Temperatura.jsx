import React from "react";


const Temperatura = () => {

    const temp = 21;

  return (
    <div>
      <h2>Hace frio o calor??</h2>
      <h4>En realidad hace mucho...
        {
            temp > 20 ? 'CALOR' : 'FRIO'
        }
      </h4>
    </div>
  )
}

export default Temperatura


    const temp = 21;
