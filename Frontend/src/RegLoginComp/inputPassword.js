import React, { useState } from 'react';
import hidePass from '../res/hidePass.png';
import showPass from '../res/showPass.png';

const InputPassword = ({ onPasswordChange, isLogin }) => {  // Accept isLogin prop
  const [password, setPassword] = useState('');
  const [strength, setStrength] = useState(0);
  const [isPasswordVisible, setIsPasswordVisible] = useState(false);

  const handlePasswordChange = (e) => {
    const inputPassword = e.target.value;
    setPassword(inputPassword);
    onPasswordChange(inputPassword);
    checkPasswordStrength(inputPassword);
  };

  const checkPasswordStrength = (password) => {
    const hasUpperCase = /[A-Z]/.test(password);
    const hasLowerCase = /[a-z]/.test(password);
    const hasNumbers = /\d/.test(password);
    const hasSpecialChar = /[!@#$%^&*(),.?":{}|<>]/.test(password);
    const isValidLength = password.length >= 8;

    const strengthCriteriaMet = [
      hasUpperCase,
      hasLowerCase,
      hasNumbers,
      hasSpecialChar,
      isValidLength,
    ].filter(Boolean).length;

    setStrength(strengthCriteriaMet);
  };

  const getStrengthColor = (strength) => {
    switch (strength) {
      case 1: return 'red';
      case 2: return 'orange';
      case 3: return 'yellow';
      case 4: return 'lightgreen';
      case 5: return 'green';
      default: return '#ddd';
    }
  };

  const togglePasswordVisibility = () => {
    setIsPasswordVisible(prev => !prev);
  };

  return (
    <div className="password-wrapper">
      <div className="password-input-container">
        <input
          type={isPasswordVisible ? 'text' : 'password'}
          placeholder="Enter your password"
          value={password}
          onChange={handlePasswordChange}
          className="password-input"
          required
        />
        <div className="password-controls">
          {/* Conditionally render the strength bar only if it's not the login page */}
          {!isLogin && (
            <div className="strength-bar">
              <div
                className="strength-indicator"
                style={{
                  width: `${(strength / 5) * 100}%`,
                  backgroundColor: getStrengthColor(strength),
                }}
              />
            </div>
          )}
          <img
            src={isPasswordVisible ? showPass : hidePass}
            alt={isPasswordVisible ? 'Hide password' : 'Show password'}
            onClick={togglePasswordVisibility}
            className="visibility-toggle"
          />
        </div>
      </div>
    </div>
  );
};

export default InputPassword;
