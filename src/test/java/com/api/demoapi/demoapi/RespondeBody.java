package com.api.demoapi.demoapi;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RespondeBody {

	@Test
	public void GetWeatherDetails() {
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification req = RestAssured.given();
		Response res = req.get("/api/users?page=2");
		ResponseBody reb = res.body();
		System.out.println(reb.asString());

	}

}