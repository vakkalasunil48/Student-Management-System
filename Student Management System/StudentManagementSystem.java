import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println();
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {

            System.out.println("\n Student Management System ");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();

                    list.add(new Student(id, name, age));

                    System.out.println("Student Added Successfully");
                    break;
case 2:

                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();

                    boolean found = false;

                    for (Student s : list) {

                        if (s.id == updateId) {

                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            s.name = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            s.age = sc.nextInt();

                            found = true;

                            System.out.println("Student Details Updated");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }

                    break;

        case 3:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < list.size(); i++) {

                        if (list.get(i).id == deleteId) {

                            list.remove(i);

                            removed = true;

                            System.out.println("Student Deleted Successfully");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student Not Found");
                    }

                    break;

case 4:

                    if (list.isEmpty()) {

                        System.out.println("No Student Records Found");

                    } else {

                        System.out.println("\nStudent Details");

                        for (Student s : list) {
                            s.display();
                        }
                    }

                    break;

                case 5:

                    System.out.println("Thank You");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}