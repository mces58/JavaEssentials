package com.mc_es.spring.error;

public class StudentNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	// kendimize ozel hata sinifi

	public StudentNotFoundException(String message, Throwable studentId) {
		super(message, studentId);
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}

}
