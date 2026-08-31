import java.util.*;
class countSpecificMark {
    public static void main(String argus[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NO YU WANT THE ARRAY SIZE:");
        int n = sc.nextInt();
        int marks[] = new int[n];
        int count = 0;
        boolean found = false;
      
        
        

        for(int i = 0;i<marks.length;i++){
            System.out.print("ENTER NO:");
            marks[i] = sc.nextInt();

        }
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.print("ENTER THE NO YOU WANT TO COUNT:");
        int countNO = sc.nextInt();

        for(int i = 0;i<marks.length;i++){
            if(marks[i] == countNO){
                found = true;
                count++;


            }
        }
        if(found){
            System.out.println(countNO + " " + "appears" + " " + count + " times");
        }
        else{
            System.out.println(countNO + " " + "NO IS NO THERE IN THIS ARRAY");
        }
       
        
    }
}
