package com.tarea27.models;

public class Message {
	String subjet;
	String from;
	String to;
	String content;
	
	
	public Message(String subjet, String from, String to, String content) {
		this.subjet = subjet;
		this.from = from;
		this.to = to;
		this.content = content;
	}
	public String getSubjet() {
		return subjet;
	}
	public void setSubjet(String subjet) {
		this.subjet = subjet;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
