package com.example.roundedtablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.roundedtablayout.adapter.ViewPagerAdapter
import com.example.roundedtablayout.fragments.Fragment1
import com.example.roundedtablayout.fragments.Fragment2
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.pager)
        tabLayout = findViewById(R.id.tab_layout)
        setAdapters()

    }

    private fun setAdapters() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Fragment1(), "Tab 1")
        adapter.addFragment(Fragment2(), "Tab 2")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(pager)
    }
}