package service;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;
import org.junit.Before;
import org.junit.Test;
import task.Person.Employee;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    @Test
    public void isValidateingSalaryCorrectly() throws WrongValue {
        EmployeeService.validateSalary(2000);
    }

    @Test(expected = WrongValue.class)
    public void isValidateingWrongSalaryCorrectly() throws WrongValue {
        EmployeeService.validateSalary(-1000);
    }




}