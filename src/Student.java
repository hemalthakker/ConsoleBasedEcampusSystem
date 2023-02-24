import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int studentid;
    String studentname;
    double percentage;
    String overallgrade;
    ArrayList<Course> studentAllCourse=new ArrayList<Course>();
    void studentinput(Scanner sc)
    {
        String studentid;
        String studentname;
        System.out.print("Enter Student id ");
        studentid = sc.nextLine();
        System.out.print("Enter Student name ");
        studentname = sc.nextLine();
    }

    void studentRegistration(Scanner sc)
    {
        String studentfullname;
        String studentusername, studentpassword;

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
