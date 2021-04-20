package com.petruciostech.visoreciclavel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.get
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var UserList:ArrayList<User>
    private lateinit var recycleView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        UserList = arrayListOf()
        recycleView = findViewById(R.id.recycleView)

        setUserInfo()
        setAdapter()



    }

    private fun setAdapter() {
        var adapter: RecycleAdapter = RecycleAdapter(UserList, this)
        var layotMenager: RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)
        recycleView.layoutManager = layotMenager
        recycleView.itemAnimator = DefaultItemAnimator()
        recycleView.adapter = adapter


    }
    private fun setUserInfo() {
        UserList.add(User("João"))
        UserList.add(User("Aline"))
        UserList.add(User("Pedro"))


    }


    fun ovoTestar(view:View){
        Toast.makeText(this, "Hehe Boy", Toast.LENGTH_SHORT).show()
    }
}