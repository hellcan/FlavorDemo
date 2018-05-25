package com.example.fengcheng.main.flavordemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.fengcheng.Constants


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(Constants.type == Constants.Type.FREE){
            Toast.makeText(this, "FREE VERSION", Toast.LENGTH_SHORT).show()

        }
        else{
            Log.i("TAG", "PREMIUM VERSION")
            Toast.makeText(this, "PREMIUM VERSION", Toast.LENGTH_SHORT).show()
        }
    }
}
