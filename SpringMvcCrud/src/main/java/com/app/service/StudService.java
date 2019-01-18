package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudService 
{
	public int addStudent(Student student);
	public List<Student> login(Student student);
	public List<Student> showList();
	public Student editStudent(int id);
	public void updateStudent(Student student);
	public int deleteStudent(int id);
}
