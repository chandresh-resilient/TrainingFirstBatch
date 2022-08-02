package com.resilient.Exception;

public class WhateverException extends Exception {

	DBConnection db;

	public WhateverException(DBConnection db, String message) {
		super(message);
		this.db = db;

	}

}
