package com.app.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Student;
@Repository
public class StudDaoImpl implements StudDao
{
	@Autowired
	private SessionFactory sf;
	
	@Override
	public int addStudent(Student student)
	{
		Session s=sf.openSession();
		int a=(Integer)s.save(student);
		Transaction ts=s.beginTransaction();
		ts.commit();
		s.close();
		return a;
	}

	@Override
	public List<Student> showList()
	{
		Session s3=sf.openSession();
		Query query=s3.createQuery("from Student");
		List list=query.list();
		return list;
	}

	@Override
	public Student editStudent(int id)
	{
		Session s4=sf.openSession();
		Student student=(Student)s4.get(Student.class, id);
		return student;
	}

	@Override
	public void updateStudent(Student student)
	{
		Session s5=sf.openSession();
		s5.update(student);
		Transaction ts=s5.beginTransaction();
		ts.commit();
		s5.close();
	}

	@Override
	public int deleteStudent(int id) 
	{
		Session s2=sf.openSession();
		Student student=(Student)s2.get(Student.class, id);
		s2.delete(student);
		Transaction ts=s2.beginTransaction();
		ts.commit();
		s2.close();
		return 1;
	}

	@Override
	public List<Student> login()
	{
		Session s1=sf.openSession();
		Query query=s1.createQuery("from Student");
		List list=query.list();
		return list;
	}

}
