package kz.darlogistics.courier.orderList.entity

data class CompanySender(
        val id: Int,
        val name: String,
        val location_id: Int,
        val created_at: String,
        val updated_at: String,
        val address: String,
        val id_min: Int,
        val id_max: Int,
        val id_null_count: Int,
        val rate_id: Int
)