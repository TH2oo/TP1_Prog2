import java.util.List;

public class Grade {
    private static final int MAXIMUM_GRADE = 20;
    private final double value;

    public Grade(double value){
        this.value = value;
    }

    public boolean equals(Object o){
        return this == o;
    }

    public double getValue(){
        return this.value;
    }

    public String toString(){
        return this.value + "/" + MAXIMUM_GRADE;
    }
    
    public static Grade averageGrade(List<Grade> grades){
        double sumOfGrades = 0;
        for (int i = 0; i < grades.size(); i++){
            sumOfGrades += grades.get(i).getValue();
        }
        return new Grade(sumOfGrades/grades.size());
    }

}