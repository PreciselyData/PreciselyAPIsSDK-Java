# PropertyInformationServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPropertyAttributesByAddress**](PropertyInformationServiceApi.md#getPropertyAttributesByAddress) | **GET** /property/v2/attributes/byaddress | PropertyV2 Attributes By Address.
[**getPropertyAttributesByAddressBatch**](PropertyInformationServiceApi.md#getPropertyAttributesByAddressBatch) | **POST** /property/v2/attributes/byaddress | PropertyV2 Attributes By Address Batch.


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

