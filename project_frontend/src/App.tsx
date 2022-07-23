import React from 'react';
import logo from './logo.svg';
import './App.css';

// or less ideally
import { Button, Navbar, Container, NavbarBrand, Nav, NavLink, NavDropdown, NavItem } from 'react-bootstrap';
import AirportNavbar from "./AirportNavbar";

function App() {
    return (
        <AirportNavbar></AirportNavbar>
    );
}

export default App;
