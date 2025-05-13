// EventPage.js
import React, { useState } from 'react';
import ButtonGroup from './ButtonGroup';
import ViewEvents from './ViewEvents';
import CreateEvent from './CreateEvent';

const EventPage = () => {
  const [currentSection, setCurrentSection] = useState('viewEvents');

  const showSection = (section) => {
    console.log("Switching to section:", section);
    setCurrentSection(section);
  };

  return (
    <>
      <ButtonGroup showSection={showSection} />
      {currentSection === 'viewEvents' && <ViewEvents />}
      {currentSection === 'createEvent' && <CreateEvent />}
    </>
  );
};

export default EventPage;
