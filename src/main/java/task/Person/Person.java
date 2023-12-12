package task.Person;

import exceptions.BadPattern;
import exceptions.InvalidName;
import service.PersonService;

public abstract class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) throws InvalidName, BadPattern {
        PersonService.validateNameNull(name);
        PersonService.validateNamePattern(name);
        PersonService.validateSurnameNull(surname);
        PersonService.validateSurnamePattern(surname);

        this.name = name;
        this.surname = surname;

    }

    //moj tescik


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return name + " " + surname;
    }
}
