package PulseiD;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Read {
	
	@Test
	public void get_data() {
		
String Resp= given().
		   
		     when().
		       get("https://jsonplaceholder.typicode.com/todos").
		     then(). 
		       assertThat().statusCode(200).and().
		       contentType(ContentType.JSON).and().
		       header("server", "cloudflare").and(). 
			   header("x-powered-by","Express").and().
		       body("title",hasItems("et porro tempora","fugiat veniam minus")).and().
		       extract().
		       response().asString();

      System.out.println("Response is\t"+Resp);
	}

}
