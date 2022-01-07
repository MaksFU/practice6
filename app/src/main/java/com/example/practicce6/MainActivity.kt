package com.example.practicce6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: RandomNumberViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val provider = ViewModelProvider(this)
        viewModel = provider.get(RandomNumberViewModel::class.java)

        observeViewModel()
        updateView()
    }

    fun observeViewModel() {
        viewModel.randNum.observe(this, Observer {
            rndNum.setText(it.toString())
        })
    }

    fun updateView() {
        getRnd.setOnClickListener {
            viewModel.onButClicked()
        }
    }
}