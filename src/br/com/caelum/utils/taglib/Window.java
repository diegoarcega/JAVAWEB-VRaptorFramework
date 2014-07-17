package br.com.caelum.utils.taglib;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Window extends TagSupport {
	
	private static final long serialVersionUID = 5536756691007522277L;
	
	private String title;
	private String width;
	private String height;
	
	private List<String> fields;
	private List<String> buttonBar;

	public Window() {
		
	}
	
	
	@Override
	public int doStartTag() throws JspException {
		
		this.buttonBar = new ArrayList<String>();
		this.fields = new ArrayList<String>();
		
		JspWriter out = pageContext.getOut();	
		
		String style ="style='width:"+ this.getWidth() +"px ; height:"+ this.getHeight() +"px ; ' ";
		
		String html = "";
		
		html = "<div class='window span8 offset2' "+ style +">";
		
		
		try {
			out.print(html);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doEndTag() throws JspException {
		JspWriter out = pageContext.getOut();	
		
		String html ="";
		html += this.buildTitle();
		html += this.buildBody();
		html += this.buildButtonBar();
		html += "</div>";
		
		try {
			out.print(html);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return EVAL_PAGE;
	}
	
	public String buildTitle(){
		String html = 
				"<div class='header' tabindex='-1' >" +
					"<span class='title'>" + this.getTitle() + "</span>" +
					"<span class='header-button close-button'></span>" +
					"<span class='header-button maximize-button'></span>" +
					"<span class='header-button minimize-button'></span>" +
					"<span class='header-button help-button'></span>" +
				 "</div>";
		return html;
	}
	
	public String buildBody(){
		String html="<div class='body'>" ;
		
		for (String field : this.fields) {
			html += field;
		}
		
		html+= "</div>";

		return html;
	}
	
	public String buildButtonBar(){
		String html="<div class='button-bar'>" ;
		
		for (String button : this.buttonBar) {
			html += button;
		}
		
		html += "</div>";
		
		return html;
	}
	
	public void  addButtonBar(String button){
		this.buttonBar.add(button);
	}
	
	public void  addField(String field){
		this.fields.add(field);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
