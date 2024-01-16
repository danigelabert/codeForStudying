package com.danigelabert.codeforstudying

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danigelabert.codeforstudying.databinding.ActivitySegonBinding

class SegonActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySegonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSegonActivity.setOnClickListener{
            startActivity(Intent(this, PrimerActivity::class.java))
        }

        binding.btnToMain.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}