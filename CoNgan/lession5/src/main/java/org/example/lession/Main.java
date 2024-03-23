package org.example.lession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver webDriver;

        WebDriverManager.chromedriver().setup(); // goi phien ban browser

        webDriver = new EdgeDriver(); // khoi tao gia tri cho browser

        webDriver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.5.3");
    }

}
