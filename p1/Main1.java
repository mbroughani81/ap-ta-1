package p1;

public class Main1 {
    public static void main(String[] args) {
        Student s = new Student("aidin", "1380/1/1", "12345", "class-level");
        System.out.println(s.name);
        System.out.println(s.birthday);
        // ERROR
        // System.out.println(s.id);

        s.f1();
    }
}
