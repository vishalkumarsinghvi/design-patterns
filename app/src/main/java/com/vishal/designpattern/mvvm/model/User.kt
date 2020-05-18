package com.vishal.designpattern.mvvm.model

class User {
	var username = ""
	var email = ""
	
	override fun toString(): String {
		return "User{username='$username', email='$email'}"
	}
	
}