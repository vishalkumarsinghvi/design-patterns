package com.vishal.designpattern.presenter

import com.vishal.designpattern.model.User

class MainActivityPresenter(private val mainActivityPresenterImpl: MainActivityPresenterImpl) {
	private val user: User = User()
	fun setUserName(userName: String?) {
		user.username = userName!!
		mainActivityPresenterImpl.updateUserView(user.toString())
	}
	
	fun setEmail(email: String?) {
		user.email = email!!
		mainActivityPresenterImpl.updateUserView(user.toString())
	}
	
}