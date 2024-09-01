import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
// import Favorites from './pages/Favorites';
import MovieDetails from './components/MovieDetails';
import '../src/styles/App.css';
import FavoriteList from '../src/components/FavouriteList';
import { FavoriteProvider } from './contexts/FavouriteContext';

function App() {
  return (
    <FavoriteProvider>
      <Router>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/movie/:id" element={<MovieDetails />} />
          <Route path="/favorites" element={<FavoriteList />} />
        </Routes>
      </Router>
    </FavoriteProvider>
  );
}

export default App;

