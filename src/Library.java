import com.sun.deploy.util.JVMParameters;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class Library {


    ArrayList<Book> Array_book = new ArrayList<>();
    ArrayList<Student> Array_Student = new ArrayList<>();

//    ArrayList<Book> Array_reserverR = new ArrayList<Book>();

     void addBook() {

        Book newBook= new Book();
         System.out.println("Enter Id of the Book");
         newBook.IdBook=new Scanner(System.in).nextLine();
         for(int i=0 ; i<Array_book.size();i++){
             while(newBook.IdBook.equals(Array_book.get(i).IdBook)){
                 System.out.println("Id already exists ,Please try again !! ");
                 newBook.IdBook=new Scanner(System.in).nextLine();
             }
         }

        System.out.println("Enter Title of the Book");
        newBook.TitLe =new Scanner(System.in).nextLine();
         for (Book book : Array_book) {
             while (newBook.TitLe.equals(book.TitLe)) {
                 System.out.println("Title already exists ,Please try again !! ");
                 newBook.TitLe = new Scanner(System.in).nextLine();

             }
         }

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
             System.out.println("~~~~~~~~~~Les livres~~~~~~~~~~");
             System.out.println("                              ");
             for (Book book : Array_book) {

                 System.out.println("Id of the Book:" + book.IdBook);
                 System.out.println("Title of the Book:" + book.TitLe);
                 System.out.println("Auteur of the Book:" + book.Auteur);
                 System.out.println("Publication Date of the Book:" + book.DatePublication);
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
                System.out.println("BOOK of this Id is remove");


            }
        }

    }

    public void searchBook(){

        System.out.println("Enter The Id of the Book you want to search");
        String Id=new Scanner(System.in).nextLine();
        for (int i=0;i<Array_book.size();i++){
            if (Id.equals(Array_book.get(i).IdBook)){
                System.out.println("                       ");
                System.out.println("Id of the Book:" + Array_book.get(i).IdBook);
                System.out.println("Title of the Book:" + Array_book.get(i).TitLe);
                System.out.println("Auteur of the Book:" + Array_book.get(i).Auteur);
                System.out.println("Publication Date of the Book:" + Array_book.get(i).DatePublication);
                System.out.println("                                       ");


            }else{
                System.out.println("Id incorrect , Please try again");
            }
        }


    }
    public void addStudent(){
         Student newStudent = new Student();
        System.out.println("Enter the Id of Student");
        newStudent.IdStudent=new Scanner(System.in).nextLine();

        System.out.println("Enter the Name of Student");
        newStudent.Name=new Scanner(System.in).nextLine();

        System.out.println("Enter the Adresse of Student");
        newStudent.Adresse=new Scanner(System.in).nextLine();
        Array_Student.add(newStudent);
        System.out.println("The Student is added successfully");


    }

    public void showStudent() {
        System.out.println("                                       ");
        System.out.println("************* List of Student**************");
        System.out.println("                                            ");
        for (Student student : Array_Student) {
            System.out.println("The Id of Student : " + student.IdStudent);
            System.out.println("The Name of Student : " + student.Name);
            System.out.println("The Adresse of Student : " + student.Adresse);

            if (student.books.isEmpty()) {
                System.out.println("He did not to reserve any book !");
            } else {
                student.books.forEach(book -> System.out.println("The book name " + book.TitLe));
            }


            System.out.println("                                                ");
            System.out.println("_________________________________________________");
        }
    }

    public void dropStudent(){
         
        System.out.println("Enter id of the student you want to remove : ");
        String Id=new Scanner(System.in).nextLine();
        for (int i =0;i<Array_Student.size();i++){
            if(Objects.equals(Id, Array_Student.get(i).IdStudent)){
                Array_Student.remove(i);
                System.out.println("Student of this Id is remove");


            }
        }

    }



    public void reserve(){


        System.out.println("Enter the Id Book  :");
        String IdBOOK = new Scanner(System.in).nextLine();

        boolean found = false;


        for (Book book : Array_book) {

            if (book.IdBook.equalsIgnoreCase(IdBOOK)) {

                for (int i = 0; i < Array_Student.get(i).books.size(); i++) {

                    while (book.IdBook.equalsIgnoreCase(Array_Student.get(i).books.get(i).IdBook)) {
                        System.out.println("This Book is Already reserved  ");
                        System.out.println("Enter the other Id Book  :");
                        IdBOOK = new Scanner(System.in).nextLine();
                        found = true;
                    }


                }if (!found){
                    System.out.println("Enter the Id Of student   : ");
                    String idStudent = new Scanner(System.in).nextLine();

                    for (Student student : Array_Student) {
                        if (student.IdStudent.equalsIgnoreCase(idStudent)) {
                            book.student = student;
                            student.books.add(book);

                            System.out.println("THE BOOK IS RESERVER");
                        }
                    }
                    break;

                }

            }
        }
        }

        public void dropReservation(){


            System.out.println("Enter the id of the book you want to cancel their reservation : ");
            String idBook =new Scanner(System.in).nextLine() ;

            boolean found = false;

            for (Book book : Array_book) {
                if (book.IdBook.equalsIgnoreCase(idBook)) {
                    found = true;

                    if (book.student == null) {
                        System.out.println("This book is not reserved ");
                    } else {
                        Student student = book.student;
                        student.books.remove(book);
                        book.student = null;
                        System.out.println("Reservation canceled successfully");
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Book with this id not found");
            }

        }

    }




