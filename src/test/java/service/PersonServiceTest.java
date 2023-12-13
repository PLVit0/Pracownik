package service;

import exceptions.BadPattern;
import exceptions.InvalidName;
import org.junit.Before;
import org.junit.Test;
import task.Person.Person;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class PersonServiceTest {


    private String rightName;
    private String wrongName;
    private String rightSurname;
    private String wrongSurname;


    @Before
    public void init(){
        rightName = "Kamil";
        wrongName = "69Żaneta";
        rightSurname = "Kowalski";
        wrongSurname = "0Ziobro";
    }

    @Test
    public void isValidateingNameNullCorrectly() {
        assertThrows(InvalidName.class, () -> PersonService.validateNameNull(null));
    }

    @Test
    public void isValidateingSurnameNullCorrectly() {
        assertThrows(InvalidName.class, () -> PersonService.validateSurnameNull(null));
    }

    @Test
    public void isValidateintRightNameCorrectly() throws BadPattern {
        PersonService.validateNamePattern(rightName);
    }

    @Test
    public void isValidateingWrongNameCorrectly() {
        assertThrows(BadPattern.class, () -> PersonService.validateNamePattern(wrongName));
    }

    @Test
    public void isValidateingRightSurnameCorrectly() throws BadPattern {
        PersonService.validateSurnamePattern(rightSurname);
    }

    @Test
    public void isValidateingWrongSurnameCorrectly() {
        assertThrows(BadPattern.class, () -> PersonService.validateSurnamePattern(wrongSurname));
    }





}