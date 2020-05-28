# RisksServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrimeRiskByAddress**](RisksServiceApi.md#getCrimeRiskByAddress) | **GET** /risks/v1/crime/byaddress | Get Crime Risk By Address
[**getCrimeRiskByAddressBatch**](RisksServiceApi.md#getCrimeRiskByAddressBatch) | **POST** /risks/v1/crime/byaddress | Post Crime Risk By Address
[**getCrimeRiskByLocation**](RisksServiceApi.md#getCrimeRiskByLocation) | **GET** /risks/v1/crime/bylocation | Get Crime Risk By Location
[**getCrimeRiskByLocationBatch**](RisksServiceApi.md#getCrimeRiskByLocationBatch) | **POST** /risks/v1/crime/bylocation | Post Crime Risk By Location
[**getDistanceToFloodHazardByAddress**](RisksServiceApi.md#getDistanceToFloodHazardByAddress) | **GET** /risks/v1/shoreline/distancetofloodhazard/byaddress | Get Distance To Flood Hazard By Address
[**getDistanceToFloodHazardByAddressBatch**](RisksServiceApi.md#getDistanceToFloodHazardByAddressBatch) | **POST** /risks/v1/shoreline/distancetofloodhazard/byaddress | Post Distance To Flood Hazard By Address
[**getDistanceToFloodHazardByLocation**](RisksServiceApi.md#getDistanceToFloodHazardByLocation) | **GET** /risks/v1/shoreline/distancetofloodhazard/bylocation | Get Distance To Flood Hazard By Location
[**getDistanceToFloodHazardByLocationBatch**](RisksServiceApi.md#getDistanceToFloodHazardByLocationBatch) | **POST** /risks/v1/shoreline/distancetofloodhazard/bylocation | Post Distance To Flood Hazard By Location
[**getEarthquakeHistory**](RisksServiceApi.md#getEarthquakeHistory) | **GET** /risks/v1/earthquakehistory | Earthquake History
[**getEarthquakeRiskByAddress**](RisksServiceApi.md#getEarthquakeRiskByAddress) | **GET** /risks/v1/earthquake/byaddress | Get Earthquake Risk By Address
[**getEarthquakeRiskByAddressBatch**](RisksServiceApi.md#getEarthquakeRiskByAddressBatch) | **POST** /risks/v1/earthquake/byaddress | Post Earthquake Risk By Address
[**getEarthquakeRiskByLocation**](RisksServiceApi.md#getEarthquakeRiskByLocation) | **GET** /risks/v1/earthquake/bylocation | Get Earthquake Risk By Location
[**getEarthquakeRiskByLocationBatch**](RisksServiceApi.md#getEarthquakeRiskByLocationBatch) | **POST** /risks/v1/earthquake/bylocation | Post Earthquake Risk By Location
[**getFireHistory**](RisksServiceApi.md#getFireHistory) | **GET** /risks/v1/firehistory | Get Fire History
[**getFireRiskByAddress**](RisksServiceApi.md#getFireRiskByAddress) | **GET** /risks/v1/fire/byaddress | Get Fire Risk By Address
[**getFireRiskByAddressBatch**](RisksServiceApi.md#getFireRiskByAddressBatch) | **POST** /risks/v1/fire/byaddress | Post Fire Risk By Address
[**getFireRiskByLocation**](RisksServiceApi.md#getFireRiskByLocation) | **GET** /risks/v1/fire/bylocation | Get Fire Risk By Location
[**getFireRiskByLocationBatch**](RisksServiceApi.md#getFireRiskByLocationBatch) | **POST** /risks/v1/fire/bylocation | Post Fire Risk By Location
[**getFireStationByAddress**](RisksServiceApi.md#getFireStationByAddress) | **GET** /risks/v1/firestation/byaddress | Fire Station By Address
[**getFireStationByLocation**](RisksServiceApi.md#getFireStationByLocation) | **GET** /risks/v1/firestation/bylocation | Fire Station By Location
[**getFloodRiskByAddress**](RisksServiceApi.md#getFloodRiskByAddress) | **GET** /risks/v1/flood/byaddress | Get Flood Risk By Address
[**getFloodRiskByAddressBatch**](RisksServiceApi.md#getFloodRiskByAddressBatch) | **POST** /risks/v1/flood/byaddress | Post Flood Risk By Address
[**getFloodRiskByLocation**](RisksServiceApi.md#getFloodRiskByLocation) | **GET** /risks/v1/flood/bylocation | Get Flood Risk By Location
[**getFloodRiskByLocationBatch**](RisksServiceApi.md#getFloodRiskByLocationBatch) | **POST** /risks/v1/flood/bylocation | Post Flood Risk By Location


<a name="getCrimeRiskByAddress"></a>
# **getCrimeRiskByAddress**
> CrimeRiskResponse getCrimeRiskByAddress(address, type, includeGeometry)

Get Crime Risk By Address

Accepts addresses as input and Returns local crime indexes.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String address = "address_example"; // String | Free-form address text.
String type = "type_example"; // String | Type of crime like violent crime, property crime, etc., multiple crime type indexes could be requested as comma separated values with 'all' as default.)
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    CrimeRiskResponse result = apiInstance.getCrimeRiskByAddress(address, type, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getCrimeRiskByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Free-form address text. |
 **type** | **String**| Type of crime like violent crime, property crime, etc., multiple crime type indexes could be requested as comma separated values with &#39;all&#39; as default.) | [optional] [enum: all, violent, property, murder, rape, robbery, assault, burglary, larceny, motorvehicletheft, arson]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**CrimeRiskResponse**](CrimeRiskResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getCrimeRiskByAddressBatch"></a>
# **getCrimeRiskByAddressBatch**
> CrimeRiskResponseList getCrimeRiskByAddressBatch(body)

Post Crime Risk By Address

This is a Batch offering for &#39;Crime Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve local crime indexes.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
CrimeRiskByAddressRequest body = new CrimeRiskByAddressRequest(); // CrimeRiskByAddressRequest | 
try {
    CrimeRiskResponseList result = apiInstance.getCrimeRiskByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getCrimeRiskByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrimeRiskByAddressRequest**](CrimeRiskByAddressRequest.md)|  | [optional]

### Return type

[**CrimeRiskResponseList**](CrimeRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getCrimeRiskByLocation"></a>
# **getCrimeRiskByLocation**
> CrimeRiskLocationResponse getCrimeRiskByLocation(longitude, latitude, type, includeGeometry)

Get Crime Risk By Location

Returns the crime data or crime indexes for a given location.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String longitude = "longitude_example"; // String | The longitude of the location
String latitude = "latitude_example"; // String | The latitude of the location
String type = "type_example"; // String | Refers to crime type. Valid values are following 11 crime types with 'all' as default (more than one can also be given as comma separated types)
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    CrimeRiskLocationResponse result = apiInstance.getCrimeRiskByLocation(longitude, latitude, type, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getCrimeRiskByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| The longitude of the location |
 **latitude** | **String**| The latitude of the location |
 **type** | **String**| Refers to crime type. Valid values are following 11 crime types with &#39;all&#39; as default (more than one can also be given as comma separated types) | [optional] [enum: all, violent, property, murder, rape, robbery, assault, burglary, larceny, motorvehicletheft, arson]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**CrimeRiskLocationResponse**](CrimeRiskLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getCrimeRiskByLocationBatch"></a>
# **getCrimeRiskByLocationBatch**
> CrimeRiskLocationResponseList getCrimeRiskByLocationBatch(body)

Post Crime Risk By Location

This is a Batch offering for &#39;Crime Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve local crime indexes.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
CrimeRiskByLocationRequest body = new CrimeRiskByLocationRequest(); // CrimeRiskByLocationRequest | 
try {
    CrimeRiskLocationResponseList result = apiInstance.getCrimeRiskByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getCrimeRiskByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrimeRiskByLocationRequest**](CrimeRiskByLocationRequest.md)|  | [optional]

### Return type

[**CrimeRiskLocationResponseList**](CrimeRiskLocationResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDistanceToFloodHazardByAddress"></a>
# **getDistanceToFloodHazardByAddress**
> WaterBodyResponse getDistanceToFloodHazardByAddress(address, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit)

Get Distance To Flood Hazard By Address

Accepts addresses as input and Returns the distance from nearest water bodies along with body name and location.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String address = "address_example"; // String | The address of the location
String maxCandidates = "maxCandidates_example"; // String | This specifies the value of maxCandidates
String waterBodyType = "waterBodyType_example"; // String | all (default value), oceanandsea,lake,others,unknown,intermittent
String searchDistance = "searchDistance_example"; // String | This specifies the search distance
String searchDistanceUnit = "searchDistanceUnit_example"; // String | miles (default value),feet, kilometers, meters
try {
    WaterBodyResponse result = apiInstance.getDistanceToFloodHazardByAddress(address, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getDistanceToFloodHazardByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address of the location |
 **maxCandidates** | **String**| This specifies the value of maxCandidates | [optional]
 **waterBodyType** | **String**| all (default value), oceanandsea,lake,others,unknown,intermittent | [optional]
 **searchDistance** | **String**| This specifies the search distance | [optional]
 **searchDistanceUnit** | **String**| miles (default value),feet, kilometers, meters | [optional]

### Return type

[**WaterBodyResponse**](WaterBodyResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDistanceToFloodHazardByAddressBatch"></a>
# **getDistanceToFloodHazardByAddressBatch**
> DistanceToFloodHazardResponse getDistanceToFloodHazardByAddressBatch(body)

Post Distance To Flood Hazard By Address

This is a Batch offering for &#39;Distance To Flood Hazard By Address&#39; service. It accepts a single address or a list of addresses and retrieve the distance from nearest water bodies along with body name and location.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
DistanceToFloodHazardAddressRequest body = new DistanceToFloodHazardAddressRequest(); // DistanceToFloodHazardAddressRequest | 
try {
    DistanceToFloodHazardResponse result = apiInstance.getDistanceToFloodHazardByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getDistanceToFloodHazardByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DistanceToFloodHazardAddressRequest**](DistanceToFloodHazardAddressRequest.md)|  | [optional]

### Return type

[**DistanceToFloodHazardResponse**](DistanceToFloodHazardResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDistanceToFloodHazardByLocation"></a>
# **getDistanceToFloodHazardByLocation**
> WaterBodyLocationResponse getDistanceToFloodHazardByLocation(longitude, latitude, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit)

Get Distance To Flood Hazard By Location

Accepts latitude &amp; longitude as input and Returns the distance from nearest water bodies along with body name and location.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String longitude = "longitude_example"; // String | The longitude of the location
String latitude = "latitude_example"; // String | The latitude of the location
String maxCandidates = "maxCandidates_example"; // String | This specifies the value of maxCandidates
String waterBodyType = "waterBodyType_example"; // String | all (default value), oceanandsea,lake,others,unknown,intermittent
String searchDistance = "searchDistance_example"; // String | This specifies the search distance
String searchDistanceUnit = "searchDistanceUnit_example"; // String | miles (default value),feet, kilometers, meters
try {
    WaterBodyLocationResponse result = apiInstance.getDistanceToFloodHazardByLocation(longitude, latitude, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getDistanceToFloodHazardByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| The longitude of the location |
 **latitude** | **String**| The latitude of the location |
 **maxCandidates** | **String**| This specifies the value of maxCandidates | [optional]
 **waterBodyType** | **String**| all (default value), oceanandsea,lake,others,unknown,intermittent | [optional]
 **searchDistance** | **String**| This specifies the search distance | [optional]
 **searchDistanceUnit** | **String**| miles (default value),feet, kilometers, meters | [optional]

### Return type

[**WaterBodyLocationResponse**](WaterBodyLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDistanceToFloodHazardByLocationBatch"></a>
# **getDistanceToFloodHazardByLocationBatch**
> DistanceToFloodHazardLocationResponse getDistanceToFloodHazardByLocationBatch(body)

Post Distance To Flood Hazard By Location

This is a Batch offering for &#39;Distance To Flood Hazard By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve the distance from nearest water bodies along with body name and location.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
DistanceToFloodHazardLocationRequest body = new DistanceToFloodHazardLocationRequest(); // DistanceToFloodHazardLocationRequest | 
try {
    DistanceToFloodHazardLocationResponse result = apiInstance.getDistanceToFloodHazardByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getDistanceToFloodHazardByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DistanceToFloodHazardLocationRequest**](DistanceToFloodHazardLocationRequest.md)|  | [optional]

### Return type

[**DistanceToFloodHazardLocationResponse**](DistanceToFloodHazardLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEarthquakeHistory"></a>
# **getEarthquakeHistory**
> EarthquakeHistory getEarthquakeHistory(postCode, startDate, endDate, minMagnitude, maxMagnitude, maxCandidates)

Earthquake History

Accepts postcode as input and Returns historical earthquake details for a particular postcode.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String postCode = "postCode_example"; // String | 5 digit Postal code to search
String startDate = "startDate_example"; // String | Start time in milliseconds(UTC)
String endDate = "endDate_example"; // String | End time in milliseconds(UTC)
String minMagnitude = "minMagnitude_example"; // String | Minimum richter scale magnitude
String maxMagnitude = "maxMagnitude_example"; // String | Maximum Richter scale magnitude
String maxCandidates = "1"; // String | Maximum response events
try {
    EarthquakeHistory result = apiInstance.getEarthquakeHistory(postCode, startDate, endDate, minMagnitude, maxMagnitude, maxCandidates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getEarthquakeHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postCode** | **String**| 5 digit Postal code to search |
 **startDate** | **String**| Start time in milliseconds(UTC) | [optional]
 **endDate** | **String**| End time in milliseconds(UTC) | [optional]
 **minMagnitude** | **String**| Minimum richter scale magnitude | [optional]
 **maxMagnitude** | **String**| Maximum Richter scale magnitude | [optional]
 **maxCandidates** | **String**| Maximum response events | [optional] [default to 1]

### Return type

[**EarthquakeHistory**](EarthquakeHistory.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEarthquakeRiskByAddress"></a>
# **getEarthquakeRiskByAddress**
> EarthquakeRiskResponse getEarthquakeRiskByAddress(address, richterValue, includeGeometry)

Get Earthquake Risk By Address

Accepts addresses as input and Returns counts of earthquakes for various richter measurements and values.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String address = "address_example"; // String | Free-form address text
String richterValue = "richterValue_example"; // String | Richter values like R5 (count of richter scale 5 events), R7 (count of richter scale 7 events), R6_GE (count of events >= richter scale 6), etc., multiple richter scales could be requested as comma separated values with 'all' as default. Valid values: All (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    EarthquakeRiskResponse result = apiInstance.getEarthquakeRiskByAddress(address, richterValue, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getEarthquakeRiskByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Free-form address text |
 **richterValue** | **String**| Richter values like R5 (count of richter scale 5 events), R7 (count of richter scale 7 events), R6_GE (count of events &gt;&#x3D; richter scale 6), etc., multiple richter scales could be requested as comma separated values with &#39;all&#39; as default. Valid values: All (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE | [optional] [enum: all, R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**EarthquakeRiskResponse**](EarthquakeRiskResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEarthquakeRiskByAddressBatch"></a>
# **getEarthquakeRiskByAddressBatch**
> EarthquakeRiskResponseList getEarthquakeRiskByAddressBatch(body)

Post Earthquake Risk By Address

This is a Batch offering for &#39;Earthquake Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve counts of earthquakes for various richter measurements and values.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
EarthquakeRiskByAddressRequest body = new EarthquakeRiskByAddressRequest(); // EarthquakeRiskByAddressRequest | 
try {
    EarthquakeRiskResponseList result = apiInstance.getEarthquakeRiskByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getEarthquakeRiskByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EarthquakeRiskByAddressRequest**](EarthquakeRiskByAddressRequest.md)|  | [optional]

### Return type

[**EarthquakeRiskResponseList**](EarthquakeRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEarthquakeRiskByLocation"></a>
# **getEarthquakeRiskByLocation**
> EarthquakeRiskLocationResponse getEarthquakeRiskByLocation(longitude, latitude, richterValue, includeGeometry)

Get Earthquake Risk By Location

Accepts latitude &amp; longitude as input and Returns counts of earthquakes for various richter measurements and values.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String longitude = "longitude_example"; // String | The longitude of the location
String latitude = "latitude_example"; // String | The latitude of the location
String richterValue = "richterValue_example"; // String | Richter values like R5 (count of richter scale 5 events), R7 (count of richter scale 7 events), R6_GE (count of events >= richter scale 6), etc., multiple richter scales could be requested as comma separated values with 'all' as default. Valid values: All (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    EarthquakeRiskLocationResponse result = apiInstance.getEarthquakeRiskByLocation(longitude, latitude, richterValue, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getEarthquakeRiskByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| The longitude of the location |
 **latitude** | **String**| The latitude of the location |
 **richterValue** | **String**| Richter values like R5 (count of richter scale 5 events), R7 (count of richter scale 7 events), R6_GE (count of events &gt;&#x3D; richter scale 6), etc., multiple richter scales could be requested as comma separated values with &#39;all&#39; as default. Valid values: All (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE | [optional] [enum: all, R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**EarthquakeRiskLocationResponse**](EarthquakeRiskLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEarthquakeRiskByLocationBatch"></a>
# **getEarthquakeRiskByLocationBatch**
> EarthquakeRiskLocationResponseList getEarthquakeRiskByLocationBatch(body)

Post Earthquake Risk By Location

This is a Batch offering for &#39;Earthquake Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve counts of earthquakes for various richter measurements and values.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
EarthquakeRiskByLocationRequest body = new EarthquakeRiskByLocationRequest(); // EarthquakeRiskByLocationRequest | 
try {
    EarthquakeRiskLocationResponseList result = apiInstance.getEarthquakeRiskByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getEarthquakeRiskByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EarthquakeRiskByLocationRequest**](EarthquakeRiskByLocationRequest.md)|  | [optional]

### Return type

[**EarthquakeRiskLocationResponseList**](EarthquakeRiskLocationResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireHistory"></a>
# **getFireHistory**
> FireHistory getFireHistory(postCode, startDate, endDate, maxCandidates)

Get Fire History

Accepts postcode as input and Returns fire event details for a particular postcode.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String postCode = "postCode_example"; // String | 5 digit Postal code to search
String startDate = "startDate_example"; // String | Start time in milliseconds(UTC)
String endDate = "endDate_example"; // String | End time in milliseconds(UTC)
String maxCandidates = "1"; // String | Maximum response events
try {
    FireHistory result = apiInstance.getFireHistory(postCode, startDate, endDate, maxCandidates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFireHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postCode** | **String**| 5 digit Postal code to search |
 **startDate** | **String**| Start time in milliseconds(UTC) | [optional]
 **endDate** | **String**| End time in milliseconds(UTC) | [optional]
 **maxCandidates** | **String**| Maximum response events | [optional] [default to 1]

### Return type

[**FireHistory**](FireHistory.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireRiskByAddress"></a>
# **getFireRiskByAddress**
> FireRiskResponse getFireRiskByAddress(address)

Get Fire Risk By Address

Accepts addresses as input and Returns fire risk data by risk types.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String address = "address_example"; // String | Free-form address text
try {
    FireRiskResponse result = apiInstance.getFireRiskByAddress(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFireRiskByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Free-form address text |

### Return type

[**FireRiskResponse**](FireRiskResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireRiskByAddressBatch"></a>
# **getFireRiskByAddressBatch**
> FireRiskResponseList getFireRiskByAddressBatch(body)

Post Fire Risk By Address

This is a Batch offering for &#39;Fire Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve fire risk data by risk types.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
FireRiskByAddressRequest body = new FireRiskByAddressRequest(); // FireRiskByAddressRequest | 
try {
    FireRiskResponseList result = apiInstance.getFireRiskByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFireRiskByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FireRiskByAddressRequest**](FireRiskByAddressRequest.md)|  | [optional]

### Return type

[**FireRiskResponseList**](FireRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireRiskByLocation"></a>
# **getFireRiskByLocation**
> FireRiskLocationResponse getFireRiskByLocation(longitude, latitude)

Get Fire Risk By Location

Accepts latitude &amp; longitude as input and Returns fire risk data by risk types.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String longitude = "longitude_example"; // String | Longitude of Location
String latitude = "latitude_example"; // String | Latitude of Location
try {
    FireRiskLocationResponse result = apiInstance.getFireRiskByLocation(longitude, latitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFireRiskByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |

### Return type

[**FireRiskLocationResponse**](FireRiskLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireRiskByLocationBatch"></a>
# **getFireRiskByLocationBatch**
> FireRiskLocationResponseList getFireRiskByLocationBatch(body)

Post Fire Risk By Location

This is a Batch offering for &#39;Fire Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve fire risk data by risk types.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
FireRiskByLocationRequest body = new FireRiskByLocationRequest(); // FireRiskByLocationRequest | 
try {
    FireRiskLocationResponseList result = apiInstance.getFireRiskByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFireRiskByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FireRiskByLocationRequest**](FireRiskByLocationRequest.md)|  | [optional]

### Return type

[**FireRiskLocationResponseList**](FireRiskLocationResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireStationByAddress"></a>
# **getFireStationByAddress**
> FireStations getFireStationByAddress(address, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket)

Fire Station By Address

Accepts addresses as input and Returns nearest fire stations.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String address = "address_example"; // String | The address to be searched.
String maxCandidates = "maxCandidates_example"; // String | Specifies the maximum number of fire stations that this service retrieves. The default value is 3 and maximum value is 5. The retrieved results are traveldistance sorted from the input location.
String travelTime = "travelTime_example"; // String | Max travel time from input location to fire station. Maximum allowed is 2 hours
String travelTimeUnit = "travelTimeUnit_example"; // String | Travel time unit such as minutes (default), hours, seconds or milliseconds.
String travelDistance = "travelDistance_example"; // String | Maximum travel distance from input location to fire station. Maximum allowed is 50 miles
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Travel distance unit such as Feet (default), Kilometers, Miles or Meters.
String sortBy = "sortBy_example"; // String | Sort the fire stations results by either travel time or travel distance (nearest first). Default sorting is by travel time.
String historicTrafficTimeBucket = "historicTrafficTimeBucket_example"; // String | Historic traffic time slab
try {
    FireStations result = apiInstance.getFireStationByAddress(address, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFireStationByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address to be searched. |
 **maxCandidates** | **String**| Specifies the maximum number of fire stations that this service retrieves. The default value is 3 and maximum value is 5. The retrieved results are traveldistance sorted from the input location. | [optional]
 **travelTime** | **String**| Max travel time from input location to fire station. Maximum allowed is 2 hours | [optional]
 **travelTimeUnit** | **String**| Travel time unit such as minutes (default), hours, seconds or milliseconds. | [optional] [enum: minutes, hours, seconds, milliseconds]
 **travelDistance** | **String**| Maximum travel distance from input location to fire station. Maximum allowed is 50 miles | [optional]
 **travelDistanceUnit** | **String**| Travel distance unit such as Feet (default), Kilometers, Miles or Meters. | [optional] [enum: Feet, Kilometers, Miles, Meters]
 **sortBy** | **String**| Sort the fire stations results by either travel time or travel distance (nearest first). Default sorting is by travel time. | [optional] [enum: time, distance]
 **historicTrafficTimeBucket** | **String**| Historic traffic time slab | [optional] [enum: None, AMPeak, PMPeak, OffPeak, Night]

### Return type

[**FireStations**](FireStations.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireStationByLocation"></a>
# **getFireStationByLocation**
> FireStationsLocation getFireStationByLocation(longitude, latitude, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket)

Fire Station By Location

Accepts latitude &amp; longitude as input and Returns nearest fire stations.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String longitude = "longitude_example"; // String | Longitude of Location
String latitude = "latitude_example"; // String | Latitude of Location
String maxCandidates = "maxCandidates_example"; // String | Specifies the maximum number of fire stations that this service retrieves. The default value is 3. The retrieved fire stations are distance ordered from the specified location. Maximum of 5 fire stations can be retrieved.
String travelTime = "travelTime_example"; // String | Maximum travel time from input location to fire station. Maximum allowed is 2 hours
String travelTimeUnit = "travelTimeUnit_example"; // String | Travel time unit such as minutes (default), hours, seconds or milliseconds.
String travelDistance = "travelDistance_example"; // String | Maximum travel distance from input location to fire station. Maximum allowed is 50 miles
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Travel distance unit such as Feet (default), Kilometers, Miles or Meters.
String sortBy = "sortBy_example"; // String | Sorting of fire stations in result by travel time/distance (nearest first from input location).
String historicTrafficTimeBucket = "historicTrafficTimeBucket_example"; // String | Historic traffic time slab
try {
    FireStationsLocation result = apiInstance.getFireStationByLocation(longitude, latitude, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFireStationByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |
 **maxCandidates** | **String**| Specifies the maximum number of fire stations that this service retrieves. The default value is 3. The retrieved fire stations are distance ordered from the specified location. Maximum of 5 fire stations can be retrieved. | [optional]
 **travelTime** | **String**| Maximum travel time from input location to fire station. Maximum allowed is 2 hours | [optional]
 **travelTimeUnit** | **String**| Travel time unit such as minutes (default), hours, seconds or milliseconds. | [optional] [enum: minutes, hours, seconds, milliseconds]
 **travelDistance** | **String**| Maximum travel distance from input location to fire station. Maximum allowed is 50 miles | [optional]
 **travelDistanceUnit** | **String**| Travel distance unit such as Feet (default), Kilometers, Miles or Meters. | [optional] [enum: Feet, Kilometers, Miles, Meters]
 **sortBy** | **String**| Sorting of fire stations in result by travel time/distance (nearest first from input location). | [optional] [enum: time, distance]
 **historicTrafficTimeBucket** | **String**| Historic traffic time slab | [optional] [enum: None, AMPeak, PMPeak, OffPeak, Night]

### Return type

[**FireStationsLocation**](FireStationsLocation.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFloodRiskByAddress"></a>
# **getFloodRiskByAddress**
> FloodRiskResponse getFloodRiskByAddress(address, includeZoneDesc, includeGeometry)

Get Flood Risk By Address

Accepts addresses as input and Returns flood risk data for flood zones and base flood elevation values.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String address = "address_example"; // String | Free-text Address
String includeZoneDesc = "includeZoneDesc_example"; // String | Specifies primary zone description. Valid Values: 'Y' or 'N'.
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    FloodRiskResponse result = apiInstance.getFloodRiskByAddress(address, includeZoneDesc, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFloodRiskByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Free-text Address |
 **includeZoneDesc** | **String**| Specifies primary zone description. Valid Values: &#39;Y&#39; or &#39;N&#39;. | [optional]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**FloodRiskResponse**](FloodRiskResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFloodRiskByAddressBatch"></a>
# **getFloodRiskByAddressBatch**
> FloodRiskResponseList getFloodRiskByAddressBatch(body)

Post Flood Risk By Address

This is a Batch offering for &#39;Flood Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve flood risk data for flood zones and base flood elevation values.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
FloodRiskByAddressRequest body = new FloodRiskByAddressRequest(); // FloodRiskByAddressRequest | 
try {
    FloodRiskResponseList result = apiInstance.getFloodRiskByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFloodRiskByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FloodRiskByAddressRequest**](FloodRiskByAddressRequest.md)|  | [optional]

### Return type

[**FloodRiskResponseList**](FloodRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFloodRiskByLocation"></a>
# **getFloodRiskByLocation**
> FloodRiskLocationResponse getFloodRiskByLocation(longitude, latitude, includeZoneDesc, includeGeometry)

Get Flood Risk By Location

Accepts latitude &amp; longitude as input and Returns flood risk data for flood zones and base flood elevation values.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
String longitude = "longitude_example"; // String | Longitude of Location
String latitude = "latitude_example"; // String | Latitude of Location
String includeZoneDesc = "includeZoneDesc_example"; // String | Specifies primary zone description. Valid Values: 'Y' or 'N'. Default: 'Y'
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    FloodRiskLocationResponse result = apiInstance.getFloodRiskByLocation(longitude, latitude, includeZoneDesc, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFloodRiskByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |
 **includeZoneDesc** | **String**| Specifies primary zone description. Valid Values: &#39;Y&#39; or &#39;N&#39;. Default: &#39;Y&#39; | [optional]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**FloodRiskLocationResponse**](FloodRiskLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFloodRiskByLocationBatch"></a>
# **getFloodRiskByLocationBatch**
> FloodRiskLocationResponseList getFloodRiskByLocationBatch(body)

Post Flood Risk By Location

This is a Batch offering for &#39;Flood Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve flood risk data for flood zones and base flood elevation values.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RisksServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RisksServiceApi apiInstance = new RisksServiceApi();
FloodRiskByLocationRequest body = new FloodRiskByLocationRequest(); // FloodRiskByLocationRequest | 
try {
    FloodRiskLocationResponseList result = apiInstance.getFloodRiskByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksServiceApi#getFloodRiskByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FloodRiskByLocationRequest**](FloodRiskByLocationRequest.md)|  | [optional]

### Return type

[**FloodRiskLocationResponseList**](FloodRiskLocationResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

