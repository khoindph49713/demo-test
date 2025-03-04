package com.example.demo3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void test() throws InterruptedException {
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"myPage\"]/header/div[2]/div/div[2]/div[2]/div[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ModalLogin\"]/div/div/div/div[1]/div[3]/a[1]")).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("sa");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("sa");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sa");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"pass-regis\"]")).sendKeys("sa");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("///*[@id=\"pass-confirm\"]")).sendKeys("sa");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"register-btn\"]")).click();
        driver.quit();

    }
}
