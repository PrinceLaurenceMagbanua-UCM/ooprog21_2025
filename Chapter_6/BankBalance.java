import java.util.*;

public class BankBalance{
    public static void main(String[] args) {
        Scanner scannewr = new Scanner(System.in);

        int user_choice;
        final double int_rate = 0.03;
        int year = 0;
        double Bal;

        System.out.print("Enter initial bank balance: ");
        Bal = scannewr.nextInt();

        System.out.println("Do you want to see next year's balance? ");
        System.out.println("Enter 1 for yes or any number for no >> ");
        user_choice = scannewr.nextInt();
       

        while (user_choice == 1) {
            year ++;
             Bal = Bal + (Bal * int_rate);

            System.out.println("After " + year +  " year/s at 0.03 interest rate, balance is $" + bal);
        
            System.out.println("");

            System.out.println("Do you want to see the balance at the end of the year? ");
            System.out.println("Enter 1 for yes or any number for no >> ");
            user_choice = scannewr.nextInt();
            
        }
        
        scannewr.close();

    }
}
