Feature: greeting is displayed on hello-world
  Scenario: client makes call to GET /hello-world
    When the client calls /hello-world
    Then the client receives status code of 200
    And the client receives response Hello, Stranger!
  
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class HelloWorldE2E {
}

@CucumberContextConfiguration
@SpringBootTest()
public class HelloWorldSteps {

    ....

    @Given("^the client calls /hello-world")
    public void the_client_issues_GET_hello() {
        executeGet("http://localhost:8080/hello-world");
    }
  
    ....
}