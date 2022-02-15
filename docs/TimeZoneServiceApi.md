# TimeZoneServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchTimezoneByAddress**](TimeZoneServiceApi.md#getBatchTimezoneByAddress) | **POST** /timezone/v1/timezone/byaddress | Timezone Batch by Address
[**getBatchTimezoneByLocation**](TimeZoneServiceApi.md#getBatchTimezoneByLocation) | **POST** /timezone/v1/timezone/bylocation | Timezone Batch by Location
[**getTimezoneByAddress**](TimeZoneServiceApi.md#getTimezoneByAddress) | **GET** /timezone/v1/timezone/byaddress | Timezone By Address.
[**getTimezoneByLocation**](TimeZoneServiceApi.md#getTimezoneByLocation) | **GET** /timezone/v1/timezone/bylocation | Timezone By Location.


<a name="getBatchTimezoneByAddress"></a>
# **getBatchTimezoneByAddress**
> TimezoneResponse getBatchTimezoneByAddress(body)

Timezone Batch by Address

Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds. 

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.TimeZoneServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

TimeZoneServiceApi apiInstance = new TimeZoneServiceApi();
TimezoneAddressRequest body = new TimezoneAddressRequest(); // TimezoneAddressRequest | 
try {
    TimezoneResponse result = apiInstance.getBatchTimezoneByAddress(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeZoneServiceApi#getBatchTimezoneByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimezoneAddressRequest**](TimezoneAddressRequest.md)|  | [optional]

### Return type

[**TimezoneResponse**](TimezoneResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getBatchTimezoneByLocation"></a>
# **getBatchTimezoneByLocation**
> TimezoneLocationResponse getBatchTimezoneByLocation(body)

Timezone Batch by Location

Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds. 

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.TimeZoneServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

TimeZoneServiceApi apiInstance = new TimeZoneServiceApi();
TimezoneLocationRequest body = new TimezoneLocationRequest(); // TimezoneLocationRequest | 
try {
    TimezoneLocationResponse result = apiInstance.getBatchTimezoneByLocation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeZoneServiceApi#getBatchTimezoneByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TimezoneLocationRequest**](TimezoneLocationRequest.md)|  | [optional]

### Return type

[**TimezoneLocationResponse**](TimezoneLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getTimezoneByAddress"></a>
# **getTimezoneByAddress**
> Timezone getTimezoneByAddress(timestamp, address, matchMode, country)

Timezone By Address.

Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.TimeZoneServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

TimeZoneServiceApi apiInstance = new TimeZoneServiceApi();
String timestamp = "timestamp_example"; // String | Timestamp in miliseconds.
String address = "address_example"; // String | The address to be searched.
String matchMode = "Relaxed"; // String | Match modes determine the leniency used to make a match between the input address and the reference data.
String country = "USA"; // String | Country ISO code.
try {
    Timezone result = apiInstance.getTimezoneByAddress(timestamp, address, matchMode, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeZoneServiceApi#getTimezoneByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **String**| Timestamp in miliseconds. |
 **address** | **String**| The address to be searched. |
 **matchMode** | **String**| Match modes determine the leniency used to make a match between the input address and the reference data. | [optional] [default to Relaxed] [enum: Exact, Standard, Relaxed, Custom, Interactive, CASS]
 **country** | **String**| Country ISO code. | [optional] [default to USA]

### Return type

[**Timezone**](Timezone.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getTimezoneByLocation"></a>
# **getTimezoneByLocation**
> TimezoneLocation getTimezoneByLocation(timestamp, longitude, latitude)

Timezone By Location.

Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.TimeZoneServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

TimeZoneServiceApi apiInstance = new TimeZoneServiceApi();
String timestamp = "timestamp_example"; // String | Timestamp in miliseconds.
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
try {
    TimezoneLocation result = apiInstance.getTimezoneByLocation(timestamp, longitude, latitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeZoneServiceApi#getTimezoneByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **String**| Timestamp in miliseconds. |
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |

### Return type

[**TimezoneLocation**](TimezoneLocation.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

