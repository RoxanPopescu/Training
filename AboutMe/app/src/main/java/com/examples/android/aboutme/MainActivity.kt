package com.examples.android.aboutme

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    @SuppressLint("ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDone: Button = findViewById(R.id.done_button)

        buttonDone.setOnClickListener {
            addNickname(it)
            //Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
        }

        val nicknameTextView: TextView = findViewById(R.id.nickname_text)
        nicknameTextView.setOnClickListener {
            updateNickname(it)
        }
    }

    private fun updateNickname(view: View) {
        val editText: EditText = findViewById(R.id.nickname_edit)
        val buttonDone: Button = findViewById(R.id.done_button)

        editText.visibility = View.VISIBLE
        buttonDone.visibility = View.VISIBLE
        view.visibility = View.GONE
        // Set the focus to the edit text.
        editText.requestFocus()
        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }

    private fun addNickname(view: View) {
        val editText: EditText = findViewById(R.id.nickname_edit)
        val nicknameTextView: TextView = findViewById(R.id.nickname_text)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        //button's view
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
    }
}
