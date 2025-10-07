import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int empNum = input.nextInt();

        System.out.print("How many hours did you work this week? ");
        double hours = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        Employee emp = new Employee(empNum, rate);

        double regularPay = emp.calculateRegularPay(hours);
        double overtimePay = emp.calculateOvertimePay(hours);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

        input.close();
    }
}

class Employee {
    private int employeeNumber;
    private double payRate;
    private final int MAX_EMPLOYEE_NUMBER = 9999;
    private final double MAX_RATE = 60.00;
    private final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER)
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        else
            this.employeeNumber = employeeNumber;

        if (payRate > MAX_RATE)
            this.payRate = MAX_RATE;
        else
            this.payRate = payRate;
    }

    public double calculateRegularPay(double hoursWorked) {
        if (hoursWorked <= 40)
            return hoursWorked * payRate;
        else
            return 40 * payRate;
    }

    public double calculateOvertimePay(double hoursWorked) {
        if (hoursWorked > 40)
            return (hoursWorked - 40) * payRate * OVERTIME_MULTIPLIER;
        else
            return 0;
    }
}
