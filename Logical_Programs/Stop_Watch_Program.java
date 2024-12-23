package Logical_Programs;

import java.util.Scanner;

public class Stop_Watch_Program {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.println("Start Time : ");
        long start_time = System.currentTimeMillis();
        sc.nextLine();

        System.out.println("Stop Time : ");
        long stop_time = System.currentTimeMillis();

        long elapse_time = stop_time - start_time;

        double elapse_time_in_sec = elapse_time / 1000.0;

        System.out.println("Elapsed Time : " + elapse_time_in_sec + " seconds");
    }
}
