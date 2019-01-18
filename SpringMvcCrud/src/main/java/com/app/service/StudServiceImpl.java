package com.app.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudDao;
import com.app.model.Student;
@Service
public class StudServiceImpl implements StudService
{
	@Autowired
	private StudDao sd;
	
	@Override
	public int addStudent(Student student)
	{
		return sd.addStudent(student);
	}

	@Override
	public List<Student> showList() 
	{
		return sd.showList();
	}

	@Override
	public Student editStudent(int id)
	{
		return sd.editStudent(id);
	}

	@Override
	public void updateStudent(Student student)
	{
		sd.updateStudent(student);
	}

	@Override
	public int deleteStudent(int id)
	{
		return sd.deleteStudent(id);
	}

	@Override
	public List<Student> login(Student student)
	{
		List list=sd.login();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Student student2=(Student)itr.next();
			if(student.getUsername().equals(student2.getUsername())&&student.getPassword().equals(student2.getPassword()))
			{
				return list;
			}
		}
		return null;
	}

}
