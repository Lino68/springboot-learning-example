package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

	/**
	 * 通过年龄相等查找，参数为name
	 * 
	 * @param age
	 * @return
	 */
	List<Person> findByAge(Integer age);

	/**
	 * 通过名字模糊查询，参数为name
	 * 
	 * @param name
	 * @return
	 */
	List<Person> findByNameContaining(String name);

	/********************** 自定义查询 **************************/
	/**
	 * 使用JPA的NameQuery注解进行自定义查询
	 * 
	 * @param name
	 * @return
	 */
	List<Person> useNameQueryAnnotation(String name);

	/**
	 * 使用@Query注解进行自定义查询
	 * 
	 * @param name
	 * @return
	 */
	@Query(value = "select p from Person p where p.name = ?1")
	List<Person> useQueryAnnotation(String name);

	/********************** 自定义查询 **************************/
}
