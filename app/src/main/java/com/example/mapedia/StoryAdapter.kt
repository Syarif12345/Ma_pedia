package com.example.mapedia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter(private val storyList: List<Story>) :

    RecyclerView.Adapter<StoryAdapter.StoryViewHolder>() {

    private var onItemClickListener: ((Story) -> Unit)? = null

    fun setOnItemClickListener(listener: (Story) -> Unit) {
        onItemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {

        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false)
        return StoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val currentStory = storyList[position]
        holder.btnTitle.text = currentStory.title
//        holder.tvCreator.text = "Pembuat: ${currentStory.creator}"
//        holder.tvStory.text = "Story: ${currentStory.story}"

        holder.btnTitle.setOnClickListener {
            onItemClickListener?.invoke(currentStory)
        }
    }

    override fun getItemCount() = storyList.size

    inner class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val btnTitle: Button = itemView.findViewById(R.id.btnTitle)
//        val tvCreator: TextView = itemView.findViewById(R.id.tvCreator)
//        val tvStory: TextView = itemView.findViewById(R.id.tvStory)
    }
}

