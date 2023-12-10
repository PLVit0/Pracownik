package task.Person;

import java.util.regex.Pattern;

public abstract class Person {

    private String name;
    private String surname;
    private int salary;

    public Person(String name, String surname, int salary) throws InvalidName, WrongValue, BadPattern {
        validateNameNull(name);
        validateNamePattern(name);
        validateSurnameNull(surname);
        validateSurnamePattern(surname);
        validateSalary(salary);
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void validateNameNull(String name) throws InvalidName {
        if (name == null || name.isEmpty()){
            throw new InvalidName("Name can't be null!");
        }
    }

    public void validateNamePattern(String name) throws BadPattern {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        if (!pattern.matcher(name).matches()){
            throw new BadPattern("Bad pattern");
        }
    }
    public void validateSurnameNull(String surname) throws InvalidName{
        if (surname == null || surname.isEmpty()){
            throw new InvalidName("Name can't be null!");
        }
    }
    public void validateSurnamePattern(String surname) throws BadPattern {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}(?: ?-?[A-Z][a-z]{2,})?$");
        if (!pattern.matcher(surname).matches()){
            throw new BadPattern("Bad pattern");
        }
    }
    public void validateSalary(int salary) throws WrongValue {
        if (salary < 0){
            throw new WrongValue("Salary can't be lower than 0!");
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return name + " " + surname;
    }
}
