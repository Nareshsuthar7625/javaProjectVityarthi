// Name : Naresh Suthar | Reg. No. : 24BAI10260

package studentManagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Studentservice service = new Studentservice();
        int choice = 0;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(br.readLine());

                    System.out.print("Enter Name: ");
                    String name = br.readLine();

                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(br.readLine());

                    System.out.print("Enter Course: ");
                    String course = br.readLine();

                    service.addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int sid = Integer.parseInt(br.readLine());
                    Student s = service.searchStudent(sid);
                    System.out.println((s != null) ? s.toString() : "Student not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int uid = Integer.parseInt(br.readLine());

                    System.out.print("Enter New Name: ");
                    String newName = br.readLine();

                    System.out.print("Enter New Age: ");
                    int newAge = Integer.parseInt(br.readLine());

                    System.out.print("Enter New Course: ");
                    String newCourse = br.readLine();

                    service.updateStudent(uid, newName, newAge, newCourse);
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int did = Integer.parseInt(br.readLine());
                    service.deleteStudent(did);
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}