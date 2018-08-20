package kz.darlogistics.courier.orderList

import kz.darlogistics.courier.core.util.BasePresenter
import kz.darlogistics.courier.orderList.entity.Data
import org.koin.core.parameter.parametersOf
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class CurrentOrderListPresenter:OrderListContract.OrderListPresenter,KoinComponent,BasePresenter<OrderListContract.OrderListView>(){
    val currentOrderListRepository: OrderListContract.OrderListRepository by inject { parametersOf(this)  }
    override fun getOrders() {
        currentOrderListRepository.getOrders(207,"bearer hgGpX7kyYQLGt1uXCtR3V4nMS7KxfuVUkRGf7dOhGGpwOTJvyX2EeUCeRJjY")
    }

    override fun setOrders(orders: ArrayList<Data>) {
        getView()?.showOrderList(orders)
    }

    override fun viewIsReady() {

    }

    override fun destroy() {

    }


}