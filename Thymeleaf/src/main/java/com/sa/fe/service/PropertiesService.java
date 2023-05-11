package com.sa.fe.service;

import com.sa.fe.model.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class PropertiesService {
    
    @Autowired
    private WebClient getWebClient;
   
    public Flux<Properties> getBFF() {
        return getWebClient.get()
                .uri("/properties")
                .retrieve()
                .bodyToFlux(Properties.class);
    }
}
