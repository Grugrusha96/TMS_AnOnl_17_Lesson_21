package com.example.tms_lesson21

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tms_lesson21.databinding.ActivityUserListItemBinding

class NotesViewHolder(private val userListItemBinding: ActivityUserListItemBinding):
    RecyclerView.ViewHolder(userListItemBinding.root){



    fun bind (notes: Notes) {
        with(userListItemBinding) {
            userName.text = notes.name
            textMessage.text = notes.text
            textMessageData.text = notes.date

        }
    }

    companion object {
        fun from(parent: ViewGroup): NotesViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ActivityUserListItemBinding.inflate(layoutInflater, parent, false)
            return NotesViewHolder(binding)
        }
    }

}