package com.model;

public class Comments {
	private String name;
	private String email;
	private String text;
	private long vid;
	private String img;
	public Comments() {
		
	}
	public Comments(String name, String email, String text) {
		super();
		this.name = name;
		this.email = email;
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public long getVid() {
		return vid;
	}
	public void setVid(long vid) {
		this.vid = vid;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "Comments [name=" + name + ", email=" + email + ", text=" + text + ", vid=" + vid + ", img=" + img + "]";
	}
	
	
	
	
}
