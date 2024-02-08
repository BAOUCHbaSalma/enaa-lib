import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Book {
    public String IdBook;
    public String TitLe;
    public String Auteur;

    public Integer DatePublication;


    public void modifyBook() {


                    System.out.println("Enter Title of the Book");
                    this.TitLe = new Scanner(System.in).nextLine();


                    System.out.println("Enter Auteur of the Book");
                    this.Auteur = new Scanner(System.in).nextLine();

                    System.out.println("Enter Publication Date of the Book");
                    this.DatePublication = new Scanner(System.in).nextInt();


                    System.out.println("BOOK of this Id is modify");

                }

            }












