package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0.0;
        Scanner object = new Scanner(System.in);
        System.out.println("**__Calculator**__");
        System.out.println("Enter first number-");
        num1 = object.nextInt();
        System.out.println("Enter second number-");
        num2 = object.nextInt();
                   
        System.out.println("what operatror!");
        operator =object.next().charAt(0);
        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
        }
                System.out.println(num1+" "+operator+" "+num2+" = "+answer);

        }
    }


