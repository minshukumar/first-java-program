class student{
    
    String name;
    int roll;
    int age;

    void study(){
        System.out.println("i can study");
    }
}

class StudentDemo{
    public static void main(String argus[]){
        student s1 = new student();
        s1.name = "Minshu";
        System.out.println(s1.name);
        s1.roll = 101;
        System.out.println(s1.roll);
        s1.age = 20;
        System.out.println(s1.age);
        s1.study();
    }
}
