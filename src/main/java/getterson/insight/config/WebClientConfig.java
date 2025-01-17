package getterson.insight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient summarizeClient() {
        return WebClient.builder()
                .baseUrl("http://localhost:8000")
                .build();
    }

    @Bean
    public WebClient whatsappClient() {
        return WebClient.builder()
                .baseUrl("http://localhost:5000")
                .build();
    }
}
