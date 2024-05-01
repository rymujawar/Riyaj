package fab;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Fabiha {
	@Test
	void GetUserList() {
		given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("page", equalTo(2))
		.body("data.email[0]", equalTo("michael.lawson@reqres.in")).log().all();
	}

}
