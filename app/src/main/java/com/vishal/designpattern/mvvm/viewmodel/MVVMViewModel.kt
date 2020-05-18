package com.vishal.designpattern.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vishal.designpattern.mvvm.model.User


class MVVMViewModel : ViewModel() {
	var email = MutableLiveData<String>()
	var username = MutableLiveData<String>()
	private var userMutableLiveData: MutableLiveData<User>? = null
	
	
	val user: MutableLiveData<User>
		get() {
			if (userMutableLiveData == null) {
				userMutableLiveData = MutableLiveData()
			}
			return userMutableLiveData!!
		}
	
	fun setData() {
		val user = User(email.value!!, username.value!!)
		userMutableLiveData!!.value = user
	}
}