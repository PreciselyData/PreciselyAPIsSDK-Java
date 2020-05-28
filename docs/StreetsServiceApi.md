# StreetsServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIntersectionByAddress**](StreetsServiceApi.md#getIntersectionByAddress) | **GET** /streets/v1/intersection/byaddress | Nearest Intersection By Address
[**getIntersectionByLocation**](StreetsServiceApi.md#getIntersectionByLocation) | **GET** /streets/v1/intersection/bylocation | Nearest Intersection By Location
[**getNearestSpeedLimit**](StreetsServiceApi.md#getNearestSpeedLimit) | **GET** /streets/v1/speedlimit | Nearest Speedlimit


<a name="getIntersectionByAddress"></a>
# **getIntersectionByAddress**
> IntersectionResponse getIntersectionByAddress(address, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates)

Nearest Intersection By Address

This service accepts an address as input and returns the Nearest Intersection.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.StreetsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

StreetsServiceApi apiInstance = new StreetsServiceApi();
String address = "address_example"; // String | Address
String roadClass = "roadClass_example"; // String | Filters roads with specified class, allowed values are (Major, Motorways, Other and All), default is All
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
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address |
 **roadClass** | **String**| Filters roads with specified class, allowed values are (Major, Motorways, Other and All), default is All | [optional]
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

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getIntersectionByLocation"></a>
# **getIntersectionByLocation**
> IntersectionResponse getIntersectionByLocation(longitude, latitude, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates)

Nearest Intersection By Location

This service accepts latitude/longitude as input and returns the Nearest Intersection.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.StreetsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

StreetsServiceApi apiInstance = new StreetsServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String roadClass = "roadClass_example"; // String | Filters roads with specified class, allowed values are (Major, Motorways, Other and All), default is All
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
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **roadClass** | **String**| Filters roads with specified class, allowed values are (Major, Motorways, Other and All), default is All | [optional]
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

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getNearestSpeedLimit"></a>
# **getNearestSpeedLimit**
> SpeedLimit getNearestSpeedLimit(path)

Nearest Speedlimit

This service accepts point coordinates of a path as input and returns the posted speed limit of the road segment on which this path will snap.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.StreetsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

StreetsServiceApi apiInstance = new StreetsServiceApi();
String path = "path_example"; // String | Accepts multiple points which will be snapped to the nearest road segment. Longitude and Latitude will be comma separated (longitude,latitude) and Point Coordinates will be separated by semi-colon(;)
try {
    SpeedLimit result = apiInstance.getNearestSpeedLimit(path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreetsServiceApi#getNearestSpeedLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Accepts multiple points which will be snapped to the nearest road segment. Longitude and Latitude will be comma separated (longitude,latitude) and Point Coordinates will be separated by semi-colon(;) |

### Return type

[**SpeedLimit**](SpeedLimit.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

