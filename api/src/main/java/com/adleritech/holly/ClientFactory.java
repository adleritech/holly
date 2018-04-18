package com.adleritech.holly;

import com.adleritech.holly.dto.Message;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.POST;

public class ClientFactory {

    public static Api createService(String apiBaseUrl) {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(apiBaseUrl);
        return builder.build().create(Api.class);
    }

    public interface Api {
        @POST("/api/v1/send")
        Call<Response> sendMessage(@Body Message request);
    }

}
