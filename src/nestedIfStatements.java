public class nestedIfStatements {
    public static void main(String[] args){

        boolean isStudent = true;
        boolean is;
        double price = 9.99;

        if(isStudent){
            System.out.println("You get a student discount of 10%");
            price *= 0.9;

        }
        else{
            price *= 1;
        }

        System.out.printf("The price of the ticket is : $%.2f", price);

    }
}
