package kz.darlogistics.courier.orderList.entity

data class Data(
        val id: Int,
        val from: String,
        val from_value: String,
        val to: String,
        val to_value: String,
        val waybill_id: Int,
        val status: String,
        val courier_id: Int,
        val created_at: String,
        val updated_at: String,
        val active: String,
        val from_text: String,
        val to_text: String,
        val from_value_text: String,
        val to_value_text: String,
        val waybill: Waybill,
        val courier_status: String,
        val courier_status_text: String,
        val status_color: String
)