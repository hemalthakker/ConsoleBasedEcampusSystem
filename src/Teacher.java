import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {

    static int id=0;
    int teacherid;
    private String username;
    private String password;

    ArrayList<Course> teachercourse = new ArrayList<Course>();

    Teacher() 
    {
        id++;
        teacherid = id;
    }

    /*
     Set Methods
     */

    void setTeacherid(int input_teacherid)
    {
        this.teacherid=input_teacherid;
    }

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

    int getTeacherid()
    {
        return teacherid;
    }

    String getTeacherName()
    {
        return this.username;
    }

    static Teacher findTeacherByTeacherId(ArrayList<Teacher>teachers, int input_teacherid){
        for (Teacher teacher: teachers)
            if (teacher.getTeacherid()==input_teacherid)
                return teacher;
        return null;
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

        Teacher findexistingTeacher = Teacher.findTeacherByTeacherId(teacherarraylistObj, teacherid);
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

    void teacherSignin(Scanner sc)
    {
        String teacherusername, teacherpassword;
        System.out.print("\nEnter Teacher UserName : ");
        teacherusername = sc.nextLine();
        System.out.print("\nEnter Password : ");
        teacherpassword = sc.nextLine();
    }
}
