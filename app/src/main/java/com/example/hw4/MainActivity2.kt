package com.example.hw4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.example.hw4.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOne.setOnClickListener{
            val number = Intent().putExtra(
                MyContract.RESULT_KEY,
                1
            )
            setResult(Activity.RESULT_OK, number)
            finish()
        }

        binding.btnTwo.setOnClickListener{
            val number = Intent().putExtra(
                MyContract.RESULT_KEY,
                2
            )
            setResult(Activity.RESULT_OK, number)
            finish()
        }

        binding.btnThree.setOnClickListener{
            val number = Intent().putExtra(
                MyContract.RESULT_KEY,
                3
            )
            setResult(Activity.RESULT_OK, number)
            finish()
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}