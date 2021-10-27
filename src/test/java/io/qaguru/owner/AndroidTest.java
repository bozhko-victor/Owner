package io.qaguru.owner;

import io.qaguru.owner.config.AndroidConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AndroidTest {

    private AndroidConfig config;

    @Test
    public void testAndroid() {
        config = ConfigFactory.create(AndroidConfig.class, System.getProperties());
        assertThat(config.appLocation()).isEqualTo("/Users/app.android");
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.deviceName()).isEqualTo("Pixel 8");
        assertThat(config.platformVersion()).isEqualTo("12");

    }

    @Test
    public void testAndroidOverride() {
        System.setProperty("device.name", "Pixel 9");

        config = ConfigFactory.create(AndroidConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("Pixel 9");

        assertThat(config.appLocation()).isEqualTo("/Users/app.android");
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("12");
    }
   
}