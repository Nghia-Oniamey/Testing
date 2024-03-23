package org.example.lession.lession6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void setup1(){
        System.out.println("1");
    }

    @BeforeMethod
    public void setup2(){
        System.out.println("2");
        WebDriverManager.edgedriver();
    }

    @AfterMethod
    public void setup3(){
        System.out.println("3");
    }

}
