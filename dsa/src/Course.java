import java.util.HashMap;
import java.util.HashSet;

public class Course {
    private String courseCode;
    private int maxCapacity;
    private HashMap<Integer,String> students = new HashMap<>();

    public Course(String courseCode, int maxCapacity) {
        this.courseCode = courseCode;
        this.maxCapacity = maxCapacity;
    }

    public void register(int studentId, String name) {
        if(students.size() == maxCapacity){
        System.out.println(this.courseCode + " is full");
        }else{
        Student s = new Student(studentId, name); 
        students.put(s.studentId, s.name);   
        System.out.println(s.name + " has registered " + this.courseCode); } 
        // System.out.println(students.toString());                
    }

    public void isEnrolled(int studentId) { 
        if(students.containsKey(studentId)){
            System.out.println(students.get(studentId) + "is erolled in " + this.courseCode);
        }

    }

    public void getStudentNumber(){
        System.out.println(students.size());
    }

    public void getStudents(){
        System.out.println(students);
    }


    public void dropCourse(int studentId){
        System.out.println(students.get(studentId) + " has registered" + this.courseCode); 
        students.remove(studentId); 
        System.out.println(students); 


    }

    public class Student {
        int studentId;
        String name;

        Student(int studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Course c1 = new Course("DCIT210", 5);
        c1.register(22173542, "Richmond Nyamedor");
        c1.register(22273542, "Richmond Nyamedor");


        c1.getStudents();
    }
}