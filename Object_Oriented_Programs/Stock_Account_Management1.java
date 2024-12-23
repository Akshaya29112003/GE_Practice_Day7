package Object_Oriented_Programs;

import java.util.Scanner;

public class Stock_Account_Management1 {

    public static int sample_Stock(String name, int noof_shares, int price[]){
        int total_price = 0;
        for(int i=0;i<noof_shares;i++){
            total_price+=price[i];
        }
        System.out.println(name + " Holding " + noof_shares + " shares of price " + total_price);
        return total_price;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n>0) {
            String name = sc.nextLine();
            sc.next();
            int noof_shares = sc.nextInt();
            int price[] = new int[noof_shares];
            for(int i=0;i<noof_shares;i++) {
                 price[i] = sc.nextInt();
            }

            int a = sample_Stock(name, noof_shares, price);
            sum+=a;
            n--;
        }

        System.out.println("Total Stock Report :" + sum);

    }

}
