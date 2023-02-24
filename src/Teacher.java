import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Main{

    
    int teacherid;
    private String username;
    private String password;
    ArrayList<Course> teacherCourse = new ArrayList<Course>();

    void setTeacherName(String username)
    {
        this.username=username;
    }

    void setTeacherPassword(String password)
    {
        this.password=password;
    }

    String getTeacherName()
    {
        return this.username;
    }

    static Student findStudentByStudentName(ArrayList<Student> students, String input_studentname){
        for (Student student: students)
            if (student.getStudentName().equals(input_studentname))
                return student;
        return null;
    }

    static Teacher findTeacherByUsername(ArrayList<Teacher> teachers, String input_username){
        for (Teacher teacher: teachers)
            if (teacher.getTeacherName().equals(input_username))
                return teacher;
        return null;
    }


    void addCourse()
    {
        //String courseid,coursename;
        //int teacherid,allstudents,studentid;

        System.out.print("Enter Course Id ");
        String courseid = sc.nextLine();

        System.out.print("Enter Course Name ");
        String coursename = sc.nextLine();

        System.out.println("Enter Course Passing Criteria : ");
        int coursepassingcriteria = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Course Credit : ");
        int coursecredit = Integer.parseInt(sc.nextLine());

        System.out.println("Enter no of students you want to add in your course : ");
        int totalstudents=Integer.parseInt(sc.nextLine());

        for(int i=0;i<totalstudents;i++)
        {
            System.out.println("Enter Student Id : ");
            String studname = sc.nextLine();
            Student findexistingStudent = Teacher.findStudentByStudentName(studentarraylistObj, studname);
            if (findexistingStudent != null){
                Course newCourse = new Course();
                newCourse.setTeacherName(this.username);
                newCourse.setCourseId(courseid);
                newCourse.setCourseName(coursename);
                newCourse.setCourseCredit(coursecredit);
                newCourse.setCousePassingcriteria(coursepassingcriteria);
                findexistingStudent.studentAllCourse.add(newCourse);
            }
            else{
                System.out.println("\n Student with name : "+studname+" doestn't exist");
            }
        }

        //add course in teacher
        Course newCourse = new Course();
        newCourse.setTeacherName(this.username);
        newCourse.setCourseId(courseid);
        newCourse.setCourseName(coursename);
        newCourse.setCourseCredit(coursecredit);
        newCourse.setCousePassingcriteria(coursepassingcriteria);
        teacherCourse.add(newCourse);
    }

    void courseAddUpdate()
    {
        System.out.println("Enter 1 to Add New Course");
        int choice = Integer.parseInt(sc.nextLine());
        switch(choice)
        {
            case 1:
                addCourse();
                break;
        }

    }

    void marksOperations()
    {

    }

    void studentListUpdate()
    {

    }

    void teacherMenu()
    {
        System.out.println("Enter 1 to Add or Update Course");
        System.out.println("Enter 2 to Add, Update, View Marks");
        System.out.println("Enter 3 to Add or Delete Student");
        int choice = Integer.parseInt(sc.nextLine());
        switch(choice)
        {
            case 1:
                courseAddUpdate();
                break;
            case 2:
                marksOperations();
                break;
            case 3:
                studentListUpdate();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("\n Enter Valid Choice ");
        }
    }

    void teacherRegistration() 
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

    void teacherSignin()
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
                teacherMenu();
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
