import React from 'react';
import MovieList from '../components/MovieList';

const Favorites = ({ movies, onFavoriteToggle }) => {
  const favoriteMovies = movies.filter(movie => movie.isFavorite);

  return (
    <div>
      <h1>My Favorites</h1>
      {favoriteMovies.length > 0 ? (
        <MovieList movies={favoriteMovies} onFavoriteToggle={onFavoriteToggle} />
      ) : (
        <p>No favorite movies yet.</p>
      )}
    </div>
  );
};

export default Favorites;
