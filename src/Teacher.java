import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Main{

    
    private static final Teacher NULL = null;
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

    void addCourse(String teacherusername)
    {
        //String courseid,coursename;
        //int teacherid,allstudents,studentid;

        System.out.print("\nEnter Course Id ");
        String courseid = sc.nextLine();


        System.out.print("\nEnter Course Name ");
        String coursename = sc.nextLine();

        System.out.println("\nEnter Course Passing Criteria : ");
        int coursepassingcriteria = Integer.parseInt(sc.nextLine());

        System.out.println("\nEnter Course Credit : ");
        int coursecredit = Integer.parseInt(sc.nextLine());

        System.out.println("\nEnter no of students you want to add in your course : ");
        int totalstudents=Integer.parseInt(sc.nextLine());

        for(int i=0;i<totalstudents;i++)
        {
            System.out.println("Enter Student Name : ");
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
        Course newObj = new Course();
        newObj.setTeacherName(this.username);
        newObj.setCourseId(courseid);
        newObj.setCourseName(coursename);
        newObj.setCourseCredit(coursecredit);
        newObj.setCousePassingcriteria(coursepassingcriteria);
        Teacher findexistingTeacher = Teacher.findTeacherByUsername(teacherarraylistObj, teacherusername);
        if(findexistingTeacher!=NULL)
        {
            findexistingTeacher.teacherCourse.add(newObj);
        }

        //design baki
        System.out.println("\n\n The List of Students enrolled in this course are\n\n");

        for(Student student : studentarraylistObj)
        {
            for(Course course : student.studentAllCourse)
            {
                if(course.courseid.equals(courseid))
                {
                    System.out.println("Student Id : "+student.getStudentId());
                    System.out.println("Student Name : "+student.getStudentName());
                    System.out.println("\n\n");
                }
            }
        }
    }

    

    void courseAddUpdate(String teacherusername)
    {
        System.out.println("Enter 1 to Add New Course");
        int choice = Integer.parseInt(sc.nextLine());
        switch(choice)
        {
            //3 ai ek addCOurse ma nakhi didhela chuta krvana baki

            case 1:
                addCourse(teacherusername);
                break;

        }

    }

    void marksOperations()
    {
        while(true)
        {
            System.out.println("Enter 1 to Add Mark of A Student");
            System.out.println("Enter 2 to View Mark of A Student");
            System.out.println("Enter 3 to Update Mark of A Student");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Student Name : ");
                    String studname = sc.nextLine();
                    Student findexistingStudent = Teacher.findStudentByStudentName(studentarraylistObj, studname);
                    if (findexistingStudent != null)
                    {
                        System.out.println("\n Enter Course Id : ");
                        String courseId = sc.nextLine();
                        for(Course course : findexistingStudent.studentAllCourse)
                        {
                            if(course.courseid.equals(courseId))
                            {
                                System.out.println("\n Enter Marks : ");
                                int studmarks = Integer.parseInt(sc.nextLine());
                                course.marks=studmarks;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n Enter Course Id : ");
                    String courseId = sc.nextLine();
                    for(Student student : studentarraylistObj)
                    {
                        for(Course course : student.studentAllCourse)
                        {
                            if(course.courseid.equals(courseId))
                            {
                                System.out.println("\n\n Student Name : "+student.getStudentName()+"\nMarks : "+course.marks);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("\nEnter Student Name : ");
                    String stname = sc.nextLine();
                    Student findexistingStud = Teacher.findStudentByStudentName(studentarraylistObj, stname);
                    if (findexistingStud != null)
                    {
                        System.out.println("\n Enter Course Id : ");
                        String courseid = sc.nextLine();
                        for(Course course : findexistingStud.studentAllCourse)
                        {
                            if(course.courseid.equals(courseid))
                            {
                                System.out.println("\n Enter Marks : ");
                                int studmarks = Integer.parseInt(sc.nextLine());
                                course.marks=studmarks;
                            }
                        }
                    }
                    break;
                    
            }
        }
    }

    void studentListUpdate()
    {
        while(true)
        {
            System.out.println("Enter 1 to Add Student");
            System.out.println("Enter 2 to Delete Student");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice)
            {
                case 1:
                    System.out.println("Enter Course Id : ");
                    String courseid = sc.nextLine();

                    Course storeCourse;
                    bool check=false;

                    for(Teacher teacher : teacherarraylistObj)
                    {
                        for(Course course : teacherCourse)
                        {
                            if(course.courseid.equals(courseid))
                            {
                                check=true;
                                storeCourse=course;
                            }
                        }
                    }

                    if(check)
                    {
                        System.out.println("\nEnter no of students you want to add in your course : ");
                        int totalstudents=Integer.parseInt(sc.nextLine());
        
                        for(int i=0;i<totalstudents;i++)
                        {
                            System.out.println("Enter Student Name : ");
                            String studname = sc.nextLine();
                            Student findexistingStudent = Teacher.findStudentByStudentName(studentarraylistObj, studname);
                            if (findexistingStudent != null)
                            {
                                Course newCourse = new Course();
                                newCourse.setTeacherName(this.username);
                                newCourse.setCourseId(storeCourse.courseid);
                                newCourse.setCourseName(storeCourse.coursename);
                                newCourse.setCourseCredit(storeCourse.coursecredit);
                                newCourse.setCousePassingcriteria(storeCourse.coursepassingcriteria);
                                findexistingStudent.studentAllCourse.add(newCourse);
                            }
                            else{
                                System.out.println("\n Student with name : "+studname+" doestn't exist");
                            }
                        }
                    }

            }
        }
    }

    void teacherMenu(String teacherusername)
    {
        System.out.println("Enter 1 to Add or Update Course");
        System.out.println("Enter 2 to Add, Update, View Marks");
        System.out.println("Enter 3 to Add or Delete Student");
        int choice = Integer.parseInt(sc.nextLine());
        switch(choice)
        {
            case 1:
                courseAddUpdate(teacherusername);
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
                teacherMenu(teacherusername);
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
