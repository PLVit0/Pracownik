package service;

import exceptions.WrongValue;
import task.Person.Company;
import task.Person.Employee;

public class EmployeeService {

    public static void validateSalary(int salary) throws WrongValue {
        if (salary < 0){
            throw new WrongValue("Salary can't be lower than 0!");
        }
    }


}
