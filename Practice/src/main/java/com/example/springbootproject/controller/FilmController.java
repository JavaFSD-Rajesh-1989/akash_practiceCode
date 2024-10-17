package com.example.springbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootproject.entity.Film;
import com.example.springbootproject.service.FilmService;

@RestController
@RequestMapping("/film")
public class FilmController {

	@Autowired
	private FilmService filmService;

	@PostMapping("/save")
	public Film addFilm(@RequestBody Film film) {
		return filmService.saveFilm(film);
	}

	@PutMapping("/{film_id}")
	public Film updateFilm(@PathVariable Long film_id, @RequestBody Film film) {
		film.setId(film_id);
		return filmService.saveFilm(film);
	}

	@DeleteMapping("/{film_id}")

	public void deleteActor(@PathVariable Long film_id) {
		filmService.deleteFilm(film_id);
	}

	@GetMapping("/getAll")
	public Page<Film> getAllFilm(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size,
			@RequestParam(defaultValue = "actor_id") String sortBy) {

		return filmService.getAllFilm(page, size, sortBy);
	}
}
