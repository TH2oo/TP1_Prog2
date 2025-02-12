import java.util.List;
import java.util.Arrays;

public class TestGrade{
    public static void main(String[] args){

        Grade grade1 = new Grade(12);
        Grade grade2 = new Grade(5);
        Grade grade3 = new Grade(17);

        System.out.println(grade1.equals(grade2));

        System.out.println(grade3.getValue());

        System.out.println(grade2.toString());

        List<Grade> grades = Arrays.asList(grade1, grade2, grade3);

        System.out.println(Grade.averageGrade(grades).toString());


        

        

        
        
        
    }
}