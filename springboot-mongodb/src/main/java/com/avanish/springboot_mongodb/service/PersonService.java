package com.avanish.springboot_mongodb.service;

import com.avanish.springboot_mongodb.collection.Person;
import com.avanish.springboot_mongodb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

    public List<Person> getByFirstName(String name) {
        return personRepository.findByFirstName(name);
    }

    public void remove(String id) {
        personRepository.deleteById(id);
    }
}
