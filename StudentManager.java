import java.util.HashMap;
import java.util.Map;

public class StudentManager implements RecordActions {

    private Map<Integer, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student s) {
        if (students.containsKey(s.getRollNo())) {
            System.out.println("Duplicate Roll Number! Not allowed.");
            return;
        }
        students.put(s.getRollNo(), s);
        System.out.println("Student Added Successfully.");
    }

    @Override
    public void deleteStudent(int rollNo) {
        if (students.remove(rollNo) != null)
            System.out.println("Student Deleted.");
        else
            System.out.println("Student Not Found.");
    }

    @Override
    public void updateStudent(int rollNo, Student newStudent) {
        if (students.containsKey(rollNo)) {
            students.put(rollNo, newStudent);
            System.out.println("Student Updated.");
        } else {
            System.out.println("Student Not Found.");
        }
    }

    @Override
    public Student searchStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No Records Found.");
            return;
        }

        for (Student s : students.values()) {
            s.displayInfo();
        }
    }
}