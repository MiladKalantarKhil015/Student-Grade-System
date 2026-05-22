import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        school.addStudents();
        school.createCourse();

        System.out.println("Choose Options by number:");
        while (true) {
            System.out.println("""
                    1. Show Students
                    2. Search Student
                    3. Remove Student
                    4. Show Courses
                    5. Exit
                                    """);
            int selectOption = 0;
            System.out.print("-> ");
            selectOption = scanner.nextInt();
            switch (selectOption) {
                case 1 -> {
                    school.printAllStudentsInfo();
                }
                case 2 -> {
                    System.out.print("Enter student id: ");
                    int id = scanner.nextInt();
                    Student foundStudent = school.findStudent(id);
                    if (foundStudent != null) {
                        foundStudent.printInfo();
                    } else {
                        System.out.println("Student not found.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter student id: ");
                    int id = scanner.nextInt();
                    school.removeStudent(id);
                }
                case 4 -> {
                    school.printCourseInfo();
                }
                case 5 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Enter a valid option!");
                }
            }
        }
    }
}
