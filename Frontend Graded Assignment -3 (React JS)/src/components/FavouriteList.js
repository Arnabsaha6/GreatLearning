import React, { useContext } from 'react';
import { FavoriteContext } from '../contexts/FavouriteContext'; 
import MovieCard from './MovieCard';

const FavoriteList = ({ onMovieClick, handleFavoriteClick }) => {

    const { favorites } = useContext(FavoriteContext);

    return (
        <div className="favorite-list">
            <h2>My Favorite Movies</h2>
            <div className="movie-list">
                {favorites.map(movie => (
                    <MovieCard key={movie.id} movie={movie} onMovieClick={() => handleFavoriteClick} />
                ))}
            </div>
        </div>
    );
};

export default FavoriteList;
