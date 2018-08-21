package kz.darlogistics.courier.orderList

import android.os.Bundle
import android.view.View

class HistoryOrderListFragment: BaseOrderListFragment(){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter.getHistoryOrders()
        super.onViewCreated(view, savedInstanceState)
    }
}