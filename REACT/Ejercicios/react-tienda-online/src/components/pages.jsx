import React from "react";
import { Route, Routes } from "react-router-dom";
import { ProductoLista } from "./Productos/index";
import {Inicio} from "./Inicio/Inicio";

export const Pages = () => {
  return (
    
      
        <Routes>
          <Route path="/Inicio" exact element={<Inicio/>} />
          <Route path="/Productos" exact element={<ProductoLista/>} />
        </Routes>
      
    
  );
};

export default Pages;
