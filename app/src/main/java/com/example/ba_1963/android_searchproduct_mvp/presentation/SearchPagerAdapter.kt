package com.example.ba_1963.android_searchproduct_mvp.presentation

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.ba_1963.android_searchproduct_mvp.presentation.product.ProductFragment
import com.example.ba_1963.android_searchproduct_mvp.presentation.shop.ShopFragment

class SearchPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    private val pages = listOf(
            ProductFragment(),
            ShopFragment()
    )

    override fun getItem(position: Int): Fragment? {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Produk"
            else -> "Toko"
        }
    }
}