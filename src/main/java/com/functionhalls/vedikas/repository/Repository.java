package com.functionhalls.vedikas.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.functionhalls.vedikas.model.ListOfFunctionHalls;

public interface Repository extends MongoRepository<ListOfFunctionHalls, String> {
  List<ListOfFunctionHalls> findByNameContaining(String name);
}