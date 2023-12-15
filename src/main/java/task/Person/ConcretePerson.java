package task.Person;

import exceptions.BadPattern;
import exceptions.InvalidName;

public class ConcretePerson extends Person{

    public ConcretePerson(String name, String surname) throws InvalidName, BadPattern {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "ConcretePerson{}";
    }
}
