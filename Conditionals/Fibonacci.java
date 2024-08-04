package ConditionalsandLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); //Takes the input
        int a = 0; // first digit of  the series
        int b = 1; // second digit in series
        int count = 2; // Basically to track the iterations(how many times the loop will run) initialized to 2 coz a and b are declared.
        while(count<= n ){
            int temp = b; // temp stores the value of (previous) b as it updates in next step
            b = b + a; // here b updates 
            a = temp; // temp = b , a = temp therefore a = b ;
            count++;
        }
        System.out.println(b);

    }
    
}
