package exceptionhandling;

import java.util.Scanner;

class ExceptionHandling{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int []arr = new int[2];
        System.out.println("Hello,");
        System.out.println("Input the values for a and b");
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        System.out.println("Executing a divide operation");
        try {
            int result = arr[0] / arr[1];
            System.out.println("Output = " + result);
        }

        catch (ArithmeticException ex){
            System.out.println("Sorry we cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Error : "+ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Unknown Error : "+ex.getMessage());
        }

        System.out.println("Thank You");
        System.out.println("Would you like to try with different inputs?(y/n)");
        char ch = scan.next().charAt(0);
        System.out.println("Bye..");


    }
}