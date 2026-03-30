// Name : Naresh Suthar | Reg. No. : 24BAI10260

package studentManagement;

import java.util.ArrayList;
import java.util.List;

public class Studentservice {
    // Raw types (no generics in JDK 1.3)
    private List students = new ArrayList();

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    // View Students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            Student s = (Student) students.get(i); // manual cast
            System.out.println(s);
        }
    }

    // Search Student by ID
    public Student searchStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            Student s = (Student) students.get(i);
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Update Student
    public void updateStudent(int id, String name, int age, String course) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
            s.setCourse(course);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Delete Student
    public void deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
}