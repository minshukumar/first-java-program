import java.util.*;
class BankTransitionAnalysis{
    public static void main(String argus[]){
        System.out.print("ENTER THE NUMBER YOU WANT TO TRANSITON:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int transaction[] = new int[n];

        int deposits = 0;
        int WITHDRAWALS = 0;
        int totalDeposite = 0;
        int totalWithdrawals = 0;


        for(int i = 0;i<transaction.length;i++){
            System.out.println("ENTER TRANSITON VALUE: ");
            transaction[i] = sc.nextInt();

        }
        for(int i = 0;i<transaction.length;i++){
            System.out.println("THE TRANSITION VALUE IS:");
            System.out.println(transaction[i]);
        }

        for(int i = 0; i<transaction.length;i++){
            if(transaction[i]>0){
                deposits++;
                totalDeposite = totalDeposite + transaction[i];

            }
            else if(transaction[i]==0){
                System.out.println("nothing happens");
            }
            else{
                WITHDRAWALS++;
                totalWithdrawals = totalWithdrawals +  (-transaction[i]);
            }
        }

            System.out.println("DEPOSITS:" + deposits);
            System.out.println("WITHDRAWALS :" + WITHDRAWALS);
            System.out.println("TOTAL DEPOSITE:" + totalDeposite);
            System.out.println("TOTAL WITHDRAWALS:" + totalWithdrawals);
        }


    }
