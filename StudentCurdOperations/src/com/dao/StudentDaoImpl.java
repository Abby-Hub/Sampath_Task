package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.db.DbConnection;
import com.model.Student;

public class StudentDaoImpl implements StudentDao {
	Connection con = null;
	
	public StudentDaoImpl() {
		con = DbConnection.getConnection();
	}
	
	
	@Override
	public int save(Student student) {
		int i =0;
		 String qry = "insert into student values(?,?,?,?)";
		 try(PreparedStatement pst = con.prepareStatement(qry)) {
			 pst.setInt(1, student.getId());
			 pst.setString(2, student.getName());
			 pst.setString(3, student.getAddr());
			 pst.setDate(4, new java.sql.Date(new Date().getTime()));
			 i =  pst.executeUpdate();
			 
		 }catch (Exception e) {
			 e.printStackTrace();
			 
		 }
		 
		 if(i != 0)
			 return 1;
			 else
				 return 0;
	}

	@Override
	public List<Student> get() {
		List<Student> list = new ArrayList<Student>();
		String qry = "Select * from Student";
        try {
       		Statement st = con.createStatement();
       		ResultSet rs = st.executeQuery(qry);
       		while (rs.next()) {
       			Student student = new Student();
    			student.setId(rs.getInt(1));
       			student.setName(rs.getString(2));
       			student.setAddr(rs.getString(3));
       			student.setJoinDate(rs.getDate(4));
       			// add student obj to List
       			list.add(student);
       			
       		}

        }catch (Exception e) {
       	 e.printStackTrace();
        }
		
		return list;


	}

	@Override
	public Student get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(int id, String address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean search(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
