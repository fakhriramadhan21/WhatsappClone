package com.example.fakhri.whatsappclone.services;

import com.example.fakhri.whatsappclone.models.User;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("whatsapp/get.php")
    Call<User> getUser(@Query("nama") String nama);
    public final String BASE_URL = "http://192.168.1.10/whatsapp";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    APIService service = retrofit.create(APIService.class);
}
