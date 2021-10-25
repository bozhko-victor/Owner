package io.qaguru.owner;

import io.qaguru.owner.config.WebDriverConfig;
import io.qaguru.owner.config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private final WebDriverConfig config = new WebDriverConfig();

    private final WebDriverProvider provider = new WebDriverProvider(config);


    @Test
    public void testTitle(){
        WebDriver driver = provider.get();
        driver.get(config.getBaseUrl());
        assertEquals(
                "GitHub: Where the world builds software · GitHub",
                driver.getTitle()
        );
        driver.quit();
    }

}
