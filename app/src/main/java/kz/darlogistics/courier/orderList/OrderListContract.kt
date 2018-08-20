package kz.darlogistics.courier.orderList

import kz.darlogistics.courier.core.util.IPresenter
import kz.darlogistics.courier.core.util.IView
import kz.darlogistics.courier.orderList.entity.Data

interface OrderListContract {
    interface OrderListView : IView<OrderListPresenter> {
        fun showOrderList(orders:ArrayList<Data>)
    }

    interface OrderListPresenter : IPresenter<OrderListContract.OrderListView> {
        fun setOrders(orders:ArrayList<Data>)
        fun getOrders()
    }

    interface OrderListRepository {
        fun getOrders(userId:Int,token:String)
    }
}