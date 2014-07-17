package org.sociesc.system.controller;

import org.sociesc.system.university.University;
import org.sociesc.system.university.bo.UniversityBO;


import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.ioc.RequestScoped; 

@RequestScoped  
@Resource 
public class UniversityController  {
	
	public final Result result;
	
	public UniversityController(Result result){
		this.result = result;
	}
	
	@Path("/university/add")
	public void add(){
	}
	
	@Post
	@Path("/university/save")
	public void save(University university){
		
		result.include("h1", university.getNome());
		UniversityBO uniBO = new UniversityBO();
		
		try {
			uniBO.insert(university);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	


}
