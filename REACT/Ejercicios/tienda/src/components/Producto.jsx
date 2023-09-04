import React, {useState} from 'react'
import FavImg from '../img/like.png'
import NoFavImg from '../img/heart.png'
import {Link} from 'react-router-dom'

export default function Producto({producto, agregarAFavoritos, eliminarDeFavoritos}) {

    const [favorito, setFavorito] = useState(false)

    function handleClick(){
        
      if (favorito) {
        eliminarDeFavoritos(producto)
        setFavorito(false)
      }else{
        agregarAFavoritos(producto)
        setFavorito(true)
      }
      }
  return (
    <div className="producto">
        <Link to={`/producto/${producto.id}`}><img src={producto.image} alt="" /></Link>
        <div className="info">
            <p>{producto.title}</p>
            <mark>${producto.price}</mark>
        </div>
        {
        favorito ?
        <img className='fav-icon' onClick={handleClick} src={NoFavImg} />
        :
        <img className='fav-icon' onClick={handleClick} src={FavImg} />
        }
    </div>
  )
}
    
