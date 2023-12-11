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

    //DODANE BEZ UZYCIA
    public static boolean checkAssociations(Employee employee) {
        for (Company company : employee.getCompanies()) {
            if (!company.getEmployees().contains(employee)) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkTotalSalary(Employee employee) {
        int sum = 0;
        for (Company company : employee.getCompanies()) {
            sum += CompanyService.getTotalSalaries(company);
        }
        return sum == employee.getSalary();
    }

}
