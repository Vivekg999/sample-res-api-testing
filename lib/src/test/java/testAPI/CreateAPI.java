package testAPI;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo_classes.CreateUser;
import pojo_classes.Response;

public class CreateAPI {

	@Test
	public void create()
	{
		CreateUser user1 = CreateUser.builder().name("morpheus").job("leader").build();
		
		RestAssured.baseURI = "https://reqres.in/";
		
		Response response = given().log().all().header("Content-Type","application/json")
		.body(user1).when().post("api/users")
		.then().assertThat().statusCode(201).extract().response().as(Response.class);
		
		// Printing Response 
		System.out.println(response.getId());
	}
	
}
