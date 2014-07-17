package br.com.caelum.utils.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class WindowField extends TagSupport {

	private String id;
	private String className;
	private String type;
	private String name;
	private String value;
	private String label;
	private boolean required;
	
	private static final long serialVersionUID = -36839703974224552L;

	public WindowField() {
		
	}
	
	@Override
	public int doStartTag() throws JspException {
		StringBuilder field = new StringBuilder();
		if (this.getLabel()  !=   null && !this.getLabel().trim().isEmpty()) {
			field.append("<label class='formLabel'> " + this.getLabel());
			if(this.isRequired()){
				field.append(" *");
			}
			field.append( "</label>");
		}
		
		field.append("<input");
		
		if(this.getId() != null && !this.getId().trim().isEmpty()){
			field.append(" id='" + this.getId() + " ' ");
		}
		
		if(this.getClassName() != null && !this.getClassName().trim().isEmpty()){
			field.append(" class='"+this.getClassName());
			if(this.isRequired()){
				field.append(" validate ");
			}			
			field.append("' ");
		}else{
			if(this.isRequired()){
				field.append(" class='validate' ");
			}			
		}
		
		if(this.getValue() != null && !this.getValue().trim().isEmpty()){
			field.append(" value='" + this.getValue() + "' ");
		}
		
		if(this.getName() != null && !this.getName().trim().isEmpty()){
			field.append(" name='" + this.getName() + "' ");
		}
		
		if(this.getType() != null && !this.getType().trim().isEmpty()){
			field.append(" type='" + this.getType() + "' ");
		}
		
		if(this.isRequired()){
			field.append(" required ");
		}
		
		field.append("></input>");
		
		Window window = (Window) this.getParent();
		window.addField(field.toString());
		
		return SKIP_BODY;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	

}
