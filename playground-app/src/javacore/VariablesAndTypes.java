package javacore;

public class VariablesAndTypes {

    public static void main(String[] args) {
        // Variables
        int myNumber = 88;
        short myShort = 847;
        long myLong = 9797;
        double myDouble = 7.32436261616671;
        float myFloat = 324.3526261611661f;
        char myChar = 'y';
        boolean myBoolean = true;
        byte myByte = 127;

        // Print variables
        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);

        // Strings
        String text = "Hello";
        String blank = " ";
        String name = "Bob";
        String greeting = text + blank + name;

        System.out.println(greeting);

        // Print integers
        System.out.println("Hello" + " " + "Bob");
        System.out.println("My integer is: " + myNumber);

        // Print doubles
        System.out.println("My number is: " + myDouble);

        // Print booleans
        System.out.println("My boolean is: " + myBoolean);

        // Print characters
        System.out.println("My char is: " + myChar);
    }

}
