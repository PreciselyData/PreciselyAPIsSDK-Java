# DemographicsServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDemographicsByAddressV2**](DemographicsServiceApi.md#getDemographicsByAddressV2) | **GET** /demographics-segmentation/v1/demographics/byaddress | Demographics By Address.
[**getDemographicsByLocationV2**](DemographicsServiceApi.md#getDemographicsByLocationV2) | **GET** /demographics-segmentation/v1/demographics/bylocation | Demographics By Location.
[**getSegmentationByAddress**](DemographicsServiceApi.md#getSegmentationByAddress) | **GET** /demographics-segmentation/v1/segmentation/byaddress | Segmentation By Address.
[**getSegmentationByLocation**](DemographicsServiceApi.md#getSegmentationByLocation) | **GET** /demographics-segmentation/v1/segmentation/bylocation | Segmentation By Location.


<a name="getDemographicsByAddressV2"></a>
# **getDemographicsByAddressV2**
> DemographicsV2 getDemographicsByAddressV2(address, country, profile, filter, valueFormat, variableLevel)

Demographics By Address.

Provides the demographic details around a specified address. GeoLife &#39;byaddress&#39; service accepts address as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.DemographicsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

DemographicsServiceApi apiInstance = new DemographicsServiceApi();
String address = "address_example"; // String | The address to be searched.
String country = "country_example"; // String | 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,AUS.
String profile = "profile_example"; // String | Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending
String filter = "filter_example"; // String | The 'filter' parameter retrieves the demographic data based upon specified input themes.
String valueFormat = "PercentAsAvailable"; // String | The 'valueFormat' parameter is applicable for few ranged variables where percent & count both are available and filter response based on the input value.
String variableLevel = "Key"; // String | The 'variableLevel' retrieves demographic facts in response based on the input value
try {
    DemographicsV2 result = apiInstance.getDemographicsByAddressV2(address, country, profile, filter, valueFormat, variableLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DemographicsServiceApi#getDemographicsByAddressV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address to be searched. |
 **country** | **String**| 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,AUS. | [optional] [enum: USA, CAN, GBR, FRA, IND, ITA, AUS, DEU.]
 **profile** | **String**| Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending | [optional] [enum: Top5Ascending, Top5Descending, Top3Ascending, Top3Descending]
 **filter** | **String**| The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. | [optional]
 **valueFormat** | **String**| The &#39;valueFormat&#39; parameter is applicable for few ranged variables where percent &amp; count both are available and filter response based on the input value. | [optional] [default to PercentAsAvailable] [enum: PercentAsAvailable, CountOnly, Both]
 **variableLevel** | **String**| The &#39;variableLevel&#39; retrieves demographic facts in response based on the input value | [optional] [default to Key] [enum: Key, Detailed, Advanced, All]

### Return type

[**DemographicsV2**](DemographicsV2.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDemographicsByLocationV2"></a>
# **getDemographicsByLocationV2**
> DemographicsV2 getDemographicsByLocationV2(longitude, latitude, profile, filter, valueFormat, variableLevel)

Demographics By Location.

Provides the demographic details around a specified location. GeoLife &#39;bylocation&#39; service accepts longitude and latitude as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.DemographicsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

DemographicsServiceApi apiInstance = new DemographicsServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String profile = "profile_example"; // String | Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by location) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending
String filter = "filter_example"; // String | The 'filter' parameter retrieves the demographic data based upon specified input themes.
String valueFormat = "PercentAsAvailable"; // String | The 'valueFormat' parameter is applicable for few ranged variables where percent & count both are available and filter response based on the input value.
String variableLevel = "Key"; // String | The 'variableLevel' retrieves demographic facts in response based on the input value
try {
    DemographicsV2 result = apiInstance.getDemographicsByLocationV2(longitude, latitude, profile, filter, valueFormat, variableLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DemographicsServiceApi#getDemographicsByLocationV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **profile** | **String**| Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by location) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending | [optional] [enum: Top5Ascending, Top5Descending, Top3Ascending, Top3Descending]
 **filter** | **String**| The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. | [optional]
 **valueFormat** | **String**| The &#39;valueFormat&#39; parameter is applicable for few ranged variables where percent &amp; count both are available and filter response based on the input value. | [optional] [default to PercentAsAvailable] [enum: PercentAsAvailable, CountOnly, Both]
 **variableLevel** | **String**| The &#39;variableLevel&#39; retrieves demographic facts in response based on the input value | [optional] [default to Key] [enum: Key, Detailed, Advanced, All]

### Return type

[**DemographicsV2**](DemographicsV2.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getSegmentationByAddress"></a>
# **getSegmentationByAddress**
> Segmentation getSegmentationByAddress(address, country)

Segmentation By Address.

Provides the segmentation details around a specified address. GeoLife &#39;Segmentation by Address&#39; service accepts address as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.DemographicsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

DemographicsServiceApi apiInstance = new DemographicsServiceApi();
String address = "address_example"; // String | The address to be searched.
String country = "country_example"; // String | 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,ITA,AUS,DEU.
try {
    Segmentation result = apiInstance.getSegmentationByAddress(address, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DemographicsServiceApi#getSegmentationByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address to be searched. |
 **country** | **String**| 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,ITA,AUS,DEU. | [optional] [enum: USA, CAN, GBR, FRA, ITA, AUS, DEU]

### Return type

[**Segmentation**](Segmentation.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getSegmentationByLocation"></a>
# **getSegmentationByLocation**
> Segmentation getSegmentationByLocation(longitude, latitude)

Segmentation By Location.

Provides the segmentation details around a specified location. GeoLife &#39;segmentation bylocation&#39; service accepts longitude and latitude as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.DemographicsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

DemographicsServiceApi apiInstance = new DemographicsServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
try {
    Segmentation result = apiInstance.getSegmentationByLocation(longitude, latitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DemographicsServiceApi#getSegmentationByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |

### Return type

[**Segmentation**](Segmentation.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

