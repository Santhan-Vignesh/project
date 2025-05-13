// NavComp/Navbar.js
import React, { useState } from 'react';
import { Link } from 'react-router-dom';

const Navbar = () => {
  const [isOpen, setIsOpen] = useState(false);

  const toggleNavbar = () => {
    setIsOpen(!isOpen);
  };

  return (
    <nav>
      <div className="navbar-title">Sportx</div>
      <div className="hamburger" onClick={toggleNavbar}>
        <div className="bar"></div>
        <div className="bar"></div>
        <div className="bar"></div>
      </div>
      <ul className={isOpen ? 'nav-links open' : 'nav-links'}>
        <li><Link to="/news">News</Link></li>
        <li><Link to="/events">Events</Link></li>
        <li><Link to="/results">Results</Link></li>
        <li><Link to="/coaches">Coaches</Link></li>
        <li><Link to="/athletes">Athletes</Link></li>
      </ul>
    </nav>
  );
};

export default Navbar;
