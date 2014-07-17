/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.caelum.vraptor.blank;

import java.util.List;

import org.sociesc.system.university.Course;
import org.sociesc.system.university.Subject;
import org.sociesc.system.university.University;
import org.sociesc.system.university.bo.CourseBO;
import org.sociesc.system.university.bo.SubjectBO;
import org.sociesc.system.university.bo.UniversityBO;
import org.sociesc.system.user.User;
import org.sociesc.system.user.bo.UserBO;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {

	private final Result result;

	public IndexController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {
		result.include("title", "Projeto Vraptor - Java Web");
		
		UserBO userBO = new UserBO();
		User user = userBO.findUserByLogin("tiago");
		List<User> users = userBO.findAll();
		
		UniversityBO universityBO = new UniversityBO();
		University university = universityBO.findById(1);
		
		CourseBO courseBO = new CourseBO();
		Course course = courseBO.findById(1);
		
		SubjectBO subjectBO = new SubjectBO();
		Subject subject = subjectBO.findById(2);
		
		result.include("singleUser", user.getNome());
		result.include("listOfUsers", geraHtmlUsers(users));
		
		result.include("universidade", university.getNome());
		result.include("curso", course.getNome());
		result.include("materia", subject.getNome());
	}	
	
	private String geraHtmlUsers(List<User> users){
		String usersHtml = "";
		
		for (User user : users) {
			usersHtml += user.getNome();
			usersHtml += ", ";
			}
		
		return usersHtml;
	}
	
	
	
	
	
}
