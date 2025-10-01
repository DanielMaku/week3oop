package ie.atu.week3;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Calculator calc = new Calculator();


        System.out.println("Please enter the first number: ");
        int firstNum = scan.nextInt();

        System.out.println("Please enter the second number: ");
        int secondNum = scan.nextInt();

        Calculator calculator = new Calculator();
        int result = calc.add(firstNum, secondNum);
        System.out.println("The answer is: " + result);




    }
}
