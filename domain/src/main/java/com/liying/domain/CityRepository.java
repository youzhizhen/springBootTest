package com.liying.domain;

import org.springframework.stereotype.Repository;

import com.liying.persistenting.SpringDataJPARepository;

@Repository
public interface CityRepository extends SpringDataJPARepository<City, Long> {

}
