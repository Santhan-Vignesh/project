import './App.css';
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navbar from './NavComp/Navbar';
import EventPage from './EventsComp/EventPage';
import Login from './RegLoginComp/login'; // Import Login component
import Register from './RegLoginComp/register'; // Import Register component
import News from './NewsComp/News';
import LandingPage from './LandingPage/LandingPage'; // Import LandingPage component

function App() {
  return (
    <Router>
      <Navbar />
      <Routes>
        {/* Set LandingPage as the root "/" */}
        <Route path="/" element={<LandingPage />} />

        {/* Other routes */}
        <Route path="/login" element={<Login />} />
        <Route path="/signup" element={<Register />} />
        <Route path="/News" element={<News />} />
        <Route path="/events" element={<EventPage />} /> {/* Change events route */}
        <Route path="/coaches" element={<EventPage initialSection="coaches" />} /> {/* Route for Coaches */}
      </Routes>
    </Router>
  );
}

export default App;
