public class Ride {
    
    private String name;
    private String description;
    private Employee operator;

    public Ride(){
        //default
    }

    public Ride(String name, String description, Employee operator) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    

}
