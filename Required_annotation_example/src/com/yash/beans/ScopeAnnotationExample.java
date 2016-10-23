package com.yash.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value="rama")
//@Service
@Scope("prototype")
public class ScopeAnnotationExample {

	String message="okay re baba";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
