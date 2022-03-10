package com.resultapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDAO {
	public int resultQuery(String query) throws Exception {
		// step 1: Database Driver
				Class.forName("com.mysql.cj.jdbc.Driver");

				// Step 2: Get the connection
				//"jdbc:mysql://101.53.133.59:3306/revature_training_db",
				//"rev_user", "rev_user"
				Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
				System.out.println(connection);
				System.out.println(query);
				Statement statement = connection.createStatement();
				int rows = statement.executeUpdate(query);

				connection.close();

				return rows;

	}

	public void addStudent(Student student) throws Exception {

		// insert into Kiruthika_Students_detail(NAME,Reg_no,degree_name,Branch_name)
		// values('Kiruthika','421218104008','BE','Computer Science');
		String query = "insert into Kiruthika_Students_detail(NAME,Reg_no,degree_name,Branch_name)values('"
				+ student.name + "','" + student.regNo + "','" + student.degreeName + "','" + student.branchName + "')";
		int rows = resultQuery(query);
		System.out.println("No of rows inserted: " + rows);

	}

	public void updateStudent(Student student) throws Exception {

		// Update Kiruthika_Students_detail set name='hema' where Reg_No=421218104013;
		String query = "update Kiruthika_Students_detail set NAME='" + student.name + "'where Reg_no=" + student.regNo;
		int rows = resultQuery(query);
		System.out.println("No of rows updated: " + rows);

	}
	public void deleteStudent(Student student) throws Exception {

		// delete Kiruthika_Students_detail where Reg_no='421218104008';
		String query = "DELETE Kiruthika_Students_detail WHERE Reg_no=" + student.regNo;
		int rows = resultQuery(query);
		System.out.println("No of rows Deleted: " + rows);

	}

}
