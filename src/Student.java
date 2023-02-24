import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Main {
    static int id=0;
    int studentid;
    String username;
    String password;
    double percentage;
    String overallgrade;
    ArrayList<Course> studentAllCourse=new ArrayList<Course>();


    void setStudentName(String username)
    {
        this.username=username;
    }

    void setStudentPassword(String password)
    {
        this.password=password;
    }

    Student(){
        id++;
        studentid=id;
    }

    String getStudentName(){
        return this.username;
    }

    String getStudentPassword(){
        return this.password;
    }

    int getStudentId(){
        return this.studentid;
    }

    static Student findStudentByStudentId(ArrayList<Student> students, int input_studentid){
        for (Student student: students)
            if (student.getStudentId()==input_studentid)
                return student;
        return null;
    }

    void studentinput()
    {
        String studentid;
        String studentname;
        System.out.print("Enter Student id ");
        studentid = sc.nextLine();
        System.out.print("Enter Student name ");
        studentname = sc.nextLine();
    }

    void studentRegistration()
    {
        System.out.print("\nEnter UserName : ");
        username = sc.nextLine();

        System.out.print("\nEnter Password : ");
        password = sc.nextLine();

        Student findexistingStudent = Student.findStudentByStudentName(studentarraylistObj, username);
        if (findexistingStudent != null){
            System.out.println("Student Already Exists");
        }
        else {
            Student newStudent = new Student();
            newStudent.setStudentName(username);
            newStudent.setStudentPassword(password);
            studentarraylistObj.add(newStudent);
            int len = newStudent.getStudentPassword().length();
            String asterisk="*";
            for(int i=1;i<len;i++)
            {
                asterisk+='*';
            }
            System.out.println("Student Name : " + newStudent.getStudentName());
            System.out.println("Student Password : " + asterisk);
            System.out.println("Successfully Registered");
        }
    }

    void studentSignin()
    {
        String studentusername, studentpassword;
        System.out.print("\nEnter Student UserName : ");
        studentusername = sc.nextLine();

        Student findexistingStudent = Student.findStudentByStudentName(studentarraylistObj, username);
        if (findexistingStudent != null)
        {
            System.out.print("\nEnter Password : ");
            studentpassword = sc.nextLine();

           if(studentpassword.equals(findexistingStudent.password))
           {
                System.out.println("\n Redirect karo Login Ma");
           }
           else{
            System.out.println("\n Invalid Password");
           }
        }else{
            System.out.println("\n Invalid User");
        }
    }
}
