import LogoSneake from "@/assets/images/logo.svg";
import AvatarImage from "@/assets/images/image-avatar.png";
import MenuIcon from "@/components/icons/MenuIcon";
import CartIcon from "@/components/icons/CartIcon";
import CloseIcon from "@/components/icons/CloseIcon";
import { useState } from 'react';

const MainHeader = () => {

    const [navClass, setNavClass] = useState(' ')

    const handleOpenMenu = () => {
      setNavClass("absolute top-0 left-0 flex h-full flex-col gap-y-5 bg-white p-8 font-bold md:mr-auto md:flex md:flex-row md:gap-4 md:static md:p-0 md:h-auto")
    }
    const handleCloseMenu = () => {
      setNavClass("hidden font-bold md:static md:mr-auto md:flex md:h-auto md:flex-row md:gap-4  md:p-0")
    }

  return (
    <header className="container mx-auto flex
    items-center gap-8 px-4 bg-gray-200 py-8">
      <button className="md:hidden" onClick={handleOpenMenu}>
        <MenuIcon />
      </button>
      <img src={LogoSneake}
       alt="Logo Sneakers" 
       className="mr-auto mb-1 h-5 md:mr-0" 
       />
      <nav className={navClass}>
        <button className="mb-12 md:hidden" onClick={handleCloseMenu}>
          <CloseIcon />
        </button>
        <a href="#">Collections</a> 
        <a href="#">Men</a>
        <a href="#">Woman</a>
        <a href="#">About</a>
        <a href="#">Contact</a>
      </nav>
      <div className="flex gap-4">
        <button>
          <CartIcon />
        </button>
        <img src={AvatarImage} alt="" className="w-10"/>
      </div>
    </header>
  );
};

export default MainHeader;
