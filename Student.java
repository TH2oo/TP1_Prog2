import java.util.List;
import java.util.ArrayList;

public class Student {
    private final String firstName;
    private final String lastName;
    private final List<TeachingUnitResult> results;
    
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = new ArrayList<>();
    }

    public boolean equals(Object o){
        return this == o;
    }

    public void addResult(TeachingUnit teachingUnitName, Grade grade){
        this.results.add(new TeachingUnitResult(teachingUnitName, grade));
    }

    public List<Grade> getGrades(){
        List<Grade> grades = new ArrayList<>();

        for (TeachingUnitResult result : results){
            grades.add(result.getGrade());
        }
        return grades;
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    public Grade averageGrade(){
        double sumResult = 0;
        int sumToken = 0;

        for (TeachingUnitResult result : results){
            if (!result.getGrade().isAbsent()){
                sumResult += result.getGrade().getValue() * result.getTeachingUnit().getToken();
                sumToken += result.getTeachingUnit().getToken();
            }
        }

        return new Grade(sumResult / sumToken);
    }

    public void printResults(){
        System.out.println(this.toString());
        for (TeachingUnitResult grades : this.results){
            System.out.println(grades.toString());
        }
        System.out.println("Note Moyenne : "+ this.averageGrade().toString());
    }
}
