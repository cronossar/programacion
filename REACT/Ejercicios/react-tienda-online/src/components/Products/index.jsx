import React from 'react'
import IMG from "../../images/img01.jpg";

export const ProductsList = () => {
  return (
    <>
    <h1 className='title'>PRODUCTOS</h1>
    <div className='productos'>
      <div className='producto'>
      <a href="#">
      <div className="producto_img">
        <img src={IMG} alt="" />
      </div>
      </a>
      <div className="producto_footer">
        <h1>Title</h1>
        <p>Categoria</p>
        <div className="price">$320</div>
      </div>
      <div className='button'>
        <button className='btn'>
          Añadir al carrito
        </button>
        <div>
        <a href="#" className='btn'>Vista</a>
        </div>
      </div>
      </div>
      <div className='producto'>
      <a href="#">
      <div className="producto_img">
        <img src={IMG} alt="" />
      </div>
      </a>
      <div className="producto_footer">
        <h1>Title</h1>
        <p>Categoria</p>
        <div className="price">$320</div>
      </div>
      <div className='button'>
        <button className='btn'>
          Añadir al carrito
        </button>
        <div>
        <a href="#" className='btn'>Vista</a>
        </div>
      </div>
      </div>
      <div className='producto'>
      <a href="#">
      <div className="producto_img">
        <img src={IMG} alt="" />
      </div>
      </a>
      <div className="producto_footer">
        <h1>Title</h1>
        <p>Categoria</p>
        <div className="price">$320</div>
      </div>
      <div className='button'>
        <button className='btn'>
          Añadir al carrito
        </button>
        <div>
        <a href="#" className='btn'>Vista</a>
        </div>
      </div>
      </div>
    </div>
    
    </>
  )
}
