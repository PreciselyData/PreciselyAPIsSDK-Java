# PhoneVerificationServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**phoneVerification**](PhoneVerificationServiceApi.md#phoneVerification) | **GET** /phoneverification/v1/phoneverification | Phone verification.


<a name="phoneVerification"></a>
# **phoneVerification**
> PhoneVerification phoneVerification(phoneNumber, includeNetworkInfo)

Phone verification.

This service accepts a phone number as input and returns details distinguishing landline and wireless numbers and also checks if a wireless number can be located.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PhoneVerificationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PhoneVerificationServiceApi apiInstance = new PhoneVerificationServiceApi(defaultClient);
    String phoneNumber = "phoneNumber_example"; // String | E.164 formatted phone number. Accepts digits only. Country Code (1) optional for USA & CAN.
    String includeNetworkInfo = "includeNetworkInfo_example"; // String | Y or N (default is Y) – if it is N, then network/carrier details will not be added in the response.
    try {
      PhoneVerification result = apiInstance.phoneVerification(phoneNumber, includeNetworkInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneVerificationServiceApi#phoneVerification");
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
 **phoneNumber** | **String**| E.164 formatted phone number. Accepts digits only. Country Code (1) optional for USA &amp; CAN. |
 **includeNetworkInfo** | **String**| Y or N (default is Y) – if it is N, then network/carrier details will not be added in the response. | [optional]

### Return type

[**PhoneVerification**](PhoneVerification.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

