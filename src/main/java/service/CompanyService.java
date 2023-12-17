package service;

import model.Company;
import model.Employee;


public class CompanyService {

    public int getTotalSalaries(Company company) {
        int sum = 0;
        for (Employee employee : company.getEmployees()) {
            sum += employee.getSalary();
        }
        return sum;
    }
}
