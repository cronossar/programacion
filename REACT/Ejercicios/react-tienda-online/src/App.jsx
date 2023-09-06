import React from 'react';
import './index.css';
import { Header } from "./components/Header";
import { ProductsList } from "./components/Products";
import 'boxicons';


function App() {
  

  return (
    
      <div className='App'>
        
        <Header />
        <ProductsList/>
        
      </div>
      
   )
}

export default App
