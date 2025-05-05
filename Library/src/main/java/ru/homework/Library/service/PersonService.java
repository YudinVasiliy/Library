package ru.homework.Library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.homework.Library.DAO.PersonDAO;
import ru.homework.Library.Models.Book;
import ru.homework.Library.Models.Person;

import java.util.List;

@Service
public class PersonService {

    private final PersonDAO personDAO;

    @Autowired
    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public List<Person> getAllPersons() {
        return personDAO.getAllPersons();
    }

    public Person getPersonById(int id) {
        return personDAO.getPersonById(id);
    }

    public List<Book> getAllBooksByOwner(int id) {
        return personDAO.getAllBooksByOwner(id);
    }

    public Person addPerson(Person person) {
        return personDAO.addPerson(person);
    }

    public void updatePerson(int id, Person person) {
        personDAO.updatePerson(id, person);
    }

    public void deletePerson(int id) {
        personDAO.deletePerson(id);
    }
}
