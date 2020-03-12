package com.mvcpractice.student;

public class StudentController {
  private Student model;
  private StudentView view;

  public StudentController(Student model, StudentView view){
    this.model = model;
    this.view = view;
  }

  public void setStudentName(String name){
    model.setName(name);
  }

  public String getStudentName(){
    return model.getName();
  }

  public void setStudentRollNo(String rollNo){
    model.setrollNo(rollNo);
  }

  public String getStudentRollNo(){
    return model.getrollNo();
  }

  //그리고 뷰를 업데이트까지 해주는 역할을 컨트롤러가 수행한다.
  public void updateView(){
    view.printStudentDetails(model.getName(), model.getrollNo());
  }
}
