import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ride implements RideInterface {

    private String name;
    private String description;
    private Employee operator;

    // part3 waiting line
    private Queue<Visitor> waitingQueue;
    // part4
    private LinkedList<Visitor> rideHistory;

    private int maxRider;
    private int numOfCycles;

    public Ride() {
        this.waitingQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = 1; // default
        this.numOfCycles = 0; // default
    }

    public Ride(String name, String description, Employee operator, int maxRider) {
        this.name = name;
        this.description = description;
        this.operator = operator;
        this.waitingQueue = new LinkedList<>();
        rideHistory = new LinkedList<>();
        this.maxRider = maxRider;
        this.numOfCycles = 0;
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

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
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

    public void sortRideHistory(Comparator<Visitor> comparator) {
        if (rideHistory.isEmpty()) {
            System.out.println("ride history is empty");
            return;
        }

        System.out.println("Sort ride history: " + name);
        Collections.sort(rideHistory, comparator);

    }

    @Override
    public void runOneCycle() {
        if (this.operator == null) {
            System.out.println("Cannot run the ride: No operator.");
            return;
        }

        if (waitingQueue.isEmpty()) {
            System.out.println("Cannot run the ride: The queue is empty.");
            return;
        }

        System.out.println("Starting one ride cycle.");
        int ridersThisCycle = 0;

        for (int i = 0; i < maxRider && !waitingQueue.isEmpty(); i++) {
            Visitor rider = waitingQueue.poll();
            addVisitorToHistory(rider);
            ridersThisCycle++;
        }
        System.out.println(ridersThisCycle + " visitors took the ride.");

        this.numOfCycles++;
        System.out.println("Total cycles run: " + this.numOfCycles);

    }

    public void exportRideHistory(String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            if (rideHistory.isEmpty()) {
                System.out.println("Ride history is empty. Nothing to export.");
                return;
            }

            for (Visitor visitor : rideHistory) {
                String line = visitor.getVisitorID() + "," +
                        visitor.getName() + "," +
                        visitor.getAge() + "," +
                        visitor.getSex() + "," +
                        visitor.getPhone();
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Successfully exported " + rideHistory.size() + " visitors to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public void importRideHistory(String fileName) {
         
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            int importedCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] visitorData = line.split(",");

                if (visitorData.length == 5) {
                    String id = visitorData[0];
                    String name = visitorData[1];
                    int age = Integer.parseInt(visitorData[2]);
                    String sex = visitorData[3];
                    String phone = visitorData[4];

                    Visitor visitor = new Visitor(name, sex, age, id, phone);

                    // add to history
                    rideHistory.add(visitor);
                    importedCount++;
                } else {
                    System.err.println("Skipping malformed line: " + line);
                }
            }

            System.out.println("Successfully imported " + importedCount + " visitors from " + fileName);

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred during import: " + e.getMessage());
        }
    }

}
