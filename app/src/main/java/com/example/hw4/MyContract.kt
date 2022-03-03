package com.example.hw4

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class MyContract : ActivityResultContract<Void, Int?>() {

    override fun createIntent(
        context: Context,
        input: Void?
    ): Intent {
        return Intent(context, MainActivity2::class.java)

    }

    override fun parseResult(resultCode: Int, intent: Intent?): Int? =when {
        resultCode != Activity.RESULT_OK -> 0
        else -> intent?.extras?.getInt(RESULT_KEY)
    }

    companion object {
        const val RESULT_KEY = "result_key"
    }
}