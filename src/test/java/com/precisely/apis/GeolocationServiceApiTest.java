/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 16.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.GeoLocationAccessPoint;
import com.precisely.apis.model.GeoLocationIpAddr;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeolocationServiceApi
 */
@Ignore
public class GeolocationServiceApiTest {

    private final GeolocationServiceApi api = new GeolocationServiceApi();

    
    /**
     * Location By IP Address.
     *
     * This service accepts an IP address and returns the location coordinates corresponding to that IP address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationByIPAddressTest() throws ApiException {
        String ipAddress = null;
                GeoLocationIpAddr response = api.getLocationByIPAddress(ipAddress);
        // TODO: test validations
    }
    
    /**
     * Location by WiFi Access Point.
     *
     * This service accepts a WiFi access point MAC address and returns the location coordinates corresponding to that access point. Only mac or accessPoint are mandatory parameters (one of them has to be provided), rest are optional.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationByWiFiAccessPointTest() throws ApiException {
        String mac = null;
        String ssid = null;
        String rsid = null;
        String speed = null;
        String accessPoint = null;
                GeoLocationAccessPoint response = api.getLocationByWiFiAccessPoint(mac, ssid, rsid, speed, accessPoint);
        // TODO: test validations
    }
    
}
