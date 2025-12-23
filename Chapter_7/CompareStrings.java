import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String input = kb.nextLine();

        String predefined = "Carmen";

        if(input.equals(predefined)) {
            System.out.println(input + " equals " + predefined);
        } else {
            System.out.println(input + " does not equal " + predefined);
        }
    }
}
 
    
    

