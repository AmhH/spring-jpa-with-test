package com.example.repository;

import com.example.model.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {

    long deleteByCity(String city);
}
