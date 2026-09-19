public class car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2012;
    double price = 12000.56;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    void drive(){
        System.out.println("You are driving" + make);
    }
}
