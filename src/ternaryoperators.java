public class ternaryoperators {
    public static void main(String[] args){

        //ternary operators ? = return 1 of 2 values if a condition is true

        //variable = (condition) ? ifTrue : ifFalse;       syntax

        int score = 70;

        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);
        /*
        We can use this if else statement but ternary operators do the job
        if(score >= 60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
         */
    }
}
