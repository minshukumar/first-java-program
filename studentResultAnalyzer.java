
import java.util.*;

class studentResultAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("====== STUDENT RESULT ANALYZER ====");
        System.out.println("1.  START STUDENT RESULT ANALYZER");
        System.out.println("2.  EXIT");


        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("STARITNG STUDENT RESULT ANALYZER");
                System.out.print("ENTER THE STUDENT NAME");
                sc.nextLine();
                String student_name = sc.nextLine();
                System.out.println("STUDNET_NAME:" + student_name);


        System.out.print("ENTER FATHER'S NAME");
        String father_name  = sc.nextLine();
        System.out.println("FATHER'S NAME:" + father_name);


        System.out.print("ENTER ROLL NO:");
         int roll = sc.nextInt();
        System.out.println("ROLL:" + roll);


        System.out.print("ENTER YOUR AGE");
        int age = sc.nextInt();
        System.out.println("AGE:" + age );


        System.out.print("ENTER YOUR GENDER");
        String gender = sc.next();
        System.out.println("GENDER:" + gender);

    

        System.out.println("ENTER THE MARKS OF JAVA");
        int javaMarks = sc.nextInt();
        while(javaMarks<0 || javaMarks>100){
            System.out.println("INVALID MARKS");
            System.out.println("ENTER THE JAVA MARKS AGAIN(0-100)");
                javaMarks = sc.nextInt();
                System.out.println("JAVAMARKS:" + javaMarks);
        }
        
        
        System.out.println("ENTER THE MARKS OF DSA");
        int dsaMarks = sc.nextInt();
        while(dsaMarks<0 || dsaMarks>100){
            System.out.print("INVALID MARKS");
            System.out.print("ENTER THE DSA MARKS AGAIN(0-100");
            
            dsaMarks = sc.nextInt();
            System.out.println("DSAMARKS:" + dsaMarks);
        }
        System.out.println("ENTER THE MARKS OF DBMS");
        int dbmsMarks = sc.nextInt();
        while(dbmsMarks<0 || dbmsMarks>100){

            System.out.println("INVALID DBMS MARKS");
            dbmsMarks = sc.nextInt();
            System.out.println("ENTER THE DBMS MARKS AGAIN(0-100)");

            System.out.println("DBMSMARKS:" + dbmsMarks);
        }


        System.out.println("ENTER THE MARKS OF NETWORK");
        int networkMarks = sc.nextInt();
        while(networkMarks<0 || networkMarks>100){
            System.out.println("INVALID NETWORK MARKS ");
            networkMarks = sc.nextInt();
             System.out.println("ENTER  VALID COMPUTER NETWORK MARKS(0-100)");
             System.out.println("NETWORKMARKS" + networkMarks);
        }




        int totalMarks = (javaMarks + dsaMarks + dbmsMarks + networkMarks);
        System.out.println("TOTAL MARKS: " + totalMarks);

        double totalSubject = 4.0;

        double percentage = (totalMarks / totalSubject); 
        System.out.println("PERCENTAGE: " + percentage);

        String result;

        if(percentage>=40){
            result = "PASS";
        }
        else{
            result = "FAIL";
        }

        String grade;

        if(percentage>=90){
            grade = "A";
        }
        else if(percentage>=75){
            grade = "B";
        }
        else if(percentage>=60){
            grade = "C";
        }

        else if(percentage>=40){
            grade = "D";
        }

        else{
            grade = "E";
        }


        System.out.println("=====================");
        System.out.println("   STUDENT RESULTS   ");
        System.out.println("=====================");
        

        System.out.println("STUDNET_NAME:" + student_name);
        System.out.println("FATHER'S NAME:" + father_name);
        System.out.println("ROLL:" + roll);
        System.out.println("AGE:" + age );
        System.out.println("GENDER:" + gender);


          System.out.println("JAVAMARKS:" + javaMarks);
           System.out.println("DSAMARKS:" + dsaMarks);
           System.out.println("DBMSMARKS:" + dbmsMarks);
           System.out.println("NETWORKMARKS" + networkMarks);

           System.out.println("TOTAL MARKS: " + totalMarks);
           System.out.println("PERCENTAGE: " + percentage);
           System.out.println("RESULT: " + result);
           System.out.println("GRADE: " + grade);


           System.out.print("========================");


      






        
                break;

                case 2:
                    System.out.println("EXITING");
                    break;

                    default:
                        System.out.println("INVALID CHOICE");
        
                        

        
                        

        
                        
        
                        
        
        
        
        
        }
        sc.close();








    }
}