import java.util.*;

class checkProductList {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            System.out.println("ENTR THE PRODUCT NAME");
            products.add(sc.nextLine());

        }
        System.out.println(products.isEmpty());

        }
    }
    

