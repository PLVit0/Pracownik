package service;

import exceptions.BadPattern;
import exceptions.InvalidName;

import java.util.regex.Pattern;

public class PersonService {

    public static void validateNameNull(String name) throws InvalidName {
        if (name == null || name.isEmpty()){
            throw new InvalidName("Name can't be null!");
        }
    }

    public static void validateNamePattern(String name) throws BadPattern {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        if (!pattern.matcher(name).matches()){
            throw new BadPattern("Bad pattern");
        }
    }
    public static void validateSurnameNull(String surname) throws InvalidName{
        if (surname == null || surname.isEmpty()){
            throw new InvalidName("Name can't be null!");
        }
    }
    public static void validateSurnamePattern(String surname) throws BadPattern {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}(?: ?-?[A-Z][a-z]{2,})?$");
        if (!pattern.matcher(surname).matches()){
            throw new BadPattern("Bad pattern");
        }
    }

}
