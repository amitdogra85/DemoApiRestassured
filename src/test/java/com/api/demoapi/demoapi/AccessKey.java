package com.api.demoapi.demoapi;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class AccessKey {
public static void main(String arg [])
	{
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification sep= RestAssured.given();
		Response res= sep.get("/api/users?page=2");
		     JsonPath path=res.jsonPath();
		     System.out.println(path.get("data[0].id"));

	}

}