
import java.util.*;

class atm {
    public static void main(String argus[]){

        System.out.print("ENTER YOUR ACCOUNT BALANCE");
        Scanner sc = new Scanner(System.in);
        int account_balance = sc.nextInt();

        System.out.print("ENTER WITHDRAW AMOUNT");
        int withdraw_amount = sc.nextInt();

        int remaning_balance = account_balance - withdraw_amount; 

        if(account_balance>= withdraw_amount){
            System.out.println("WITHDRAW SUCCESSFULLY");
            System.out.println("remaning_balance: " + remaning_balance);
             
            
        }
        else{
            System.out.println("INSUFFICIENT BALANCE");
        }
        
    }
}
