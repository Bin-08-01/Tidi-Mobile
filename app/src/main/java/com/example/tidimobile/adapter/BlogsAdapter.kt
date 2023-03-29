package com.example.tidimobile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tidimobile.R
import com.example.tidimobile.model.BlogModelBasic

class BlogsAdapter(private var listBlogs: ArrayList<BlogModelBasic.BlogBasicObject>): RecyclerView.Adapter<BlogsAdapter.BlogViewHolder>() {
    class BlogViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        init {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.blog_item_layout, parent, false)
        return BlogViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBlogs.size
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        holder.itemView.apply {
            val tvTitle = findViewById<TextView>(R.id.txtTitleBlog)
            val tvDescription = findViewById<TextView>(R.id.txtDescriptionBlog)
            val tvAuthor = findViewById<TextView>(R.id.txtAuthor)
            val tvTime = findViewById<TextView>(R.id.txtTimeCreated)
            tvTitle.text = listBlogs[position].title
            tvDescription.text = listBlogs[position].description
            tvAuthor.text = "${listBlogs[position].idUser?.firstName} ${listBlogs[position].idUser?.lastName}"
            tvTime.text = listBlogs[position].createdAt
        }
    }

}