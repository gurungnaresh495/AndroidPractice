package com.example.shankselectronics.adaptar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.shankselectronics.R
import com.example.shankselectronics.model.Product
import kotlinx.android.synthetic.main.row_layout.view.*
import java.util.*
import kotlin.collections.ArrayList

class ListAdaptar(var context: Context, var list: ArrayList<Product>): BaseAdapter() {
    override fun getCount(): Int {
        return  list.size
    }

    override fun getItem(position: Int): Product {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getView(position: Int, view: View?, container: ViewGroup?): View {
        var layoutInflater = LayoutInflater.from(context)
        var product = getItem(position)
        var view = layoutInflater.inflate(R.layout.row_layout, container, false)
        view.image_view_row.setImageResource(product.image)
        view.text_view_title.setText(product.name)
        view.text_view_description.setText(product.description)
        return view
    }
}