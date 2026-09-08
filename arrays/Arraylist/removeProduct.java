import java.util.*;

class removeProduct {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<=4;i++){
            System.out.println("ENTER  THE PRODUCT NAME:");
            products.add(sc.nextLine());
            
            
        }
       
       
        
        System.out.println("products:");
        System.out.println(products);

        
        System.out.println("ENTER THE INDEX YOU WANT TO REMOVE:");
        int no = sc.nextInt();
        products.remove(no);

        System.out.println("UPDATED PRODUCTS:");
        System.out.println(products);

        sc.close();
        
        
    }
    
}
