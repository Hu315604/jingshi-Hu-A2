public interface RideInterface {

    public void addVisitorToQueue(Visitor visitor);

    public void removeVisitorFromQueue();

    public void printQueue();

    public void addVisitorToHistory(Visitor visitor);

    public boolean checkVisitorFromHistory(Visitor visitor);

    public int numberOfVisitors();

    public void printRideHistory();

    public void runOneCycle();

}
