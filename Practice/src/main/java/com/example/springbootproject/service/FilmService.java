package com.example.springbootproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springbootproject.dto.FilmRepository;
import com.example.springbootproject.entity.Film;

@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;

	public Film saveFilm(Film film) {
		return filmRepository.save(film);
	}

	public Film updateFilm(Film film) {
		return filmRepository.save(film);
	}

	public void deleteFilm(Long film_id) {

		filmRepository.deleteById(film_id);
	}

	public Film getFilmById(Long film_id) {
		Optional<Film> film = filmRepository.findById(film_id);
		return film.orElse(null);
	}

	public Page<Film> getAllFilm(int page, int size, String sortBy) {
		return filmRepository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
	}
}