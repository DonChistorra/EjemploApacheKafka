package com.chisto.kafka.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageRequest {

	private String mensaje;

	public MessageRequest(@JsonProperty("mensaje") String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void setMensaje (String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
}
