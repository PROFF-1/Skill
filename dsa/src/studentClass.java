import java.util.HashSet;
import java.util.Set;
public class studentClass extends student {


    studentClass(String studentName, String studentId){
        super(studentName,studentId);
        
    }

    @Override
    void addCourse() {
        
    }

    @Override
    void removeCourse() {
        
    }
    
   
    public class courseClass extends courses {

        Set<Integer>  course = new HashSet<>();

 
    @Override
        void addStudent() {
            
        }

    @Override
    void removeStudent() {
        
    }

    @Override
    void checkLimit() {
        
    }

    @Override
    void getStudentNumber() {
        
    }
    
        
    }
}
