package association;

import task.Person.Company;
import task.Person.Employee;

import java.util.List;

public class AssociationCounter {

    public static int countEmployeeAssociations(Employee employee){
        int associations = 0;
        associations += employee.getCompanies().size();
        return associations;
    }

    public static int countCompanyAssociations(Company company){
        int associations = 0;
        associations += company.getEmployees().size();
        return associations;
    }

    public static boolean checkAssociations(Employee employee, Company company){
        return countEmployeeAssociations(employee) == countCompanyAssociations(company);
    }

    public static boolean checkExtension(List<Company> companies, List<Employee> employees) {
        int totalCompanyEmployees = 0;
        for (Company company : companies) {
            totalCompanyEmployees += company.getEmployees().size();
        }

        return employees.size() == totalCompanyEmployees;
    }
}
