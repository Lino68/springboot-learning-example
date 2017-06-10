package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@RequestMapping("/list")
	public List<Person> list() {
		return personRepository.findAll();
	}

	@RequestMapping("/add")
	public Person add(@RequestBody Person person) {
		Person p = new Person();
		p.setAge(person.getAge());
		p.setName(person.getName());

		return personRepository.save(p);
	}

	@RequestMapping("/get/{id}")
	public Person get(@PathVariable("id") Long id) {
		return personRepository.findOne(id);
	}

	@RequestMapping("/update")
	public Person update(@RequestBody Person person) {
		Person p = new Person();
		p.setAge(person.getAge());
		p.setName(person.getName());

		return personRepository.save(person);
	}

	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		personRepository.delete(id);
	}
}
