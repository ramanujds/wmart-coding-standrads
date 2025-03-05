package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {

    public static void main(String[] args) {

        File file = new File("data.txt");
        try(Scanner scanner = new Scanner(file)){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        catch (FileNotFoundException ex){
            System.out.println("Error : "+ex.getMessage());
        }


    }

}
