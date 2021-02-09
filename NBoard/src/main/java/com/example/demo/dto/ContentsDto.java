package com.example.demo.dto;

public class ContentsDto {

	private String conseq;
	private String title;
	private String contents;
	private String id;
	private String indate;

	public ContentsDto(String conseq, String title, String contents, String id, String indate) {
		super();
		this.conseq = conseq;
		this.title = title;
		this.contents = contents;
		this.id = id;
		this.indate = indate;
	}

	public ContentsDto() {
		super();
	}

	public String getConseq() {
		return conseq;
	}

	public void setConseq(String conseq) {
		this.conseq = conseq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	@Override
	public String toString() {
		return "ContentsDto [conseq=" + conseq + ", title=" + title + ", contents=" + contents + ", id=" + id
				+ ", indate=" + indate + "]";
	}

}
