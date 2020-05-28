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
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.EmailVerificationServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

EmailVerificationServiceApi apiInstance = new EmailVerificationServiceApi();
ValidateEmailAddressAPIRequest inputEmailAddress = new ValidateEmailAddressAPIRequest(); // ValidateEmailAddressAPIRequest | 
try {
    ValidateEmailAddressAPIResponse result = apiInstance.validateEmailAddress(inputEmailAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailVerificationServiceApi#validateEmailAddress");
    e.printStackTrace();
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
 - **Accept**: application/json

