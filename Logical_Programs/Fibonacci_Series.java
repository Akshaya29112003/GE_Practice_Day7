package Logical_Programs;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void sample_fibo(int n){
        int a[] = new int[n+1];
        a[0] = 0;
        a[1] = 1;

        for(int i=2;i<=n;i++){
            a[i] = a[i-1] + a[i-2];
        }

        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sample_fibo(n);
    }
}
