package com.example.shankselectronics.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shankselectronics.R
import com.example.shankselectronics.adaptar.TabAdaptar
import com.example.shankselectronics.model.Category
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var mCategoryList: ArrayList<Category> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init()
    {
        generateCategory()
        var listAdaptar = TabAdaptar(supportFragmentManager)
        for(i in 0 until mCategoryList.size){
            listAdaptar.addFragment(mCategoryList[i])
        }

        view_pages_list_view.adapter = listAdaptar
        tab_layout_category.setupWithViewPager(view_pages_list_view)
    }

    companion object{
        val key = "DATA"
    }

    private fun generateCategory(){
        mCategoryList.add(Category(1, "Mobile"))
        mCategoryList.add(Category(2, "Laptop"))
        mCategoryList.add(Category(3, "Desktop"))
    }
}