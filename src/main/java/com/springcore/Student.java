package com.springcore;

import java.util.List;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAddress;
	private List studentMarks;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
	public List getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(List studentMarks) {
		this.studentMarks = studentMarks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String studentName, String studentAddress, List studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentMarks=" + studentMarks + "]";
	}
	
	
}
