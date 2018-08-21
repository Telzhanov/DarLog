package kz.darlogistics.courier.orderList

import org.koin.dsl.module.module

val orderListModule = module{
//    single{CurrentOrderListService.create()}
    single{OrderListService.create()}
//    factory { CurrentOrderListPresenter() as OrderListContract.OrderListPresenter }
//    factory{(currentOrderListPresenter:OrderListContract.OrderListPresenter)->CurrentOrderListRepository(get(), currentOrderListPresenter) as OrderListContract.OrderListRepository}
    factory{(orderListPresenter:OrderListContract.OrderListPresenter)->OrderListRepository(get(),orderListPresenter) as OrderListContract.OrderListRepository}
    factory { OrderListPresenter() as OrderListContract.OrderListPresenter }
    factory("current") {CurrentOrderListFragment() as OrderListContract.OrderListView }
    factory("new") {NewOrderListFragment() as OrderListContract.OrderListView  }
    factory("history") { HistoryOrderListFragment() as OrderListContract.OrderListView }
    factory("return"){ReturnOrderListFragment() as OrderListContract.OrderListView}
}