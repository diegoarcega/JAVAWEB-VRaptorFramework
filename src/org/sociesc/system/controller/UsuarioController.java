package org.sociesc.system.controller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Action;


import br.com.caelum.bean.Usuario;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.ioc.RequestScoped; 

@RequestScoped  
@Resource 
public class UsuarioController  {
	
	public final Result result;
	//private ArrayList<Usuario> userList;
	
	public UsuarioController(Result result){
		this.result = result;
	}
	
	@Path("/usuario/create")
	public void create(){
		result.include("h1", "create");
	}
	
	
	@Path("/usuario/loga")
	public void loga(){
		result.include("h1", "Cadastre um usuário");
	}
	
	@Get("/usuario/valida")
	public void valida(String usuario, String senha ){
		
		Usuario usuarioInput = new Usuario();
		usuarioInput.setUsuario(usuario);
		usuarioInput.setSenha(senha);
		
		//usuario.valida();
		
		//List<Usuario> permitidos = new ArrayList<Usuario>();
		//permitidos.add(_usuario);
		
         result.include("testeA", usuario + senha );
	}

}
