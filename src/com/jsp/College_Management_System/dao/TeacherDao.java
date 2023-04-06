package com.jsp.College_Management_System.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.College_Management_System.dto.Teacher;
import com.jsp.College_Management_System.util.HelperClass;

public class TeacherDao {
	HelperClass helperClass=new HelperClass();
	public Teacher saveTeacher(Teacher teacher){
		Connection connection= helperClass.getConnection();
		String sql="insert into teacher values(?,?,?);";
		
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.setString(2, teacher.getName());
			preparedStatement.setString(3, teacher.getSub());
			
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teacher;
	}
	
	public Teacher updateTeacher(Teacher teacher){
		Connection connection= helperClass.getConnection();
		String sql="Update teacher set name='Dike' where id=?";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, teacher.getId());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teacher;
		
	}
	
	public void deleteTeacher(int id){
		Connection connection= helperClass.getConnection();
		String sql="Delete from teacher where id=?";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void readTeacher(int id){
		Connection connection= helperClass.getConnection();
		String sql="Select * from teacher where id=?";
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
	public void readAllTeacher(){
		Connection connection= helperClass.getConnection();
		String sql="Select * from teacher";
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
