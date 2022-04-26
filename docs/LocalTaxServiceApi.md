# LocalTaxServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchTaxByAddress**](LocalTaxServiceApi.md#getBatchTaxByAddress) | **POST** /localtax/v1/tax/{taxRateTypeId}/byaddress | Post Tax By Address
[**getBatchTaxByLocation**](LocalTaxServiceApi.md#getBatchTaxByLocation) | **POST** /localtax/v1/tax/{taxRateTypeId}/bylocation | Post Tax By Location
[**getBatchTaxRateByAddress**](LocalTaxServiceApi.md#getBatchTaxRateByAddress) | **POST** /localtax/v1/taxrate/{taxRateTypeId}/byaddress | Post Taxrate By Address
[**getBatchTaxRateByLocation**](LocalTaxServiceApi.md#getBatchTaxRateByLocation) | **POST** /localtax/v1/taxrate/{taxRateTypeId}/bylocation | Post Taxrate By Location
[**getIPDTaxByAddress**](LocalTaxServiceApi.md#getIPDTaxByAddress) | **GET** /localtax/v1/taxdistrict/ipd/byaddress | Get IPD Tax by Address
[**getIPDTaxByAddressBatch**](LocalTaxServiceApi.md#getIPDTaxByAddressBatch) | **POST** /localtax/v1/taxdistrict/ipd/byaddress | Get IPD Tax for batch requests.
[**getSpecificTaxByAddress**](LocalTaxServiceApi.md#getSpecificTaxByAddress) | **GET** /localtax/v1/tax/{taxRateTypeId}/byaddress | Get Tax By Address
[**getSpecificTaxByLocation**](LocalTaxServiceApi.md#getSpecificTaxByLocation) | **GET** /localtax/v1/tax/{taxRateTypeId}/bylocation | Get Tax By Location
[**getSpecificTaxRateByAddress**](LocalTaxServiceApi.md#getSpecificTaxRateByAddress) | **GET** /localtax/v1/taxrate/{taxRateTypeId}/byaddress | Get Taxrate By Address
[**getSpecificTaxRateByLocation**](LocalTaxServiceApi.md#getSpecificTaxRateByLocation) | **GET** /localtax/v1/taxrate/{taxRateTypeId}/bylocation | Get Taxrate By Location


<a name="getBatchTaxByAddress"></a>
# **getBatchTaxByAddress**
> TaxResponses getBatchTaxByAddress(taxRateTypeId, taxAddressRequest)

Post Tax By Address

This is a Batch offering for &#39;Tax By Address&#39; service. It accepts a single address, purchase amount or a list of addresses, purchase amounts and retrieve applicable taxes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.LocalTaxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    LocalTaxServiceApi apiInstance = new LocalTaxServiceApi(defaultClient);
    String taxRateTypeId = "taxRateTypeId_example"; // String | 
    TaxAddressRequest taxAddressRequest = new TaxAddressRequest(); // TaxAddressRequest | 
    try {
      TaxResponses result = apiInstance.getBatchTaxByAddress(taxRateTypeId, taxAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxServiceApi#getBatchTaxByAddress");
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
 **taxRateTypeId** | **String**|  |
 **taxAddressRequest** | [**TaxAddressRequest**](TaxAddressRequest.md)|  |

### Return type

[**TaxResponses**](TaxResponses.md)

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

<a name="getBatchTaxByLocation"></a>
# **getBatchTaxByLocation**
> TaxResponses getBatchTaxByLocation(taxRateTypeId, taxLocationRequest)

Post Tax By Location

This is a Batch offering for &#39;Tax By Location&#39; service. It accepts a single location coordinate, purchase amount or a list of location coordinates, purchase amounts and retrieve applicable tax.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.LocalTaxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    LocalTaxServiceApi apiInstance = new LocalTaxServiceApi(defaultClient);
    String taxRateTypeId = "taxRateTypeId_example"; // String | 
    TaxLocationRequest taxLocationRequest = new TaxLocationRequest(); // TaxLocationRequest | 
    try {
      TaxResponses result = apiInstance.getBatchTaxByLocation(taxRateTypeId, taxLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxServiceApi#getBatchTaxByLocation");
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
 **taxRateTypeId** | **String**|  |
 **taxLocationRequest** | [**TaxLocationRequest**](TaxLocationRequest.md)|  |

### Return type

[**TaxResponses**](TaxResponses.md)

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

<a name="getBatchTaxRateByAddress"></a>
# **getBatchTaxRateByAddress**
> TaxResponses getBatchTaxRateByAddress(taxRateTypeId, taxRateAddressRequest)

Post Taxrate By Address

This is a Batch offering for &#39;Taxrate By Address&#39; service. It accepts a single address or a list of addresses and retrieve applicable tax rates.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.LocalTaxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    LocalTaxServiceApi apiInstance = new LocalTaxServiceApi(defaultClient);
    String taxRateTypeId = "taxRateTypeId_example"; // String | 
    TaxRateAddressRequest taxRateAddressRequest = new TaxRateAddressRequest(); // TaxRateAddressRequest | 
    try {
      TaxResponses result = apiInstance.getBatchTaxRateByAddress(taxRateTypeId, taxRateAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxServiceApi#getBatchTaxRateByAddress");
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
 **taxRateTypeId** | **String**|  |
 **taxRateAddressRequest** | [**TaxRateAddressRequest**](TaxRateAddressRequest.md)|  |

### Return type

[**TaxResponses**](TaxResponses.md)

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

<a name="getBatchTaxRateByLocation"></a>
# **getBatchTaxRateByLocation**
> TaxResponses getBatchTaxRateByLocation(taxRateTypeId, taxRateLocationRequest)

Post Taxrate By Location

This is a Batch offering for &#39;Taxrate By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve applicable tax rates.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.LocalTaxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    LocalTaxServiceApi apiInstance = new LocalTaxServiceApi(defaultClient);
    String taxRateTypeId = "taxRateTypeId_example"; // String | 
    TaxRateLocationRequest taxRateLocationRequest = new TaxRateLocationRequest(); // TaxRateLocationRequest | 
    try {
      TaxResponses result = apiInstance.getBatchTaxRateByLocation(taxRateTypeId, taxRateLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxServiceApi#getBatchTaxRateByLocation");
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
 **taxRateTypeId** | **String**|  |
 **taxRateLocationRequest** | [**TaxRateLocationRequest**](TaxRateLocationRequest.md)|  |

### Return type

[**TaxResponses**](TaxResponses.md)

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

<a name="getIPDTaxByAddress"></a>
# **getIPDTaxByAddress**
> TaxDistrictResponse getIPDTaxByAddress(address, returnLatLongFields, latLongFormat)

Get IPD Tax by Address

Retrieves IPD (Insurance Premium District) tax rates applicable to a specific address. This service accepts address as input and returns one or many IPD tax rate details for that region in which address falls.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.LocalTaxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    LocalTaxServiceApi apiInstance = new LocalTaxServiceApi(defaultClient);
    String address = "address_example"; // String | The address to be searched.
    String returnLatLongFields = "returnLatLongFields_example"; // String | Y or N (default is N) - Returns Latitude Longitude Fields.
    String latLongFormat = "latLongFormat_example"; // String | (default is Decimal) - Returns Desired Latitude Longitude Format.
    try {
      TaxDistrictResponse result = apiInstance.getIPDTaxByAddress(address, returnLatLongFields, latLongFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxServiceApi#getIPDTaxByAddress");
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
 **returnLatLongFields** | **String**| Y or N (default is N) - Returns Latitude Longitude Fields. | [optional]
 **latLongFormat** | **String**| (default is Decimal) - Returns Desired Latitude Longitude Format. | [optional]

### Return type

[**TaxDistrictResponse**](TaxDistrictResponse.md)

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

<a name="getIPDTaxByAddressBatch"></a>
# **getIPDTaxByAddressBatch**
> TaxDistrictResponseList getIPDTaxByAddressBatch(ipDTaxByAddressBatchRequest)

Get IPD Tax for batch requests.

This is a Batch offering for &#39;IPD Tax rates By Address&#39;. It accepts multiple addresses as parameters along with geocoding and matching preferences and returns one or many IPD tax rate details for each address.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.LocalTaxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    LocalTaxServiceApi apiInstance = new LocalTaxServiceApi(defaultClient);
    IPDTaxByAddressBatchRequest ipDTaxByAddressBatchRequest = new IPDTaxByAddressBatchRequest(); // IPDTaxByAddressBatchRequest | 
    try {
      TaxDistrictResponseList result = apiInstance.getIPDTaxByAddressBatch(ipDTaxByAddressBatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxServiceApi#getIPDTaxByAddressBatch");
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
 **ipDTaxByAddressBatchRequest** | [**IPDTaxByAddressBatchRequest**](IPDTaxByAddressBatchRequest.md)|  |

### Return type

[**TaxDistrictResponseList**](TaxDistrictResponseList.md)

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

<a name="getSpecificTaxByAddress"></a>
# **getSpecificTaxByAddress**
> TaxRateResponse getSpecificTaxByAddress(taxRateTypeId, address, purchaseAmount)

Get Tax By Address

This service calculates and returns taxes applicable at a specific address. Address, purchase amount and supported tax rate type are inputs to the service.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.LocalTaxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    LocalTaxServiceApi apiInstance = new LocalTaxServiceApi(defaultClient);
    String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id
    String address = "address_example"; // String | The address to be searched.
    String purchaseAmount = "purchaseAmount_example"; // String | The amount on which tax to be calculated
    try {
      TaxRateResponse result = apiInstance.getSpecificTaxByAddress(taxRateTypeId, address, purchaseAmount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxServiceApi#getSpecificTaxByAddress");
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
 **taxRateTypeId** | **String**| The tax rate id |
 **address** | **String**| The address to be searched. |
 **purchaseAmount** | **String**| The amount on which tax to be calculated |

### Return type

[**TaxRateResponse**](TaxRateResponse.md)

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

<a name="getSpecificTaxByLocation"></a>
# **getSpecificTaxByLocation**
> TaxRateResponse getSpecificTaxByLocation(taxRateTypeId, latitude, longitude, purchaseAmount)

Get Tax By Location

This service calculates and returns tax applicable at a specific location. Longitude, latitude, purchase amount and supported tax rate type are inputs to the service.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.LocalTaxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    LocalTaxServiceApi apiInstance = new LocalTaxServiceApi(defaultClient);
    String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id
    String latitude = "latitude_example"; // String | Latitude of the location
    String longitude = "longitude_example"; // String | Longitude of the location
    String purchaseAmount = "purchaseAmount_example"; // String | The amount on which tax to be calculated
    try {
      TaxRateResponse result = apiInstance.getSpecificTaxByLocation(taxRateTypeId, latitude, longitude, purchaseAmount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxServiceApi#getSpecificTaxByLocation");
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
 **taxRateTypeId** | **String**| The tax rate id |
 **latitude** | **String**| Latitude of the location |
 **longitude** | **String**| Longitude of the location |
 **purchaseAmount** | **String**| The amount on which tax to be calculated |

### Return type

[**TaxRateResponse**](TaxRateResponse.md)

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

<a name="getSpecificTaxRateByAddress"></a>
# **getSpecificTaxRateByAddress**
> TaxRateResponse getSpecificTaxRateByAddress(taxRateTypeId, address)

Get Taxrate By Address

Retrieves tax rates applicable to a specific address. This service accepts address and supported tax rate type as inputs to retrieve applicable tax rates.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.LocalTaxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    LocalTaxServiceApi apiInstance = new LocalTaxServiceApi(defaultClient);
    String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id
    String address = "address_example"; // String | The address to be searched.
    try {
      TaxRateResponse result = apiInstance.getSpecificTaxRateByAddress(taxRateTypeId, address);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxServiceApi#getSpecificTaxRateByAddress");
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
 **taxRateTypeId** | **String**| The tax rate id |
 **address** | **String**| The address to be searched. |

### Return type

[**TaxRateResponse**](TaxRateResponse.md)

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

<a name="getSpecificTaxRateByLocation"></a>
# **getSpecificTaxRateByLocation**
> TaxRateResponse getSpecificTaxRateByLocation(taxRateTypeId, latitude, longitude)

Get Taxrate By Location

Retrieves tax rates applicable to a specific location. This service accepts longitude, latitude and supported tax rate type as inputs to retrieve applicable tax rates.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.LocalTaxServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    LocalTaxServiceApi apiInstance = new LocalTaxServiceApi(defaultClient);
    String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id
    String latitude = "latitude_example"; // String | Latitude of the location
    String longitude = "longitude_example"; // String | Longitude of the location
    try {
      TaxRateResponse result = apiInstance.getSpecificTaxRateByLocation(taxRateTypeId, latitude, longitude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxServiceApi#getSpecificTaxRateByLocation");
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
 **taxRateTypeId** | **String**| The tax rate id |
 **latitude** | **String**| Latitude of the location |
 **longitude** | **String**| Longitude of the location |

### Return type

[**TaxRateResponse**](TaxRateResponse.md)

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

