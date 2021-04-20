package com.petruciostech.visoreciclavel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter(private val UserList: ArrayList<User>, private val con:Context)
    : RecyclerView.Adapter<RecycleAdapter.MyViewHolder>() {

    class MyViewHolder(view:View): RecyclerView.ViewHolder(view){
        val txtUser:TextView
        init {
            txtUser = view.findViewById(R.id.UserTitule)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleAdapter.MyViewHolder {
        var itemView:View = LayoutInflater.from(parent.context).inflate(R.layout.list_items,
            parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecycleAdapter.MyViewHolder, position: Int) {
        holder.txtUser.text = UserList[position].getUserName()
        holder.itemView.setOnClickListener { Toast.makeText(con, "Outra conquista!", Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int = UserList.size

}