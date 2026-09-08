import java.util.*;

class searchProduct {
    public static void main(){
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<=4;i++){
            System.out.println("ENTER THE PRODUCT NAME:");
            products.add(sc.nextLine());


        }
        System.out.println("ENTER THE PRODUCT YOU WANT TO SEARCH:");
        String findProduct = sc.nextLine();

        if(products.contains(findProduct)){
            System.out.println("PRODUCT FOUND");
        }
        else{
            System.out.println("PRODUCT NOT FOUND");
        }
        sc.close();

        
    }



    
}
