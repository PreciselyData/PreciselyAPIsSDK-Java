# GeolocationServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLocationByIPAddress**](GeolocationServiceApi.md#getLocationByIPAddress) | **GET** /geolocation/v1/location/byipaddress | Location By IP Address.
[**getLocationByWiFiAccessPoint**](GeolocationServiceApi.md#getLocationByWiFiAccessPoint) | **GET** /geolocation/v1/location/byaccesspoint | Location by WiFi Access Point.


<a name="getLocationByIPAddress"></a>
# **getLocationByIPAddress**
> GeoLocationIpAddr getLocationByIPAddress(ipAddress)

Location By IP Address.

This service accepts an IP address and returns the location coordinates corresponding to that IP address.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.GeolocationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    GeolocationServiceApi apiInstance = new GeolocationServiceApi(defaultClient);
    String ipAddress = "ipAddress_example"; // String | This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address.
    try {
      GeoLocationIpAddr result = apiInstance.getLocationByIPAddress(ipAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeolocationServiceApi#getLocationByIPAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | **String**| This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address. |

### Return type

[**GeoLocationIpAddr**](GeoLocationIpAddr.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getLocationByWiFiAccessPoint"></a>
# **getLocationByWiFiAccessPoint**
> GeoLocationAccessPoint getLocationByWiFiAccessPoint(mac, ssid, rsid, speed, accessPoint)

Location by WiFi Access Point.

This service accepts a WiFi access point MAC address and returns the location coordinates corresponding to that access point. Only mac or accessPoint are mandatory parameters (one of them has to be provided), rest are optional.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.GeolocationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    GeolocationServiceApi apiInstance = new GeolocationServiceApi(defaultClient);
    String mac = "mac_example"; // String | This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons.
    String ssid = "ssid_example"; // String | The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters.
    String rsid = "rsid_example"; // String | This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm.
    String speed = "speed_example"; // String | This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps.
    String accessPoint = "accessPoint_example"; // String | This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location.
    try {
      GeoLocationAccessPoint result = apiInstance.getLocationByWiFiAccessPoint(mac, ssid, rsid, speed, accessPoint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeolocationServiceApi#getLocationByWiFiAccessPoint");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mac** | **String**| This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons. | [optional]
 **ssid** | **String**| The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters. | [optional]
 **rsid** | **String**| This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm. | [optional]
 **speed** | **String**| This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps. | [optional]
 **accessPoint** | **String**| This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location. | [optional]

### Return type

[**GeoLocationAccessPoint**](GeoLocationAccessPoint.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

