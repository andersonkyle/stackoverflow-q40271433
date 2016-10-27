package com.example.stackoverflow;

public class Greeting {

	private long id;
	private String content;
	private String dooDad;
	
	public Greeting(long id, String content, String dooDad) {
		this.id = id;
		this.content = content;
		this.dooDad = dooDad;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDooDad() {
		return dooDad;
	}
	public void setDooDad(String dooDad) {
		this.dooDad = dooDad;
	}
	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + ", dooDad=" + dooDad + "]";
	}
	
}
