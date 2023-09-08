import React from 'react'
import PropTypes from 'prop-types';


export const ProductoItem = ({
  id,
  title,
  price,
  image,
  category
}) => {

  
  return (
    <div className="producto">
      <a href="#">
      <div className="producto_img">
        <img src={image.default} alt={title} />
      </div>
      </a>
      <div className="producto_footer">
        <h1>{title}</h1>
        <p>{category}</p>
        <div className="price">${price}</div>
      </div>
      <div className="buttom">
        <button className="btn">
          Añadir al carrito
        </button>
        <div>
        <a href="#" className="btn">Vista</a>
        </div>
      </div>
    </div>
      
    )
}
