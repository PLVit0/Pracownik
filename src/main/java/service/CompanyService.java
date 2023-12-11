package service;

import task.Person.Company;
import task.Person.CompanyE;
import task.Person.Employee;


public class CompanyService {

    public static boolean isValidCompanyName(CompanyE company) {
        String companyName = company.name();
        return companyName.length() >= 3 && companyName.length() <= 10;
    }
    public static int getTotalSalaries(Company company) {
        int sum = 0;
        for (Employee employee : company.getEmployees()) {
            sum += employee.getSalary();
        }
        return sum;
    }
}
