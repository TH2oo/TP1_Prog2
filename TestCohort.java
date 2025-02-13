public class TestCohort {
    public static void main(String[] args) {
        Cohort cohort = new Cohort("Les deux gars de la résidence Opale");

        Student student1 = new Student("Théo", "Saez");
        student1.addResult("Théorie et application du service smashé", new Grade(12.0));
        student1.addResult("Esprit d'équipe et encouragement de son prochain", new Grade(16.0));
        student1.addResult("Techniques de nettoyage et entretien du terrain", new Grade(27.0));

        Student student2 = new Student("Edouard", "Dansette");
        student2.addResult("Théorie et application du service smashé", new Grade(18.0));
        student2.addResult("Esprit d'équipe et encouragement de son prochain", new Grade(12.0));
        student2.addResult("Techniques de nettoyage et entretien du terrain", new Grade(8.0));

        cohort.addStudent(student1);
        cohort.addStudent(student2);

        cohort.printStudentsResults();
    }
}