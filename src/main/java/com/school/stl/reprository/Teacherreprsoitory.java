package com.school.stl.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.school.stl.entity.Teacher;

@Repository
	@EnableJpaRepositories
	public interface Teacherreprsoitory extends JpaRepository<Teacher, Long> 
	{


	}



