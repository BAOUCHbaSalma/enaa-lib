import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public void listChoice() {
        Library lb = new Library();
        Book BK =new Book();

        int choice;
        do {
            System.out.println("                                              ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~~~~~~");
            System.out.println("                                               ");
            System.out.println("1-- Ajouter un livre");
            System.out.println("2-- Afficher les livres");
            System.out.println("3-- Supprimer un livre");
            System.out.println("4-- Modifier les détails d'un livre");
            System.out.println("5-- Reserver un livre");
            System.out.println("6-- Afficher les livres reserver");
            System.out.println("7-- Chercher un livre");
            System.out.println("8-- Ajouter un Apprenant");
            System.out.println("9-- Afficher un Apprenant");
            System.out.println("10-- Modifier un Apprenant");
            System.out.println("11-- Quitter");

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
                    lb.reserve();

                    break;
                case 6:
//                   lb.showBookRe();
                    break;
                case 7:
                  lb.searchBook();
                    break;
                case 8:
                    lb.addStudent();
                    break;
                case 9:
                    lb.showStudent();
                    break;
                case 10:
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
                case 11:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choice != 11);

    }
}








