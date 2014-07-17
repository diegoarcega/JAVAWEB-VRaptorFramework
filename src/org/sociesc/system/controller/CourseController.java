package org.sociesc.system.controller;

import org.sociesc.system.university.Course;
import org.sociesc.system.university.bo.CourseBO;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.ioc.RequestScoped; 

@RequestScoped  
@Resource 
public class CourseController  {
	
	public final Result result;
	
	public CourseController(Result result){
		this.result = result;
	}
	
	@Path("/course/add")
	public void add(){
	}
	
	@Post
	@Path("/course/save")
	public void save(Course course){
		
		result.include("h1", course.getNome());
		CourseBO couBO = new CourseBO();
		
		try {
			couBO.insert(course);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	


}
