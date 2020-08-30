package com.api.demoapi.demoapi;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class QueryPar {
public static void main(String arg [])
	{
	// Specify the base URL to the RESTful web service
	RestAssured.baseURI ="https://samples.openweathermap.org/data/2.5/";
	RequestSpecification request = RestAssured.given();
	Response response = request.queryParam("q","London,UK")
            .queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
.get("/weather");
	System.out.println(response.getStatusCode());
	String as=response.asString();
	Assert.assertEquals(as.contains("London"), true);
	
	}

}