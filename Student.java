package User;

public class Student extends User {
    String matric_no = "bhu/20/04/05/0130";
    String admission_no = "302283748632";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result";
        } else {
            return "You got 6As and 1C";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ugochukwu Uzoho";
        student.password = "lacode@123";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
