import java.util.*;
class DisplayProduct{
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO OF PRODUCT");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n;i++){
            System.out.println("ENTER THE PRODUCT NAME");
            products.add(sc.nextLine());

        }

        System.out.println("---PRODUCTS---");

        for(int i = 0; i<products.size();i++){
            System.out.println(products.get(i));

        }

        

    }
}