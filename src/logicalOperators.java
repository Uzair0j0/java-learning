public class logicalOperators {
    public static void main (String[] args){

        /*logical operators

        && = AND
        || = OR
        !  = NOT
                     */
        double temp = 20;
        boolean isSunny = true;


        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good");
            System.out.println("It is sunny outside");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("It is cloudy outside");
        }
        else if(temp >30 || temp < 0){
            System.out.println("The weather is BAD");
        }
    }
}
