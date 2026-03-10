package BetterCode;
// This class follows the Single Responsibility Principle as it only has one reason to change which is when there is a change in employee data structure. It does not have any other responsibilities like computing salary, printing performance report or fetching employee data. This makes the code more maintainable and easier to understand.
public class Employee {
    private int id;
    private String name;
    private String  address;

    public Employee(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getEmployeeId(){
        return id;
    }
    public String getEmployeeName(){
        return name;
    }
    public String getEmployeeAddress(){
        return address;
    }
    public void setEmployeeAddress(String address){
        this.address = address;

    }
    public void setEmployeeName(String name){
        this.name = name;
    }
}
