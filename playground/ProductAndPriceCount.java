package com.wmart.app;

import java.util.Scanner;

public class ProductAndPriceCount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input total item count : ");
        int count = scan.nextInt();

        double total = 0;

//        int iteration = 1;
//        while(iteration <= count){
//            System.out.println("Enter price for Item "+iteration);
//            double price = scan.nextDouble();
//            total = total + price;
//            iteration++;
//        }
        for (int itr = 1; itr <= count; itr++){
            System.out.println("Enter price for Item "+itr);
            double price = scan.nextDouble();
            if (price <= 0){
                continue;
            }
            total = total + price;
        }

        System.out.println("Total Price = "+total);

    }

}
