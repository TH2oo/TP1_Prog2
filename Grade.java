import java.util.List;

public class Grade {
    public static final int MAXIMUM_GRADE = 20;
    private final double value;
    private final boolean isAbsent;

    public Grade(double value){
        this.value = value;
        this.isAbsent = false;
    }

    public Grade(){
        this.value = 0.0;
        this.isAbsent = true;
    }

    public boolean equals(Object o){
        return this == o;
    }

    public double getValue(){
        return this.value;
    }

    public String toString(){
        if (this.isAbsent == false)
            return this.value + "/" + MAXIMUM_GRADE;
        else
            return "ABS /" + MAXIMUM_GRADE;
    }

    public boolean isAbsent(){
        return this.isAbsent;
    }
    
    public static Grade averageGrade(List<Grade> grades){
        double sumOfGrades = 0;
        int numberOfABS = 0;

        for (int i = 0; i < grades.size(); i++){
            sumOfGrades += grades.get(i).getValue();
            if (grades.get(i).isAbsent == true)
                numberOfABS++;
        }
        return new Grade(sumOfGrades/(grades.size()-numberOfABS));
    }

}