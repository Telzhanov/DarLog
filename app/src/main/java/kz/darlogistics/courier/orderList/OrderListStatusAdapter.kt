package kz.darlogistics.courier.orderList

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class OrderListStatusAdapter(fr : FragmentManager): FragmentPagerAdapter(fr) {
    override fun getCount(): Int {
        return 4
    }
    override fun getItem(position: Int): Fragment? {
        when(position){
            0->{
                val currentOrdetListFragment= CurrentOrderListFragment()
                return currentOrdetListFragment
            }
            1->{
                val newOrderListFragment= NewOrderListFragment()
                return newOrderListFragment
            }
            2->{
                val historyOrderListFragment= HistoryOrderListFragment()
                return historyOrderListFragment
            }
            3->{
                val returnOrderListFragment= ReturnOrderListFragment()
                return returnOrderListFragment
            }
            else ->return null
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0->return "Текущие"
            1->return "Новые"
            2->return "История"
            3->return "Возврат"
            else->return null
        }
    }
}