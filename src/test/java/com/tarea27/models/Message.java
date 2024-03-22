package com.tarea27.models;

public class Message {
	String subjet;
	String from;
	String to;
	String content;
	User remitente;
	User destenatario;
	
	
	public Message(String subjet, User remitente, User destenatario, String content) {
		this.subjet = subjet;
		this.remitente = remitente;
		this.destenatario = destenatario;
		this.to = destenatario.getEmail();
		this.content = content;
		this.from = remitente.getEmail();
	}
	public String getSubjet() {
		return subjet;
	}
	public void setSubjet(String subjet) {
		this.subjet = subjet;
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
	
	public User getRemitente() {
		return remitente;
	}
	public void setRemitente(User remitente) {
		this.remitente = remitente;
	}
	
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public User getDestenatario() {
		return destenatario;
	}
	public void setDestenatario(User destenatario) {
		this.destenatario = destenatario;
	}
	@Override
	public String toString(){
		return "Mensaje: "+ this.content + "\n"
				+ "From: " + this.remitente.getEmail() + "\n"
				+ "To: " + this.to + "\n"
				;
	}

}
