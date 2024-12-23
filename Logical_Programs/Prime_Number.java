package Logical_Programs;

import java.util.Scanner;

public class Prime_Number {
    public static String sample_prime(int n){
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0)
                cnt++;
        }
        if(cnt == 2 || n == 2)
            return n + " is a prime number ";
        else
            return n + " is not a prime number ";
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sample_prime(n));
    }
}
