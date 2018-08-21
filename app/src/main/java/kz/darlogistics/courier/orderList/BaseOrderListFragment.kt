package kz.darlogistics.courier.orderList

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_current_order_list.*
import kz.darlogistics.courier.R
import kz.darlogistics.courier.orderList.entity.Data
import org.koin.android.ext.android.inject

abstract class BaseOrderListFragment:Fragment(),OrderListContract.OrderListView{
    override val presenter: OrderListContract.OrderListPresenter by inject()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_current_order_list,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter.attachView(this)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun showOrderList(orders: ArrayList<Data>) {
        orderList.layoutManager= LinearLayoutManager(context)
        orderList.adapter =OrderListAdapter(orders)
    }
}
