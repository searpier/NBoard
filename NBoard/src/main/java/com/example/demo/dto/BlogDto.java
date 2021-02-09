package com.example.demo.dto;

public class BlogDto {

	private String id;
	private String pwd;
	private String name;

	public BlogDto(String id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	public BlogDto() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BlogDto [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}

}
