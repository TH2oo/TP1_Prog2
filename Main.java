public class Main {
    public static void main(String[] args) {
        // Créer des instances de Student
        Student student1 = new Student("Théo", "Saez");
        Student student2 = new Student("Edouard", "Dansette");
        Student student3 = new Student("Annibal", "Pété");
        Student student4 = new Student("Le", "Lobotomisateur");

        // Ajouter des notes aux étudiants
        student1.addResult(new TeachingUnit("Programmation 2", 6), new Grade(18.0));
        student1.addResult(new TeachingUnit("Structures discrètes", 3), new Grade());

        student2.addResult(new TeachingUnit("Programmation 2", 6), new Grade(8.0));
        student2.addResult(new TeachingUnit("Structures discrètes", 3), new Grade(19.0));

        student3.addResult(new TeachingUnit("Programmation 2", 6), new Grade(8.0));
        student3.addResult(new TeachingUnit("Structures discrètes", 3), new Grade(3.0));

        student4.addResult(new TeachingUnit("Programmation 2", 6), new Grade());
        student4.addResult(new TeachingUnit("Structures discrètes", 3), new Grade(12.0));

        // Créer une promotion (instance de Cohort)
        Cohort cohort = new Cohort("L2 informatique");

        // Ajouter les étudiants créés à la promotion
        cohort.addStudent(student1);
        cohort.addStudent(student2);
        cohort.addStudent(student3);
        cohort.addStudent(student4);

        // Afficher les résultats de la promotion
        cohort.printStudentsResults();


        System.out.println("Statistiques--------------------------------------------------------------\n");

        System.out.println("Le nombre d'étudiant ayant leur semestre (moy > 10): " + cohort.guessStudentPass());

        System.out.println("Le nombre d'absences aux exams : " + cohort.numberOfABS());

        System.out.println("La meilleure note de la promo: " + cohort.maxGrade().getValue());
        System.out.println("La pire note de la promo: " + cohort.minGrade().getValue());
    }
}