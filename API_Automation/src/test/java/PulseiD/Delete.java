package PulseiD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


public class Delete {
		
	@Test
	public void delete_data() {
	
     String Resp =  given().	
	   when().	
	     delete("https://jsonplaceholder.typicode.com/todos/2").
       then().
         assertThat().statusCode(200).and().
         header("Server","cloudflare").and().
         extract().
         response().asString();
     
    System.out.println("Response is " +Resp);
	}

}
