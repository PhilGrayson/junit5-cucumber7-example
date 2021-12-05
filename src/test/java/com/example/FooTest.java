package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.ConfigurationParameter;

@Suite
@SelectClasspathResource("com/example")
@ConfigurationParameter(
  key = io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME,
  value = "com.example"
)
public class FooTest {
  @Given("a basic cucumber v7 test in junit v5")
  public void given() {
  }

  @Then("this test should pass")
  public void thenSuccess() {
    Assertions.assertEquals(Foo.doSomething(), "Hello world!");
  }

  @Then("this test should fail")
  public void thenFail() {
    Assertions.assertNotEquals(Foo.doSomething(), "Hello world!");
  }
}
