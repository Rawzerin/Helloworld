package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("msg", "OnCreate")


        val button: Button = findViewById(R.id.button)
        val nameEdit: EditText = findViewById(R.id.nameEdit)
        button.setOnClickListener {
            val name: String = nameEdit.text.toString()
            //image.visibility= View.VISIBLE

            val intent:Intent= Intent(this, SecondActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
         }
    }

    override fun onStart() {
        super.onStart()
        Log.i("msg","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("msg","onResume")
    }



    override fun onPause() {
        super.onPause()
        Log.i("msg","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("msg","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("msg","onDestroy")
    }

}