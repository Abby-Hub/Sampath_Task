package com.dao;


import java.util.List;

import com.model.Student;

public interface StudentDao {
	int save(Student student);
	
	List<Student> get(); // returns All Student Records as List Collection

	Student get(int id); // returns Student data if id exist otherwise return null

	boolean update(int id, String address);

	boolean delete(int id);

	boolean search(int id);
}