import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int studentid;
    String studentname;
    double percentage;
    String overallgrade;
    ArrayList<Course> studentallcourse=new ArrayList<Course>();


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




    void studentRegistration(Scanner sc)
    {
        String studentfullname;
        String studentusername, studentpassword;

        System.out.print("\nEnter Full Name of Student : ");
        studentfullname = sc.nextLine();


        System.out.print("\nEnter UserName : ");
        studentusername = sc.nextLine();

        System.out.print("\nEnter Password : ");
        studentpassword = sc.nextLine();
    }


    void studentSignin(Scanner sc)
    {
        String studentusername, studentpassword;

        System.out.print("\nEnter Student UserName : ");
        studentusername = sc.nextLine();

        System.out.print("\nEnter Password : ");
        studentpassword = sc.nextLine();
    }
}
