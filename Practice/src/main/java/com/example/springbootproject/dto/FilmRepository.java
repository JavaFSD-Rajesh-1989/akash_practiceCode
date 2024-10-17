package com.example.springbootproject.dto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootproject.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
	Page<Film> findByActorId(Long actor_id, Pageable pageable);
}
