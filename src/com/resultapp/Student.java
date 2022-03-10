package com.resultapp;

public class Student {
	public String name;
	public long regNo;
	public String degreeName;
	public String branchName;
	public Student(String name, long regNo, String degreeName, String branchName) {
	
		this.name = name;
		this.regNo = regNo;
		this.degreeName = degreeName;
		this.branchName = branchName;
	}
	public Student(String name, String degreeName, String branchName) {
		
		this.name = name;
		this.degreeName = degreeName;
		this.branchName = branchName;
	}
	
}
