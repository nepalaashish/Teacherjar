package com.school.stl.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.school.stl.entity.Teacher;
import com.school.stl.service.Teacherservice;


@RestController
@CrossOrigin("*")
public class Teachercontroller {
	

	@Autowired
	public Teacherservice techservice;
	
	@Bean
	public RestTemplate getRestTemplate() {
		return  new  RestTemplate();
		
	}
	static final String Student_URL_ID = "http://localhost:4002/Getallstudent";
	
	@Autowired
	private RestTemplate restTemplate;


@CrossOrigin("http://localhost:9003")
	@GetMapping("/getallteachers")
	public List<Teacher> getallteachers() {

		return  techservice.getallteachers();
	}
	
	@PostMapping("/teacher")
	public Teacher addteacher(@RequestBody Teacher teacher) {

		Teacher p = techservice.save(teacher);
		return p;
	}
	
	@DeleteMapping("/teacher/{}")
	public void deletetecher(@PathVariable("Employeeid") Long Employeeid) 
	{
		techservice.deleteteacher(Employeeid);
	}
	@PutMapping("/teacher/{Employeeid}")
	public void updateteachers(@PathVariable ("Employeeid") long Employeeid,@RequestBody Teacher teacher) 
	{
		techservice.updateteacher(Employeeid, teacher);
    }
	
	@GetMapping("/getstudents")
	public String findstudent() {
		return restTemplate.exchange(Student_URL_ID, HttpMethod.GET, null, String.class).getBody();
	}
	
	
	
	

	
	

}
