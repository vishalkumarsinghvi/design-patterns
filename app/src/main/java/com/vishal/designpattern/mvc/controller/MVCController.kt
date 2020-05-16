package com.vishal.designpattern.mvc.controller

import com.vishal.designpattern.mvc.model.User
import com.vishal.designpattern.mvc.view.MVCActivity

class MVCController(private val view: MVCActivity) {
	val user: User = User()
	fun setEmail(email: String?) {
		user.email = email!!
		view.printTextView(user.toString())
	}
	
	fun setUsername(username: String?) {
		user.username = username!!
		view.printTextView(user.toString())
	}
	
}