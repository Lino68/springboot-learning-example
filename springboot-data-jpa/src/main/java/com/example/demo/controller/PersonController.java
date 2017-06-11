package com.example.demo.controller;

import java.util.List;

import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
		return personRepository.save(person);
	}

	@RequestMapping("/get/{id}")
	public Person get(@PathVariable("id") Long id) {
		return personRepository.findOne(id);
	}

	@RequestMapping("/update")
	public Person update(@RequestBody Person person) {
		return personRepository.save(person);
	}

	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		personRepository.delete(id);
	}

	@RequestMapping("/findByAge/{age}")
	public List<Person> findByAge(@PathVariable Integer age) {
		return personRepository.findByAge(age);
	}

	/**
	 * 模糊搜索
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping("/findByNameContaining/{name}")
	public List<Person> findByNameContaining(@PathVariable String name) {
		return personRepository.findByNameContaining(name);
	}

	/**
	 * 使用@NameQuery进行自定义查询
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping("/useNameQueryAnnotation/{name}")
	public List<Person> useNameQueryAnnotation(@PathVariable String name) {
		return personRepository.useNameQueryAnnotation(name);
	}

	/**
	 * 使用@Query注解进行自定义查询
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping("/useQueryAnnotation/{name}")
	public List<Person> useQueryAnnotation(@PathVariable String name) {
		return personRepository.useQueryAnnotation(name);
	}

	/**
	 * 分页查询 ， pageIndex默认从0（即第1页）开始
	 * 
	 * @param person
	 * @return
	 */
	@RequestMapping("/findWithPaging/{pageIndex}/{pageSize}")
	public Page<Person> findWithPaging(@PathVariable Integer pageIndex, @PathVariable Integer pageSize) {
		Person person = new Person();
		return personRepository.findAll(Example.of(person), new PageRequest(pageIndex, pageSize));
	}
}
