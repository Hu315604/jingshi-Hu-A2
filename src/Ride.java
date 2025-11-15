import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {

    private String name;
    private String description;
    private Employee operator;

    // part3 waiting line
    private Queue<Visitor> waitingQueue;

    public Ride() {
        // default
    }

    public Ride(String name, String description, Employee operator) {
        this.name = name;
        this.description = description;
        this.waitingQueue = new LinkedList<>();
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

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Visitor is null, there cannot join a null visitor to waiting line");
        } else {
            waitingQueue.add(visitor);
            System.out.println("Visitor " + visitor.getName() + " was joined to waiting line");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void printQueue() {
        // TODO Auto-generated method stub

    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int numberOfVisitors() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void printRideHistory() {
        // TODO Auto-generated method stub

    }

    @Override
    public void runOneCycle() {
        // TODO Auto-generated method stub

    }

}
