package com.KRT;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Jāievada 1. skaitlis
        System.out.println("Lūdzu ievadiet 1. skaitli:");

        System.out.println("");
        int num1 = scanner.nextInt();

        System.out.println("Lūdzu ievadiet +,-,/ vai '*'");
        System.out.println("");
        String oper;
        scanner.nextLine();
        oper = scanner.nextLine();

        System.out.println("Lūdzu ievadiet 2. skaitli:");

        System.out.println("");
        int num2 = scanner.nextInt();

        System.out.println("Rezultāts:");
        if(oper.equals("+")) System.out.println(num1 + num2);
        if(oper.equals("-")) System.out.println(num1 - num2);
        if(oper.equals("*")) System.out.println(num1 * num2);
        if(oper.equals("/")) System.out.println(num1 / num2);
        // write your code here
    }
}
