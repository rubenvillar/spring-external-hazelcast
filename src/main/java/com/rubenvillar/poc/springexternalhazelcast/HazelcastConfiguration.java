package com.rubenvillar.poc.springexternalhazelcast;

import com.hazelcast.client.config.ClientConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HazelcastConfiguration {
    @Bean
    public ClientConfig hazelCastConfig() {
        ClientConfig config = new ClientConfig();
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.getGroupConfig().setName("dev");
        clientConfig.getNetworkConfig().addAddress("localhost");
        return config;
    }
}
