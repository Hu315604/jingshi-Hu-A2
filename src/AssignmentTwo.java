public class AssignmentTwo {

    public static void main(String[] args) {

        AssignmentTwo assignmentTwo = new AssignmentTwo();
        // assignmentTwo.partThree();
        assignmentTwo.partFourA();

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
    }

    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }

}