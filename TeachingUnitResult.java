public class TeachingUnitResult {
    private final TeachingUnit teachingUnit;
    private final Grade grade;
    
    public TeachingUnitResult(TeachingUnit teachingUnitName, Grade grade){
        this.teachingUnit = teachingUnitName;
        this.grade = grade;
    }

    public boolean equals(Object o){
        return this == o;
    }

    public Grade getGrade(){
        return this.grade;
    }

    public String toString(){
        return teachingUnit.getName() + " : " + this.grade.toString(); 
    }
    
}
