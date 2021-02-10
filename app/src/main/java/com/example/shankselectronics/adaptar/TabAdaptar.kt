package com.example.shankselectronics.adaptar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.shankselectronics.fragment.MyFragment
import com.example.shankselectronics.model.Category
import com.google.android.material.tabs.TabLayout

class TabAdaptar(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    var mFragmentList: ArrayList<Fragment> = ArrayList<Fragment>()
    var mTitleList = ArrayList<String>()

    override fun getCount(): Int {
        return mFragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mTitleList[position]
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
        }

    fun addFragment(category: Category)
    {
        mFragmentList.add(MyFragment.newInstance(category.id))
        mTitleList.add(category.type)
    }
}