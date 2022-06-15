package PulseiD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Update {
	
	@Test
	public void update_data() {
		
			JSONObject request = new JSONObject();
			request.put("title", "updated title");
			request.put("completed", "false");
			
String Resp = given().
			  body(request.toJSONString()).
			when().  
			  put("https://jsonplaceholder.typicode.com/todos/4").
			then().
			  assertThat().statusCode(200).and().
			  contentType(ContentType.JSON).and().
		      header("server", "cloudflare").and(). 
			  header("x-powered-by","Express").and().
              extract().asString();
		     
		    System.out.println("Response is " +Resp);
		}
	}


