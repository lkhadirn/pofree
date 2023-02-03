package com.pofree.pofree.service;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Service;

import com.pofree.pofree.model.Product;

@Service
public class ProductService {

    public List<Product> getProductList() {
        String url = "https://www.amazon.com/s?k=&i=fashion-novelty&rh=p_6:ATVPDKIKX0DER";
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        WebDriver driver = new ChromeDriver(options);
        driver.get(url);
        driver.quit();
        return new ArrayList<>();
    }
}
