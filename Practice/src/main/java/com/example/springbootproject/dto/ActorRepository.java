package com.example.springbootproject.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootproject.entity.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
}
