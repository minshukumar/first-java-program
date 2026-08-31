import java.util.*;
class searchMark {
    public static void main(String argus[]){
        int marks[] = {78,85,72,90,68};
        boolean found = false;
        System.out.println("ENTER THE NO YOU WANT TO SEARCH: ");
        Scanner sc = new Scanner(System.in);
        int searchMark = sc.nextInt();

        for(int i = 0; i<marks.length;i++){
            if(marks[i]==searchMark){
                System.out.println("MARKS FOUND AT: " + i );
                found = true;
            }
            
        }
        
        if(!found){
            System.out.println("MARKS IS NOT PRESENT");
        }
    }
}
