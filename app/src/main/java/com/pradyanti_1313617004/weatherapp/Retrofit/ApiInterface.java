package com.pradyanti_1313617004.weatherapp.Retrofit;


import com.pradyanti_1313617004.weatherapp.Model.ForecastModel;
import com.pradyanti_1313617004.weatherapp.Model.HistoryModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiInterface {

    @GET("forecast.json?key=a10472fd23c5489b92b113358212305&q=Jakarta&days=3&aqi=yes&alerts=no")
    Call<ForecastModel> getForecastData();

    @GET
    Call<HistoryModel> getHistoryData(@Url String url_history);


}
