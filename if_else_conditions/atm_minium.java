import java.util.*;
class atm_minium{
    public static void main(){
        System.out.print("ENTER ACCOUNT BALANCE");
        Scanner sc = new Scanner(System.in);
        int account_balance = sc.nextInt();

        System.out.print("ENTER WITHDRAW AMOUNT");
        int withdraw_amount = sc.nextInt();

        int remaining_balance = account_balance - withdraw_amount;

        if(withdraw_amount < 500){
            System.out.println("MINIUMUM WIHTDRAW IS RS-500");

        }
        else if(withdraw_amount > 20000){
            System.out.println("MINIMUM WIHTDRAW IS RS-20000");

        }
        else if(withdraw_amount > account_balance){
            System.out.println("INSUFFICIENT AMOUNT");
        }

        else{
            System.out.println("WITHDRAW SUCCESSFUL");
            System.out.println("REAMAINING BALANCE" + remaining_balance);
        }

    }
}