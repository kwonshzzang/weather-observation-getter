package kr.co.kwonshzzang.weatherobservationgetter.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherObservationGetAndTransferTest {
    @Autowired
    private WeatherObservationGetAndTransfer weatherObservationGetAndTransfer;

    @Test
    void doServiceTest() throws UnsupportedEncodingException {
        weatherObservationGetAndTransfer.doService();
    }

}