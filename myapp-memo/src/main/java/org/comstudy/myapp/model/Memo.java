package org.comstudy.myapp.model;

public class Memo {
	private int id;
	private String title;
	private String content;
	
	public Memo() {
		this(0, "", "");
	}
	
	public Memo(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Memo [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
