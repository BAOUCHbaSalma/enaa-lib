import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class Library {
     ArrayList<Book> Array_book = new ArrayList<Book>();
     void addBook() {

        Book newBook= new Book();
         System.out.println("Enter Id of the Book");
         newBook.IdBook=new Scanner(System.in).nextLine();
        System.out.println("Enter Title of the Book");
        newBook.TitLe =new Scanner(System.in).nextLine();
        System.out.println("Enter Auteur of the Book");
        newBook.Auteur=new Scanner(System.in).nextLine();
        System.out.println("Enter Publication Date of the Book");
        newBook.DatePublication=new Scanner(System.in).nextInt();
        Array_book.add(newBook);


        System.out.println("The book is added successfully");
    }
     void showBooks() {
         if (Array_book.isEmpty()){
             System.out.println("ARRAY IS EMPTY");
         }else {
             for (int i = 0; i < Array_book.size(); i++) {
                 System.out.println("~~~~Les livres~~~~");
                 System.out.println("Id of the Book:" + Array_book.get(i).IdBook);
                 System.out.println("Title of the Book:" + Array_book.get(i).TitLe);
                 System.out.println("Auteur of the Book:" + Array_book.get(i).Auteur);
                 System.out.println("Publication Date of the Book:" + Array_book.get(i).DatePublication);
                 System.out.println("                                       ");
                 System.out.println("--------------------------------------------");

             }
         }
    }
    public void dropBook() {
     System.out.println("Enter id of the book you want to remove : ");
     String Id=new Scanner(System.in).nextLine();
        for (int i =0;i<Array_book.size();i++){
            if(Objects.equals(Id, Array_book.get(i).IdBook)){
                Array_book.remove(i);

            }
        }
        System.out.println("BOOK of this Id is remove");
    }
}
