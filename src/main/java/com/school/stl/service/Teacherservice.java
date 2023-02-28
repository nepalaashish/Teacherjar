package com.school.stl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.school.stl.entity.Teacher;
import com.school.stl.reprository.Teacherreprsoitory;

@Service
public class Teacherservice {

	@Autowired
	public Teacherreprsoitory teachrepo;

	@Autowired
	public RestTemplate restTemplate;

	public Teacher save(Teacher teacher) {
		// TODO Auto-generated method stub
		return teachrepo.save(teacher);
	}

	public void updateteacher(Long Employeeid, Teacher teacher) {
		teachrepo.save(teacher);

	}

	public void deleteteacher(Long Employeeid) {
		teachrepo.deleteById(Employeeid);

	}

	public Teacher add(Teacher teacher) {
		// TODO Auto-generated method stub
		return teachrepo.save(teacher);
	}

	public List<Teacher> getallteachers() {

		List<Teacher> list = (List<Teacher>) this.teachrepo.findAll();
		return list;
	}


}

