import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Object = An entity that holds data (attributes)
        //and can perform actions (methods)
        //It is a reference data type

        Scanner scanner = new Scanner(System.in);

        car car1 = new car();

        car1.isRunning = true;

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println("$" + car1.price);
        System.out.println(car1.isRunning);

        car1.start();
        car1.stop();

    }
}
