# PropertyInformationServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getParcelBoundaryByAddress**](PropertyInformationServiceApi.md#getParcelBoundaryByAddress) | **GET** /property/v2/parcelboundary/byaddress | Get Parcel Boundary By Address
[**getParcelBoundaryByLocation**](PropertyInformationServiceApi.md#getParcelBoundaryByLocation) | **GET** /property/v2/parcelboundary/bylocation | Get Parcel Boundary By Location
[**getParcelBoundaryByPreciselyID**](PropertyInformationServiceApi.md#getParcelBoundaryByPreciselyID) | **GET** /property/v2/parcelboundary/bypreciselyID | Get Parcel Boundary By PreciselyID
[**getPropertyAttributesByAddress**](PropertyInformationServiceApi.md#getPropertyAttributesByAddress) | **GET** /property/v2/attributes/byaddress | PropertyV2 Attributes By Address.
[**getPropertyAttributesByAddressBatch**](PropertyInformationServiceApi.md#getPropertyAttributesByAddressBatch) | **POST** /property/v2/attributes/byaddress | PropertyV2 Attributes By Address Batch.


<a name="getParcelBoundaryByAddress"></a>
# **getParcelBoundaryByAddress**
> ParcelBoundaryV2 getParcelBoundaryByAddress(address)

Get Parcel Boundary By Address

Accepts address as input and returns property parcel boundary around that address.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PropertyInformationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi(defaultClient);
    String address = "address_example"; // String | free form address text
    try {
      ParcelBoundaryV2 result = apiInstance.getParcelBoundaryByAddress(address);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyInformationServiceApi#getParcelBoundaryByAddress");
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
 **address** | **String**| free form address text |

### Return type

[**ParcelBoundaryV2**](ParcelBoundaryV2.md)

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

<a name="getParcelBoundaryByLocation"></a>
# **getParcelBoundaryByLocation**
> ParcelBoundaryV2 getParcelBoundaryByLocation(longitude, latitude)

Get Parcel Boundary By Location

Accepts latitude/longitude as input and returns property parcel boundary around that location.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PropertyInformationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of Location
    String latitude = "latitude_example"; // String | Latitude of Location
    try {
      ParcelBoundaryV2 result = apiInstance.getParcelBoundaryByLocation(longitude, latitude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyInformationServiceApi#getParcelBoundaryByLocation");
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
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |

### Return type

[**ParcelBoundaryV2**](ParcelBoundaryV2.md)

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

<a name="getParcelBoundaryByPreciselyID"></a>
# **getParcelBoundaryByPreciselyID**
> ParcelBoundaryV2 getParcelBoundaryByPreciselyID(preciselyID)

Get Parcel Boundary By PreciselyID

Accepts PB key as input and returns property attributes for the matched address.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PropertyInformationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi(defaultClient);
    String preciselyID = "preciselyID_example"; // String | precisely ID
    try {
      ParcelBoundaryV2 result = apiInstance.getParcelBoundaryByPreciselyID(preciselyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyInformationServiceApi#getParcelBoundaryByPreciselyID");
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
 **preciselyID** | **String**| precisely ID |

### Return type

[**ParcelBoundaryV2**](ParcelBoundaryV2.md)

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

<a name="getPropertyAttributesByAddress"></a>
# **getPropertyAttributesByAddress**
> PropertyInfoResponse getPropertyAttributesByAddress(address, attributes)

PropertyV2 Attributes By Address.

GetPropertyAttributesbyAddress Endpoint will take address as an input and will return key property attributes in response. Optionally user will have the option to filter the attributes and will pay for only returned attributes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PropertyInformationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi(defaultClient);
    String address = "address_example"; // String | free form address text
    String attributes = "attributes_example"; // String | Case-insensitive comma separated values of property attributes. Response will contain only the input attributes.
    try {
      PropertyInfoResponse result = apiInstance.getPropertyAttributesByAddress(address, attributes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyInformationServiceApi#getPropertyAttributesByAddress");
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
 **address** | **String**| free form address text | [optional]
 **attributes** | **String**| Case-insensitive comma separated values of property attributes. Response will contain only the input attributes. | [optional]

### Return type

[**PropertyInfoResponse**](PropertyInfoResponse.md)

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

<a name="getPropertyAttributesByAddressBatch"></a>
# **getPropertyAttributesByAddressBatch**
> PropertyInfoResponses getPropertyAttributesByAddressBatch(propertyInfoAddressRequest)

PropertyV2 Attributes By Address Batch.

GetPropertyAttributesbyAddressBatch Endpoint will take the list of addresses as an input and will return key property attributes for the given addresses in response. Optionally user will have the option to filter the attributes and will pay for only returned attributes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PropertyInformationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi(defaultClient);
    PropertyInfoAddressRequest propertyInfoAddressRequest = new PropertyInfoAddressRequest(); // PropertyInfoAddressRequest | 
    try {
      PropertyInfoResponses result = apiInstance.getPropertyAttributesByAddressBatch(propertyInfoAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyInformationServiceApi#getPropertyAttributesByAddressBatch");
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
 **propertyInfoAddressRequest** | [**PropertyInfoAddressRequest**](PropertyInfoAddressRequest.md)|  |

### Return type

[**PropertyInfoResponses**](PropertyInfoResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

