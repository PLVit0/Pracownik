package task.Person;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person{
    private List<Company> companies = new ArrayList<>();

    public Employee(String name, String surname, int salary) throws InvalidName, WrongValue, BadPattern {
        super(name, surname, salary);
    }

    public void employment (Company company){
        companies.add(company);
        company.addEmployee(this);
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
