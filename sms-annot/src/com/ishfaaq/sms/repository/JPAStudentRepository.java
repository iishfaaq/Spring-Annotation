package com.ishfaaq.sms.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ishfaaq.sms.model.Student;

@Repository("a")
public class JPAStudentRepository implements StudentRepository{

	@Override
	public List<Student> fetchAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
