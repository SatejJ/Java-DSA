package ConditionalsandLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result = 0 ;
        Scanner in = new Scanner(System.in);
        while(true){
        System.out.print("Enter the operation to perform : ");
     char op = in.next().trim().charAt(0);
        
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter num1:");
                int num1 = in.nextInt();
                System.out.print("Enter num2:");
                int num2= in.nextInt();

                if(op == '+'){
                    result = num1+num2;
                }
                if(op == '-'){
                    result = num1-num2;
                }
                if(op == '*'){
                    result = num1*num2;
                }
                if(op == '/')
                { if(num2>0){
                    result = num1/num2;

                }   
                }
                if(op == '%'){
                    result = num1%num2;
                }
                
            }
            else if(op == 'X' || op == 'x'){
                break;
            }
            else{
                System.out.print("Enter Valid operation");
            }
            System.out.println(result);
        }
    }
    
}
