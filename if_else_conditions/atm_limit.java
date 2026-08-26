import java.util.*;

class atm_limit {
    public static void main(String argus[]){
        System.out.print("ENTER ACCOUNT BALANCE");
        Scanner sc = new Scanner(System.in);
        int account_balance = sc.nextInt();

        System.out.print("ENTER WITHDRAW AMOUNT");
        int withdraw_amount = sc.nextInt();

        int remaining_balance = account_balance - withdraw_amount;

        if(withdraw_amount >20000){
            System.out.println("DAILY WITHDRAW LIMIT EXCEDDED");

        }
        else if(withdraw_amount >account_balance){
            System.out.println("INSUFFICIENT BALANCE");
        }

        else{
            System.out.println("WITHDRAW SUCCESSFUL");
            System.out.println("RAMAINING AMOUNT:" + remaining_balance);

        }
    }
}
