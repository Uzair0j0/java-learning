import java.util.Scanner;

public class forloops {
    public static void main(String[] args){

        //for loops = execute a block of code for a certain amount of time

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i <= 10 ; i+=2){
            System.out.println("*");
        }

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1 ; i <= max ; i++){
                System.out.println(i);
        }

        //Making a count down

        int start = 10;

        for(int i = start; i > 0; i-- ){
            System.out.println(i);
        }

        //Break = break out of a loop(Stop)
        //Continue = skip current iteration of a loop(Skip)

        for(int i = 0; i<=10; i++){
            if(i == 5){
                break;
            }
            System.out.print(i + " ");
        }


        scanner.close();
    }
}
