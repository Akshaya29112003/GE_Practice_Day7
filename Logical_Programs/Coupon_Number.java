package Logical_Programs;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Coupon_Number {
    public static int sample_coupon(int n) {
        Set<Integer> set = new HashSet<>();
        Random rand = new Random();
        int dup = -1;
        for (int i = 0; i < n; i++) {
            int x = rand.nextInt(n)+1;
            if (set.contains(x)) {
                dup = x;
                break;
            }
            else set.add(x);
        }

        System.out.println(set);
        System.out.println("Duplicate : " + dup);
        return set.size();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sample_coupon(n));
    }
}
