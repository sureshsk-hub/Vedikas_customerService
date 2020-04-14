package com.functionhalls.vedikas.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.functionhalls.vedikas.model.ListOfFunctionHalls;
import com.functionhalls.vedikas.repository.Repository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class Controller {

  @Autowired
  Repository repository;

  @GetMapping("/listOfFunctionHalls")
  public List<ListOfFunctionHalls> getAll()
  {
  	List<ListOfFunctionHalls>listOfFunctionHalls=this.repository.findAll();
  	return listOfFunctionHalls;
  }

@GetMapping("/listOfFunctionHalls/{id}")
  public ResponseEntity<ListOfFunctionHalls> getTutorialById(@PathVariable("id") String id) {
    Optional<ListOfFunctionHalls> tutorialData = repository.findById(id);

    if (tutorialData.isPresent()) {
      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/listOfFunctionHalls")
  public ResponseEntity<ListOfFunctionHalls> createTutorial(@RequestBody ListOfFunctionHalls listOfFunctionHalls) {
    try {
    	ListOfFunctionHalls _tutorial = repository.save(new ListOfFunctionHalls(listOfFunctionHalls.getName(), listOfFunctionHalls.getOwnername(), listOfFunctionHalls.getLocation(),listOfFunctionHalls.getStreet(),listOfFunctionHalls.getPincode()));
      return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
    }
  }

  @PutMapping("/listOfFunctionHalls/{id}")
  public ResponseEntity<ListOfFunctionHalls> updateTutorial(@PathVariable("id") String id, @RequestBody ListOfFunctionHalls listOfFunctionHalls) {
    Optional<ListOfFunctionHalls> tutorialData = repository.findById(id);

    if (tutorialData.isPresent()) {
    	ListOfFunctionHalls _tutorial = tutorialData.get();
      _tutorial.setName(listOfFunctionHalls.getName());
      _tutorial.setOwnername(listOfFunctionHalls.getOwnername());
      _tutorial.setLocation(listOfFunctionHalls.getLocation());
      _tutorial.setStreet(listOfFunctionHalls.getStreet());
      _tutorial.setPincode(listOfFunctionHalls.getPincode());


      return new ResponseEntity<>(repository.save(_tutorial), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/listOfFunctionHalls/{id}")
  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") String id) {
    try {
      repository.deleteById(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }
  }

  @DeleteMapping("/listOfFunctionHalls")
  public ResponseEntity<HttpStatus> deleteAllTutorials() {
    try {
      repository.deleteAll();
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }
  }

  

}