package com.jsp.College_Management_System.controller;

import com.jsp.College_Management_System.dao.StudentDao;
import com.jsp.College_Management_System.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(1);
//		s1.setName("abc");
//		s1.setEmail("abc@gmail.com");
//		
		StudentDao studentDao=new StudentDao();           //common
		
//		Student student=studentDao.saveStudent(s1);       //Save student by passing Student Object
		studentDao.updateStudent(s1);
//		studentDao.deleteStudent(1);                      //delete Student data with primary key ID
//		studentDao.readStudent(3);                        //read the Single Student data by giving ID
	//	studentDao.readAll();
		
		
//		if(student !=null){
//			System.out.println("Student data Updated");
//		}else {
//			System.out.println("Student data not Updated");
//		}
	}

}
