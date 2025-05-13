import React, { useState } from 'react';

const ViewEvents = () => {
  const [events, setEvents] = useState([
    { id: 'E_00001', title: 'Rapid Dash', meet: 'Victory Sprint Classic' },
    { id: 'E_00002', title: 'Golden Mile Run', meet: 'Grand Marathon Challenge' },
    { id: 'E_00003', title: 'Speedster 400m', meet: 'Blaze Track Meet' },
    { id: 'E_00004', title: 'Sprint King 100m', meet: 'Victory Sprint Classic' }, // Repeat meet
    { id: 'E_00005', title: 'Iron Will 10K', meet: 'Grand Marathon Challenge' },  // Repeat meet
    { id: 'E_00006', title: 'Rapid Dash', meet: 'Blaze Track Meet' }         // Repeat meet
  ]);
  

  const [searchTerm, setSearchTerm] = useState('');

  const filterEvents = (e) => {
    setSearchTerm(e.target.value.toLowerCase());
  };

  const printPage = () => {
    window.print();
  };

  return (
    <div id="viewEvents" className="section active">
      <h1>Events</h1>
      <input
        type="text"
        id="search"
        placeholder="Search by meet name or event title"
        onKeyUp={filterEvents}
      />

      <table id="eventsTable">
        <thead>
          <tr>
            <th>Event ID</th>
            <th>Event Title</th>
            <th>Meet Name</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {events
            .filter(
              (event) =>
                event.title.toLowerCase().includes(searchTerm) ||
                event.meet.toLowerCase().includes(searchTerm)
            )
            .map((event) => (
              <tr key={event.id}>
                <td>{event.id}</td>
                <td>{event.title}</td>
                <td>{event.meet}</td>
                <td><button className="view-btn">View Registrations</button></td>
              </tr>
            ))}
        </tbody>
      </table>

      <button onClick={printPage} className="print-btn">Print Events</button>

      <br /><br />

      <iframe
        title="sports-management"
        className="responsive-iframe"
        src="https://app.powerbi.com/view?r=eyJrIjoiNjM3N2JiYTgtMDQ1Mi00NTY2LTg1MGItNjQ1OTkyMTQ3ZTQ3IiwidCI6ImJiYzIxNzVlLTUyZDEtNGVkNi1iYzNhLTNhYzQ3OWY1ODM5ZCIsImMiOjEwfQ%3D%3D"
        frameBorder="0"
        allowFullScreen={true}>
      </iframe>

    </div>
  );
};

export default ViewEvents;
