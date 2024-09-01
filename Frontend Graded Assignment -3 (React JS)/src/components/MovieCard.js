import React, { useContext } from 'react';
import { FavoriteContext } from '../contexts/FavouriteContext'; 

const MovieCard = ({ movie, onMovieClick }) => {
    const { addFavorite, removeFavorite, favorites } = useContext(FavoriteContext);

    const isFavorite = favorites.some(fav => fav.id === movie.id);

    const handleFavoriteClick = () => {
        if (isFavorite) {
            removeFavorite(movie.id);
        } else {
            addFavorite(movie);
        }
    };

    return (
        <div>
            <div className="movie-card" onClick={() => onMovieClick(movie)}>
                <h3>{movie.title}</h3>
                <img src={movie.posterurl} alt={movie.title} />
                <p>{movie.genres.join(', ')}</p>

            </div>
            <div style={{marginLeft: "39px"}}>
                <button onClick={handleFavoriteClick}>
                    {isFavorite ? 'Remove from Favorites' : 'Add to Favorites'}
                </button>
            </div>
        </div>
    );
};

export default MovieCard;
