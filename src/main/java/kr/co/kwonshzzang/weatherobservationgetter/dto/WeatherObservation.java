package kr.co.kwonshzzang.weatherobservationgetter.dto;


import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
public class WeatherObservation {
    private Response response;

    @Getter
    @Setter
    @ToString
    public static class Response {
        private Header header;
        private Body body;
    }

    @Getter
    @Setter
    @ToString
    public static class Header {
        private String resultCode;
        private String resultMsg;
    }

    @Getter
    @Setter
    @ToString
    public static class Body {
        private String dataType;
        private Items items;
        private Integer pageNo;
        private Integer numOfRows;
        private Integer totalCount;
    }

    @Getter
    @Setter
    @ToString
    public static class Items {
        private List<Item> item;
    }

    @Getter
    @Setter
    @ToString
    public static class Item {
        private String baseDate;
        private String baseTime;
        private String category;
        private int nx;
        private int ny;
        private String obsrValue;
    }
}
