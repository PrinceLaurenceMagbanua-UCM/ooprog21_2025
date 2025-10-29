import java.util.Scanner;

public class BankBalanceRateandYear{
   public static void main(){

      Scanner Scanner = new Scanner(System.in);

      System.out.print("Enter initial balance > ");
      double balance = Scanner.nextDouble();
      double rt = 0.02;
      double tmp = balance;

      for(int x=1; x<=4; x++){
         System.out.println("\nWith an initial balance of $"+balance+" at an interest of "+rt);
         for(int y=1; y<=4; y++){
            balance+=(balance*rt);
            System.out.println("After year "+y+" balance is $"+balance);
         }
         
         rt+=0.01;
         balance=tmp;
      }
   }
}