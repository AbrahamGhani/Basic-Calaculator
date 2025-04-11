package org.example;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);





    // ==================================== Basic Calculator ====================================
        System.out.println("Enter the first Num: ");
        float num1 = input.nextFloat();
        input.nextLine();

        System.out.println("Enter the second Num: ");
        float num2 = input.nextFloat();

        input.nextLine();


        Calculators.doBasicMath(num1, num2);

        // Needed in order to Eat the left over next line from the Enter key press. if not done it will be
        // detected as an enter input instead of the users input


// ==================================== Payroll Calculator ====================================

        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter You're Working Hours: ");
        float hoursWorked = input.nextFloat();
        input.nextLine();
        System.out.println("What Is You're Pay Rate: ");
        float payRate = input.nextFloat();
        float totalPay;
        float overtimeRate = 1.5f;
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * payRate;
        }
        else {
            float overtime = hoursWorked - 40;
            float overtimePay = overtime * payRate * overtimeRate;
           totalPay = payRate * 40 + overtimePay;
        }

        System.out.println("The amount of money " + name + " made is " + totalPay);


    }
}