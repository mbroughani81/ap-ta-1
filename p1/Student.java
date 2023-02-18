package p1;

public class Student {
    public String name;
    String birthday;
    private String id;
    private String scope;
    
    public Student(String name, String birthday, String id, String scope) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
        this.scope = scope;
    }

    public void f1() {
        System.out.println("class level is => " + scope);

        {
            String scope = "block-level";
            System.out.println("block level is => " + scope);
        }
        // value is unchanged
        System.out.println("class level is => " + scope);
    }
}
