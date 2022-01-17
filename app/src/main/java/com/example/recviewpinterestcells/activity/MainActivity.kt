package com.example.recviewpinterestcells.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recviewpinterestcells.R
import com.example.recviewpinterestcells.adapter.CustomAdapter
import com.example.recviewpinterestcells.helper.SpaceItemDecoration
import com.example.recviewpinterestcells.model.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            initView()
        val member = prapareMemberList()
        refreshAdapter(member)

    }
    fun initView(){
          recyclerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
          val decoration = SpaceItemDecoration(10)
          recyclerView.addItemDecoration(decoration)
 }
    fun refreshAdapter(member: List<Member>){
            val adapter = CustomAdapter(this,member)
            recyclerView.adapter = adapter
    }
    fun prapareMemberList():List<Member>{
          val member = ArrayList<Member>()
          for (i in 0..15){

            member.add(Member())

        }

        return member
    }
}