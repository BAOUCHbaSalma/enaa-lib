import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public void listChoice() {
        Library lb = new Library();

        int choice;
        do {
            System.out.println("                                              ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~~~~~~");
            System.out.println("                                               ");
            System.out.println("1-- Ajouter un livre");
            System.out.println("2-- Afficher les livres");
            System.out.println("3-- Supprimer un livre");
            System.out.println("4-- Modifier les détails d'un livre");
            System.out.println("5-- Chercher un livre");
            System.out.println("6-- Ajouter un Apprenant");
            System.out.println("7-- Afficher un Apprenant");
            System.out.println("8-- Modifier un Apprenant");
            System.out.println("9-- Quitter");
            System.out.println("                                                 ");
            System.out.print(" Entrez votre choix  ====> ");
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
                    if (lb.Array_book.isEmpty()) {
                        System.out.println("No Book to edit");
                    } else {

                        System.out.println("Enter the Id of the Book you want to edit : ");
                        String Id = new Scanner(System.in).nextLine();

                        for (Book book : lb.Array_book){
                            if (book.IdBook.equalsIgnoreCase(Id)) {
                                book.modifyBook();
                            }
                        }
                    }

                    break;
                case 5:
                  lb.searchBook();
                    break;
                case 6:
                    lb.addStudent();
                    break;
                case 7:
                    lb.showStudent();
                    break;
                case 8:
                    if (lb.Array_Student.isEmpty()){
                        System.out.println("No Student to edit");
                    }else {
                        System.out.println("Enter the Id of Student you want to edit : ");
                        String Id=new Scanner(System.in).nextLine();
                        for (Student student: lb.Array_Student){
                            if(student.IdStudent.equalsIgnoreCase(Id)){
                                student.modifyStudent();
                            }
                        }
                    }
                    break;
                case 9:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choice != 7);

    }
}







//    public void addStudent() {
//        // Implement logic to add a student
//        System.out.println("Ajouter un Apprenant");
//    }
//
//    public void showStudent() {
//        // Implement logic to display a student
//        System.out.println("Afficher un Apprenant");
//    }
//}
