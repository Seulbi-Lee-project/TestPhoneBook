package com.example.testphonebook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testphonebook.databinding.ItemRecyclerviewBinding

class PhoneBookAdapter(var myPhoneBookList: MutableList<PhoneBook>) : RecyclerView.Adapter<PhoneBookAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneBookAdapter.Holder {
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: PhoneBookAdapter.Holder, position: Int) {
        holder.profileImage.setImageResource(myPhoneBookList[position].aProfileImage)
        holder.name.text = myPhoneBookList[position].aName
        holder.phoneNumber.text = myPhoneBookList[position].aPhoneNumber
    }

    override fun getItemCount(): Int {
        return myPhoneBookList.size
    }

    inner class Holder(val binding: ItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root){
        val profileImage = binding.profileImage
        val name = binding.name
        val phoneNumber = binding.phoneNumber
    }
}