package com.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.Student;


class StudentTestCase {
	StudentDao dao = new StudentDaoImpl();
	 
	@Test
	void test() {
		Student st = new Student();
		st.setId(102);
		st.setName("Student 22");
		st.setAddr("Addrs 22");
		st.setJoinDate(new Date());
		
		//assertEquals(0, dao.save(st));
		
		saveTest(st);
	}
	
	
	public void saveTest(Student st) {
		assertEquals(0, dao.save(st));
	}
	
	
	 
	    @Test
	    public void testEmployeeResultSet(){
	      
	           
	            List<Student> studentList = dao.get();
	            //Grab the first Result Set
	            Student student = studentList.get(0);
	 
	            assertNotNull(studentList,  "Employees were not parsed.");
	           assertEquals(2, student.getId(), "Employee Id is not equal to 1");
	       
	    }
	 
	    

}
