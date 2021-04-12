package com.app.step_defs;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.sql.PseudoColumnUsage;

import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.given;

public class RestAPI {
    public static void main(String[] args) {

         RestAssured.baseURI = "http://dummy.restapiexample.com";

        RequestSpecification request = RestAssured.given();
        Response response = request.get("/api/v1/employees");
        JsonPath json = response.jsonPath();
        int statusCode = response.getStatusCode();
        System.out.println("Status code is " + statusCode);
        String name = json.getString("data[0].employee_name");
        System.out.println("Employee name is " + name);
        Assert.assertEquals(name, "Tiger Nixon");
        Assert.assertEquals(statusCode, 200);

    //    deleteCall("http://dummy.restapiexample.com/api/v1/delete/");

    }


    public static Response deleteCall (String url){


        RequestSpecification request = RestAssured.given();
        Response response = request.delete(url+2);
        JsonPath json = response.jsonPath();
        String successMessage = json.getString("status");
        System.out.println("Status message is "+successMessage);
        Assert.assertEquals(successMessage, "success");
        return response;

    }




}
