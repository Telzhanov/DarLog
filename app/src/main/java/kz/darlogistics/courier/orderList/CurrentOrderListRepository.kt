package kz.darlogistics.courier.orderList

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kz.darlogistics.courier.orderList.entity.Data

class CurrentOrderListRepository(val apiServiceCurrent:CurrentOrderListService,val currentOrderListPresenter: OrderListContract.OrderListPresenter):OrderListContract.OrderListRepository{
    override fun getOrders(userId: Int, token: String) {
        apiServiceCurrent.getOrders(userId,token)
                .doOnSubscribe {  }
                .doOnComplete {  }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe{
                    var orders = ArrayList<Data>()
                    for (order in it.data){
                        orders.add(order)
                    }
                    currentOrderListPresenter.setOrders(orders)
                }
    }


}