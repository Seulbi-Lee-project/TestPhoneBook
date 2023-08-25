package com.example.testphonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
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
        dataList.add(PhoneBook(R.drawable.profile_picture, "Bella", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.profile_picture, "Charlie", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.profile_picture, "Daisy", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.profile_picture, "Duke", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.profile_picture, "Max", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.profile_picture, "Happy", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.profile_picture, "Luna", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.profile_picture, "Bob", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.profile_picture, "Rora", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.profile_picture, "Jim", "010-1234-5678"))
        dataList.add(PhoneBook(R.drawable.profile_picture, "Jack", "010-1234-5678"))

        binding.recyclerView.adapter = PhoneBookAdapter(dataList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}