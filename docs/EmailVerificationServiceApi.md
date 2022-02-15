# EmailVerificationServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validateEmailAddress**](EmailVerificationServiceApi.md#validateEmailAddress) | **POST** /emailverification/v1/validateemailaddress/results.json | ValidateEmailAddress


<a name="validateEmailAddress"></a>
# **validateEmailAddress**
> ValidateEmailAddressAPIResponse validateEmailAddress(inputEmailAddress)

ValidateEmailAddress

Confirm that your customer’s mailing address exists and that mail and packages can be delivered to it.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.EmailVerificationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    EmailVerificationServiceApi apiInstance = new EmailVerificationServiceApi(defaultClient);
    ValidateEmailAddressAPIRequest inputEmailAddress = new ValidateEmailAddressAPIRequest(); // ValidateEmailAddressAPIRequest | 
    try {
      ValidateEmailAddressAPIResponse result = apiInstance.validateEmailAddress(inputEmailAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailVerificationServiceApi#validateEmailAddress");
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
 **inputEmailAddress** | [**ValidateEmailAddressAPIRequest**](ValidateEmailAddressAPIRequest.md)|  |

### Return type

[**ValidateEmailAddressAPIResponse**](ValidateEmailAddressAPIResponse.md)

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

