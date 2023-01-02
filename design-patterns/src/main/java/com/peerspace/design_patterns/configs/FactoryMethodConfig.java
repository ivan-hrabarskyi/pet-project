package com.peerspace.design_patterns.configs;

import org.aeonbits.owner.Accessible;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:configs/config.properties"
})
public interface FactoryMethodConfig extends Config {

    @Config.Key("type_of_user")
    String typeOfUser();

}
