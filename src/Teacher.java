import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Main{

    static int id=0;
    int teacherid;
    private String username;
    private String password;

    ArrayList<Course> teachercourse = new ArrayList<Course>();

    /*
     Set Methods
     */

    void setTeacherName(String username)
    {
        this.username=username;
    }

    void setTeacherPassword(String password)
    {
        this.password=password;
    }


    /*
     Get Methods
    */
    String getTeacherName()
    {
        return this.username;
    }

    static Teacher findTeacherByUsername(ArrayList<Teacher>teachers, String input_username){
        for (Teacher teacher: teachers)
            if (teacher.getTeacherName().equals(input_username))
                return teacher;
        return null;
    }

    void teacherMenu(Scanner sc)
    {
        System.out.println("Enter 1 to Add or Update Course");
        System.out.println("Enter 2 to Add, Update, View Marks");
        System.out.println("Enter 3 to Add or Delete Student");
        int choice = Integer.parseInt(sc.nextLine());
        

    }

    void teacher(Scanner sc)
    {
        String courseid,coursename;
        int teacherid,allstudents,studentid;

        System.out.print("Enter course id ");
        courseid = sc.nextLine();

        System.out.print("Enter course name ");
        coursename = sc.nextLine();

        System.out.print("Enter teacher id ");
        teacherid = Integer.parseInt(sc.nextLine());

        System.out.print("How many student you teach ");
        allstudents = Integer.parseInt(sc.nextLine());

        System.out.print("Enter all student id ");
        studentid =  Integer.parseInt(sc.nextLine());

    }

    void teacherRegistration(Scanner sc,ArrayList<Teacher>teacherarraylistObj) 
    {
        System.out.print("\nEnter UserName : ");
        username = sc.nextLine();

        System.out.print("\nEnter Password : ");
        password = sc.nextLine();

        Teacher findexistingTeacher = Teacher.findTeacherByUsername(teacherarraylistObj, username);
        if (findexistingTeacher != null){
            System.out.println("--> Teacher already exists!");
        }
        else {
            Teacher newTeacher = new Teacher();
            newTeacher.setTeacherName(username);
            newTeacher.setTeacherPassword(password);
            teacherarraylistObj.add(newTeacher);
            System.out.println("Teacher " + newTeacher.getTeacherName());
        }
    }

    void teacherSignin(Scanner sc,ArrayList<Teacher>teacherarraylistObj)
    {
        String teacherusername, teacherpassword;
        System.out.print("\nEnter Teacher UserName : ");
        teacherusername = sc.nextLine();
        Teacher findexistingTeacher = Teacher.findTeacherByUsername(teacherarraylistObj, teacherusername);
        if (findexistingTeacher != null)
        {
            System.out.print("\nEnter Password : ");
            teacherpassword = sc.nextLine();

           if(teacherpassword.equals(findexistingTeacher.password))
           {
                teacherMenu(sc);
           }
           else{
            System.out.println("\n Invalid Password");
           }
        }else{
            System.out.println("\n Invalid Username");
            System.out.println("\n Please register first if not registered then Login");
        }
    }
}
