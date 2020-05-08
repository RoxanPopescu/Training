package com.examples.android.aboutme

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.examples.android.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Roxana Popescu")

    @SuppressLint("ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName

        binding.doneButton.setOnClickListener {
            addNickname()
            //Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
        }

        // val nicknameTextView: TextView = findViewById(R.id.nickname_text)
        binding.nicknameEdit.setOnClickListener {
            updateNickname()
        }


    }

    private fun updateNickname() {

        binding.nicknameEdit.visibility = View.VISIBLE

        binding.doneButton.visibility = View.VISIBLE
        binding.doneButton.visibility = View.GONE
        // Set the focus to the edit text.
        binding.nicknameEdit.requestFocus()
        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(binding.nicknameEdit, 0)
    }

    private fun addNickname() {

        binding.apply {
           // nicknameText.text = binding.nicknameEdit.text.toString()
            myName?.nickname = nicknameEdit.text.toString()
            invalidateAll()
            nicknameEdit.visibility = View.GONE
            //button's view
            doneButton.visibility = View.GONE
            nicknameEdit.visibility = View.VISIBLE
        }

    }
}
