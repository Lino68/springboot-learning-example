package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Reader;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface ReaderRepository extends JpaRepository<Reader, String> {

}
