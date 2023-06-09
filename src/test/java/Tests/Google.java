package Tests;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.Config;
import utilities.Driver;

import java.util.Random;

public class Google {
  Faker faker = new Faker();
    @Test
    public void Test1(){

       Driver.getDriver().get("https://google.com");


    }
}
