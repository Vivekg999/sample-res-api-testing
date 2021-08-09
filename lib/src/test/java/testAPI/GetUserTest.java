package testAPI;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import getUser.GetUser;

public class GetUserTest {

	@Test
	public void test() {

		RestAssured.baseURI = "https://reqres.in/";
		GetUser gu = given().log().all().header("Content-Type", "application/json").expect().defaultParser(Parser.JSON)
				    .when().get("api/users/2")
				    .then().assertThat().statusCode(200).extract().response().as(GetUser.class);

		System.out.println(gu.getData().getFirst_name());

	}

}
