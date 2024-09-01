import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import '../styles/MovieDetails.css'

const MovieDetails = () => {
  const { id } = useParams();
  const [movie, setMovie] = useState(null);

  useEffect(() => {
    fetch(`${process.env.PUBLIC_URL}/data/data.json`)
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok ' + response.statusText);
        }
        return response.json();
      })
      .then(data => {
        const movieData = data['movies-coming'].find(m => m.id === id);
        setMovie(movieData);
      })
      .catch(error => console.error('Error fetching the JSON:', error));
  }, [id]);

  if (!movie) return <div>Loading...</div>;

  return (
    <div className="movie-details-container">
      <h1>{movie.title}</h1>
      <img src={movie.posterurl} alt={movie.title} />
      <p><strong>Year:</strong> {movie.year}</p>
      <p><strong>Genres:</strong> {movie.genres.join(', ')}</p>
      <p><strong>Storyline:</strong> {movie.storyline}</p>
      <p><strong>Actors:</strong> {movie.actors.join(', ')}</p>
    </div>
  );
};

export default MovieDetails;
