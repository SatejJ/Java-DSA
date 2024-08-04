package ConditionalsandLoops;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;
        while(number>0){
            int rem = number % 10 ; // gives us the last element of the number
            number = number / 10; // eleminates the last element of the number
            reverse = reverse *10 + rem; // say for example we have to store 54321, now we already have 5 in reverse and we want 5 to move to left therefore we multiply 5 x10 which gives 50 and then adds rem which stores 4 and gives us 54 in return and then this will continue till the loop executes.
        }
        System.out.print(reverse);
    }
}
