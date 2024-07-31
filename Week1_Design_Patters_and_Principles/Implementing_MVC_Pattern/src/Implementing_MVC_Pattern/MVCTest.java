package Implementing_MVC_Pattern;

public class MVCTest {
    public static void main(String[] args) {
        Student model = new Student("Sruthika", "1010", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Lashwik");
        controller.updateView();
    }
}
