public class Visitor extends Person{

    private String visitorID;
    private String phone;

    public Visitor() {
        // Default constructor
    }

    public Visitor(String name, String sex, int age, String visitorID, String phone) {
        super(name, sex, age);
        this.visitorID = visitorID;
        this.phone = phone;
    }

    public String getVisitorID() {
        return visitorID;
    }
    public void setVisitorID(String visitorID) {
        this.visitorID = visitorID;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
