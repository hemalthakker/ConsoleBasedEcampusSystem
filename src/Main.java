import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class Main {

    private static ArrayList<Teacher> teacherarraylistObj = new ArrayList<Teacher>();
    private static ArrayList<Course> coursearraylistObj = new ArrayList<Course>();
    private static ArrayList<Student> studentarraylistObj = new ArrayList<Student>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student studentObj = new Student();
        Teacher teacherObj = new Teacher();

        while(true)
        {
            System.out.print("\nEnter 1 to Register Yourself\n");
            System.out.print("Enter 2 to Login\n");
            System.out.print("Enter 3 to Exit\n");
            System.out.print("Enter Your Choice : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice)
            {
                case 1:
                    System.out.println("Enter 1 to Register Yourself as Student");
                    System.out.println("Enter 2 to Register Yourself as Teacher");
                    int choiceRegister = Integer.parseInt(sc.nextLine());
                    switch (choiceRegister)
                    {
                        case 1:
                            studentObj.studentRegistration(sc,studentarraylistObj);
                            break;
                        case 2:
                            teacherObj.teacherRegistration(sc,teacherarraylistObj);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Enter 1 to Login as Student");
                    System.out.println("Enter 2 to Login as Teacher");
                    int choiceSignin = Integer.parseInt(sc.nextLine());
                    switch (choiceSignin)
                    {
                        case 1:
                            studentObj.studentSignin(sc,studentarraylistObj);
                            break;
                        case 2:
                            teacherObj.teacherSignin(sc,teacherarraylistObj);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;

                    }
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
