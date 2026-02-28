package USERAPI;


import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class UserAPITest {

@Test
public void getUser() {

given()
.baseUri("https://reqres.in")
.when()
.get("/api/users/2")
.then()
.statusCode(403);

}

@Test
public void createUser() {

given()
.baseUri("https://reqres.in")
.header("Content-Type","application/json")
.body("{\"name\":\"anu\",\"job\":\"tester\"}")

.when()
.post("/api/users")

.then()
.statusCode(403);

}

@Test
public void updateUser() {

given()
.baseUri("https://reqres.in")
.header("Content-Type","application/json")
.body("{\"name\":\"anu\",\"job\":\"qa\"}")

.when()
.put("/api/users/2")

.then()
.statusCode(403);

}

}