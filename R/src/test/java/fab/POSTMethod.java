package fab;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import java.util.HashMap;
import org.testng.annotations.Test;
public class POSTMethod{
	@Test
	void CreateUser()
	{

		HashMap data =new HashMap();
		data.put("name","Riyaj");
		data.put("job", "QA");

		given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("https://reqres.in/api/users")
		.then().statusCode(201)
		.body("name", equalTo("Riyaj"))
		.log().all();
	}
}
