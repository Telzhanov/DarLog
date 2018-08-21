package kz.darlogistics.courier.orderList

import android.os.Bundle
import android.view.View

class CurrentOrderListFragment : BaseOrderListFragment(){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter.getCurrentOrders()
        super.onViewCreated(view, savedInstanceState)
    }
}