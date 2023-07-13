//ya par main Logic likha ha data kase insert update delete hoga 
//aur interface ka implementation yaha par kiya haa.
package com.studentmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagementsystem.entities.Student;
import com.studentmanagementsystem.repository.StudentRepository;

@Service
public class Student_Services_Impl implements StudentServices {

	@Autowired //object  pass karne ka liya annotation use kya ha
	private StudentRepository repository;

	
	public Student_Services_Impl(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	//ya method database sa sare student find karke dega
	@Override
	public List<Student> getAllStudent() {

		return repository.findAll();//ya method (findAll()) predefine haa JPA Repository ma bass humlog na use kiya haa isko

	}
	
	//ya database ma student ka data insert kare ga
 	@Override
	public Student saveStudent(Student student) {
		return repository.save(student);//yabhi same haa predefine method (save(student)).
	}

 	//ya student ka data as per ID Find karke dega
	@Override
	public Student getStudentById(int id) {
		
		return repository.findById(id).get();
	}

	//ya student ka data ko Update kare ga
	@Override
	public Student editStudentForm(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	//aur ya Student ka Data ko Delete kare ga
	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
}
