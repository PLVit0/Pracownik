package service;

import task.Person.Company;
import task.Person.CompanyE;
import task.Person.Employee;


public class CompanyService {

    public static int getTotalSalaries(Company company) {
        int sum = 0;
        for (Employee employee : company.getEmployees()) {
            sum += employee.getSalary();
        }
        return sum;
    }
}
