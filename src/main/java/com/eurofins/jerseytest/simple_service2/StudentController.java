package com.eurofins.jerseytest.simple_service2;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eurofins.model.Student;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/student")
public class StudentController {

    
	private static List<Student> studentList = new ArrayList<>();
	
	@GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Student> getAllStudents() {
        return this.studentList;
    }
	
	@POST
	@Path("/{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	public void addStudent(Student student) {
		studentList.add(student);
		System.out.println(studentList);
	}
	
	
}
