import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
import java.util.Iterator;

public class Ride implements RideInterface {

    private String name;
    private String description;
    private Employee operator;

    // part3 waiting line
    private Queue<Visitor> waitingQueue;
    // part4
    private LinkedList<Visitor> rideHistory;

    public Ride() {
        // default
    }

    public Ride(String name, String description, Employee operator) {
        this.name = name;
        this.description = description;
        this.waitingQueue = new LinkedList<>();
        rideHistory = new LinkedList<>();
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
    public void removeVisitorFromQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Waiting que is empty.");
        } else {
            Visitor removedVisitor = waitingQueue.remove();
            System.out.println(removedVisitor.getName() + " has remove from the queue.");
        }

    }

    @Override
    public void printQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("There is nobody in queue.");
        } else {
            System.out.println("Queue:");
            for (Visitor visitor : waitingQueue) {
                System.out.println("VisitorID:" + visitor.getVisitorID() + ", Name:" + visitor.getName() + ", Age:"
                        + visitor.getAge() + ", Sex:" + visitor.getSex() + ", Phone:" + visitor.getPhone());
            }
        }

    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Visitor is null, there cannot join a null visitor to ride history");
        } else {
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " has been added to the ride history.");
        }
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Visitor is null.");
            return false;
        }
        if (rideHistory.isEmpty()) {
            System.out.println("Ride histroy is empty.");
            return false;
        }

        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        if (rideHistory.isEmpty()) {
            System.out.println("Ride histroy is empty.");
            return 0;
        }
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("The ride history is empty.");
        } else {
            System.out.println("Ride History:");
            // Iterator
            Iterator<Visitor> iterator = rideHistory.iterator();

            // hasNext() check if there is a next element
            while (iterator.hasNext()) {
                Visitor visitor = iterator.next();
                System.out.println("VisitorID:" + visitor.getVisitorID() + ", Name:" + visitor.getName() + ", Age:"
                        + visitor.getAge() + ", Sex:" + visitor.getSex() + ", Phone:" + visitor.getPhone());
            }

        }

    }

    

    @Override
    public void runOneCycle() {
        // TODO Auto-generated method stub

    }

}
