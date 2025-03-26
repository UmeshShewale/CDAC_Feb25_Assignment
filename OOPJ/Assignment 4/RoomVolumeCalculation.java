/*Q1. Room Volume Calculation 
Design a class named Room with three data members: height, width, and breadth. Include a method 
volume() to compute and return the volume of the room. Create a separate class RoomDemo that 
creates instances of the Room class and displays the volume for each instance.*/
import java.util.*;

class Room {
    int height;
    int width;
    int breadth;

    public Room(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    void volume() {
        double volume = height * width * breadth; 
        System.out.println("Volume: " + volume); 
    }
}

class RoomDemo extends Room {RoomDemo(int height, int width, int breadth) {
        super(height, width, breadth); 
    }
}

public class RoomVolumeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter dimensions of the room: ");
            int height = sc.nextInt();
            int width = sc.nextInt();
            int breadth = sc.nextInt();


            if (height <= 0 || width <= 0 || breadth <= 0) {
                throw new IllegalArgumentException("Values can't be zero or negative.");
            }
            Room room = new RoomDemo(height, width, breadth);
            room.volume(); 

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        } finally {
            sc.close(); 
        }
    }
}
