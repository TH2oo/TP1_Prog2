import java.util.List;
import java.util.Arrays;

public class TestTeachingUnitResult{
    public static void main(String[] args){

        TeachingUnitResult UE1 = new TeachingUnitResult("Séries entières/Séries de Fourrier", new Grade(15));
        TeachingUnitResult UE2 = new TeachingUnitResult("Groupes et Géométrie", new Grade(8));

        System.out.println(UE1.equals(UE2));

        System.out.println(UE1.getGrade());

        System.out.println(UE2.toString());
       

    }
}