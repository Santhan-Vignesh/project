import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import './RegLogin.css'; // Reuse the same CSS file for styling
import InputPassword from './inputPassword'; // Import the InputPassword component

const Login = () => {
  const [loginData, setLoginData] = useState({
    identifier: '', // This will be either the username or email
    password: '',
    role: '',
  });

  const handleChange = (e) => {
    setLoginData({
      ...loginData,
      [e.target.name]: e.target.value,
    });
  };

  const handlePasswordChange = (password) => {
    setLoginData((prevData) => ({
      ...prevData,
      password: password,
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Logic to handle form submission goes here
    console.log('Login Data:', loginData);
  };

  return (
    <form className="form-container" onSubmit={handleSubmit}>
      <h2>Login</h2>
      
      <div>
        <input 
          type="text" 
          name="identifier" 
          placeholder="Username or Email" 
          value={loginData.identifier}
          onChange={handleChange}
          required 
        />
      </div>
      
      <div>
        <InputPassword onPasswordChange={handlePasswordChange} isLogin={true} /> {/* Pass isLogin={true} */}
      </div>
      
      <div>
        <select 
          name="role" 
          value={loginData.role}
          onChange={handleChange}
          required
        >
          <option value="" disabled>Select role</option>
          <option value="coach">Coach</option>
          <option value="athlete">Athlete</option>
        </select>
      </div>
      
      <div>
        <button type="submit">Login</button>
      </div>

      <p>
        New user? <Link to="/register">Register Here!</Link>
      </p>
    </form>
  );
};

export default Login;
