package com.avanish.springboot_mongodb.controller;

import com.avanish.springboot_mongodb.collection.Person;
import com.avanish.springboot_mongodb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public String save(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping
    public List<Person> getByFirstName(@RequestParam("name") String name) {
        return personService.getByFirstName(name);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable String id) {
        personService.remove(id);
    }
}
