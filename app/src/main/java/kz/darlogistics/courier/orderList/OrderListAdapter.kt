package kz.darlogistics.courier.orderList

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.order_card.view.*
import kz.darlogistics.courier.R
import kz.darlogistics.courier.orderList.entity.Data

class OrderListAdapter(var orders:ArrayList<Data>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return OrderViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.order_card,parent,false))
    }

    override fun getItemCount(): Int {
        return orders.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.orderCount.text = (position+1).toString()
        holder.itemView.orderId.text = orders[position].id.toString()
        holder.itemView.orderDate.text =orders[position].created_at
        holder.itemView.orderFromName.text = orders[position].from_text
        holder.itemView.orderToAdress.text = orders[position].to_value_text
    }
}
class OrderViewHolder(v:View):RecyclerView.ViewHolder(v){}