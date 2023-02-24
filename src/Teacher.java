import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    int teacherid;
    ArrayList<Course> teachercourse = new ArrayList<Course>();





    void teacherRegistration(Scanner sc) {

        String teacherfullname;
        String teacherusername, teacherpassword;

        System.out.print("\nEnter Full Name of Teacher : ");
        teacherfullname = sc.nextLine();


        System.out.print("\nEnter UserName : ");
        teacherusername = sc.nextLine();

        System.out.print("\nEnter Password : ");
        teacherpassword = sc.nextLine();
    }
    void teacherSignin(Scanner sc)
    {
        String teacherusername, teacherpassword;

        System.out.print("\nEnter Teacher UserName : ");
        teacherusername = sc.nextLine();

        System.out.print("\nEnter Password : ");
        teacherpassword = sc.nextLine();
    }
}
