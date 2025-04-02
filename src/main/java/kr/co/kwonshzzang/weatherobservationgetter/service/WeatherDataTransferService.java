package kr.co.kwonshzzang.weatherobservationgetter.service;

import kr.co.kwonshzzang.weatherobservationgetter.config.WeatherOpenAPIProperties;
import kr.co.kwonshzzang.weatherobservationgetter.dto.WeatherObservation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherDataTransferService {
    private final WebClient webClient;
    private final WeatherOpenAPIProperties properties;

    public void  doService(WeatherObservation weatherObservation) {
        webClient.post()
                .uri(properties.dataTransferUrl())
                .bodyValue(weatherObservation)
                .retrieve()
                .bodyToMono(WeatherObservation.class)
                .block();
        log.info("Send Weather Observation - {}", weatherObservation);
    }
}