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
                        .url("https://jdf-pega-devl.deere.com/prweb/PRRestService/BRMUnitTest" +
                                "/Rule-Test-Unit-Case/ExecuteBRMTests?TestSuiteID=" +
                                "DEERE-USCA-BRM-WORK!TS_E2EBUREAUERRORS"
                                //+"DEERE-USCA-BRM-WORK!TS_PULLBUREAU_FROZENFILE"
                        )
                        .method("POST", body)
                        .addHeader("Content-Type", "text/xml")
                        .addHeader("Authorization", "Basic VVNBVVRJRDpBOCFiVnRSYQ==")
                        .build();

        Response response = client.newCall(request).execute();

        System.out.println(response.body().string());

        System.exit(0);
    }
}
