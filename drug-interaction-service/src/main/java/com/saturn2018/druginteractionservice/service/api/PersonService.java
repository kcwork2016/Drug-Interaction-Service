package com.saturn2018.druginteractionservice.service.api;

import com.saturn2018.druginteractionservice.model.Person;

import java.util.List;

public interface PersonService {

   void addPerson(Person person);

   void deletePerson(int personKey);

   List<Person> getAllPerson ();
}
