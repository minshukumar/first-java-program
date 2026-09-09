import java.util.*;

class RemoveOutOfStock {
    public static void main(String[] args) {
        ArrayList<String> Products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO OF PRODUCT YOU WANT TO ADD");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i<n;i++){
            System.out.println("ENTER THE PRODUCT NAME");
            Products.add(sc.nextLine());
        }
        
        for(int i = 0;i<n;i++){
            System.out.println(Products.get(i));
        }
        System.out.println("ENTER THE OUT OF STOCK PRODUCT NAME");
        String outofstock = sc.nextLine();

       
        for(int i = 0;i<Products.size();i++){
            if(Products.get(i)==outofstock){
                Products.remove(i);
            }
        }
        for(int i = 0;i<Products.size();i++){
            System.out.println(Products.get(i));

        }
        sc.close();
    }
    
}
