package BetterCode;
public class EmployeeSalaryCalculation {

    public double computeSalary(Employee employee){
        // Salary calculation logic based on employee data
        return 1000.0; // Placeholder for actual salary computation
    }
}
// This class is responsible for computing the salary of an employee. If there is a change in the salary calculation logic, we only need to update this class without affecting the Employee class. This adheres to the Open Closed Principle as we can extend the functionality of salary computation without modifying the existing code.