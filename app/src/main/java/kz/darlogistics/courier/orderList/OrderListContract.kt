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
        fun getCurrentOrders()
        fun getNewOrders()
        fun getHistoryOrders()
        fun getRefundsOrders()
    }

    interface OrderListRepository {
        fun getCurrentOrders(userId:Int,token:String)
        fun getNewOrders(userId:Int)
        fun getHistoryOrders(userId:Int)
        fun getRefundsOrders(userId:Int,token:String)
    }
}