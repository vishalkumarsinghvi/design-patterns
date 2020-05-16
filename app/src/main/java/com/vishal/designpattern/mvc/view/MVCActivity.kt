package com.vishal.designpattern.mvc.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.vishal.designpattern.R
import com.vishal.designpattern.mvc.controller.MVCController
import kotlinx.android.synthetic.main.activity_m_v_c.*

class MVCActivity : AppCompatActivity() {
	val mvcController: MVCController = MVCController(this)
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_m_v_c)
		et_email.onChange { mvcController.setEmail(it) }
		et_username.onChange { mvcController.setUsername(it) }
	}
	
	fun printTextView(value: String) {
		tv_text.text = value
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