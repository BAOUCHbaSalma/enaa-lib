import java.util.ArrayList;
import java.util.Scanner;

public class Student {
   public  String IdStudent;
   public String Name;
   public String Adresse;

   ArrayList<Book> books = new ArrayList<>();
   public void modifyStudent(){

      System.out.println("Enter the Name of Student");
      this.Name=new Scanner(System.in).nextLine();


      System.out.println("Enter the Adresse of Student");
      this.Adresse=new Scanner(System.in).nextLine();

      System.out.println("Student of this Id is modify");


   }


}
