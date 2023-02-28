package com.school.stl;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


import com.school.stl.entity.Teacher;
import com.school.stl.reprository.Teacherreprsoitory;
import com.school.stl.service.Teacherservice;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;






@SpringBootTest(classes= {TeacherTest.class})
public class TeacherTest {
	@Mock
	Teacherreprsoitory teachrepro;
	
	@InjectMocks
  Teacherservice Teachservice;
	
	public List<Teacher> allteach;
	
	@Test
	@Order(1)
    void test_getallteach()
   
	{
		
	List<Teacher> allteacher = new ArrayList<Teacher>();	
	allteacher.add(new Teacher( ));
	when(teachrepro.findAll()).thenReturn(allteacher);
	assertEquals(1,Teacherservice.getallteacherssize());
		 
	}
	@Test
	@Order(2)
	void test_adddappointment() 
	{
		Appoint appoint = new Appoint("Aashih", "kumar", 1, "Normal", 23, 21, 24, 26 );
		when(appointrepro.save(appoint)).thenReturn(appoint);
		appointservice.addappointment(appoint);
		assertEquals(appoint,appointservice.addappointment(appoint));
		
	}
	
	@Test
	@Order(3)
	void test_updatedoctor() 
	{
		Appoint appoint = new Appoint("Aashih", "kumar", 1, "Normal", 23, 21, 24, 26 );
		appoint.setaid(1);
		appointrepro.save(appoint);
		assertEquals(appoint, appoint);
		 
	}
	@Test
    @Order(4)
    public void  test_getallappoint() {
       Appoint appoint=new Appoint("Aashih", "kumar", 1, "Normal", 23, 21, 24, 26 );
        when(appointrepro.findByAid(1)).thenReturn( appoint);
        assertEquals(appoint, appointservice.getallappoint(1));
        
    }
	}
	


