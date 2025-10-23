import java.util.Scanner;

public class DebugSix1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int days;
        double money = 0.01;
        int day = 1;

        System.out.print("Enter number of days >> "); 
        days = scanner.nextInt();

        while(day <= days)
        {
            System.out.println("After day " + day +
                " you have " + money);
            money = money * 2;  
            ++day;
        }
        scanner.close();
    }
   
}