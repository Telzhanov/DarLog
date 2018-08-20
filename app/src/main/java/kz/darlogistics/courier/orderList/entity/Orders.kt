package kz.darlogistics.courier.orderList.entity

data class Orders(
    val total: Int,
    val per_page: Int,
    val current_page: Int,
    val last_page: Int,
    val next_page_url: Any,
    val prev_page_url: Any,
    val from: Int,
    val to: Int,
    val data: List<Data>
)
