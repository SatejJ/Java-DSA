package ConditionalsandLoops;

public class Occurance {
    public static void main(String[] args) {
        int num = 7277;
        int count = 0;
        while(num>0){ // as we are dividing the num after every iteration this reduces the number 
            int rem = num % 10; // modulo returns the last digit of the num
            if(rem == 7){
                count ++;
            }
            num = num/10; // when num divided by 10 this eleminates last digit as we know num is int not float 
            System.out.println(count);
        }  
    }
}
