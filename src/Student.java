import jdk.jfr.Percentage;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Main {
    static int id=-1;
    int studentid;
    String username;
    String password;
    double percentage;
    String overallgrade;

String markstograde(int marks)
{
    if(marks>90 && marks<=100)
        return "AA";
        else if(marks>80 && marks <=90)
            return "AB";
            else if(marks>70 && marks <=80)
                return "BB";
            else if(marks>60 && marks<=70)
                return "BC";
            else if(marks>50 && marks<=60)
                return "CC";
            else if(marks>40 && marks<=50)
                return  "CD";
            else
                return "FF";

}
    ArrayList<Course> studentAllCourse=new ArrayList<Course>();
    void setPercentage(double k)
    {
        this.percentage=k;
    }
    void Percentage(Student Cstudent) {
        for (Student student : studentarraylistObj) {
            if (student.username.equals(Cstudent.username)) {
                double total = 0;
                double coursecalculate=0;
                for (Course course : student.studentAllCourse) {
                    if (course.getMarks() == 0)
                    {
                    }
                        else
                        {
                            coursecalculate++;

                            total = total + course.getMarks();
                        }

                    }
                    coursecalculate=coursecalculate*100;
                    total=total*100/coursecalculate;
                    student.setPercentage(total);
                }

            }
        }



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


    static Student findStudentByStudentName(ArrayList<Student> students, String input_username){
        for (Student student: students)
            if (student.getStudentName().equals(input_username))
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
    String calculategrade(Student findexistingStudent)
    {
        int marks=0;
        for(Course course:findexistingStudent.studentAllCourse)
        {
            if(course.getMarks()==0 )
                return "NOT COMPLETE";
      else if(course.getMarks()<40 && course.getMarks()!=0)
        {
            return "FAIL";
        }
            else
            {
             marks=marks+course.getMarks();
            }
        }
        int totalstudents=findexistingStudent.studentAllCourse.size();
        if(totalstudents!=0)
            marks=marks/totalstudents;
        return markstograde(marks);
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
                double percentage1=findexistingStudent.percentage;
                System.out.println("Student id : "+findexistingStudent.studentid);
                System.out.println("Student Name : "+findexistingStudent.username);
                System.out.println("List of courses with their total credits attained credits grades : ");
                boolean flag=false;
                if(findexistingStudent.studentAllCourse.size()==0)
                {}
else{
                for(Course course :findexistingStudent.studentAllCourse )
                {
                    if(course.getMarks()==0 ) {
                        flag=true;
                        System.out.println(course.getCourseid() + " " + course.getCoursename());
                    }
                    else
                    {
                        System.out.println(course.getCourseid()+" "+course.getCoursename()+" "+course.getMarks()+" "+markstograde(course.getMarks()));
                    }
                }
                if(flag){
                    System.out.print("one or more subject marks not assigned");
                }
                    if(!(flag)) {
                        System.out.println("Overall grades : " + calculategrade(findexistingStudent));
                        System.out.println("Percentage : " + percentage1);
                    }
            }}
            else{
                System.out.println("\n Invalid Password");
            }
        }else{
            System.out.println("\n Invalid User");
        }
    }
}
