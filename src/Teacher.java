import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    int teacherid;
    ArrayList<Course> teachercourse = new ArrayList<Course>();

    void teacher(Scanner sc)
    {
        System.out.print("Enter course id ");
        String courseid = sc.nextLine();
        System.out.print("Enter course name ");
        String coursename = sc.nextLine();
        System.out.print("Enter teacher id ");
        int teacherid = Integer.parseInt(sc.nextLine());
        System.out.print("How many student you teach ");
        int allstudents = Integer.parseInt(sc.nextLine());
        System.out.print("Enter student id ");
        int studentid =  Integer.parseInt(sc.nextLine());

    }

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
