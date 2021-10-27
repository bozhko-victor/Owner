package io.qaguru.owner;

import io.qaguru.owner.config.AndroidConfig;
import io.qaguru.owner.config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileTest {

    private MobileConfig config;

    @Test
    public void testAndroid() {
        System.setProperty("platform", "android");

        config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.appLocation()).isEqualTo("/Users/app.android");
        assertThat(config.deviceName()).isEqualTo("Pixel 8");
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("12");
    }

    @Test
    public void testIOS() {
        System.setProperty("platform", "ios");

        config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.appLocation()).isEqualTo("/Users/app.ios");
        assertThat(config.deviceName()).isEqualTo("IPhone 13");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("15");
    }
}