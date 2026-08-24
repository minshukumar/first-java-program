// // // // class first {
// // // //     public static void main(String args[]){
// // // //         System.out.println("minshu hello");
// // // //     }
// // // // }


// // // class first{
// // //     public static void main(String args[]){
// // //         System.out.println("*");
// // //         System.out.println("* *");
// // //         System.out.println("* * *");
// // //         System.out.println("* * * *");
        

// // //     }
// // // } 

// // import java.util.Scanner;

// // class first{
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("enter your age");
// //         int age = sc.nextInt();
// //         System.out.print(age);

// //     }
// // }

// import java.util.Scanner;

// class first {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int sum = a + b;

//         System.out.println("Sum = " + sum);
//     }

// }



import java.util.*;  
class first{
    public static void main(String args[]){

        System.out.println("enter the star");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=a -i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

