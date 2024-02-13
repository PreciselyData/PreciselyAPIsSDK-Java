# TimeZoneServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchTimezoneByLocation**](TimeZoneServiceApi.md#getBatchTimezoneByLocation) | **POST** /timezone/v1/timezone/bylocation | Timezone Batch by Location.
[**getTimezoneByAddress**](TimeZoneServiceApi.md#getTimezoneByAddress) | **GET** /timezone/v1/timezone/byaddress | Timezone By Address.
[**getTimezoneByAddressBatch**](TimeZoneServiceApi.md#getTimezoneByAddressBatch) | **POST** /timezone/v1/timezone/byaddress | Timezone Batch by Address.
[**getTimezoneByLocation**](TimeZoneServiceApi.md#getTimezoneByLocation) | **GET** /timezone/v1/timezone/bylocation | Timezone By Location.


<a name="getBatchTimezoneByLocation"></a>
# **getBatchTimezoneByLocation**
> TimezoneResponseList getBatchTimezoneByLocation(timezoneLocationRequest)

Timezone Batch by Location.

Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.TimeZoneServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    TimeZoneServiceApi apiInstance = new TimeZoneServiceApi(defaultClient);
    TimezoneLocationRequest timezoneLocationRequest = new TimezoneLocationRequest(); // TimezoneLocationRequest | 
    try {
      TimezoneResponseList result = apiInstance.getBatchTimezoneByLocation(timezoneLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeZoneServiceApi#getBatchTimezoneByLocation");
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
 **timezoneLocationRequest** | [**TimezoneLocationRequest**](TimezoneLocationRequest.md)|  |

### Return type

[**TimezoneResponseList**](TimezoneResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getTimezoneByAddress"></a>
# **getTimezoneByAddress**
> TimezoneResponse getTimezoneByAddress(timestamp, address, matchMode, country)

Timezone By Address.

Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.TimeZoneServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    TimeZoneServiceApi apiInstance = new TimeZoneServiceApi(defaultClient);
    String timestamp = "timestamp_example"; // String | Timestamp in miliseconds.
    String address = "address_example"; // String | The address to be searched.
    String matchMode = "Relaxed"; // String | Match modes determine the leniency used to make a match between the input address and the reference data (Default is relaxed)
    String country = "USA"; // String | Country ISO code (Default is USA)
    try {
      TimezoneResponse result = apiInstance.getTimezoneByAddress(timestamp, address, matchMode, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeZoneServiceApi#getTimezoneByAddress");
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
 **timestamp** | **String**| Timestamp in miliseconds. |
 **address** | **String**| The address to be searched. |
 **matchMode** | **String**| Match modes determine the leniency used to make a match between the input address and the reference data (Default is relaxed) | [optional]
 **country** | **String**| Country ISO code (Default is USA) | [optional]

### Return type

[**TimezoneResponse**](TimezoneResponse.md)

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

<a name="getTimezoneByAddressBatch"></a>
# **getTimezoneByAddressBatch**
> TimezoneResponseList getTimezoneByAddressBatch(timezoneAddressRequest)

Timezone Batch by Address.

Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.TimeZoneServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    TimeZoneServiceApi apiInstance = new TimeZoneServiceApi(defaultClient);
    TimezoneAddressRequest timezoneAddressRequest = new TimezoneAddressRequest(); // TimezoneAddressRequest | 
    try {
      TimezoneResponseList result = apiInstance.getTimezoneByAddressBatch(timezoneAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeZoneServiceApi#getTimezoneByAddressBatch");
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
 **timezoneAddressRequest** | [**TimezoneAddressRequest**](TimezoneAddressRequest.md)|  |

### Return type

[**TimezoneResponseList**](TimezoneResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getTimezoneByLocation"></a>
# **getTimezoneByLocation**
> TimezoneResponse getTimezoneByLocation(timestamp, longitude, latitude)

Timezone By Location.

Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.TimeZoneServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    TimeZoneServiceApi apiInstance = new TimeZoneServiceApi(defaultClient);
    String timestamp = "timestamp_example"; // String | Timestamp in miliseconds.
    String longitude = "longitude_example"; // String | Longitude of the location.
    String latitude = "latitude_example"; // String | Latitude of the location.
    try {
      TimezoneResponse result = apiInstance.getTimezoneByLocation(timestamp, longitude, latitude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeZoneServiceApi#getTimezoneByLocation");
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
 **timestamp** | **String**| Timestamp in miliseconds. |
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |

### Return type

[**TimezoneResponse**](TimezoneResponse.md)

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

