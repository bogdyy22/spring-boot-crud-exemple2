package com.javatechi.crud.exemple.repository;

import com.javatechi.crud.exemple.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findByName(String name);
}
