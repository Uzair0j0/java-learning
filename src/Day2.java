import java.util.Scanner;

public class Day2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are You a student (True/False): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " Years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Student= " + isStudent);



    scanner.close();
    }
}
