# Psap911ServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAHJPlusPSAPByAddress**](Psap911ServiceApi.md#getAHJPlusPSAPByAddress) | **GET** /911/v1/ahj-psap/byaddress | AHJ &amp; PSAP By Address.
[**getAHJPlusPSAPByLocation**](Psap911ServiceApi.md#getAHJPlusPSAPByLocation) | **GET** /911/v1/ahj-psap/bylocation | AHJ &amp; PSAP By Location
[**getPSAPByAddress**](Psap911ServiceApi.md#getPSAPByAddress) | **GET** /911/v1/psap/byaddress | PSAP By Address.
[**getPSAPByLocation**](Psap911ServiceApi.md#getPSAPByLocation) | **GET** /911/v1/psap/bylocation | PSAP By Location.
[**searchByFccId**](Psap911ServiceApi.md#searchByFccId) | **GET** /911/v1/ahj-psap/byfccid | AHJ &amp; PSAP By Fccid


<a name="getAHJPlusPSAPByAddress"></a>
# **getAHJPlusPSAPByAddress**
> AHJPlusPSAPResponse getAHJPlusPSAPByAddress(address)

AHJ &amp; PSAP By Address.

Accepts addresses as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). 911/PSAP accepts an address and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.Psap911ServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    Psap911ServiceApi apiInstance = new Psap911ServiceApi(defaultClient);
    String address = "address_example"; // String | The address to be searched.
    try {
      AHJPlusPSAPResponse result = apiInstance.getAHJPlusPSAPByAddress(address);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Psap911ServiceApi#getAHJPlusPSAPByAddress");
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
 **address** | **String**| The address to be searched. |

### Return type

[**AHJPlusPSAPResponse**](AHJPlusPSAPResponse.md)

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

<a name="getAHJPlusPSAPByLocation"></a>
# **getAHJPlusPSAPByLocation**
> AHJPlusPSAPResponse getAHJPlusPSAPByLocation(longitude, latitude)

AHJ &amp; PSAP By Location

Accepts latitude &amp; longitude as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). 911/PSAP accepts a location coordinate and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.Psap911ServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    Psap911ServiceApi apiInstance = new Psap911ServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of the location.
    String latitude = "latitude_example"; // String | Latitude of the location.
    try {
      AHJPlusPSAPResponse result = apiInstance.getAHJPlusPSAPByLocation(longitude, latitude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Psap911ServiceApi#getAHJPlusPSAPByLocation");
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
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |

### Return type

[**AHJPlusPSAPResponse**](AHJPlusPSAPResponse.md)

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

<a name="getPSAPByAddress"></a>
# **getPSAPByAddress**
> PSAPResponse getPSAPByAddress(address)

PSAP By Address.

Accepts addresses as input and Returns contact details for local Public Safety Answering Points (PSAP). 911/PSAP accepts an address as input and returns the relevant PSAP address and contact details including agency name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.Psap911ServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    Psap911ServiceApi apiInstance = new Psap911ServiceApi(defaultClient);
    String address = "address_example"; // String | The address to be searched.
    try {
      PSAPResponse result = apiInstance.getPSAPByAddress(address);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Psap911ServiceApi#getPSAPByAddress");
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
 **address** | **String**| The address to be searched. |

### Return type

[**PSAPResponse**](PSAPResponse.md)

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

<a name="getPSAPByLocation"></a>
# **getPSAPByLocation**
> PSAPResponse getPSAPByLocation(longitude, latitude)

PSAP By Location.

Accepts latitude &amp; longitude as input and Returns contact details for local Public Safety Answering Points (PSAP). 911/PSAP accepts a location coordinate and returns the relevant PSAP address and contact details including dispatch name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.Psap911ServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    Psap911ServiceApi apiInstance = new Psap911ServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of the location.
    String latitude = "latitude_example"; // String | Latitude of the location.
    try {
      PSAPResponse result = apiInstance.getPSAPByLocation(longitude, latitude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Psap911ServiceApi#getPSAPByLocation");
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
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |

### Return type

[**PSAPResponse**](PSAPResponse.md)

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

<a name="searchByFccId"></a>
# **searchByFccId**
> AHJPlusPSAPResponse searchByFccId(fccId)

AHJ &amp; PSAP By Fccid

Accepts fccid as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). 911/PSAP accepts a location coordinate and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.Psap911ServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    Psap911ServiceApi apiInstance = new Psap911ServiceApi(defaultClient);
    String fccId = "fccId_example"; // String | fccId
    try {
      AHJPlusPSAPResponse result = apiInstance.searchByFccId(fccId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Psap911ServiceApi#searchByFccId");
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
 **fccId** | **String**| fccId |

### Return type

[**AHJPlusPSAPResponse**](AHJPlusPSAPResponse.md)

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

