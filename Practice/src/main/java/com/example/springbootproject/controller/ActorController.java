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

import com.example.springbootproject.entity.Actor;
import com.example.springbootproject.service.ActorService;

@RestController
@RequestMapping("/actor")
public class ActorController {

	@Autowired
	private ActorService actorService;

	@PostMapping("/save")
	public Actor addActor(@RequestBody Actor actor) {
		return actorService.saveActor(actor);
	}

	@PutMapping("/{actor_id}")
	public Actor updateActor(@PathVariable Long actor_id, @RequestBody Actor actor) {
		actor.setId(actor_id);
		return actorService.saveActor(actor);
	}

	@DeleteMapping("/{actor_id}")
	public void deleteActor(@PathVariable Long actor_id) {
		actorService.deleteActor(actor_id);
	}

	@GetMapping("/{actor_id}")
	public Actor getActorById(@PathVariable Long actor_id) {
		return actorService.getActorById(actor_id);
	}

	@GetMapping("/getAll")
	public Page<Actor> getAllActor(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size, @RequestParam(defaultValue = "actor_id") String sortBy) {

		return actorService.getAllActor(page, size, sortBy);
	}
}