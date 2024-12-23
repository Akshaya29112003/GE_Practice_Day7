package Logical_Programs;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Reverse_Number {
    public static int sample_reverse(int n){
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        return rev;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sample_reverse(n));
    }
}
