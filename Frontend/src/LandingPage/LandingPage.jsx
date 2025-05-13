import React from 'react';
import { useNavigate } from 'react-router-dom';
import './LandingPage.css';  // External CSS for styling

const LandingPage = () => {
  const navigate = useNavigate();

  const handleLogin = () => {
    navigate('/login');
  };

  const handleSignUp = () => {
    navigate('/signup');
  };

  return (
    <div className="landing-page">
      {/* Hero Section */}
      <header className="hero">
        <div className="hero-content">
          <h1>Welcome to the ultimate sports application</h1>
          <p>We provide you the platform where you can engage in different in sports events occuring across the world.</p>
          <div className="cta-buttons">
            <button onClick={handleLogin} className="cta-btn">Login</button>
            <button onClick={handleSignUp} className="cta-btn">Sign Up</button>
          </div>
        </div>
      </header>

      {/* Features Section */}
      <section className="features">
        <h2>What You Can Do</h2>
        <div className="feature-grid">
          <div className="feature-card">
            <h3>Create Profiles</h3>
            <p>Athletes and coaches can create and manage their personal profiles with ease.</p>
          </div>
          <div className="feature-card">
            <h3>Register for Events</h3>
            <p>View and register for available sports events with just a few clicks.</p>
          </div>
          <div className="feature-card">
            <h3>Track Your Progress</h3>
            <p>See the events you've registered for and track your performance.</p>
          </div>
        </div>
      </section>

      {/* Footer Section */}
      <footer className="footer">
        <p>&copy; 2024 Sports Event Management. All rights reserved.</p>
      </footer>
    </div>
  );
};

export default LandingPage;
