import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private final String name;
    private final List<Student> students;
    
    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents(){
        List<Student> studentsPromo = new ArrayList<>();
        for (Student students : this.students)
            studentsPromo.add(students);
        return studentsPromo;
    }

    public String toString(){
        String ahead = "Promo" + this.name;
        String nameStudents = "";

        for (Student students : getStudents()){
            nameStudents += students + "\n";
        }

        return ahead + nameStudents;
    }

    public void printStudentsResults(){
        System.out.println(this.name + "\n");

        for (Student student : this.students){
            student.printResults();
        }
    }
}
