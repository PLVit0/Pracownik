package model;

import exceptions.BadPattern;
import exceptions.InvalidName;
import service.PersonService;

import java.util.regex.Pattern;

public abstract class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) throws InvalidName, BadPattern {
        validateNameNull(name);
        validateNamePattern(name);
        validateSurnameNull(surname);
        validateSurnamePattern(surname);

        this.name = name;
        this.surname = surname;

    }

    public void validateNameNull(String name) throws InvalidName {
        if (name == null || name.isEmpty()){
            throw new InvalidName("Name can't be null!");
        }
    }

    public  void validateNamePattern(String name) throws BadPattern {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        if (!pattern.matcher(name).matches()){
            throw new BadPattern("Bad pattern");
        }
    }
    public  void validateSurnameNull(String surname) throws InvalidName{
        if (surname == null || surname.isEmpty()){
            throw new InvalidName("Surname can't be null!");
        }
    }
    public  void validateSurnamePattern(String surname) throws BadPattern {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        if (!pattern.matcher(surname).matches()){
            throw new BadPattern("Bad pattern");
        }
    }

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
