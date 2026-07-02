import java.util.Random;

public class numberguess {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        int number2;
        int number3;
        boolean isHeads;

        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }


    }
}
