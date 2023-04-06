package com.jsp.College_Management_System.controller;

import com.jsp.College_Management_System.dao.TeacherDao;
import com.jsp.College_Management_System.dto.Teacher;

public class TeacherController {

	public static void main(String[] args) {
//		Teacher t1=new Teacher();
//		t1.setId(102);
//		t1.setName("Dube");
//		t1.setSub("History");
		
		TeacherDao teacherDao=new TeacherDao();
//		Teacher teacher= teacherDao.saveTeacher(t1);
//		Teacher teacher= teacherDao.updateTeacher(t1);
//		teacherDao.deleteTeacher(102);
//		teacherDao.readTeacher(104);
		teacherDao.readAllTeacher();
	}

}
