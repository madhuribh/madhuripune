package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Student;
import com.app.service.StudService;

@Controller
public class StudController
{
	@Autowired
	private StudService ss;
	
	@RequestMapping("register")
	public String toRegister()
	{
		return "register";
	}
	
	@RequestMapping("reg")
	public String addStudent(@ModelAttribute Student student)
	{	
		int a=ss.addStudent(student);
		if(a>0)
		{
			return "index";
		}
		else
		{
			return "register";
		}
	}
	
	@RequestMapping("login")
	public ModelAndView login(@ModelAttribute Student student)
	{
		List list=ss.login(student);
		if(!list.isEmpty())
		{
			return new ModelAndView("success","data",list);
		}
		else
		{
			return new ModelAndView("index");
		}
	}
	
	@RequestMapping("deleteel{id}")
	public ModelAndView getData(@PathVariable("id") int a)
	{
		List list=new ArrayList<>();
		int b=ss.deleteStudent(a);
		if(b>0)
		{
			list=ss.showList();
		}
		return new ModelAndView("success","data",list);
	}
	
	@RequestMapping("editel{id}")
	public ModelAndView editStud(@PathVariable("id") int a)
	{
		Student student=ss.editStudent(a);
		return new ModelAndView("editpage","stud",student);
	}
	
	@RequestMapping("upd")
	public String updateStud(@ModelAttribute Student student)
	{
		ss.updateStudent(student);
		return "index";
	}
}
