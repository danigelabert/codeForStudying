package com.danigelabert.codeforstudying

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danigelabert.codeforstudying.databinding.ActivityPrimerBinding

class PrimerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrimerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrimerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMainActivity.setOnClickListener {
            startActivity(Intent(this, SegonActivity::class.java))
        }

    }
}