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
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PhoneVerificationServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PhoneVerificationServiceApi apiInstance = new PhoneVerificationServiceApi();
String phoneNumber = "phoneNumber_example"; // String | E.164 formatted phone number. Accepts digits only. Country Code (1) optional for USA & CAN.
String includeNetworkInfo = "includeNetworkInfo_example"; // String | Y or N (default is Y) – if it is N, then network/carrier details will not be added in the response.
try {
    PhoneVerification result = apiInstance.phoneVerification(phoneNumber, includeNetworkInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneVerificationServiceApi#phoneVerification");
    e.printStackTrace();
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

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

