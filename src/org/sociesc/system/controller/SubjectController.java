package org.sociesc.system.controller;

import org.sociesc.system.university.Subject;
import org.sociesc.system.university.bo.SubjectBO;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.ioc.RequestScoped; 

@RequestScoped  
@Resource 
public class SubjectController  {
	
	public final Result result;
	
	public SubjectController(Result result){
		this.result = result;
	}
	
	@Path("/subject/add")
	public void add(){
	}
	
	@Post
	@Path("/subject/save")
	public void save(Subject subject){
		
		result.include("h1", subject.getNome());
		SubjectBO subBO = new SubjectBO();
		
		try {
			subBO.insert(subject);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
