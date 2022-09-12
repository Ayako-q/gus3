package com.example.gus;
import java.util.Scanner; //importing Scanners library

public class Gus {
    public static void main(String[] args) {
        int weareworking = 72; //using integers (first type of comments)
        double cap = 33.4;
        float payperhour = 9.5F;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your name:");
        String urname = scan.nextLine(); //asking to input users name
        System.out.println("Enter your surname:");
        String surname = scan.nextLine();
        System.out.println("Hello, " + urname + ", and welcome to Los Pollos Hermanos family!");
        System.out.println("Our fast food restaurants have been working since 2016 for " + weareworking/12 + " years!");
        System.out.println("My name is Gustavo, but you can call me ...");
        System.out.print("Instead of ... there should be: \n A) Gus B) Bob C) Tom\n \nPlease, type A, B or C into chat:\n");
        String Gustavo = scan.nextLine();/* I am asking user to answer my question
        then I am answering if his answer was correct or not (second type of comments)
         */
        if(Gustavo.equals("A")){
            System.out.println("Thats correct! Lets continue");
        }
        else{
            System.out.println("Thats wrong! You can call me Gus");
        }
        System.out.println("Our capitalization is " + cap + "M$, our regular worker usually earns " + payperhour + "$ per hour, and " + payperhour*6*22 + "$ per month");
        System.out.println("Now tell me, do you have any experience?");
        String exp = scan.nextLine();
        System.out.println("So your answer is: " + exp + ". To be honest, " + urname + " " + surname + " - that doesn't matter, you r hired!");
        /**I haven't used all types of variables
         * I have no booleans and chars
         * but I think it's enough
         * third type
         * of comments in java
         **/

    }
}