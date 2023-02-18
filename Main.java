import p1.Student;

public class Main{
    String id = "class-level"; 

    public static void main(String[]args) {
        Student s1 = new Student("aidin", "1380/1/1", "12345");
        Student s2 = new Student("Mohammad","1381/1/1", "23456");
        // ERROR
        // System.out.println(s.birthday);
        // ERROR
        // System.out.println(s.id);
        int x = 10;
        System.out.println("x before change: "+x);
        callByValueInteger(x);
        System.out.println("x after change: "+x);
        System.out.println("------------------------------------");

        System.out.println("student1 name before change: "+s1.name);
        callByValueObject(s1);
        System.out.println("student1 name after change: "+s1.name);

        //System.out.println("student 1 name is: "+s1.name);

        // System.out.println("student 2 name is: "+s2.name);
    }
    public static void callByValueInteger(int x){
        x = x +1;
        System.out.println("x in the function is: "+x);
    }

    public static void callByValueObject(Student s1){
        s1 = null;
        System.out.println("s1 is: "+s1);
    }
    public static void swap(Student s1,Student s2){

        Student tmp = s1;
        s1 = s2;
        s2 = s1;

    }


}