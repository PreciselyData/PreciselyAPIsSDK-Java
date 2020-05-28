# LocalTaxServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchTaxByAddress**](LocalTaxServiceApi.md#getBatchTaxByAddress) | **POST** /localtax/v1/tax/{taxRateTypeId}/byaddress | Post Tax By Address
[**getBatchTaxByLocation**](LocalTaxServiceApi.md#getBatchTaxByLocation) | **POST** /localtax/v1/tax/{taxRateTypeId}/bylocation | Post Tax By Location
[**getBatchTaxRateByAddress**](LocalTaxServiceApi.md#getBatchTaxRateByAddress) | **POST** /localtax/v1/taxrate/{taxRateTypeId}/byaddress | Post Taxrate By Address
[**getBatchTaxRateByLocation**](LocalTaxServiceApi.md#getBatchTaxRateByLocation) | **POST** /localtax/v1/taxrate/{taxRateTypeId}/bylocation | Post Taxrate By Location
[**getIPDTaxByAddress**](LocalTaxServiceApi.md#getIPDTaxByAddress) | **GET** /localtax/v1/taxdistrict/ipd/byaddress | Get IPD Tax by Address
[**getIPDTaxByAddressBatch**](LocalTaxServiceApi.md#getIPDTaxByAddressBatch) | **POST** /localtax/v1/taxdistrict/ipd/byaddress | Get IPD Tax for batch requests
[**getSpecificTaxByAddress**](LocalTaxServiceApi.md#getSpecificTaxByAddress) | **GET** /localtax/v1/tax/{taxRateTypeId}/byaddress | Get Tax By Address
[**getSpecificTaxByLocation**](LocalTaxServiceApi.md#getSpecificTaxByLocation) | **GET** /localtax/v1/tax/{taxRateTypeId}/bylocation | Get Tax By Location
[**getSpecificTaxRateByAddress**](LocalTaxServiceApi.md#getSpecificTaxRateByAddress) | **GET** /localtax/v1/taxrate/{taxRateTypeId}/byaddress | Get Taxrate By Address
[**getSpecificTaxRateByLocation**](LocalTaxServiceApi.md#getSpecificTaxRateByLocation) | **GET** /localtax/v1/taxrate/{taxRateTypeId}/bylocation | Get Taxrate By Location


<a name="getBatchTaxByAddress"></a>
# **getBatchTaxByAddress**
> TaxResponses getBatchTaxByAddress(taxRateTypeId, body)

Post Tax By Address

This is a Batch offering for &#39;Tax By Address&#39; service. It accepts a single address, purchase amount or a list of addresses, purchase amounts and retrieve applicable taxes.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.LocalTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LocalTaxServiceApi apiInstance = new LocalTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
TaxAddressRequest body = new TaxAddressRequest(); // TaxAddressRequest | TaxAddressRequest Class Object having tax request.
try {
    TaxResponses result = apiInstance.getBatchTaxByAddress(taxRateTypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalTaxServiceApi#getBatchTaxByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **body** | [**TaxAddressRequest**](TaxAddressRequest.md)| TaxAddressRequest Class Object having tax request. |

### Return type

[**TaxResponses**](TaxResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getBatchTaxByLocation"></a>
# **getBatchTaxByLocation**
> TaxLocationResponses getBatchTaxByLocation(taxRateTypeId, body)

Post Tax By Location

This is a Batch offering for &#39;Tax By Location&#39; service. It accepts a single location coordinate, purchase amount or a list of location coordinates, purchase amounts and retrieve applicable tax.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.LocalTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LocalTaxServiceApi apiInstance = new LocalTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
TaxLocationRequest body = new TaxLocationRequest(); // TaxLocationRequest | TaxAddressRequest Class Object having tax request.
try {
    TaxLocationResponses result = apiInstance.getBatchTaxByLocation(taxRateTypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalTaxServiceApi#getBatchTaxByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **body** | [**TaxLocationRequest**](TaxLocationRequest.md)| TaxAddressRequest Class Object having tax request. |

### Return type

[**TaxLocationResponses**](TaxLocationResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getBatchTaxRateByAddress"></a>
# **getBatchTaxRateByAddress**
> TaxRateResponses getBatchTaxRateByAddress(taxRateTypeId, body)

Post Taxrate By Address

This is a Batch offering for &#39;Taxrate By Address&#39; service. It accepts a single address or a list of addresses and retrieve applicable tax rates.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.LocalTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LocalTaxServiceApi apiInstance = new LocalTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
TaxRateAddressRequest body = new TaxRateAddressRequest(); // TaxRateAddressRequest | TaxRateAddressRequest Class Object having tax rate request.
try {
    TaxRateResponses result = apiInstance.getBatchTaxRateByAddress(taxRateTypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalTaxServiceApi#getBatchTaxRateByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **body** | [**TaxRateAddressRequest**](TaxRateAddressRequest.md)| TaxRateAddressRequest Class Object having tax rate request. |

### Return type

[**TaxRateResponses**](TaxRateResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getBatchTaxRateByLocation"></a>
# **getBatchTaxRateByLocation**
> TaxRateLocationResponses getBatchTaxRateByLocation(taxRateTypeId, body)

Post Taxrate By Location

This is a Batch offering for &#39;Taxrate By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve applicable tax rates.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.LocalTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LocalTaxServiceApi apiInstance = new LocalTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
TaxRateLocationRequest body = new TaxRateLocationRequest(); // TaxRateLocationRequest | TaxRateLocationRequest Class Object having tax rate request.
try {
    TaxRateLocationResponses result = apiInstance.getBatchTaxRateByLocation(taxRateTypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalTaxServiceApi#getBatchTaxRateByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **body** | [**TaxRateLocationRequest**](TaxRateLocationRequest.md)| TaxRateLocationRequest Class Object having tax rate request. |

### Return type

[**TaxRateLocationResponses**](TaxRateLocationResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getIPDTaxByAddress"></a>
# **getIPDTaxByAddress**
> TaxDistrictResponse getIPDTaxByAddress(address, returnLatLongFields, latLongFormat)

Get IPD Tax by Address

This will accept &#39;address&#39; as a parameter and will return one or many IPDs details for that region in which address will fall.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.LocalTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LocalTaxServiceApi apiInstance = new LocalTaxServiceApi();
String address = "address_example"; // String | The address to be searched.
String returnLatLongFields = "returnLatLongFields_example"; // String | Y or N (default is N) - Returns Latitude Longitude Fields
String latLongFormat = "latLongFormat_example"; // String | (default is Decimal) - Returns Desired Latitude Longitude Format
try {
    TaxDistrictResponse result = apiInstance.getIPDTaxByAddress(address, returnLatLongFields, latLongFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalTaxServiceApi#getIPDTaxByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address to be searched. |
 **returnLatLongFields** | **String**| Y or N (default is N) - Returns Latitude Longitude Fields | [optional] [enum: Y, N]
 **latLongFormat** | **String**| (default is Decimal) - Returns Desired Latitude Longitude Format | [optional] [enum: PreZero, PreZeroDecimal, Decimal, DecimalAssumed]

### Return type

[**TaxDistrictResponse**](TaxDistrictResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getIPDTaxByAddressBatch"></a>
# **getIPDTaxByAddressBatch**
> TaxDistrictResponseList getIPDTaxByAddressBatch(body)

Get IPD Tax for batch requests

Get IPD Tax for batch requests

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.LocalTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LocalTaxServiceApi apiInstance = new LocalTaxServiceApi();
IPDTaxByAddressBatchRequest body = new IPDTaxByAddressBatchRequest(); // IPDTaxByAddressBatchRequest | IPDTaxByAddressBatchRequest Class Object having IPD tax request
try {
    TaxDistrictResponseList result = apiInstance.getIPDTaxByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalTaxServiceApi#getIPDTaxByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPDTaxByAddressBatchRequest**](IPDTaxByAddressBatchRequest.md)| IPDTaxByAddressBatchRequest Class Object having IPD tax request |

### Return type

[**TaxDistrictResponseList**](TaxDistrictResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getSpecificTaxByAddress"></a>
# **getSpecificTaxByAddress**
> TaxResponse getSpecificTaxByAddress(taxRateTypeId, address, purchaseAmount)

Get Tax By Address

This service calculates and returns taxes applicable at a specific address. Address, purchase amount and supported tax rate type are inputs to the service.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.LocalTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LocalTaxServiceApi apiInstance = new LocalTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
String address = "address_example"; // String | The address to be searched.
String purchaseAmount = "purchaseAmount_example"; // String | The amount on which tax to be calculated.
try {
    TaxResponse result = apiInstance.getSpecificTaxByAddress(taxRateTypeId, address, purchaseAmount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalTaxServiceApi#getSpecificTaxByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **address** | **String**| The address to be searched. |
 **purchaseAmount** | **String**| The amount on which tax to be calculated. |

### Return type

[**TaxResponse**](TaxResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getSpecificTaxByLocation"></a>
# **getSpecificTaxByLocation**
> TaxResponse getSpecificTaxByLocation(taxRateTypeId, latitude, longitude, purchaseAmount)

Get Tax By Location

This service calculates and returns tax applicable at a specific location. Longitude, latitude, purchase amount and supported tax rate type are inputs to the service.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.LocalTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LocalTaxServiceApi apiInstance = new LocalTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
String latitude = "latitude_example"; // String | Latitude of the location.
String longitude = "longitude_example"; // String | Longitude of the location.
String purchaseAmount = "purchaseAmount_example"; // String | The amount on which tax to be calculated.
try {
    TaxResponse result = apiInstance.getSpecificTaxByLocation(taxRateTypeId, latitude, longitude, purchaseAmount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalTaxServiceApi#getSpecificTaxByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **latitude** | **String**| Latitude of the location. |
 **longitude** | **String**| Longitude of the location. |
 **purchaseAmount** | **String**| The amount on which tax to be calculated. |

### Return type

[**TaxResponse**](TaxResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getSpecificTaxRateByAddress"></a>
# **getSpecificTaxRateByAddress**
> TaxRateResponse getSpecificTaxRateByAddress(taxRateTypeId, address)

Get Taxrate By Address

Retrieves tax rates applicable to a specific address. This service accepts address and supported tax rate type as inputs to retrieve applicable tax rates.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.LocalTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LocalTaxServiceApi apiInstance = new LocalTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
String address = "address_example"; // String | The address to be searched.
try {
    TaxRateResponse result = apiInstance.getSpecificTaxRateByAddress(taxRateTypeId, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalTaxServiceApi#getSpecificTaxRateByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **address** | **String**| The address to be searched. |

### Return type

[**TaxRateResponse**](TaxRateResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getSpecificTaxRateByLocation"></a>
# **getSpecificTaxRateByLocation**
> TaxRateResponse getSpecificTaxRateByLocation(taxRateTypeId, latitude, longitude)

Get Taxrate By Location

Retrieves tax rates applicable to a specific location. This service accepts longitude, latitude and supported tax rate type as inputs to retrieve applicable tax rates.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.LocalTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LocalTaxServiceApi apiInstance = new LocalTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
String latitude = "latitude_example"; // String | Latitude of the location.
String longitude = "longitude_example"; // String | Longitude of the location.
try {
    TaxRateResponse result = apiInstance.getSpecificTaxRateByLocation(taxRateTypeId, latitude, longitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalTaxServiceApi#getSpecificTaxRateByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **latitude** | **String**| Latitude of the location. |
 **longitude** | **String**| Longitude of the location. |

### Return type

[**TaxRateResponse**](TaxRateResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

