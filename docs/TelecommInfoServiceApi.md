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
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.TelecommInfoServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

TelecommInfoServiceApi apiInstance = new TelecommInfoServiceApi();
String address = "address_example"; // String | The address to be searched.
String country = "USA"; // String | 3 letter ISO code of the country to be searched. Allowed values USA,CAN
String areaCodeInfo = "False"; // String | Specifies whether area code information will be part of response.Allowed values True,False
String level = "basic"; // String | Level (basic/detail).Allowed values detail,basic.
try {
    RateCenterResponse result = apiInstance.getRateCenterByAddress(address, country, areaCodeInfo, level);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelecommInfoServiceApi#getRateCenterByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address to be searched. |
 **country** | **String**| 3 letter ISO code of the country to be searched. Allowed values USA,CAN | [optional] [default to USA] [enum: USA, CAN]
 **areaCodeInfo** | **String**| Specifies whether area code information will be part of response.Allowed values True,False | [optional] [default to False] [enum: True, False]
 **level** | **String**| Level (basic/detail).Allowed values detail,basic. | [optional] [default to basic] [enum: detail, basic]

### Return type

[**RateCenterResponse**](RateCenterResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getRateCenterByLocation"></a>
# **getRateCenterByLocation**
> RateCenterResponse getRateCenterByLocation(longitude, latitude, areaCodeInfo, level)

Rate Center By Location.

Accepts latitude &amp; longitude as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.TelecommInfoServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

TelecommInfoServiceApi apiInstance = new TelecommInfoServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String areaCodeInfo = "False"; // String | Specifies whether area code information will be part of response.Allowed values True,False.
String level = "basic"; // String | Level (basic/detail).Allowed values detail,basic.
try {
    RateCenterResponse result = apiInstance.getRateCenterByLocation(longitude, latitude, areaCodeInfo, level);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelecommInfoServiceApi#getRateCenterByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **areaCodeInfo** | **String**| Specifies whether area code information will be part of response.Allowed values True,False. | [optional] [default to False] [enum: True, False]
 **level** | **String**| Level (basic/detail).Allowed values detail,basic. | [optional] [default to basic] [enum: detail, basic]

### Return type

[**RateCenterResponse**](RateCenterResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

