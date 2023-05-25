import java.util.*;

abstract class Vehicle{
    public abstract void move();
}

class Helicopter extends Vehicle {
    // @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car extends Vehicle {
    // @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train extends Vehicle {
    // @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}

class VehicleFactory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of vehicle (Helicopter/Car/Train): ");
        String vehicleType = sc.nextLine();

        Vehicle vehicle;
        switch(vehicleType.toLowerCase()){
            case "helicopter":
                vehicle = new Helicopter();
                break;
            case "train":
                vehicle = new Train();
                break;
            case "car":
                vehicle = new Car();
                break;
            default:
                System.out.println("Invalid vehicle type.");
                sc.close();
                return;
        }
        vehicle.move();
        sc.close();
        
    }
}