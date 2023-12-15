package task.Person;

import exceptions.BadPattern;
import exceptions.InvalidName;
import org.junit.Before;
import org.junit.Test;
import service.PersonService;

import static org.junit.Assert.*;

public class PersonTest {


    private ConcretePerson person;

    @Before
    public void init() throws InvalidName, BadPattern {
        person = new ConcretePerson("Kamil", "Zako");
    }

    @Test(expected = InvalidName.class)
    public void isValidateingNameNullCorrectly() throws InvalidName {
        person.validateNameNull(null);
    }

    @Test(expected = InvalidName.class)
    public void isValidateingSurnameNullCorrectly() throws InvalidName {
        person.validateSurnameNull(null);
    }

    @Test
    public void isValidateintRightNameCorrectly() throws BadPattern {
        person.validateNamePattern(person.getName());
    }

    @Test(expected = BadPattern.class)
    public void isValidateingWrongNameCorrectly() throws BadPattern {
        person.validateSurnamePattern("69Żaneta");
    }

    @Test
    public void isValidateingRightSurnameCorrectly() throws BadPattern {
        person.validateSurnamePattern("Zako");
    }

    @Test(expected = BadPattern.class)
    public void isValidateingWrongSurnameCorrectly() throws BadPattern {
        person.validateSurnamePattern("997Kowalski");
    }
}