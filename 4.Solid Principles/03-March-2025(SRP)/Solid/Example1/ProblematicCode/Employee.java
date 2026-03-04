

public class Employee{

    private int id;
    private String name;
    private String Address;

    public Employee(int id,String name,String Address){
        this.id= id;
        this.name  = name;
        this.Address = Address;
    }

    public void printPerformanceReport(){
        System.out.println("Performance report for employee:"+name);
    }
//If the report format changes we need to update this function 
    public double computeSalary(){
        return 1000.0;
    }
    // If the taxation changes, we might nedd to update this function

    public void updateEmployeeData(){
System.out.println("Employee data updated successfully");
    }
//If data storage is changed from database to file system then we need to change the code of this class which violates the Open Closed Principle.
    public void fetchEmployeeData(){
        System.out.println("Employee data fetched successfully");
    }
}

// Because the above class is doing too many things , there are too many reasons to update the code present in the class.This violates the Single Responsibility Principle.

 