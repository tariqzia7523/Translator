package com.free.translator;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://translate.googleapis.com/translate_a/";
    @GET("single")
    Call<JsonArray> getAllNews(
            @Query("client") String client,
            @Query("sl") String inputLangCode,
            @Query("tl") String outPutLangCode,
            @Query("dt") String t,
            @Query("q") String textToTranslate);
}