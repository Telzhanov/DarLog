package kz.darlogistics.courier.orderList

import org.koin.dsl.module.module

val orderListModule = module{
    single{CurrentOrderListService.create()}
    factory { CurrentOrderListPresenter() as OrderListContract.OrderListPresenter }
    factory{(currentOrderListPresenter:OrderListContract.OrderListPresenter)->CurrentOrderListRepository(get(), currentOrderListPresenter) as OrderListContract.OrderListRepository}
    factory {CurrentOrderListFragment() as OrderListContract.OrderListView }
}