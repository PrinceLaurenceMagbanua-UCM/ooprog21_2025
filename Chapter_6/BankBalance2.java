import java.util.Scanner;

public class BankBalance2
{
public static void main(String[] args) {
    double bal;
    int response;
    int TIME_year = 1;
    final double INT_RATE = 0.03;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter initial bank balance > ");
    bal = scanner.nextDouble();
    scanner.nextLine();

    do{ 
        bal = bal + bal * INT_RATE;
        System.out.println("After year " + TIME_year + " at " + INT_RATE + " interest rate, balance is $" + bal);
        TIME_year = TIME_year + 1;
        System.out.println("\nDo you want to see the balance " + "at the end of another year?");
        System.out.println("Enter 1 for yes");
        System.out.print(" or any other number for no >> ");
        response = scanner.nextInt();
    } while(response == 1);
    scanner.close();
}
}