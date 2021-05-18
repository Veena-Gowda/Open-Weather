package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;




public class StepDefinition{
	
	  //RestAssured.baseURI = "api.openweathermap.org/data/2.5/weather?";	
	
	
	@Given("Open Weather Map")

	public void setUp() throws Exception {
		RestAssured.baseURI = "api.openweathermap.org/data/2.5/weather?";
	    
	}
	

	@When("User calls {string} API's predicted to be above {int} degrees in the next {int} days with http Get request")
	public void user_calls_API_s_predicted_to_be_above_degrees_in_the_next_days_with_http_Get_request(String string, Integer int1, Integer int2) {
	
	   
		RestAssured.baseURI = "api.openweathermap.org/data/2.5/forecast?";
	  	  String responsebody = given().when().get("https://api.openweathermap.org/data/2.5/weather?q=Sydney&appid=c5907393d14b0598623da6907ca90a45&units=metric")
	  	  .then().log().body().toString();
	  	  
	  	  System.out.println(responsebody);
	  	  
	  	  JsonPath js = new JsonPath(responsebody);
	  			  
	  	  int count = js.getInt("main.temp.size()");
	  	  
	  	
	  	  for (int i=0;i<count;i++)
	  	  {
	  		 int tempvalue =  js.getInt("main.temp["+i+"]"); 
	  		 
	  		   if (tempvalue>=20)
	  		   {
	  			   System.out.println("NO. of days temparature predicted to be are"+i+"");
	  		   }
	  		   
	  	  }
	  	  
	    }  
	  
	
	@Then("the API call is success with status code {string}")
	public void the_API_call_is_success_with_status_code(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	    
		   int statusCode= given().when()
		  			.get("https://api.openweathermap.org/data/2.5/weather?q=Sydney&appid=c5907393d14b0598623da6907ca90a45&units=metric")
		  			
		  			.getStatusCode()
		  	;
		  	   System.out.println("The response status is "+statusCode);

		
	}
	

	@Then("status in response body is {string}")
	public void status_in_response_body_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  
		 String payload= given().when()
		  			.get("https://api.openweathermap.org/data/2.5/weather?q=Sydney&appid=c5907393d14b0598623da6907ca90a45&units=metric")
		  			
		  			.getBody().asString();
		  	
		  	   System.out.println("The response body is "+payload);
	
	}
}