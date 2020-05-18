package com.vishal.designpattern.mvvm.model

class User {
	var username = ""
	var email = ""
	
	constructor(username: String, email: String) {
		this.username = username
		this.email = email
	}
	
	
	override fun toString(): String {
		return "User{username='$username', email='$email'}"
	}
	
}