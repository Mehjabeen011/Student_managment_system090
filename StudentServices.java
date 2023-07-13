//code ko loose Copling karne ka liya interface banaya haa bass baki iska koi kam nahe ha 
// humlog direct bhi kar sakte haa isko without interface create kiya bhi.
package com.studentmanagementsystem.service;

import java.util.List;

import com.studentmanagementsystem.entities.Student;

public interface StudentServices {
	
	List<Student> getAllStudent();
	Student saveStudent(Student student);
	Student getStudentById(int id);
	Student editStudentForm(Student student);
	void deleteStudentById(int id);
	
	
}
