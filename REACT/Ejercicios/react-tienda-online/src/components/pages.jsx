import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import { ProductoLista } from "./Productos/index";
import {Inicio} from "./Inicio/Inicio";

export const Pages = () => {
  return (
    
      <Router>
        <Routes>
          <Route path="/Inicio" exact element={<Inicio/>} />
          <Route path="/Productos" exact element={<ProductoLista/>} />
        </Routes>
      </Router>
    
  );
};

export default Pages;
