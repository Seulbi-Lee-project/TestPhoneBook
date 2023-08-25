package com.example.testphonebook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testphonebook.databinding.ItemFavoriteRecyclerviewBinding
import com.example.testphonebook.databinding.ItemRecyclerviewBinding

class PhoneBookAdapter(var myPhoneBookList: MutableList<PhoneBook>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    val NOT_FAVORITE = 0
    val FAVORITE = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        // viewType = getItemViewType 의 리턴 값
        return when(viewType){
            NOT_FAVORITE ->{
                val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                NotFavoriteHolder(binding)
            }
            FAVORITE ->{
                val binding = ItemFavoriteRecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                FavoriteHolder(binding)
            }
            else -> throw RuntimeException("Error")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(myPhoneBookList[position].type){
            NOT_FAVORITE -> (holder as NotFavoriteHolder).bind(myPhoneBookList[position])
            FAVORITE -> (holder as FavoriteHolder).bind(myPhoneBookList[position])
        }
    }

    override fun getItemCount(): Int {
        return myPhoneBookList.size
    }
    override fun getItemViewType(position: Int): Int {
        return myPhoneBookList[position].type
    }

    inner class NotFavoriteHolder(val binding: ItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root){
        val profileImage = binding.profileImage
        val name = binding.name
        val phoneNumber = binding.phoneNumber

        fun bind(item : PhoneBook){
            profileImage.setImageResource(item.aProfileImage)
            name.text = item.aName
            phoneNumber.text = item.aPhoneNumber
        }
    }

    inner class FavoriteHolder(val binding: ItemFavoriteRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root){
        val profileImage = binding.fProfileImage
        val name = binding.fName
        val phoneNumber = binding.fPhoneNumber
        fun bind(item : PhoneBook){
            profileImage.setImageResource(item.aProfileImage)
            name.text = item.aName
            phoneNumber.text = item.aPhoneNumber
        }
    }
}