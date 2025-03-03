package com.wmart.app;

import java.util.Scanner;

public class ProductExample {


    public static void main(String[] args) {

        String productName;
        double price;
        int quantity;
        boolean inStock;

        Scanner scan = new Scanner(System.in);

        System.out.print("Input product name : ");
        productName = scan.nextLine();
        System.out.print("Input price : ");
        price = scan.nextDouble();
        System.out.print("Input quantity : ");
        quantity = scan.nextInt();

        System.out.print("Is in stock(y/n)?");
        char option = scan.next().charAt(0);
//        inStock = option == 'y' ;

//        if (option == 'y' || option == 'Y'){
//            inStock = true;
//        }
//        else if(option == 'n' || option == 'N') {
//            inStock = false;
//        }
//        else {
//            inStock = false;
//            System.out.println("Invalid option");
//        }

//        switch (option){
//            case 'y':
//            case 'Y':
//                inStock = true;
//                break;
//            case 'n':
//            case 'N':
//                inStock = false;
//                break;
//            default:
//                inStock = false;
//                System.out.println("Invalid Option");
//                break;
//        }

        inStock = switch (option){
            case 'y','Y' -> true;
            case 'n','N' -> false;
            default -> false;
        };

        System.out.println("Product Details : ");
        System.out.println("Name : "+productName);
        System.out.println("Price : "+price);
        System.out.println("Quantity : "+quantity);
        System.out.println("Available : "+inStock);

        double total = quantity * price ;

        if( quantity >=5 ) {
            total *= 0.9;
        }
        else if (quantity >=2) {
            total *= 0.95;
        }
        else {
            total -= 100;
        }


        System.out.println("Total Price : "+total);

        // if quantity >= 5
        // apply 10% discount on the total price
        // if quantity >= 2 and <5
        // apply 5% discount
        // else give a 100 rs discount



    }

}
