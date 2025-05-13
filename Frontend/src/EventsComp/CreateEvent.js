import React from 'react';

const CreateEvent = () => {
  const meets = [
    { id: 'E_00001', title: 'Rapid Dash', meet: 'Victory Sprint Classic' },
    { id: 'E_00002', title: 'Golden Mile Run', meet: 'Grand Marathon Challenge' }
  ];

  return (
    <div id="createEvent" className="section active">
      <h1>Create New Event</h1>
      <form>
        <div className="form-group">
          <div>
            <label htmlFor="eventTitle">Event Title</label>
            <input type="text" id="eventTitle" placeholder="Enter event title" />
          </div>
          <div>
            <label htmlFor="eventDate">Event Date</label>
            <input type="text" id="eventDate" placeholder="dd/mm/yyyy" />
          </div>
        </div>

        <div className="form-group">
          <div>
            <label htmlFor="meet">Meet</label>
            <input type="text" id="meet" placeholder="Search for a meet" />
            <select>
              <option>Select a meet</option>
              {meets.map((meet) => (
                <option key={meet.id} value={meet.id}>
                  {meet.meet}
                </option>
              ))}
            </select>
          </div>
          <div>
            <label htmlFor="venue">Venue</label>
            <input type="text" id="venue" placeholder="Enter venue" />
          </div>
        </div>

        <div className="form-group">
          <label htmlFor="category">Category</label>
          <input type="text" id="category" placeholder="Enter category" />
        </div>
        <div className="form-group">
          <label htmlFor="description">Event Description</label>
          <textarea id="description" placeholder="Describe the event"></textarea>
        </div>
        <div className="form-group">
          <label htmlFor="photo">Photo</label>
          <input type="file" id="photo" />
        </div>
        <button type="submit" className="create-btn">Create Event</button>
      </form>
    </div>
  );
};

export default CreateEvent;
