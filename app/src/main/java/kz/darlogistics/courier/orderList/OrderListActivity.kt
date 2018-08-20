package kz.darlogistics.courier.orderList

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import kotlinx.android.synthetic.main.activity_order_list.*
import kz.darlogistics.courier.R

class OrderListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_list)
        setSupportActionBar(toolbarOrderList)
        val actionBar:ActionBar? = supportActionBar
        val pagerAdapter = OrderListStatusAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var menuInflater: MenuInflater = menuInflater
        menuInflater.inflate(R.menu.order_list_menu,menu)
        return true
    }
}
