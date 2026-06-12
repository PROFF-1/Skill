public abstract class student {


    String studentName;
    String studentId;

     student(String studentName, String studentId){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    abstract void addCourse();
    abstract void removeCourse();


    
}
