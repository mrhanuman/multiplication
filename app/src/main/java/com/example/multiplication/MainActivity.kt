package com.example.multiplication

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var table: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edtNumber)
        button = findViewById(R.id.button)
        table = findViewById(R.id.textView)


        button.setOnClickListener {
            if (editText.text.isEmpty()) {
                Toast.makeText(this, "enter a number", Toast.LENGTH_SHORT).show()
            } else {
                table.text = ""

                val txt = editText.text.toString()

                for (i in 1..10) {
                    val number = txt.toInt()
                    var num = number * i

                    table.append(
                        "$number" + " X " + i
                                + " = " + num + "\n\n"
                    )
                }
            }
            editText.text.clear()
            editText.onEditorAction(EditorInfo.IME_ACTION_DONE)

        }
    }
}