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

    public void addResult(String teachingUnitName, Grade grade){
        this.results.add(new TeachingUnitResult(teachingUnitName, grade));
    }

    public List<Grade> getGrades(){
        List<Grade> grades = new ArrayList<>();

        for (TeachingUnitResult result : results){
            grades.add(result.getGrade());
        }
        return grades;
    }
}
