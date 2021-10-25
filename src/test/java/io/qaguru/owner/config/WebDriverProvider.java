package io.qaguru.owner.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private WebDriverConfig config;

    public WebDriverProvider(final WebDriverConfig config) {
        this.config = config;
    }

    @Override
    public WebDriver get() {
        return new ChromeDriver();
    }
}
