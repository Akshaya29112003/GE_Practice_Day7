package Object_Oriented_Programs;

import java.util.Scanner;

public class Account {
    public static int bal;
    public Account(int ini_bal){
        if(ini_bal > 0)
            this.bal = ini_bal;
        else
            this.bal = 0;
    }
    public void Credit(int add_amount){
        bal+=add_amount;
        System.out.println("Balance After Crediting amount : "+bal);
    }

    public void Debit(int rem_amount){
        if(bal > rem_amount) {
            bal -= rem_amount;
            System.out.println("Balance After Debiting amount : " + bal);
        }
        else {
            bal = bal;
            System.out.println("―Debit amount exceeded account balance");
        }
    }

//    public int getBal() {
//        return bal;
//    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int ini_bal = sc.nextInt();

        Account account = new Account(ini_bal);

        System.out.println("Amount to be deposited :");
        int add_amount = sc.nextInt();
        account.Credit(add_amount);

        System.out.println("Amount to be debited :");
        int rem_amount = sc.nextInt();
        account.Debit(rem_amount);
    }
}
