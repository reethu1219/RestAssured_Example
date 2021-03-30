package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class GetRequest {
	 @Test
     
		public void test1() {
			
			RestAssured.given()
					   .baseUri("http://localhost:8088/employees")
					  
					   .when()
					   .get()
					   .then()
					   .statusCode(200) //201
					   .log() 
					   .body();
			
		}



}
