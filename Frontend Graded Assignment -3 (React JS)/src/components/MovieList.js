import React from 'react';
import MovieCard from './MovieCard';

const MovieList = ({ movies, onMovieClick }) => {
  if (!movies || movies.length === 0) {
    return <p>No movies available</p>;
  }
  return (
    <div className="movie-list" style={{ display: 'flex', flexWrap: 'wrap' }}>
      {movies.map(movie => (
        <MovieCard key={movie.id} movie={movie} onMovieClick={onMovieClick} />
      ))}
    </div>
  );
};


export default MovieList;


