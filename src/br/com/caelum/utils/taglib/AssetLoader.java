package br.com.caelum.utils.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;


public class AssetLoader extends TagSupport {


	private String src;
	private String type;
	
	private static final long serialVersionUID = 6957396923230038833L;

	public AssetLoader() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int doStartTag() throws JspException {
		
		if(this.getSrc().indexOf("/") != 0 ){
			this.setSrc("/" + this.getSrc());
		}
		
		String code = "";
		
		if("css".equals(this.getType())){
			code = "<link rel='stylesheet' type='text/css' href='." + this.getSrc() + " ' /> ";
		} else if ("js".equals(getType())){
			code =  "<script type='text/javascript' src='." + this.getSrc() +" '></script>";	
		}else if("icon".equals(getType())){
			code = "<link rel='icon' type='image/x-icon' href='." + this.getSrc() + " ' /> ";
		}

		
		try {
			pageContext.getOut().print(code);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String Type) {
		this.type = Type;
	}

}
