public class Student {
    private int id;
    private String name;
    private int age;


    public Student() {
        this.id = 0;
        this.name = "";
        this.age = 0;
    }


    public Student(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {

        Student defaultStudent = new Student();


        System.out.println("Default Student Information:");
        defaultStudent.displayStudentInfo();


        Student paramStudent1 = new Student(11, "John Doe", 20);


        System.out.println("\nParameterized Student Information:");
        paramStudent1.displayStudentInfo();

        //Student paramStudent2 = new Student(101, "John Doe", 20);


        //System.out.println("\nParameterized Student Information:");
        //paramStudent2.displayStudentInfo();
    }
}
