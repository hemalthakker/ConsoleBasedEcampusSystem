import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int studentid;
    String studentname;
    double percentage;
    String overallgrade;
    ArrayList<Course> studentallcourse=new ArrayList<Course>();







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
