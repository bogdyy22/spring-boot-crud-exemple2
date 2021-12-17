package com.javatechi.crud.exemple.service;

import com.javatechi.crud.exemple.entity.Person;
import com.javatechi.crud.exemple.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {


    @Autowired
    private PersonRepository personRepository;


    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> savePersons(List<Person> persons) {
        return personRepository.saveAll(persons);
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public Person getPersonsById(int id) {
        return personRepository.findById(id).orElse(null);
    }

    public Person getPersonsName(String name) {
        return personRepository.findByName(name);
    }

    public String deletePerson(int id) {
        personRepository.deleteById(id);
        return "Person remove!!!" + id;
    }

    public Person updatePerson(Person person) {
        Person existPerson = personRepository.findById(person.getId()).orElse(null);
        existPerson.setName(person.getName());
        existPerson.setEmail(person.getEmail());
        existPerson.setLocalDate(person.getLocalDate());
        existPerson.setAge(person.getAge());
        return personRepository.save(existPerson);
    }

}
