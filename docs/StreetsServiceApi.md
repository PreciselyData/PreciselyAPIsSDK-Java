# StreetsServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIntersectionByAddress**](StreetsServiceApi.md#getIntersectionByAddress) | **GET** /streets/v1/intersection/byaddress | Nearest Intesection By Address.
[**getIntersectionByLocation**](StreetsServiceApi.md#getIntersectionByLocation) | **GET** /streets/v1/intersection/bylocation | Nearest Intesection By Location.
[**getNearestSpeedLimit**](StreetsServiceApi.md#getNearestSpeedLimit) | **GET** /streets/v1/speedlimit | Nearest Speedlimit.


<a name="getIntersectionByAddress"></a>
# **getIntersectionByAddress**
> IntersectionResponse getIntersectionByAddress(address, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates)

Nearest Intesection By Address.

This service accepts an address as input and returns the Nearest Intersection.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.StreetsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    StreetsServiceApi apiInstance = new StreetsServiceApi(defaultClient);
    String address = "address_example"; // String | Address
    String roadClass = "roadClass_example"; // String | Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All
    String driveTime = "driveTime_example"; // String | Returns Intersection in specified drive time
    String driveTimeUnit = "driveTimeUnit_example"; // String | Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes
    String searchRadius = "searchRadius_example"; // String | Search radius within which user wants to search, default is 50 miles
    String searchRadiusUnit = "searchRadiusUnit_example"; // String | Search radius unit, allowed values are (feet, meter, kilometers and miles)
    String historicSpeed = "historicSpeed_example"; // String | Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT)
    String maxCandidates = "maxCandidates_example"; // String | max candidates to be returned default is 1
    try {
      IntersectionResponse result = apiInstance.getIntersectionByAddress(address, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreetsServiceApi#getIntersectionByAddress");
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
 **address** | **String**| Address | [optional]
 **roadClass** | **String**| Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All | [optional]
 **driveTime** | **String**| Returns Intersection in specified drive time | [optional]
 **driveTimeUnit** | **String**| Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes | [optional]
 **searchRadius** | **String**| Search radius within which user wants to search, default is 50 miles | [optional]
 **searchRadiusUnit** | **String**| Search radius unit, allowed values are (feet, meter, kilometers and miles) | [optional]
 **historicSpeed** | **String**| Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) | [optional]
 **maxCandidates** | **String**| max candidates to be returned default is 1 | [optional]

### Return type

[**IntersectionResponse**](IntersectionResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getIntersectionByLocation"></a>
# **getIntersectionByLocation**
> IntersectionResponse getIntersectionByLocation(longitude, latitude, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates)

Nearest Intesection By Location.

This service accepts latitude/longitude as input and returns the Nearest Intersection.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.StreetsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    StreetsServiceApi apiInstance = new StreetsServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of the location.
    String latitude = "latitude_example"; // String | Latitude of the location.
    String roadClass = "roadClass_example"; // String | Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All
    String driveTime = "driveTime_example"; // String | Returns Intersection in specified drive time
    String driveTimeUnit = "driveTimeUnit_example"; // String | Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes
    String searchRadius = "searchRadius_example"; // String | Search radius within which user wants to search, default is 50 miles
    String searchRadiusUnit = "searchRadiusUnit_example"; // String | Search radius unit, allowed values are (feet, meter, kilometers and miles)
    String historicSpeed = "historicSpeed_example"; // String | Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT)
    String maxCandidates = "maxCandidates_example"; // String | max candidates to be returned default is 1
    try {
      IntersectionResponse result = apiInstance.getIntersectionByLocation(longitude, latitude, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreetsServiceApi#getIntersectionByLocation");
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
 **longitude** | **String**| Longitude of the location. | [optional]
 **latitude** | **String**| Latitude of the location. | [optional]
 **roadClass** | **String**| Filters roads with specified class, allowed values are (Major, Secondary, Other and All), default is All | [optional]
 **driveTime** | **String**| Returns Intersection in specified drive time | [optional]
 **driveTimeUnit** | **String**| Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes | [optional]
 **searchRadius** | **String**| Search radius within which user wants to search, default is 50 miles | [optional]
 **searchRadiusUnit** | **String**| Search radius unit, allowed values are (feet, meter, kilometers and miles) | [optional]
 **historicSpeed** | **String**| Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) | [optional]
 **maxCandidates** | **String**| max candidates to be returned default is 1 | [optional]

### Return type

[**IntersectionResponse**](IntersectionResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getNearestSpeedLimit"></a>
# **getNearestSpeedLimit**
> SpeedLimit getNearestSpeedLimit(path)

Nearest Speedlimit.

This service accepts point coordinates of a path as input and returns the posted speed limit of the road segment on which this path will snap.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.StreetsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    StreetsServiceApi apiInstance = new StreetsServiceApi(defaultClient);
    String path = "path_example"; // String | Accepts multiple points which will be snapped to the nearest road segment. Longitude and Latitude will be comma separated (longitude,latitude) and Point Coordinates will be separated by semi-colon(;)
    try {
      SpeedLimit result = apiInstance.getNearestSpeedLimit(path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreetsServiceApi#getNearestSpeedLimit");
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
 **path** | **String**| Accepts multiple points which will be snapped to the nearest road segment. Longitude and Latitude will be comma separated (longitude,latitude) and Point Coordinates will be separated by semi-colon(;) | [optional]

### Return type

[**SpeedLimit**](SpeedLimit.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

