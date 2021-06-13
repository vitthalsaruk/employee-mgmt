package com.employee.pract;

import java.io.*;
import okhttp3.*;


public class ExecuteAUT {
    public static void main(String []args) throws IOException{

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/xml");
        RequestBody body = RequestBody.create(mediaType, "");

        Request request = new Request.Builder()
                        .url("")
                        .method("POST", body)
                        .addHeader("Content-Type", "text/xml")
                        .addHeader("Authorization", "Basic VVNBVVRJRDpBOCFiVnRSYQ")
                        .build();

        Response response = client.newCall(request).execute();

        System.out.println(response.body().string());

        System.exit(0);
    }
}
