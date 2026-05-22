public class Student {
    private int id;
    private String firstname;
    private float grade;

    // public Student(int id, String firstname, float grade) {
    // this.id = id;
    // this.firstname = firstname;
    // this.grade = grade;
    // }

    // here we check if the grade is between 0-20.
    public void setGrade(float grade) {
        if (grade <= 20 && grade >= 0) {
            this.grade = grade;
        } else {
            System.out.println("Enter grade between 0-20.");
            this.grade = 0;
        }
    }

    // this method is just for printing the data of the student
    public void printInfo() {
        System.out.println("Id: " + id + "\nFullname: " + firstname + "\nGrade: " + grade);
    }

    // this method is setting the characters for student grades, as my own rules on
    // grades
    public char getLetterGrade() {
        if (this.grade >= 15) {
            return 'A';
        } else if (this.grade >= 10) {
            return 'B';
        } else {
            return 'C';
        }
    }

    // setting the (getter and setter) methods.
    // getter methods
    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public float getGrade() {
        return this.grade;
    }

    // setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

}