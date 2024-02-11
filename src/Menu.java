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
            System.out.println("1-- Add a book");
            System.out.println("2-- Show books");
            System.out.println("3-- Delete a book");
            System.out.println("4-- Edit book details");
            System.out.println("5-- Find a book");
            System.out.println("6-- Reserve a book");
            System.out.println("7-- Cancel a book reservation");
            System.out.println("8-- Add a Student");
            System.out.println("9-- Show a Student");
            System.out.println("10-- Modify a Student");
            System.out.println("11-- Delete a Student");
            System.out.println("12-- Close");

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
                    lb.reserve();

                    break;
                case 7:
                    lb.dropReservation();
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
                    lb.dropStudent();
                    break;
                case 12:
                System.out.println("BY BY !");
                break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 12);

    }
}








