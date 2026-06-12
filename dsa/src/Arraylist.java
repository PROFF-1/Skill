import java.util.ArrayList;

public class Arraylist {

    private ArrayList<String> courses = new ArrayList<>();

  
    // public Arraylist(){
    //     this.courses = courses ;
    // }

    public ArrayList<String> getCourses(){
        return this.courses;
    }

    public void addCourses( String name){
        this.courses.add(name);
    }
    
}
