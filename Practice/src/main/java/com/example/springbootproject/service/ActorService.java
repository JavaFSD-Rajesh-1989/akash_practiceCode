package com.example.springbootproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springbootproject.dto.ActorRepository;
import com.example.springbootproject.entity.Actor;

@Service
public class ActorService {

	@Autowired
	private ActorRepository actorRepository;

	public Actor saveActor(Actor actor) {
		return actorRepository.save(actor);
	}

	public Actor updateActor(Actor actor) {
		return actorRepository.save(actor);
	}

	public void deleteActor(Long actor_id) {
		actorRepository.deleteById(actor_id);
	}

	public Actor getActorById(Long actor_id) {
		Optional<Actor> actor = actorRepository.findById(actor_id);
		return actor.orElse(null);

	}

	public Page<Actor> getAllActor(int page, int size, String sortBy) {
		return actorRepository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
	}
}