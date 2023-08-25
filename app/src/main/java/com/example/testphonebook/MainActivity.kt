package com.example.testphonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testphonebook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        // 데이터 원본 준비
        val dataList = mutableListOf<PhoneBook>()
        dataList.add(PhoneBook(R.drawable.sample1, "Bella", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.sample1, "Charlie", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.sample2, "Daisy", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.sample3, "Duke", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.sample4, "Max", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.sample5, "Happy", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.sample6, "Luna", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.sample7, "Bob", "010-1234-5678"))



    }
}