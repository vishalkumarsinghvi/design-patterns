package com.vishal.designpattern.mvvm.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.vishal.designpattern.R
import com.vishal.designpattern.databinding.ActivityMVVMBinding
import com.vishal.designpattern.mvvm.viewmodel.MVVMViewModel
import kotlinx.android.synthetic.main.activity_m_v_v_m.*


class MVVMActivity : AppCompatActivity() {
	lateinit var binding: ActivityMVVMBinding
	lateinit var mvvmViewModel: MVVMViewModel
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = DataBindingUtil.setContentView(this, R.layout.activity_m_v_v_m)
		mvvmViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application)).get(MVVMViewModel::class.java)
		binding.lifecycleOwner = this
		binding.viewmodel = mvvmViewModel
		mvvmViewModel.user.observe(this, Observer { tv_text.text = it.toString() })
	}
	
	
}
