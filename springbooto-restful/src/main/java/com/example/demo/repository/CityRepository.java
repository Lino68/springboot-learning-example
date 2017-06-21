package com.example.demo.repository;

import com.example.demo.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Lino on 2017/6/21.
 */
public interface CityRepository extends JpaRepository<City, Long> {
}
