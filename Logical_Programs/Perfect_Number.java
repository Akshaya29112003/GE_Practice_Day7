package Logical_Programs;

import java.util.Scanner;

public class Perfect_Number {
    public static void sample_perfect(int n){
        int a[] = new int[n];
        int j = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                a[j++] = i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        if(sum == n)    System.out.println(n + " is perfect number ");
        else    System.out.println(n + " is not a perfect number ");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sample_perfect(n);
    }
}
