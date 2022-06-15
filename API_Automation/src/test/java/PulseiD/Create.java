package PulseiD;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.equalTo;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Create {
	
	@Test
	public void create_data() {
		
		JSONObject request = new JSONObject();
		request.put("userId","12");
		request.put("title", "new title");
		request.put("completed", "true");
		
String Resp=given().
		  body(request.toJSONString()).
		when().  
		  post("https://jsonplaceholder.typicode.com/todos").
		then().
		  assertThat().statusCode(201).and().
		  contentType(ContentType.JSON).and().
	      header("server", "cloudflare").and(). 
		  header("x-powered-by","Express").and().
		  extract().
	      response().asString();
	     
	    System.out.println("Response is " +Resp);
	    
		  
		  
	}

}
