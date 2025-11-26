import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Search Student");
            System.out.println("5. View All Students");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter Roll No: ");
                    int rn = sc.nextInt(); sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(rn, name, email, course, marks);
                    manager.addStudent(s);
                }
                case 2 -> {
                    System.out.print("Enter Roll No to Delete: ");
                    manager.deleteStudent(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter Roll No to Update: ");
                    int rn = sc.nextInt(); sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter New Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student sNew = new Student(rn, name, email, course, marks);
                    manager.updateStudent(rn, sNew);
                }
                case 4 -> {
                    System.out.print("Enter Roll No to Search: ");
                    Student s = manager.searchStudent(sc.nextInt());
                    if (s != null)
                        s.displayInfo("Overloaded Display Method:");
                    else
                        System.out.println("Student Not Found.");
                }
                case 5 -> manager.viewAllStudents();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}