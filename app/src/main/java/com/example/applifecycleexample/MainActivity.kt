package com.example.applifecycleexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate() called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter_text.text = counter.toString()

        increment_counter.setOnClickListener{
            counter++
            counter_text.text = counter.toString()
        }
    }

    override fun onStart() {
        Log.i(TAG, "onStart() called")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG, "onStop() called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy() called")
        super.onDestroy()
    }
}
