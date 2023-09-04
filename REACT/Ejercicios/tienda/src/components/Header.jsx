import React from 'react'
import { Link } from 'react-router-dom'
import LogoImg from '../img/shop-icon_34368.png'
export default function Header() {
  return (
    
    <header className='header'>
        <Link className='icon' to={"/"}><img src={LogoImg} alt="logo" /></Link>
        <nav>
            <h3 className='tituloweb'>Mi Tienda Virtual</h3>
            <Link to={"/"}>Productos</Link>
            <Link to={"/favoritos"}>Favoritos</Link>
        </nav>
    </header>
    
  )
}
