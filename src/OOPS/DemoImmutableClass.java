package OOPS;

public class DemoImmutableClass {
    public static void main(String[] args) {
        College college = new College("EIT","Faridabad");
        System.out.println(college.name);

        Student student = new Student(20,"Sharad",college);
        student.getCollege().name = "Lingayas";
        System.out.println(college.name);   // Mutation can be possible even without inheriting any class
        
    }
}

// Immutable class
final class Student{
    private int age;
    private String name;
    private College college;

    Student(int age, String name, College college){
        this.name = name;
        this.age = age;
        this.college = new College(college.name,college.address);
    }

    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
    College getCollege(){
        return new College(this.college.name,this.college.address);   // This is defensive construction
    }
}

// Mutable class

class College{
    String name;
    String address;

    College(String name, String address){
        this.name = name;
        this.address = address;
    }
}