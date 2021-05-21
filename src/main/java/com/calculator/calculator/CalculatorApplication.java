package com.calculator.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
@SpringBootApplication



class Calculator {

    public static void main(String[] args) {

        int num1 = 0;

        int num2 = 0;

        char operator;

        double answer = 0.0;


        Scanner scanObject = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = scanObject.nextInt();
        System.out.println("Enter second number: ");
        num2 = scanObject.nextInt();
        System.out.println("Choose operation");
        operator = scanObject.next().charAt(0);

        switch (operator){

            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1 / num2;
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
    }
}
