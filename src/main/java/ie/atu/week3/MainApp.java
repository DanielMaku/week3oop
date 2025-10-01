package ie.atu.week3;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Calculator calc = new Calculator();


        System.out.println("Please enter the first number: ");
        int firstNum = input.nextInt();

        System.out.println("Please enter the second number: ");
        int secondNum = input.nextInt();

        input.nextLine();

        System.out.println("Pick an operation (add,subtract, multiply, divide): ");
        String operation = input.next();

        double result = switch (operation)
        {
         case "add" ->
         {
             Calculator calculator = new Calculator();
             yield calc.add(firstNum, secondNum);
         }

            case "subtract" ->
            {
                Calculator calculator = new Calculator();
                yield calc.subtract(firstNum, secondNum);
            }
            default  ->
            {
                System.out.println("Invalid operation");
                yield 0;
            }

        };


        System.out.println("The answer is: " + result);




    }
}
