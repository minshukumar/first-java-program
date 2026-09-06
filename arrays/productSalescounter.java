import java.util.*;
class productSalescounter {
    public static void main(String[] args) {
        System.out.print("ENTER THE NO YOU WANT TO TAKE SIZE OF ARRAY");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        
        String product[] = new String[n];
        int productIds[] = new int[n]; 

        for(int i = 0; i<n;i++){
            System.out.println("ENTER THE PRODUCT NAME");
            product[i] =  sc.nextLine();

            System.out.println("ENTER THE PRODUCTID");
            productIds[i] = sc.nextInt();
            
            sc.nextLine();


        }
        System.out.println("ENTER THE PRODUCT ID YOU WANT TO SEARCH");
        int searchId = sc.nextInt();
        
        for(int i = 0;i<n;i++){
            if(productIds[i]== searchId){
                count++;
            }
        }
        if(count==0){
            System.out.println("PRODUCT IS NOT FOUND");
        }
        else{

            System.out.println("PRODUCT SOLD" + " " + count + " " + "TIMES");
        }

    }
}
        
      
        