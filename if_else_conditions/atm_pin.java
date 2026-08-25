import java.util.*;
class atm_pin{
    public static void main(String argus[]){
        
        System.out.print("ENTER PIN:");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();

        int correct_pin = 1234;

        if(pin == correct_pin){

        System.out.print("ENTER ACCOUNT BALANCE:");
        int account_balance = sc.nextInt();
       
        System.out.println("ENTER WITHDRAW AMOUNT:");
        int withdraw_amount = sc.nextInt();

         int remaning_balance = account_balance - withdraw_amount;


        

            if(withdraw_amount<=account_balance){
                System.out.println("withdraw successfully");
                System.out.println("remaning_balance: " + remaning_balance);
            

            }
            else{
                System.out.print("insufficient balance");
            }
            
        }



    
    if(pin!=correct_pin){
        System.out.print("incorrect pin");
    }
}
}