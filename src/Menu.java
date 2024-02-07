import java.util.Scanner;

public class Menu {
    public void listChoice() {
        Library lb = new Library();
        int choice;
        do {
            System.out.println("~~~~~~~~~ Menu ~~~~~~~");
            System.out.println("1-- Ajouter un livre");
            System.out.println("2-- Afficher les livres");
            System.out.println("3-- Supprimer un livre");
            System.out.println("4-- Modifier les détails d'un livre");
            System.out.println("5-- Ajouter un Apprenant");
            System.out.println("6-- Afficher un Apprenant");
            System.out.println("7-- Quitter");
            System.out.print("Entrez votre choix : ");
            choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    lb.addBook();
                    break;
                case 2:
                    lb.showBooks();
                    break;
                case 3:
                    lb.dropBook();
                    break;
                case 4:
                    modifyBook();
                    break;
                case 5:
                    addStudent();
                    break;
                case 6:
                    showStudent();
                    break;
                case 7:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choice != 7);

    }







    public void modifyBook() {
        // Implement logic to modify a book
        System.out.println("Modifier les détails d'un livre");
    }

    public void addStudent() {
        // Implement logic to add a student
        System.out.println("Ajouter un Apprenant");
    }

    public void showStudent() {
        // Implement logic to display a student
        System.out.println("Afficher un Apprenant");
    }
}

