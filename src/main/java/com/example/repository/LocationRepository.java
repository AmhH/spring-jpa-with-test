package com.example.repository;

import com.example.model.Location;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface LocationRepository extends CrudRepository<Location, Long> {

    long deleteByCity(String city);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "INSERT INTO LOCATION (CITY,STATE,ZIPCODE) select :city, :state, :zipCode", nativeQuery = true)
    void saveLocation(@Param("city") String city, @Param("state") String state, @Param("zipCode") String zipCode);
}
