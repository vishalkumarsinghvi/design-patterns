package com.vishal.designpattern

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.vishal.designpattern.mvc.view.MVCActivity
import com.vishal.designpattern.mvp.view.MVPActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		btn_mvc.setOnClickListener(this)
		btn_mvp.setOnClickListener(this)
		btn_mvvm.setOnClickListener(this)
	}
	
	override fun onClick(p0: View?) {
		if (p0 == btn_mvc) {
			startActivity(Intent(this@MainActivity, MVCActivity::class.java))
		} else if (p0 == btn_mvp) {
			startActivity(Intent(this@MainActivity, MVPActivity::class.java))
		} else if (p0 == btn_mvvm) {
//			startActivity(Intent(this@MainActivity, MVVMActivity::class.java))
		}
	}
}