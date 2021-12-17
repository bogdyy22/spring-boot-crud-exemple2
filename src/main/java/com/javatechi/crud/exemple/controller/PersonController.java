package com.javatechi.crud.exemple.controller;

import com.javatechi.crud.exemple.entity.Person;
import com.javatechi.crud.exemple.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {


    @Autowired
    public PersonService personService;

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @PostMapping("/addPersons")
    public List<Person> addPersons(@RequestBody List<Person> persons) {
        return personService.savePersons(persons);
    }

    @GetMapping("/persons")
    public List<Person> findAllPersons() {
        return personService.getPersons();
    }

    @GetMapping("/person/{id}")
    public Person findPersonById(@PathVariable int id) {
        return personService.getPersonsById(id);
    }

    @GetMapping("/person/{name}")
    public Person findPErsonByName(@PathVariable String name) {
        return personService.getPersonsName(name);
    }

    @PutMapping("/update")
    public Person updatePerson(@RequestBody Person person) {
        return personService.updatePerson(person);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePerson(@PathVariable int id) {
        return personService.deletePerson(id);
    }
}
