# PhoneVerificationServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validatephonenumber**](PhoneVerificationServiceApi.md#validatephonenumber) | **POST** /phoneverification/v2/validatephonenumber/results.json | Phone verification.


<a name="validatephonenumber"></a>
# **validatephonenumber**
> PhoneVerification validatephonenumber(validatePhoneNumberAPIRequest)

Phone verification.

This service accepts a phone number as input and returns details distinguishing landline and wireless numbers.

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
    ValidatePhoneNumberAPIRequest validatePhoneNumberAPIRequest = new ValidatePhoneNumberAPIRequest(); // ValidatePhoneNumberAPIRequest | 
    try {
      PhoneVerification result = apiInstance.validatephonenumber(validatePhoneNumberAPIRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneVerificationServiceApi#validatephonenumber");
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
 **validatePhoneNumberAPIRequest** | [**ValidatePhoneNumberAPIRequest**](ValidatePhoneNumberAPIRequest.md)|  |

### Return type

[**PhoneVerification**](PhoneVerification.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

