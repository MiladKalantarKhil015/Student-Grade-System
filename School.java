import java.util.Scanner;

public class School {
    private final String schoolName = "Bashiri";
    private Student[] students;
    private Course[] courses;

    public void addStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students do we have? -> ");
        int counter = scanner.nextInt();
        this.students = new Student[counter];
        for (int i = 0; i < students.length; i++) {
            Student student = new Student();
            System.out.println("Student " + (i + 1));
            System.out.print("Enter name of student: ");
            String name = scanner.next();
            student.setFirstName(name);
            System.out.print("Enter id of student: ");
            int id = scanner.nextInt();
            student.setId(id);
            System.out.print("Enter grade of student: ");
            float grade = scanner.nextFloat();
            student.setGrade(grade);
            students[i] = student;
            System.out.println();
        }
    }

    public void removeStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
            }
        }
        for (int j = 0; j < (students.length - 1); j++) {
            if (students[j] == null) {
                students[j] = students[j + 1];
                students[j + 1] = null;
            }
        }
    }

    public Student findStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    return students[i];
                }
            }
        }
        return null;
    }

    public void createCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many courses do you have? -> ");
        int counter = scanner.nextInt();
        this.courses = new Course[counter];
        for (int i = 0; i < courses.length; i++) {
            Course course = new Course();
            System.out.print("Enter courseName: ");
            String coursename = scanner.next();
            course.setCourseName(coursename);
            System.out.print("Enter courseCode: ");
            int courseCode = scanner.nextInt();
            course.setCourseCode(courseCode);
            System.out.print("Enter teacherName: ");
            String teacherName = scanner.next();
            course.setTeacherName(teacherName);
            courses[i] = course;
            System.out.println();
        }
    }

    public void printCourseInfo() {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null) {
                System.out.println("Course " + (i + 1) + " Details:");
                System.out.println();
                System.out
                        .println("Course: " + courses[i].getCourseName() + "\nCourseCode: " + courses[i].getCourseCode()
                                + "\nTeacher: " + courses[i].getTeacherName());
                System.out.println();

            }
        }
    }

    public void printAllStudentsInfo() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("Student " + (i + 1));
                System.out.println(
                        "Firstname: " + students[i].getFirstName() + "\nId: " + students[i].getId() + "\nGrade: "
                                + students[i].getGrade() + " " + students[i].getLetterGrade());
                System.out.println();

            }
        }
    }

}