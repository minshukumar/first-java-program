import java.util.*;
class productPriceUpdate{
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        Scanner sc = new Scanner(System.in);



        System.out.println("ENTER THE NO OF PRODUCTS:");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n;i++){
            System.out.println("ENTER THE PRODUCT NAME:");
            products.add(sc.nextLine());

            System.out.println("ENTER THE PRICE");
            prices.add(sc.nextDouble());
            sc.nextLine();

        }

        System.out.println("--PRODUCT WITH THEIR PRICES--");

        for(int i = 0;i<n;i++){
            System.out.println(products.get(i) + " - " +  prices.get(i));
        }
    }
}