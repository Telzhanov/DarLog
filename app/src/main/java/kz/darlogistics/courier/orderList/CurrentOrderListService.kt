package kz.darlogistics.courier.orderList

import io.reactivex.Observable
import kz.darlogistics.courier.orderList.entity.Orders
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrentOrderListService{
    @GET("/api/waybills/active")
    fun getOrders(@Query("user_id") userId:Int,
                  @Query("") token:String): Observable<Orders>

    companion object Factory {
        fun create(): CurrentOrderListService {
            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://darlogistics.kz")
                    .build()

            return retrofit.create(CurrentOrderListService::class.java)
        }
    }
}