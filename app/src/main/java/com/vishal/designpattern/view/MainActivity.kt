package com.vishal.designpattern.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.vishal.designpattern.R
import com.vishal.designpattern.presenter.MainActivityPresenter
import com.vishal.designpattern.presenter.MainActivityPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityPresenterImpl {
	private var mainActivityPresenter: MainActivityPresenter? = null
	private var tvText: TextView? = null
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		mainActivityPresenter = MainActivityPresenter(this)
		tvText = findViewById(R.id.tv_text)
		et_email.onChange { mainActivityPresenter!!.setEmail(it) }
		et_username.onChange { mainActivityPresenter!!.setUserName(it) }
	}
	
	override fun updateUserView(user: String?) {
		tvText!!.text = user
	}
	
	fun EditText.onChange(cb: (String) -> Unit) {
		this.addTextChangedListener(object : TextWatcher {
			override fun afterTextChanged(s: Editable?) {
				cb(s.toString())
			}
			
			override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
			override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
		})
	}
}