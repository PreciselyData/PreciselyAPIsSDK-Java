# AddressVerificationServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCityStateProvince**](AddressVerificationServiceApi.md#getCityStateProvince) | **POST** /addressverification/v1/getcitystateprovince/results.json | GetCityStateProvince
[**getPostalCodes**](AddressVerificationServiceApi.md#getPostalCodes) | **POST** /addressverification/v1/getpostalcodes/results.json | GetPostalCodes
[**validateMailingAddress**](AddressVerificationServiceApi.md#validateMailingAddress) | **POST** /addressverification/v1/validatemailingaddress/results.json | ValidateMailingAddress
[**validateMailingAddressPremium**](AddressVerificationServiceApi.md#validateMailingAddressPremium) | **POST** /addressverification/v1/validatemailingaddresspremium/results.json | ValidateMailingAddressPremium
[**validateMailingAddressPro**](AddressVerificationServiceApi.md#validateMailingAddressPro) | **POST** /addressverification/v1/validatemailingaddresspro/results.json | ValidateMailingAddressPro
[**validateMailingAddressUSCAN**](AddressVerificationServiceApi.md#validateMailingAddressUSCAN) | **POST** /addressverification/v1/validatemailingaddressuscan/results.json | ValidateMailingAddressUSCAN


<a name="getCityStateProvince"></a>
# **getCityStateProvince**
> GetCityStateProvinceAPIResponse getCityStateProvince(inputAddress)

GetCityStateProvince

GetCityStateProvince returns a city and state/province for a given input postal code for U.S. and Canadian addresses.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.AddressVerificationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    AddressVerificationServiceApi apiInstance = new AddressVerificationServiceApi(defaultClient);
    GetCityStateProvinceAPIRequest inputAddress = new GetCityStateProvinceAPIRequest(); // GetCityStateProvinceAPIRequest | 
    try {
      GetCityStateProvinceAPIResponse result = apiInstance.getCityStateProvince(inputAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressVerificationServiceApi#getCityStateProvince");
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
 **inputAddress** | [**GetCityStateProvinceAPIRequest**](GetCityStateProvinceAPIRequest.md)|  |

### Return type

[**GetCityStateProvinceAPIResponse**](GetCityStateProvinceAPIResponse.md)

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

<a name="getPostalCodes"></a>
# **getPostalCodes**
> GetPostalCodesAPIResponse getPostalCodes(inputAddress)

GetPostalCodes

GetPostalCodes takes a city and state as input for U.S. addresses and returns the postal codes for that city.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.AddressVerificationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    AddressVerificationServiceApi apiInstance = new AddressVerificationServiceApi(defaultClient);
    GetPostalCodesAPIRequest inputAddress = new GetPostalCodesAPIRequest(); // GetPostalCodesAPIRequest | 
    try {
      GetPostalCodesAPIResponse result = apiInstance.getPostalCodes(inputAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressVerificationServiceApi#getPostalCodes");
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
 **inputAddress** | [**GetPostalCodesAPIRequest**](GetPostalCodesAPIRequest.md)|  |

### Return type

[**GetPostalCodesAPIResponse**](GetPostalCodesAPIResponse.md)

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

<a name="validateMailingAddress"></a>
# **validateMailingAddress**
> ValidateMailingAddressResponse validateMailingAddress(inputAddress)

ValidateMailingAddress

ValidateMailingAddress analyses and compares the input addresses against the known address databases around the world to output a standardized detail.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.AddressVerificationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    AddressVerificationServiceApi apiInstance = new AddressVerificationServiceApi(defaultClient);
    ValidateMailingAddressRequest inputAddress = new ValidateMailingAddressRequest(); // ValidateMailingAddressRequest | 
    try {
      ValidateMailingAddressResponse result = apiInstance.validateMailingAddress(inputAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressVerificationServiceApi#validateMailingAddress");
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
 **inputAddress** | [**ValidateMailingAddressRequest**](ValidateMailingAddressRequest.md)|  |

### Return type

[**ValidateMailingAddressResponse**](ValidateMailingAddressResponse.md)

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

<a name="validateMailingAddressPremium"></a>
# **validateMailingAddressPremium**
> ValidateMailingAddressPremiumResponse validateMailingAddressPremium(inputAddress)

ValidateMailingAddressPremium

ValidateMailing AddressPremium expands on the ValidateMailingAddressPro service by adding premium address data sources to get the best address validation result possible.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.AddressVerificationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    AddressVerificationServiceApi apiInstance = new AddressVerificationServiceApi(defaultClient);
    ValidateMailingAddressPremiumRequest inputAddress = new ValidateMailingAddressPremiumRequest(); // ValidateMailingAddressPremiumRequest | 
    try {
      ValidateMailingAddressPremiumResponse result = apiInstance.validateMailingAddressPremium(inputAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressVerificationServiceApi#validateMailingAddressPremium");
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
 **inputAddress** | [**ValidateMailingAddressPremiumRequest**](ValidateMailingAddressPremiumRequest.md)|  |

### Return type

[**ValidateMailingAddressPremiumResponse**](ValidateMailingAddressPremiumResponse.md)

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

<a name="validateMailingAddressPro"></a>
# **validateMailingAddressPro**
> ValidateMailingAddressProResponse validateMailingAddressPro(inputAddress)

ValidateMailingAddressPro

ValidateMailingAddressPro builds upon the ValidateMailingAddress service by using additional address databases so it can provide enhanced detail.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.AddressVerificationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    AddressVerificationServiceApi apiInstance = new AddressVerificationServiceApi(defaultClient);
    ValidateMailingAddressProRequest inputAddress = new ValidateMailingAddressProRequest(); // ValidateMailingAddressProRequest | 
    try {
      ValidateMailingAddressProResponse result = apiInstance.validateMailingAddressPro(inputAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressVerificationServiceApi#validateMailingAddressPro");
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
 **inputAddress** | [**ValidateMailingAddressProRequest**](ValidateMailingAddressProRequest.md)|  |

### Return type

[**ValidateMailingAddressProResponse**](ValidateMailingAddressProResponse.md)

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

<a name="validateMailingAddressUSCAN"></a>
# **validateMailingAddressUSCAN**
> ValidateMailingAddressUSCANAPIResponse validateMailingAddressUSCAN(inputAddress)

ValidateMailingAddressUSCAN

ValidateMailingAddressUSCAN analyses and compares the input addresses against the known address databases around the world to output a standardized detail for US and CANADAIt gives RDI and DPV also along with other US/CAN specific functionalities.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.AddressVerificationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    AddressVerificationServiceApi apiInstance = new AddressVerificationServiceApi(defaultClient);
    ValidateMailingAddressUSCANAPIRequest inputAddress = new ValidateMailingAddressUSCANAPIRequest(); // ValidateMailingAddressUSCANAPIRequest | 
    try {
      ValidateMailingAddressUSCANAPIResponse result = apiInstance.validateMailingAddressUSCAN(inputAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressVerificationServiceApi#validateMailingAddressUSCAN");
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
 **inputAddress** | [**ValidateMailingAddressUSCANAPIRequest**](ValidateMailingAddressUSCANAPIRequest.md)|  |

### Return type

[**ValidateMailingAddressUSCANAPIResponse**](ValidateMailingAddressUSCANAPIResponse.md)

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

