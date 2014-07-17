package br.com.caelum.bean;
import br.com.caelum.vraptor.Result;

public class Usuario {
	
	private String usuario;
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String _usuario) {
		this.usuario = _usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String _senha) {
		this.senha = _senha;
	}
	
	public void valida(Result result){
		if(this.getUsuario().equals("diego")){
			result.redirectTo("/some/uri"); 	
			result.include("resultado", "ok");
		}
	}

}
