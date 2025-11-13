public class Employee extends Person{
    private String employeeID;
    private String position;

    public Employee(){
        // Default constructor
    }

    public Employee(String name, String sex, int age, String employeeID, String position){
        super(name, sex, age);
        this.employeeID = employeeID;
        this.position = position;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    
}
