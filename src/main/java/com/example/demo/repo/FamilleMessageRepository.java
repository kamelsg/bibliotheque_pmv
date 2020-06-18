package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FamilleMessageEntity;

@Repository
public interface FamilleMessageRepository extends CrudRepository<FamilleMessageEntity, Integer> {
}