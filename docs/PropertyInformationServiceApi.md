# PropertyInformationServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGeoPropertyByAddress**](PropertyInformationServiceApi.md#getGeoPropertyByAddress) | **GET** /property/v1/all/attributes/byaddress | Get Property Attributes By Address
[**getGeoPropertyByAddressBatch**](PropertyInformationServiceApi.md#getGeoPropertyByAddressBatch) | **POST** /property/v1/all/attributes/byaddress | Post Property Attributes By Address
[**getParcelBoundaryByAddress**](PropertyInformationServiceApi.md#getParcelBoundaryByAddress) | **GET** /property/v1/parcelboundary/byaddress | Get Parcel Boundary By Address
[**getParcelBoundaryByLocation**](PropertyInformationServiceApi.md#getParcelBoundaryByLocation) | **GET** /property/v1/parcelboundary/bylocation | Get Parcel Boundary By Location
[**getPropertyAttributesByAddress**](PropertyInformationServiceApi.md#getPropertyAttributesByAddress) | **GET** /property/v2/attributes/byaddress | PropertyV2 Attributes By Address.
[**getPropertyAttributesByAddressBatch**](PropertyInformationServiceApi.md#getPropertyAttributesByAddressBatch) | **POST** /property/v2/attributes/byaddress | PropertyV2 Attributes By Address Batch.


<a name="getGeoPropertyByAddress"></a>
# **getGeoPropertyByAddress**
> GeoPropertyResponse getGeoPropertyByAddress(address)

Get Property Attributes By Address

Accepts address as input and returns property attributes for the matched address.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PropertyInformationServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi();
String address = "address_example"; // String | free form address text
try {
    GeoPropertyResponse result = apiInstance.getGeoPropertyByAddress(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyInformationServiceApi#getGeoPropertyByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text |

### Return type

[**GeoPropertyResponse**](GeoPropertyResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getGeoPropertyByAddressBatch"></a>
# **getGeoPropertyByAddressBatch**
> GeoPropertyResponses getGeoPropertyByAddressBatch(body)

Post Property Attributes By Address

This is a Batch offering for &#39;Property Attributes By Address&#39; service. It accepts a single address or a list of addresses and returns property attributes for the matched address.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PropertyInformationServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi();
GeoPropertyAddressRequest body = new GeoPropertyAddressRequest(); // GeoPropertyAddressRequest | 
try {
    GeoPropertyResponses result = apiInstance.getGeoPropertyByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyInformationServiceApi#getGeoPropertyByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeoPropertyAddressRequest**](GeoPropertyAddressRequest.md)|  | [optional]

### Return type

[**GeoPropertyResponses**](GeoPropertyResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getParcelBoundaryByAddress"></a>
# **getParcelBoundaryByAddress**
> ParcelBoundary getParcelBoundaryByAddress(address, accept)

Get Parcel Boundary By Address

Accepts address as input and returns property parcel boundary around that address.

### Example
```java
// Import classes:
//import com.precisely.ApiException;
//import com.precisely.apis.PropertyInformationServiceApi;


PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi();
String address = "address_example"; // String | free form address text
String accept = "accept_example"; // String | 
try {
    ParcelBoundary result = apiInstance.getParcelBoundaryByAddress(address, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyInformationServiceApi#getParcelBoundaryByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text |
 **accept** | **String**|  | [optional]

### Return type

[**ParcelBoundary**](ParcelBoundary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getParcelBoundaryByLocation"></a>
# **getParcelBoundaryByLocation**
> ParcelBoundary getParcelBoundaryByLocation(longitude, latitude, accept)

Get Parcel Boundary By Location

Accepts latitude/longitude as input and returns property parcel boundary around that location.

### Example
```java
// Import classes:
//import com.precisely.ApiException;
//import com.precisely.apis.PropertyInformationServiceApi;


PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi();
String longitude = "longitude_example"; // String | Longitude of Location
String latitude = "latitude_example"; // String | Latitude of Location
String accept = "accept_example"; // String | 
try {
    ParcelBoundary result = apiInstance.getParcelBoundaryByLocation(longitude, latitude, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyInformationServiceApi#getParcelBoundaryByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |
 **accept** | **String**|  | [optional]

### Return type

[**ParcelBoundary**](ParcelBoundary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getPropertyAttributesByAddress"></a>
# **getPropertyAttributesByAddress**
> PropertyInfoResponse getPropertyAttributesByAddress(address, attributeFilter)

PropertyV2 Attributes By Address.

GetPropertyAttributesbyAddress Endpoint will take address as an input and will return key property attributes in response. Optionally user will have the option to filter the attributes and will pay for only returned attributes.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PropertyInformationServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi();
String address = "address_example"; // String | free form address text
String attributeFilter = "attributeFilter_example"; // String | Case-insensitive comma separated values of property attributes. Response will contain only the input attributes.
try {
    PropertyInfoResponse result = apiInstance.getPropertyAttributesByAddress(address, attributeFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyInformationServiceApi#getPropertyAttributesByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text | [optional]
 **attributeFilter** | **String**| Case-insensitive comma separated values of property attributes. Response will contain only the input attributes. | [optional]

### Return type

[**PropertyInfoResponse**](PropertyInfoResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getPropertyAttributesByAddressBatch"></a>
# **getPropertyAttributesByAddressBatch**
> PropertyInfoResponses getPropertyAttributesByAddressBatch(body)

PropertyV2 Attributes By Address Batch.

GetPropertyAttributesbyAddressBatch Endpoint will take the list of addresses as an input and will return key property attributes for the given addresses in response. Optionally user will have the option to filter the attributes and will pay for only returned attributes.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PropertyInformationServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PropertyInformationServiceApi apiInstance = new PropertyInformationServiceApi();
PropertyInfoAddressRequest body = new PropertyInfoAddressRequest(); // PropertyInfoAddressRequest | 
try {
    PropertyInfoResponses result = apiInstance.getPropertyAttributesByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyInformationServiceApi#getPropertyAttributesByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PropertyInfoAddressRequest**](PropertyInfoAddressRequest.md)|  | [optional]

### Return type

[**PropertyInfoResponses**](PropertyInfoResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

