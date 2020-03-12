package com.mvcpractice.student;

public class MVCPatternDemo {
  private static Student retrieveStudentFromDatabase(){
    Student student = new Student();
    student.setName("Honux");
    student.setrollNo("2");
    return student;
  }
  public static void main(String[] args) {
    Student model = retrieveStudentFromDatabase();
    StudentView view = new StudentView();
    StudentController controller = new StudentController(model, view);
    controller.updateView();
    controller.setStudentName("JK");
    controller.setStudentRollNo("1");
    controller.updateView();
  }
}