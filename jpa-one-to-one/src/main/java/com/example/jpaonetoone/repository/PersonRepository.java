package com.example.jpaonetoone.repository;

import com.example.jpaonetoone.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
