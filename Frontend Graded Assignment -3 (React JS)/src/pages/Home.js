import React, { useEffect, useState } from 'react';
import MovieList from '../components/MovieList';
import { Link, useNavigate } from 'react-router-dom';


const Home = () => {
    const [movies, setMovies] = useState([]);
    const [searchTerm, setSearchTerm] = useState('movies-coming');
    const [filteredMovies, setFilteredMovies] = useState([]);
    const navigate = useNavigate();

    useEffect(() => {
      fetch(`${process.env.PUBLIC_URL}/data/data.json`)
        .then(response => response.json())
        .then(data => {
          setMovies(data);
          setFilteredMovies(data[searchTerm]);
        })
        .catch(error => console.error('Error fetching the JSON:', error));
    }, [searchTerm]);

    const handleMovieClick = (movie) => {
      navigate(`/movie/${movie.id}`);
    };

    const handleSearchChange = (e) => {
      const category = e.target.value;
      setSearchTerm(category);
      setFilteredMovies(movies[category]);
    };

    return (
    <div className="home">
      <h1>Movie List</h1>
      <Link to="/favorites" style={{paddingRight: "20px"}}>View My Favorites</Link>
      <select onChange={handleSearchChange} value={searchTerm}>
        <option value="movies-coming">Coming Soon</option>
        <option value="movies-in-theaters">Movies in Theaters</option>
        <option value="top-rated-indian">Top Rated Indian Movies</option>
        <option value="top-rated-movies">Top Rated Movies</option>
      </select>
      <MovieList movies={filteredMovies} onMovieClick={handleMovieClick} />
    </div>
  );
};

export default Home;
