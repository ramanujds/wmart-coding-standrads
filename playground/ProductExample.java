

import java.util.Scanner;

public class ProductExample {


    public static void main(String[] args) {

        String productName = args[0];
        double price = Double.parseDouble(args[1]);
        int quantity = Integer.parseInt(args[2]);
        boolean inStock  = true;

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Input product name : ");
//        productName = scan.nextLine();
//        System.out.print("Input price : ");
//        price = scan.nextDouble();
//        System.out.print("Input quantity : ");
//        quantity = scan.nextInt();

        System.out.println("Product Details : ");
        System.out.println("Name : "+productName);
        System.out.println("Price : "+price);
        System.out.println("Quantity : "+quantity);
        System.out.println("Available : "+inStock);

        double total = quantity * price;
        System.out.println("Total Price : "+total);




    }

}
