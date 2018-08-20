package kz.darlogistics.courier.orderList

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kz.darlogistics.courier.R

class NewOrderListFragment:Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_current_order_list,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        orderList.layoutManager= LinearLayoutManager(context)
//        orderList.adapter =OrderListAdapter()
        super.onViewCreated(view, savedInstanceState)
    }
}