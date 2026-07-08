
public class stringMethods {
    public static void main(String[] args){

        //We can use string length method to set a limit to characters in a password

        String name = "Uzair Iqbal";

        int length = name.length();
        char letter = name.charAt(8);
        int index = name.indexOf("l");
        int lastIndex = name.lastIndexOf("l");

        //we also have upper and lower case string methods
        name = name.toUpperCase();

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);


    }
}
