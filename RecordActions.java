public interface RecordActions {
    void addStudent(Student s);
    void deleteStudent(int rollNo);
    void updateStudent(int rollNo, Student newStudent);
    Student searchStudent(int rollNo);
    void viewAllStudents();
}