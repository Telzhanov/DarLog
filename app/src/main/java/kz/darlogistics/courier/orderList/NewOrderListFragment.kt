package kz.darlogistics.courier.orderList

import android.os.Bundle
import android.view.View

class NewOrderListFragment:BaseOrderListFragment(){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter.getNewOrders()
        super.onViewCreated(view, savedInstanceState)
    }
}