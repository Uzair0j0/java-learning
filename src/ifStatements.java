import java.util.Scanner;

public class ifStatements {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        int age;
        System.out.print("Enter Your age: ");
        age = scanner.nextInt();

        //Group 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name! ");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        //Group 2
        if(age >= 65){

            System.out.println("You are a Senior");
        }
        else if (age >= 18) {
            System.out.println("you are an adult!");
        }
        else if(age <= 0){
            System.out.println("You haven't been born yet");
        }
        else{
            System.out.println("You are not an adult!");
        }

        scanner.close();
    }
}
