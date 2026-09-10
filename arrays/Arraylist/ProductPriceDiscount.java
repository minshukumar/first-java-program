import java.util.*;

class practice {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        Scanner sc = new Scanner(System.in); 
        System.out.println("ENTER THE NO YOU WANT TO HOW MCUH PRODUCT");
        int n = sc.nextInt();
        sc.nextLine();


        for(int i = 0;i<n;i++){
            System.out.println("ENTER THE PRODUCT NAME:");
            products.add(sc.nextLine());

            System.out.println("ENTER THE PRICES:");
            prices.add(sc.nextDouble());
            sc.nextLine();

            
        }
        for(int i = 0;i<products.size();i++){
            System.out.println(products.get(i) +"-"+  prices.get(i));
            




        }
    }
    
}
