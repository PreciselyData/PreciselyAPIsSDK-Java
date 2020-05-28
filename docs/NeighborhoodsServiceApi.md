# NeighborhoodsServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlaceByLocation**](NeighborhoodsServiceApi.md#getPlaceByLocation) | **GET** /neighborhoods/v1/place/bylocation | Place By Location.


<a name="getPlaceByLocation"></a>
# **getPlaceByLocation**
> PlaceByLocations getPlaceByLocation(longitude, latitude, levelHint)

Place By Location.

Identifies and retrieves the nearest neighborhood around a specific location. This Places service accepts latitude &amp; longitude as input and returns a place name.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.NeighborhoodsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

NeighborhoodsServiceApi apiInstance = new NeighborhoodsServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String levelHint = "levelHint_example"; // String | Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6
try {
    PlaceByLocations result = apiInstance.getPlaceByLocation(longitude, latitude, levelHint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NeighborhoodsServiceApi#getPlaceByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **levelHint** | **String**| Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6 | [optional] [enum: 1, 2, 3, 4, 5, 6]

### Return type

[**PlaceByLocations**](PlaceByLocations.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

