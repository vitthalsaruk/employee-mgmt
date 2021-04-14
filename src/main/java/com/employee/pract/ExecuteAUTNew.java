package com.employee.pract;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ExecuteAUTNew {
    public static void main(String... args) throws UnirestException {
        //Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.post("https://jdf-pega-devl.deere.com/prweb/PRRestService/BRMUnitTest/Rule-Test-Unit-Case/ExecuteBRMTests?TestSuiteID=" +
                "DEERE-USCA-BRM-WORK!TS_US_E2EVALIDATION")
                .header("Content-Type", "text/xml")
                .header("Authorization", "Basic VVNBVVRJRDpBOCFiVnRSYQ==")
                .asString();

        System.out.println(response.getBody().toString());

    }
}
