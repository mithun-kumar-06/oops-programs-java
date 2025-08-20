public class Car {
    // Attributes
    String model;
    String color;

    // Constructor to initialize model and color
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Method to start the car
    public void start() {
        System.out.println(model + " in " + color + " color is starting.");
    }

    // Method to stop the car
    public void stop() {
        System.out.println(model + " is stopping.");
    }

    // Main method to create object and invoke methods
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota Camry", "Red");

        // Invoking methods
        myCar.start();
        myCar.stop();
    }
}
