package com.example.repository;

import com.example.model.Load;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface LoadRepository extends CrudRepository<Load, Long> {

    @Async
    CompletableFuture<List<Load>> findByEquipmentType(String type);

    @Transactional
    @Modifying
    @Query("Update LOAD SET WEIGHT = : weight WHERE ID = :id ")
    void updateWeigth(@Param("weight") float weight, @Param("id") Long id);

}
