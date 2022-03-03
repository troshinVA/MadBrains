package com.example.hw4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.launch
import androidx.core.content.res.ResourcesCompat
import com.example.hw4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var imgView: ImageView
    private lateinit var btnView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imgView = binding.imageMain
        btnView = binding.buttonMain

        val getContent = registerForActivityResult(MyContract()) { imageId: Int? ->
            when (imageId) {
                1 -> imgView.setImageResource(R.drawable.one)
                2 -> imgView.setImageResource(R.drawable.two)
                3 -> imgView.setImageResource(R.drawable.three)
            }
        }

        val imageId = savedInstanceState?.getInt(IMAGE_KEY) ?: R.drawable.one
        binding.imageMain.setImageResource(imageId)

        btnView.setOnClickListener {
            getContent.launch()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        imgView.setImageResource(savedInstanceState.getInt(IMAGE_KEY))
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(IMAGE_KEY, imgView.id.toString().toInt())
    }

    companion object {
        const val IMAGE_KEY = "image_key"
    }
}