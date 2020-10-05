# AddressesAPIServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddressesByBoundaryName**](AddressesAPIServiceApi.md#getAddressesByBoundaryName) | **GET** /addresses/v1/address/byboundaryname | Addresses By Boundary Area.
[**getAddressesCountByBoundary**](AddressesAPIServiceApi.md#getAddressesCountByBoundary) | **POST** /addresses/v1/addresscount/byboundary | Address Counts by Boundary.
[**getAddressesCountByBoundaryName**](AddressesAPIServiceApi.md#getAddressesCountByBoundaryName) | **GET** /addresses/v1/addresscount/byboundaryname | Address Counts by Boundary Name.
[**getAddressesbyBoundary**](AddressesAPIServiceApi.md#getAddressesbyBoundary) | **POST** /addresses/v1/address/byboundary | Addresses by Boundary.


<a name="getAddressesByBoundaryName"></a>
# **getAddressesByBoundaryName**
> AddressesResponse getAddressesByBoundaryName(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page)

Addresses By Boundary Area.

This service accepts zip code, neighborhood, county, or city names, and returns all known &amp; valid addresses associated with these names.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.AddressesAPIServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

AddressesAPIServiceApi apiInstance = new AddressesAPIServiceApi();
String country = "country_example"; // String | Name of country. Acceptable values are CAN, USA.
String areaName1 = "areaName1_example"; // String | Specifies the largest geographical area, typically a state or province.
String areaName2 = "areaName2_example"; // String | Specifies the secondary geographic area, typically a county or district.
String areaName3 = "areaName3_example"; // String | Specifies a city or town name.
String areaName4 = "areaName4_example"; // String | Specifies a city subdivision or locality/neighborhood.
String postCode = "postCode_example"; // String | Specifies the postcode (ZIP code) in the appropriate format for the country.
String maxCandidates = "maxCandidates_example"; // String | Maximum number of addresses to be returned in response. Max. value is 100 for XML/JSON, and 2000 for CSV.
String page = "page_example"; // String | Response will indicate the page number.
try {
    AddressesResponse result = apiInstance.getAddressesByBoundaryName(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressesAPIServiceApi#getAddressesByBoundaryName");
    e.printStackTrace();
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

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getAddressesCountByBoundary"></a>
# **getAddressesCountByBoundary**
> AddressesCount getAddressesCountByBoundary(body)

Address Counts by Boundary.

This service accepts custom geographic boundaries or drivetimes &amp; drive distances, returns the total number of addresses within these boundaries.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.AddressesAPIServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

AddressesAPIServiceApi apiInstance = new AddressesAPIServiceApi();
AddressesByBoundaryRequest body = new AddressesByBoundaryRequest(); // AddressesByBoundaryRequest | 
try {
    AddressesCount result = apiInstance.getAddressesCountByBoundary(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressesAPIServiceApi#getAddressesCountByBoundary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddressesByBoundaryRequest**](AddressesByBoundaryRequest.md)|  | [optional]

### Return type

[**AddressesCount**](AddressesCount.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getAddressesCountByBoundaryName"></a>
# **getAddressesCountByBoundaryName**
> AddressesCount getAddressesCountByBoundaryName(country, areaName1, areaName2, areaName3, areaName4, postCode)

Address Counts by Boundary Name.

This service accepts zip code, neighborhood, county, or city names, and returns the total number of addresses associated with these names. 

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.AddressesAPIServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

AddressesAPIServiceApi apiInstance = new AddressesAPIServiceApi();
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
    System.err.println("Exception when calling AddressesAPIServiceApi#getAddressesCountByBoundaryName");
    e.printStackTrace();
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

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getAddressesbyBoundary"></a>
# **getAddressesbyBoundary**
> AddressesResponse getAddressesbyBoundary(body)

Addresses by Boundary.

This service accepts custom geographic boundaries or drivetimes &amp; drive distances, returns all known &amp; valid addresses within these boundaries.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.AddressesAPIServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

AddressesAPIServiceApi apiInstance = new AddressesAPIServiceApi();
AddressesByBoundaryRequest body = new AddressesByBoundaryRequest(); // AddressesByBoundaryRequest | 
try {
    AddressesResponse result = apiInstance.getAddressesbyBoundary(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressesAPIServiceApi#getAddressesbyBoundary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddressesByBoundaryRequest**](AddressesByBoundaryRequest.md)|  | [optional]

### Return type

[**AddressesResponse**](AddressesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

