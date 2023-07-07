package com.vikash.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikash.springboot.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
