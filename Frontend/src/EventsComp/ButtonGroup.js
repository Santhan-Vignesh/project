import React from 'react';

const ButtonGroup = ({ showSection }) => {
  return (
    <div className="btn-group">
      <button onClick={() => showSection('viewEvents')} className="btn">
        View Events
      </button>
      <button onClick={() => showSection('createEvent')} className="btn">
        Create New Event
      </button>
    </div>
  );
};

export default ButtonGroup;
