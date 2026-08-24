// import java.util.*;

// class gpt_ques {
//     public static void main(String argu[]) {
//         System.out.print("enter the name");
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();

//         System.out.print("Enter your age");

//         int age = sc.nextInt();

//         System.out.print("Enter your course");

//         String course = sc.next();

//         System.out.print("Enter roll no");

//         int roll = sc.nextInt();

//         System.out.println("----STUDENT INFORMATION----");

//         System.out.println("name:" + name);
//         System.out.println("age:" + age);
//         System.out.println("course:" + course);
//         System.out.println("roll:" + roll);

//     }

// }


import java.util.*;

class gpt_ques{
public static void main(String argu[]){
    System.out.print("Enter the product name:");
    Scanner sc = new Scanner(System.in);
    String product= sc.nextLine();

    System.out.println("Enter price:");
    int price = sc.nextInt();

    System.out.println("enter quantity:");
    int quantity = sc.nextInt();

    int total = price * quantity;


    System.out.println("----BILL---");

    System.out.println("PRODUCT:" + product);
    System.out.println("PRICE:" + price);
    System.out.println("QUANTITY:" + quantity);
    System.out.println("TOTAL:" + total);




}

}