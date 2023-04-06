package com.jsp.College_Management_System.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.College_Management_System.dto.Student;
import com.jsp.College_Management_System.util.HelperClass;

public class StudentDao {
	HelperClass helperClass=new HelperClass();
	public Student saveStudent(Student student){
		Connection connection=helperClass.getConnection();
		String sql="insert into student values(?,?,?);";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
		
	}
	
	public Student updateStudent(Student student) {
		  
		  Connection connection=helperClass.getConnection();
		  String sql="UPDATE student SET NAME='Bhushan' WHERE ID=?";
		  
		  try {
		   PreparedStatement preparedStatement=connection.prepareStatement(sql);
		   preparedStatement.setInt(1,student.getId());
//		   preparedStatement.setString(2,student.getName());
//		   preparedStatement.setString(3,student.getEmail());
		   int i=preparedStatement.executeUpdate();
		   if(i>0) {
		    System.out.println("data will updated");
		   }
		   
		  } catch (SQLException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		   
		  }
		  return student;
	}
	
	
	public void deleteStudent(int id){
		Connection connection=helperClass.getConnection();
		String sql="Delete from student where id=?";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			
			System.out.println("delete data");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void readStudent(int id){
		Connection connection= helperClass.getConnection();
		String sql="Select * from student where id=?";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet= preparedStatement.executeQuery();
			
			while(resultSet.next()){
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("===============================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void readAll(){
		Connection connection= helperClass.getConnection();
		String sql="Select * from student";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			ResultSet resultSet= preparedStatement.executeQuery();
			while(resultSet.next()){
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("===============================");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
