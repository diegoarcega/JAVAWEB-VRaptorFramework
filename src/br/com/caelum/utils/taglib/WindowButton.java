package br.com.caelum.utils.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class WindowButton extends TagSupport {

	private static final long serialVersionUID = 5067865924277171477L;
	
	private String id;
	private String className;
	private String onClickEvent;
	private String label;
	
	@Override
	public int doStartTag() throws JspException {
		StringBuilder button = new StringBuilder();
		button.append("<button ");
		
		if(this.getId() != null && !this.getId().trim().isEmpty()){
			button.append(" id='");
			button.append(this.getId());
			button.append("' ");
		}
		
		if(this.getClassName() != null & !this.getClassName().trim().isEmpty()){
			button.append(" class='");
			button.append(this.getClassName());
			button.append("'");
		}
		
		if(this.getOnClickEvent() != null & !this.getOnClickEvent().trim().isEmpty()){
			button.append(" onClick='");
			button.append(this.getOnClickEvent());
			button.append(" ' ");
		}
		
		button.append(">");
		
		if(this.getLabel() != null & !this.getLabel().trim().isEmpty()){
			button.append(this.getLabel());
		}
		
		button.append("</button>");
		
		Window window = (Window) this.getParent();	
		window.addButtonBar(button.toString());
		
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

	public String getOnClickEvent() {
		return onClickEvent;
	}

	public void setOnClickEvent(String onClickEvent) {
		this.onClickEvent = onClickEvent;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public WindowButton() {
		// TODO Auto-generated constructor stub
	}

}

