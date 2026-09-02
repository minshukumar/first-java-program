import java.util.*;
class InventoryStockAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NO YOU WANT TO HOW MANY PRODUCT:");
        int n = sc.nextInt();

        String Products[] = new String[n];
        int stock[] = new int[n];
        int stockProduct = 0;
        int OutStockProduct = 0;
        int totalItem = 0;
        int highestStock = stock[0];
        int highestIndex = 0;



        for(int i = 0;i<n;i++){
            System.out.print("ENTER PRODUCT NAME:");
            Products[i] = sc.next();

            System.out.print("ENTER STOCK");
            stock[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            if(stock[i]>0){
                stockProduct++;
                totalItem = totalItem + stock[i];
            }
            else{
                OutStockProduct++;

            }
        }
        for(int i = 1;i<n;i++){
            
            if(stock[i]>highestStock){
                highestStock = stock[i];
                highestIndex = i;
            }
        }

        System.out.println("-----INVENTORY REPORT-----");
        
        System.out.println("PRODUCTS IN STOCK:" + stockProduct);
        System.out.println("OUT OF STOCK PRODUCTS:" + OutStockProduct);
        System.out.println("TOTAL ITEMS:" + totalItem);
        System.out.println("HIGHEST STOCK QUANTITY:" + highestStock);
        System.out.println("PRODUCT WITH HIGHEST STOCK:" + Products[highestIndex]);






    }
    
}
