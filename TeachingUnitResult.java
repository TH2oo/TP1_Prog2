public class TeachingUnitResult {
    private final String teachingUnitName;
    private final Grade grade;
    
    public TeachingUnitResult(String teachingUnitName, Grade grade){
        this.teachingUnitName = teachingUnitName;
        this.grade = grade;
    }

    public boolean equals(Object o){
        return this == o;
    }

    public Grade getGrade(){
        return this.grade;
    }

    public String toString(){
        return teachingUnitName + " : " + this.grade.toString(); 
    }
    
}
