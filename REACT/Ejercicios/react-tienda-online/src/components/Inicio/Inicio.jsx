import React from 'react';
import Portada from "../../images/inicio.jpg";
import { BrowserRouter, BrowserRouter as Routes } from 'react-router-dom';

export const Inicio = () => {
  
  return (
    <div className='inicio'>
      <BrowserRouter>
      <Routes to="/inicio">
        <h1>Inicio</h1>
      </Routes>
      <Routes to="/productos"><i class="fa fa-deviantart" aria-hidden="true"></i>
          <h1>Productos</h1>
      </Routes>
      </BrowserRouter>
      <img src={Portada} alt="inicio" />
    </div>
  )
}

export default Inicio


