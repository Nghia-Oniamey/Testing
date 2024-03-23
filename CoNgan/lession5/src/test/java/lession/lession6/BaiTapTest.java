package lession.lession6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;

public class BaiTapTest {

    private String url = "http://127.0.0.1:5500/html/index.html";

    @Test
    public void init(){
        WebDriverManager.edgedriver().setup();
        EdgeDriver edgeDriver = new EdgeDriver();
        run(edgeDriver);
    }

    private static void runAfter(EdgeDriver edgeDriver) {
        edgeDriver.quit();
    }

    public void run(EdgeDriver edgeDriver) {
        edgeDriver.get(url);
//        sleep(2000);
//        edgeDriver.navigate().refresh();
//        edgeDriver.navigate().back();
//        edgeDriver.navigate().forward();
//        WebElement btnDontTouchMe = edgeDriver.findElement((By.className("btn-click")));
//        btnDontTouchMe.click();
//        Assertions.assertEquals("Click", btnDontTouchMe.getText());
        List<WebElement> webElementList = edgeDriver.findElements((By.className("btn-click")));

        for (WebElement webElement : webElementList){
            webElement.click();
        }
    }

    public void sleep(int time){
        try {
            Thread.sleep(time);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
