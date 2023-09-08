
import  React, {useContext}  from "react";
import { DataContext } from "../../context/Dataprovider";
import { ProductoItem } from "./productoItem";

export const ProductoLista = () => {

  const value = useContext(DataContext)
  const [productos] = value.productos
  

  return (
    <>
    <h1 className="title">PRODUCTOS</h1>
    <div className="productos">
    <ProductoItem /> 
    <ProductoItem />
    <ProductoItem />    
    </div>
    
    </>
  )
}

export default ProductoLista;