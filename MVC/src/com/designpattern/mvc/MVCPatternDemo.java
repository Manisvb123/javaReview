package com.designpattern.mvc;

public class MVCPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fetch student record based on his roll no from the database
	      Student model  = retriveStudentFromDatabase();

	      //Create a view : to write student details on console
	      StudentView view = new StudentView();

	      StudentController controller = new StudentController(model, view);

	      controller.updateView();
	      System.out.println("first time view");

	      //update model data
	      controller.setStudentName("Suresh");

	      controller.updateView();
	      System.out.println("sec time view after updated the studnet object");

	   }

	 private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("Robert");
	      student.setRollNo("10");
	      return student;
	   }
	}


