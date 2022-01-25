package edu.uw.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btnPushMe)
        var click = 0
        btn.setOnClickListener{
            click++
            if(click==1) {
                btn.text = getString(R.string.btnClickedOnce)
            }else {
                btn.text = "You have pushed me " + click + " times!"
            }
        }
    }
}