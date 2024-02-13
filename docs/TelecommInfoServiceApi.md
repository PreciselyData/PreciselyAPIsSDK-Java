# TelecommInfoServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRateCenterByAddress**](TelecommInfoServiceApi.md#getRateCenterByAddress) | **GET** /telecomm/v1/ratecenter/byaddress | Rate Center By Address.
[**getRateCenterByLocation**](TelecommInfoServiceApi.md#getRateCenterByLocation) | **GET** /telecomm/v1/ratecenter/bylocation | Rate Center By Location.


<a name="getRateCenterByAddress"></a>
# **getRateCenterByAddress**
> RateCenterResponse getRateCenterByAddress(address, country, areaCodeInfo, level)

Rate Center By Address.

Accepts addresses as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.TelecommInfoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    TelecommInfoServiceApi apiInstance = new TelecommInfoServiceApi(defaultClient);
    String address = "address_example"; // String | The address to be searched
    String country = "country_example"; // String | 3 letter ISO code of the country to be searched. Allowed values USA,CAN
    String areaCodeInfo = "areaCodeInfo_example"; // String | Specifies whether area code information will be part of response.Allowed values True,False.
    String level = "level_example"; // String | Level (basic/detail).Allowed values detail,basic.
    try {
      RateCenterResponse result = apiInstance.getRateCenterByAddress(address, country, areaCodeInfo, level);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TelecommInfoServiceApi#getRateCenterByAddress");
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
 **address** | **String**| The address to be searched | [optional]
 **country** | **String**| 3 letter ISO code of the country to be searched. Allowed values USA,CAN | [optional]
 **areaCodeInfo** | **String**| Specifies whether area code information will be part of response.Allowed values True,False. | [optional]
 **level** | **String**| Level (basic/detail).Allowed values detail,basic. | [optional]

### Return type

[**RateCenterResponse**](RateCenterResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getRateCenterByLocation"></a>
# **getRateCenterByLocation**
> RateCenterResponse getRateCenterByLocation(longitude, latitude, areaCodeInfo, level)

Rate Center By Location.

Accepts latitude &amp; longitude as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.TelecommInfoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    TelecommInfoServiceApi apiInstance = new TelecommInfoServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of the location
    String latitude = "latitude_example"; // String | Latitude of the location
    String areaCodeInfo = "areaCodeInfo_example"; // String | Specifies whether area code information will be part of response.Allowed values True,False.
    String level = "level_example"; // String | Level (basic/detail).Allowed values detail,basic.
    try {
      RateCenterResponse result = apiInstance.getRateCenterByLocation(longitude, latitude, areaCodeInfo, level);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TelecommInfoServiceApi#getRateCenterByLocation");
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
 **longitude** | **String**| Longitude of the location | [optional]
 **latitude** | **String**| Latitude of the location | [optional]
 **areaCodeInfo** | **String**| Specifies whether area code information will be part of response.Allowed values True,False. | [optional]
 **level** | **String**| Level (basic/detail).Allowed values detail,basic. | [optional]

### Return type

[**RateCenterResponse**](RateCenterResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

