import java.util.*;
class EmployeeAttendence {
    public static void main(String[] args) {
        int attendence[] = {1,0,1,1,0,1,0,1,1,0};
        int totalPresent = 0;
        int totalAbsent = 0;

        for(int i = 0;i<attendence.length;i++){
            if(attendence[i]==1){
                totalPresent++;
            }
            else{
                totalAbsent++;
            }

        }
        System.out.println("TOTAL PRESENT: " + totalPresent);
        System.out.println("TOTAL ABSENT: " + totalAbsent);
    }
    
}
