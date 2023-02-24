public class Course extends Main {
    String teachername;
    String courseid;
    String coursename;
    String coursecredit;
    String coursepassingcriteria;
    int marks;

    void setCourseId(String courseid)
    {
        this.courseid=courseid;
    }

    void setCourseName(String coursename)
    {
        this.coursename=coursename;
    }

    void setCourseCredit(String coursecredit)
    {
        this.coursecredit=coursecredit;
    }

    void setCousePassingcriteria(String coursecriteria)
    {
        this.coursecredit=coursecriteria;
    }

    String checkByTeacherName()
    {
        return this.teachername;
    }

    String checkByCourseId()
    {
        return this.courseid;
    }
    

}

