# AddressesServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddressesCountByBoundaryName**](AddressesServiceApi.md#getAddressesCountByBoundaryName) | **GET** /addresses/v1/addresscount/byboundaryname | Addresses Count by Boundary Name.
[**getAddressesCountbyBoundary**](AddressesServiceApi.md#getAddressesCountbyBoundary) | **POST** /addresses/v1/addresscount/byboundary | Addresses count by Boundary.
[**getAddressesbyBoundary**](AddressesServiceApi.md#getAddressesbyBoundary) | **POST** /addresses/v1/address/byboundary | Addresses by Boundary.
[**getAddressesbyBoundaryName**](AddressesServiceApi.md#getAddressesbyBoundaryName) | **GET** /addresses/v1/address/byboundaryname | Addresses by Boundary Name.


<a name="getAddressesCountByBoundaryName"></a>
# **getAddressesCountByBoundaryName**
> AddressesCount getAddressesCountByBoundaryName(country, areaName1, areaName2, areaName3, areaName4, postCode)

Addresses Count by Boundary Name.

This service accepts zip code, neighborhood, county, or city names, and returns the total number of addresses associated with these names.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.AddressesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    AddressesServiceApi apiInstance = new AddressesServiceApi(defaultClient);
    String country = "country_example"; // String | Name of country. Acceptable values are CAN, USA.
    String areaName1 = "areaName1_example"; // String | Specifies the largest geographical area, typically a state or province.
    String areaName2 = "areaName2_example"; // String | Specifies the secondary geographic area, typically a county or district.
    String areaName3 = "areaName3_example"; // String | Specifies a city or town name.
    String areaName4 = "areaName4_example"; // String | Specifies a city subdivision or locality/neighborhood.
    String postCode = "postCode_example"; // String | Specifies the postcode (ZIP code) in the appropriate format for the country.
    try {
      AddressesCount result = apiInstance.getAddressesCountByBoundaryName(country, areaName1, areaName2, areaName3, areaName4, postCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesServiceApi#getAddressesCountByBoundaryName");
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
 **country** | **String**| Name of country. Acceptable values are CAN, USA. |
 **areaName1** | **String**| Specifies the largest geographical area, typically a state or province. | [optional]
 **areaName2** | **String**| Specifies the secondary geographic area, typically a county or district. | [optional]
 **areaName3** | **String**| Specifies a city or town name. | [optional]
 **areaName4** | **String**| Specifies a city subdivision or locality/neighborhood. | [optional]
 **postCode** | **String**| Specifies the postcode (ZIP code) in the appropriate format for the country. | [optional]

### Return type

[**AddressesCount**](AddressesCount.md)

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

<a name="getAddressesCountbyBoundary"></a>
# **getAddressesCountbyBoundary**
> AddressesCount getAddressesCountbyBoundary(addressesByBoundaryRequest)

Addresses count by Boundary.

This service accepts custom geographic boundaries or drive time &amp; drive distance, returns the total number of addresses within these boundaries.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.AddressesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    AddressesServiceApi apiInstance = new AddressesServiceApi(defaultClient);
    AddressesByBoundaryRequest addressesByBoundaryRequest = new AddressesByBoundaryRequest(); // AddressesByBoundaryRequest | 
    try {
      AddressesCount result = apiInstance.getAddressesCountbyBoundary(addressesByBoundaryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesServiceApi#getAddressesCountbyBoundary");
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
 **addressesByBoundaryRequest** | [**AddressesByBoundaryRequest**](AddressesByBoundaryRequest.md)|  |

### Return type

[**AddressesCount**](AddressesCount.md)

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

<a name="getAddressesbyBoundary"></a>
# **getAddressesbyBoundary**
> AddressesResponse getAddressesbyBoundary(addressesByBoundaryRequest)

Addresses by Boundary.

This service accepts custom geographic boundaries or drive time &amp; drive distance, returns all known &amp; valid addresses within these boundaries.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.AddressesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    AddressesServiceApi apiInstance = new AddressesServiceApi(defaultClient);
    AddressesByBoundaryRequest addressesByBoundaryRequest = new AddressesByBoundaryRequest(); // AddressesByBoundaryRequest | 
    try {
      AddressesResponse result = apiInstance.getAddressesbyBoundary(addressesByBoundaryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesServiceApi#getAddressesbyBoundary");
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
 **addressesByBoundaryRequest** | [**AddressesByBoundaryRequest**](AddressesByBoundaryRequest.md)|  |

### Return type

[**AddressesResponse**](AddressesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getAddressesbyBoundaryName"></a>
# **getAddressesbyBoundaryName**
> AddressesResponse getAddressesbyBoundaryName(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page)

Addresses by Boundary Name.

This service accepts zip code, neighborhood, county, or city names, and returns all known &amp; valid addresses associated with these names.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.AddressesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    AddressesServiceApi apiInstance = new AddressesServiceApi(defaultClient);
    String country = "country_example"; // String | Name of country. Acceptable values are CAN, USA.
    String areaName1 = "areaName1_example"; // String | Specifies the largest geographical area, typically a state or province.
    String areaName2 = "areaName2_example"; // String | Specifies the secondary geographic area, typically a county or district.
    String areaName3 = "areaName3_example"; // String | Specifies a city or town name.
    String areaName4 = "areaName4_example"; // String | Specifies a city subdivision or locality/neighborhood.
    String postCode = "postCode_example"; // String | Specifies the postcode (ZIP code) in the appropriate format for the country.
    String maxCandidates = "maxCandidates_example"; // String | Maximum number of addresses to be returned in response. Max. value is 100 for XML/JSON, and 2000 for CSV.
    String page = "page_example"; // String | Response will indicate the page number.
    try {
      AddressesResponse result = apiInstance.getAddressesbyBoundaryName(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesServiceApi#getAddressesbyBoundaryName");
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
 **country** | **String**| Name of country. Acceptable values are CAN, USA. |
 **areaName1** | **String**| Specifies the largest geographical area, typically a state or province. | [optional]
 **areaName2** | **String**| Specifies the secondary geographic area, typically a county or district. | [optional]
 **areaName3** | **String**| Specifies a city or town name. | [optional]
 **areaName4** | **String**| Specifies a city subdivision or locality/neighborhood. | [optional]
 **postCode** | **String**| Specifies the postcode (ZIP code) in the appropriate format for the country. | [optional]
 **maxCandidates** | **String**| Maximum number of addresses to be returned in response. Max. value is 100 for XML/JSON, and 2000 for CSV. | [optional]
 **page** | **String**| Response will indicate the page number. | [optional]

### Return type

[**AddressesResponse**](AddressesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

