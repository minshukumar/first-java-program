import java.util.*;
class FindRollNumber {
    public static void main(String argus[]){
        int rollNumbers[] = {101,105,108,112,120};

        System.out.print("ENTER THE ROLL NO YOU WANT TO SEARCH:");
        Scanner sc = new Scanner(System.in);
        int searchRoll = sc.nextInt();
        boolean found = false;


        for(int i = 0;i<rollNumbers.length;i++){
            if(searchRoll == rollNumbers[i]){
                found = true;
                

                System.out.println("ROLL NO IS FOUND AT:" + i);
            }


        }
        if(!found){
            System.out.println("ROLL NO IS NOT PRESENT HERE");

        }
    }

    
}
