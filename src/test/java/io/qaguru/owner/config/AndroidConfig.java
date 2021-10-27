package io.qaguru.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:android.properties"})
public interface AndroidConfig extends Config {

    @Key("app.location")
    String appLocation();

    @Key("platform.name")
    String platformName();

    @Key("device.name")
    String deviceName();

    @Key("platform.version")
    String platformVersion();
}
