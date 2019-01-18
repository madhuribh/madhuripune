package com.app.dao;

import java.util.List;

import com.app.model.Student;

public interface StudDao 
{
	public int addStudent(Student student);
	public List<Student> login();
	public List<Student> showList();
	public Student editStudent(int id);
	public void updateStudent(Student student);
	public int deleteStudent(int id);
}
