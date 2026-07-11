import java.util.Scanner;

public class whileLoop {
    public static void main (String[] args){

        //While loop = repeat code forever
        //              while condition remains true

        Scanner scanner = new scanner(System.in);

        String name = "";
        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
    }
}
