package com.resultapp;

public class StudentTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*Student s1=new Student("Sheela","BE","Computer Science");
		System.out.println(s1.name +"-"+s1.regNo +"-"+s1.degreeName+"-" +s1.branchName);
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.addStudent(s1);*/
		/*Student s2=new Student("Hema.G",421218104013l,"BE","Computer Science");
		System.out.println(s2.name +"-"+s2.regNo +"-"+s2.degreeName+"-" +s2.branchName);
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.updateStudent(s2);*/
		Student s3=new Student("Kiruthika.V",421218104008l,"BE","Computer Science");
		System.out.println(s3.name +"-"+s3.regNo +"-"+s3.degreeName+"-" +s3.branchName);
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.deleteStudent(s3);
		
		
		

		
		
		
		
	}

}
