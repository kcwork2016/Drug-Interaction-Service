package com.saturn2018.druginteractionservice.service.impl;

import com.saturn2018.druginteractionservice.model.Person;
import com.saturn2018.druginteractionservice.service.api.PersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonServiceImpl  implements PersonService {

    //fake data
    private List<Person> persons = new ArrayList<>(
            Arrays.asList(new Person(1, "11","Steve","Daless","D03/04/1970"),
                    new Person(2, "22","Steve","Daless","D03/04/1970")
            )
    );


    public void addPerson(Person person) { persons.add(person); }

    public void deletePerson (int personKey) { persons.removeIf(t->t.getPersonkey()==personKey); }

    public List<Person> getAllPerson() { return persons; }

}
