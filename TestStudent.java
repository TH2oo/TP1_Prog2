import java.util.List;
import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        
        Student The = new Student("Théo", "Saez");

        The.addResult("Théorie et application du service smashé", new Grade(12.0));
        The.addResult("Esprit d'équipe et encouragement de son prochain", new Grade(16.0));
        The.addResult("Techniques de nettoyage et entretien du terrain", new Grade(27.0));
               
        Student Edo = new Student("Edouard", "Dansette");

        Edo.addResult("Théorie et application du service smashé", new Grade(18.0));
        Edo.addResult("Esprit d'équipe et encouragement de son prochain", new Grade(12.0));
        Edo.addResult("Techniques de nettoyage et entretien du terrain", new Grade(8.0));

        The.printResults();

        System.out.println("");

        Edo.printResults();



       



        

        
    }
}