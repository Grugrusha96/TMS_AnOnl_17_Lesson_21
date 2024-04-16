package com.example.tms_lesson21

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tms_lesson21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val recyclerView = binding.recyclerView1
        val notes = listOf(
            Notes("Алексей", "Привет всем", "18.03.2024"),
            Notes("Алексей", "Простите что пропал", "18.03.2024"),
            Notes("Алексей", "Очень много времени потерял", "18.03.2024"),
            Notes("Алексей", "Работы было много", "18.03.2024"),
            Notes("Алексей", "Сейчас все наверстаю", "18.03.2024")


        )
        val myAdapter = UserAdapter(notes)
        recyclerView.adapter = myAdapter
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}
