package kz.darlogistics.courier.orderList

import kz.darlogistics.courier.core.util.BasePresenter
import kz.darlogistics.courier.orderList.entity.Data
import org.koin.core.parameter.parametersOf
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class OrderListPresenter: BasePresenter<OrderListContract.OrderListView>(),OrderListContract.OrderListPresenter,KoinComponent{
    val orderListRepository:OrderListContract.OrderListRepository by inject{parametersOf(this)}
    override fun getCurrentOrders() {
        orderListRepository.getCurrentOrders(207,"bearer hgGpX7kyYQLGt1uXCtR3V4nMS7KxfuVUkRGf7dOhGGpwOTJvyX2EeUCeRJjY")
    }

    override fun getNewOrders() {
        orderListRepository.getNewOrders(207)
    }

    override fun getHistoryOrders() {
        orderListRepository.getHistoryOrders(207)
    }

    override fun getRefundsOrders() {
        orderListRepository.getRefundsOrders(207,"bearer hgGpX7kyYQLGt1uXCtR3V4nMS7KxfuVUkRGf7dOhGGpwOTJvyX2EeUCeRJjY")
    }

    override fun setOrders(orders: ArrayList<Data>) {
        getView()?.showOrderList(orders)
    }



    override fun viewIsReady() {

    }

    override fun destroy() {

    }

}