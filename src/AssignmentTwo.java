import java.util.Comparator;

public class AssignmentTwo {

    public static void main(String[] args) {

        AssignmentTwo assignmentTwo = new AssignmentTwo();
        // assignmentTwo.partThree();
        // assignmentTwo.partFourA();
        assignmentTwo.partFourB();

    }

    public void partThree() {
        Employee operator = new Employee("Andy", "female", 35, "E001", "Ride operator");
        Ride rollerCoaster = new Ride("Roller Coaster", "Visitor with heart disease cannot ride", operator);

        Visitor visitor1 = new Visitor("Zhangsan", "female", 25, "V001", "13800138001");
        Visitor visitor2 = new Visitor("Zhangwuji", "male", 32, "V002", "13900139002");
        Visitor visitor3 = new Visitor("Zhangsanfeng", "male", 28, "V003", "13600136003");
        Visitor visitor4 = new Visitor("Liudehua", "male", 45, "V004", "13700137004");
        Visitor visitor5 = new Visitor("Zhaowei", "female", 36, "V005", "13500135005");

        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        
        rollerCoaster.printQueue();

        rollerCoaster.removeVisitorFromQueue();
        rollerCoaster.printQueue();

    }

    public void partFourA() {
        Employee operator = new Employee("Jacket", "male", 51, "E002", "Ride operator");
        Ride waterRide = new Ride("Water Ride", "Visitor with heart disease cannot ride", operator);
        System.out.println("Create a new Ride object:"+waterRide.getName());

        Visitor visitor1 = new Visitor("Zhangsan", "female", 25, "V001", "13800138001");
        Visitor visitor2 = new Visitor("Zhangwuji", "male", 32, "V002", "13900139002");
        Visitor visitor3 = new Visitor("Zhangsanfeng", "male", 28, "V003", "13600136003");
        Visitor visitor4 = new Visitor("Liudehua", "male", 45, "V004", "13700137004");
        Visitor visitor5 = new Visitor("Zhaowei", "female", 36, "V005", "13500135005");

        waterRide.addVisitorToHistory(visitor1);
        waterRide.addVisitorToHistory(visitor2);
        waterRide.addVisitorToHistory(visitor3);
        waterRide.addVisitorToHistory(visitor4);
        waterRide.addVisitorToHistory(visitor5);

        boolean inHisory=waterRide.checkVisitorFromHistory(visitor5);
        if (inHisory) {
            System.out.println(visitor5.getName()+" is in ride history.");
        }else{
            System.out.println(visitor5.getName()+" is not in ride history.");
        }

        int num = waterRide.numberOfVisitors();
        System.out.println("Number of visitors in "+waterRide.getName()+" ride hisroty: "+num);

        waterRide.printRideHistory();

    }

    public void partFourB() {
        Employee operator = new Employee("Mack", "female", 41, "E003", "Ride operator");
        Ride waterRide = new Ride("Water Ride", "Visitor with heart disease cannot ride", operator);
        System.out.println("Create a new Ride object: "+waterRide.getName());

        Visitor visitor1 = new Visitor("Zhangsan", "female", 25, "V001", "13800138001");
        Visitor visitor2 = new Visitor("Zhangwuji", "male", 45, "V002", "13900139002");
        Visitor visitor3 = new Visitor("Zhangsanfeng", "male", 28, "V003", "13600136003");
        Visitor visitor4 = new Visitor("Liudehua", "male", 45, "V004", "13700137004");
        Visitor visitor5 = new Visitor("Zhaowei", "female", 36, "V005", "13500135005");
        Visitor visitor6 = new Visitor("Liudehua1", "female", 36, "V006", "13500135005");

        waterRide.addVisitorToHistory(visitor1);
        waterRide.addVisitorToHistory(visitor2);
        waterRide.addVisitorToHistory(visitor3);
        waterRide.addVisitorToHistory(visitor4);
        waterRide.addVisitorToHistory(visitor5);
        waterRide.addVisitorToHistory(visitor6);

        waterRide.printRideHistory();

        System.out.println();
        waterRide.sortRideHistory(new VisitorComparator());

        System.out.println("\nAfter sort by age and name.");
        waterRide.printRideHistory();

    }

    public void partFive() {
        Employee operator = new Employee("Mimi", "female", 38, "E004", "Ride operator");
        Ride rollerCoaster = new Ride("Roller Coaster", "Visitor with heart disease cannot ride", operator,4);
        System.out.println("Create a new Ride object:"+rollerCoaster.getName());

        Visitor visitor1 = new Visitor("Zhangsan", "female", 25, "V001", "13800138001");
        Visitor visitor2 = new Visitor("Zhangwuji", "male", 32, "V002", "13900139002");
        Visitor visitor3 = new Visitor("Zhangsanfeng", "male", 28, "V003", "13600136003");
        Visitor visitor4 = new Visitor("Liudehua", "male", 45, "V004", "13700137004");
        Visitor visitor5 = new Visitor("Zhaowei", "female", 36, "V005", "13500135005");
        Visitor visitor6 = new Visitor("visitor6", "female", 25, "V006", "13800138001");
        Visitor visitor7 = new Visitor("visitor7", "male", 32, "V007", "13900139002");
        Visitor visitor8 = new Visitor("visitor8", "male", 28, "V008", "13600136003");
        Visitor visitor9 = new Visitor("visitor9", "male", 45, "V009", "13700137004");
        Visitor visitor10 = new Visitor("visitor10", "female", 36, "V0010", "13500135005");

        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        rollerCoaster.addVisitorToQueue(visitor6);
        rollerCoaster.addVisitorToQueue(visitor7);
        rollerCoaster.addVisitorToQueue(visitor8);
        rollerCoaster.addVisitorToQueue(visitor9);
        rollerCoaster.addVisitorToQueue(visitor10);

        rollerCoaster.printQueue();

        rollerCoaster.runOneCycle();

        rollerCoaster.printQueue();

        rollerCoaster.printRideHistory();
    }

    public void partSix() {
    }

    public void partSeven() {
    }

}