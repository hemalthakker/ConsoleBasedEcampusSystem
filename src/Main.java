import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student studentObj = new Student();
        Teacher teacherObj = new Teacher();

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
                        

                }
        }

    }
}
