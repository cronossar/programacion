import React from 'react'
import Nike from "../../images/Nike.jpg"


export const Header = () => {
  return (
    
    <header>
      <div className='menu'>
        <h1>Header</h1>
      <box-icon name="menu"></box-icon>
      </div>
      <a href="#">
        <div className='logo'>
          <img src={Nike} alt=""/>
        </div>
      </a>
    </header>
  )
}
