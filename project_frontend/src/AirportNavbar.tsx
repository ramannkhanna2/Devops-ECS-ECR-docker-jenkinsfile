import React from 'react';
import './App.css';
// or less ideally
import {Container, Nav, Navbar, NavDropdown} from 'react-bootstrap';

function AirportNavbar() {
    return (
        <Navbar bg="light" expand="lg">
            <Container>
                <Navbar.Brand href="#home">Our Airports</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav"/>
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        <Nav.Link href="#home">World</Nav.Link>
                        <Nav.Link href="#link">Airports</Nav.Link>
                        <Nav.Link href="#link">Comments</Nav.Link>
                        <Nav.Link href="#link">Downloads</Nav.Link>
                        <NavDropdown title="SiteInfo" id="basic-nav-dropdown">
                            <NavDropdown.Item href="#action/3.1">About</NavDropdown.Item>
                            <NavDropdown.Item href="#action/3.2">Contact</NavDropdown.Item>
                            <NavDropdown.Item href="#action/3.3">Help</NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
}

export default AirportNavbar;
