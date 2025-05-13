import React, { useState } from 'react';
import './News.css'; // Import News-specific CSS
import Im1 from './im.jpg';
import Im2 from './im2.jpg';
import Im3 from './im3.jpg';
import Im4 from './im4.jpg';
import Im5 from './im5.jpg';
import Im6 from './im6.jpg';

function News() {
  const [activeEvent, setActiveEvent] = useState(null);

  const matches = [
    {
      id: 1,
      summary: 'Cricket',
      status: 'Live - Q4',
      image: Im1,
      description: 'Team A is leading against Team B in Q4.',
      details: 'Team A and Team B have been going head-to-head in an intense match...',
    },
    {
      id: 2,
      summary: 'Relay',
      status: 'Upcoming',
      image: Im2,
      description: 'Team C and Team D are preparing for an intense matchup.',
      details: 'The upcoming game between Team C and Team D has fans eagerly awaiting...',
    },
    {
      id: 3,
      summary: 'Long jump',
      status: 'Completed',
      image: Im3,
      description: 'Team E won against Team F in a thrilling finish.',
      details: 'In a nail-biting finish, Team E managed to secure a last-minute victory...',
    },
    {
      id: 4,
      summary: 'Archery',
      status: 'Upcoming',
      image: Im4,
      description: 'Team G and Team H will meet in a highly anticipated match.',
      details: 'Team G and Team H are both in top form for the upcoming match...',
    },
    {
      id: 5,
      summary: 'Player changes',
      status: 'Change',
      image: Im5,
      description: 'Team A changed the Player A by substituting Player B.',
      details: 'Due to Player A absence, Team A decided to substitute Player B...',
    },
    {
      id: 6,
      summary: 'Injury alert',
      status: 'Injured',
      image: Im6,
      description: 'Player 1 in Team A got injured',
      details: 'During the practice session, Player 1 got injured in the ankle...',
    },
  ];

  const openModal = (id) => {
    setActiveEvent(id);
  };

  const closeModal = () => {
    setActiveEvent(null);
  };

  return (
    <div className="main-container">
      <h1 className="heading">Latest Sports News</h1>
      <p className="sub-heading">
        Keep updated with the latest news, match summary, match status, player highlights, team news, and the list of events.
      </p>

      <div className="container">
        {matches.map((match) => (
          <div className="match-card" key={match.id}>
            <img src={match.image} alt="match" />
            <div className="match-info">
              <p className="summary">{match.summary}</p>
              <p className="description">{match.description}</p>
              <p className="status">{match.status}</p>
              <button className="read-more" onClick={() => openModal(match.id)}>
                Read More
              </button>
            </div>
          </div>
        ))}
      </div>

      {activeEvent && (
        <div className="modal-overlay">
          <div className="modal-container">
            <button className="close-modal" onClick={closeModal}>
              &times;
            </button>
            <h3>{matches.find((match) => match.id === activeEvent).summary}</h3>
            <p>{matches.find((match) => match.id === activeEvent).details}</p>
          </div>
        </div>
      )}
    </div>
  );
}

export default News;
