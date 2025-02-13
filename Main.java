public class Main {
    public static void main(String[] args) {
        // Créer des instances de Student
        Student student1 = new Student("Théo", "Saez");
        Student student2 = new Student("Edouard", "Dansette");
        Student student3 = new Student("Annibal", "Pété");

        // Ajouter des notes aux étudiants
        student1.addResult("Programmation 2", new Grade(18.0));
        student1.addResult("Structures discrètes", new Grade(17.0));

        student2.addResult("Programmation 2", new Grade(8.0));
        student2.addResult("Structures discrètes", new Grade(22.0));

        student3.addResult("Programmation 2", new Grade(8.0));
        student3.addResult("Structures discrètes", new Grade(3.0));

        // Créer une promotion (instance de Cohort)
        Cohort cohort = new Cohort("L2 informatique");

        // Ajouter les étudiants créés à la promotion
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        cohort.addStudent(student3);

        // Afficher les résultats de la promotion
        cohort.printStudentsResults();

        System.out.println(cohort.guessStudentPass());
    }
}