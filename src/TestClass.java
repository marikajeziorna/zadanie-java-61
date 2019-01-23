import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Give the current temp in the room1: ");
        double currentTempInTheRoom1 = scanner1.nextDouble();
        System.out.println("Give the measurement for the room1: ");
        double roomMeasurement1 = scanner1.nextDouble();

        Room room1 = new Room(roomMeasurement1, currentTempInTheRoom1,true ,18);

        double room1CurrentTemp = room1.getCurrentTemp();
        double room1Measurement = room1.getMeasurement();
        double room1MinTemp = room1.getMinTemp();
        boolean room1AirCondition = room1.isAirCondition();
        boolean room1CanWeSetUpLowerTemp = room1.canSetLowerTemperature();
        boolean room1SetUpLowerTemperature = room1.setUpLowerTheTemperature();

        System.out.println("Get the current temp in the room no. 1: " + room1CurrentTemp);
        System.out.println("Get measurement in the room no. 1: " + room1Measurement);
        System.out.println("Get the min temp in the room no. 1: " + room1MinTemp);
        System.out.println("is it installed air conditioner in the room? " + room1AirCondition);
        System.out.println("Can I set up lower temp in the room no. 1: " + room1CanWeSetUpLowerTemp);
        System.out.println("I set up lower temp in the room no. 1: " + room1SetUpLowerTemperature);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Give the current temp in the room2: ");
        double currentTempInTheRoom2 = scanner2.nextDouble();
        System.out.println("Give the measurement for the room2: ");
        double roomMeasurement2 = scanner2.nextDouble();

        Room room2 = new Room(roomMeasurement2, currentTempInTheRoom2,false ,10);

        double room2CurrentTemp = room2.getCurrentTemp();
        double room2Measurement = room2.getMeasurement();
        double room2MinTemp = room2.getMinTemp();
        boolean room2AirCondition = room2.isAirCondition();
        boolean room2CanWeSetUpLowerTemp = room2.canSetLowerTemperature();
        boolean room2SetUpLowerTemperature = room2.setUpLowerTheTemperature();

        System.out.println("Get the current temp in the room no. 2: " + room2CurrentTemp);
        System.out.println("Get measurement in the room no. 2: " + room2Measurement);
        System.out.println("Get the min temp in the room no. 2: " + room2MinTemp);
        System.out.println("is it installed air conditioner in the room? " + room2AirCondition);
        System.out.println("Can I set up lower temp in the room no. 2: " + room2CanWeSetUpLowerTemp);
        System.out.println("I set up lower temp in the room no. 2: " + room2SetUpLowerTemperature);
    }
}
