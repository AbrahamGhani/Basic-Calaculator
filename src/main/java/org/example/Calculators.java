package org.example;

import java.util.Scanner;

public class Calculators {
    public static void doBasicMath(float _num1, float _num2){
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want done:\n    (A) - Add\n    (S) - Subtract\n    (M) - Multiple\n    (D) - Divide");
        System.out.println("Choice: ");
        String mathOption = input.nextLine();

        if (mathOption.equalsIgnoreCase("A")){
            float result = _num1 + _num2;
            System.out.println(result);
        }
        else if (mathOption.equalsIgnoreCase("S")) {
            float result = _num1 - _num2;
            System.out.println(result);
        }
        else if (mathOption.equalsIgnoreCase("M")) {
            float result = _num1 * _num2;
            System.out.println(result);
        }
        else if (mathOption.equalsIgnoreCase("D")) {
            float result = _num1 / _num2;
            System.out.println(result);
        }
        else {
            System.out.println("Invalid Entry");
        }
    }

}
