package kz.darlogistics.courier.orderList

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kz.darlogistics.courier.orderList.entity.Data

class OrderListRepository(val orderListService:OrderListService,val orderListPresenter:OrderListContract.OrderListPresenter):OrderListContract.OrderListRepository{
    override fun getCurrentOrders(userId: Int, token: String) {
        orderListService.getCurrentOrders(userId,token)
                .doOnSubscribe {  }
                .doOnComplete {  }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe{
                    var orders = ArrayList<Data>()
                    for (order in it.data){
                        orders.add(order)
                    }
                    orderListPresenter.setOrders(orders)
                }
    }
    override fun getNewOrders(userId: Int) {
        orderListService.getNewOrders(userId)
                .doOnSubscribe {  }
                .doOnComplete {  }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe{
                    var orders = ArrayList<Data>()
                    for (order in it.data){
                        orders.add(order)
                    }
                    orderListPresenter.setOrders(orders)
                }
    }

    override fun getHistoryOrders(userId: Int) {
        orderListService.getHistoryOrders(userId)
                .doOnSubscribe {  }
                .doOnComplete {  }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe{
                    var orders = ArrayList<Data>()
                    for (order in it.data){
                        orders.add(order)
                    }
                    orderListPresenter.setOrders(orders)
                }
    }

    override fun getRefundsOrders(userId: Int, token: String) {
        orderListService.getRefundsOrders(userId,token)
                .doOnSubscribe {  }
                .doOnComplete {  }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe{
                    var orders = ArrayList<Data>()
                    for (order in it.data){
                        orders.add(order)
                    }
                    orderListPresenter.setOrders(orders)
                }
    }


}