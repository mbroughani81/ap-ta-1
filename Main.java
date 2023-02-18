import p1.Student;

public class Main{
    public static void main(String[]args) {
        Student s = new Student("aidin", "1380/1/1", "12345");
        
        System.out.println(s.name);
        // ERROR
        // System.out.println(s.birthday); 
        // ERROR
        // System.out.println(s.id);
    }
}