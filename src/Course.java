public class Course extends Main {
    String teachername;
    String courseid;
    String coursename;
    int coursecredit;
    int coursepassingcriteria;
    int marks;

    void setCourseId(String courseid)
    {
        this.courseid=courseid;
    }

    void setCourseName(String coursename)
    {
        this.coursename=coursename;
    }

    void setCourseCredit(int coursecredit)
    {
        this.coursecredit=coursecredit;
    }

    void setCousePassingcriteria(int coursecriteria)
    {
        this.coursecredit=coursecriteria;
    }

    void setMarks(int marks)
    {
        this.marks=marks;
    }

    String checkByTeacherName()
    {
        return this.teachername;
    }

    String checkByCourseId()
    {
        return this.courseid;
    }

    int getMarks()
    {
        return this.marks;
    }
    

}

