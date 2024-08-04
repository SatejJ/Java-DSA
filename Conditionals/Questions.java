package ConditionalsandLoops;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number :");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd number :");
        int num3 = in.nextInt();

        // Find biggest of three numbers
        // if(num1>num2 && num1>num3){
        //     System.out.println(num1);
        // }
        // else if(num2>num3){
        //     System.out.println(num2);
        // }
        // else{
        //     System.out.println(num3);
        // }

        int max = num1;
        if(max < num2){
            max = num2;
            System.out.println(num2);
        }
        if(max < num3){
            max = num3;
            System.out.println(num3);
        }
     System.out.println(num1);
}   
} 
