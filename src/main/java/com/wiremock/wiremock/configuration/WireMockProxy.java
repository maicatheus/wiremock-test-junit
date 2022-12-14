package com.wiremock.wiremock.configuration;

import lombok.Data;

@Data
public class WireMockProxy {
    private String name;
    private int port;
    private String url;
    private boolean recording;
}
