# GeocodeServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**geocode**](GeocodeServiceApi.md#geocode) | **GET** /geocode/v1/{datapackBundle}/geocode | Get Forward Geocode
[**geocodeBatch**](GeocodeServiceApi.md#geocodeBatch) | **POST** /geocode/v1/{datapackBundle}/geocode | Post Forward Geocode
[**getCapabilities**](GeocodeServiceApi.md#getCapabilities) | **GET** /geocode/v1/{datapackBundle}/capabilities | Get Capabilities
[**getDictionaries**](GeocodeServiceApi.md#getDictionaries) | **GET** /geocode/v1/{datapackBundle}/dictionaries | Get installed Dictionaries
[**getPreciselyID**](GeocodeServiceApi.md#getPreciselyID) | **GET** /geocode/v1/key/byaddress | Get PreciselyID By Address
[**getPreciselyIDs**](GeocodeServiceApi.md#getPreciselyIDs) | **POST** /geocode/v1/key/byaddress | Post PreciselyID By Address
[**keyLookup**](GeocodeServiceApi.md#keyLookup) | **GET** /geocode/v1/keylookup | Get Key Lookup
[**keyLookupBatch**](GeocodeServiceApi.md#keyLookupBatch) | **POST** /geocode/v1/keylookup | Post Key Lookup
[**reverseGeocodBatch**](GeocodeServiceApi.md#reverseGeocodBatch) | **POST** /geocode/v1/{datapackBundle}/reverseGeocode | Post Reverse Geocode
[**reverseGeocode**](GeocodeServiceApi.md#reverseGeocode) | **GET** /geocode/v1/{datapackBundle}/reverseGeocode | Get Reverse Geocode


<a name="geocode"></a>
# **geocode**
> GeocodeServiceResponse geocode(datapackBundle, country, placeName, mainAddress, lastLine, areaName1, areaName2, areaName3, areaName4, postalCode, matchMode, fallbackGeo, fallbackPostal, maxCands, streetOffset, streetOffsetUnits, cornerOffset, cornerOffsetUnits)

Get Forward Geocode

This service accepts an address and returns the location coordinates corresponding to that address. Premium offers the best accuracy and is a high precision geocoder leveraging Master Location Data - geocodes to Street or building level.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.GeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

GeocodeServiceApi apiInstance = new GeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
String country = "USA"; // String | Country name or ISO code.
String placeName = "placeName_example"; // String | Building name, place name, Point of Interest (POI), company or firm name associated with the input address.
String mainAddress = "4750 Walnut St., Boulder CO, 80301"; // String | Single line input, treated as collection of field elements.
String lastLine = "lastLine_example"; // String | The last line of the address.
String areaName1 = "areaName1_example"; // String | Specifies the largest geographical area, typically a state or province.
String areaName2 = "areaName2_example"; // String | Specifies the secondary geographic area, typically a county or district.
String areaName3 = "areaName3_example"; // String | Specifies a city or town name.
String areaName4 = "areaName4_example"; // String | Specifies a city subdivision or locality.
Integer postalCode = 56; // Integer | The postal code in the appropriate format for the country.
String matchMode = "Standard"; // String | Match modes determine the leniency used to make a match between the input address and the reference data.
Boolean fallbackGeo = true; // Boolean | Specifies whether to attempt to determine a geographic region centroid when an address-level geocode cannot be determined.
Boolean fallbackPostal = true; // Boolean | Specifies whether to attempt to determine a post code centroid when an address-level geocode cannot be determined.
Integer maxCands = 1; // Integer | The maximum number of candidates to return.
Integer streetOffset = 7; // Integer | Indicates the offset distance from the street segments to use in street-level geocoding.
String streetOffsetUnits = "METERS"; // String | Specifies the unit of measurement for the street offset.
Integer cornerOffset = 7; // Integer | Specifies the distance to offset the street end points in street-level matching.
String cornerOffsetUnits = "METERS"; // String | Specifies the unit of measurement for the corner offset.
try {
    GeocodeServiceResponse result = apiInstance.geocode(datapackBundle, country, placeName, mainAddress, lastLine, areaName1, areaName2, areaName3, areaName4, postalCode, matchMode, fallbackGeo, fallbackPostal, maxCands, streetOffset, streetOffsetUnits, cornerOffset, cornerOffsetUnits);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeocodeServiceApi#geocode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium, advanced]
 **country** | **String**| Country name or ISO code. | [optional] [default to USA]
 **placeName** | **String**| Building name, place name, Point of Interest (POI), company or firm name associated with the input address. | [optional]
 **mainAddress** | **String**| Single line input, treated as collection of field elements. | [optional] [default to 4750 Walnut St., Boulder CO, 80301]
 **lastLine** | **String**| The last line of the address. | [optional]
 **areaName1** | **String**| Specifies the largest geographical area, typically a state or province. | [optional]
 **areaName2** | **String**| Specifies the secondary geographic area, typically a county or district. | [optional]
 **areaName3** | **String**| Specifies a city or town name. | [optional]
 **areaName4** | **String**| Specifies a city subdivision or locality. | [optional]
 **postalCode** | **Integer**| The postal code in the appropriate format for the country. | [optional]
 **matchMode** | **String**| Match modes determine the leniency used to make a match between the input address and the reference data. | [optional] [default to Standard] [enum: Exact, Standard, Relaxed, Custom, Interactive, CASS]
 **fallbackGeo** | **Boolean**| Specifies whether to attempt to determine a geographic region centroid when an address-level geocode cannot be determined. | [optional] [default to true]
 **fallbackPostal** | **Boolean**| Specifies whether to attempt to determine a post code centroid when an address-level geocode cannot be determined. | [optional] [default to true]
 **maxCands** | **Integer**| The maximum number of candidates to return. | [optional] [default to 1]
 **streetOffset** | **Integer**| Indicates the offset distance from the street segments to use in street-level geocoding. | [optional] [default to 7]
 **streetOffsetUnits** | **String**| Specifies the unit of measurement for the street offset. | [optional] [default to METERS] [enum: METERS, FEET]
 **cornerOffset** | **Integer**| Specifies the distance to offset the street end points in street-level matching. | [optional] [default to 7]
 **cornerOffsetUnits** | **String**| Specifies the unit of measurement for the corner offset. | [optional] [default to METERS] [enum: METERS, FEET]

### Return type

[**GeocodeServiceResponse**](GeocodeServiceResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="geocodeBatch"></a>
# **geocodeBatch**
> GeocodeServiceResponseList geocodeBatch(body, datapackBundle)

Post Forward Geocode

This is a Batch offering for geocode service. It accepts a single address or a list of addresses and returns location coordinates.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.GeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

GeocodeServiceApi apiInstance = new GeocodeServiceApi();
GeocodeRequest body = new GeocodeRequest(); // GeocodeRequest | Geocode Request Object
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
try {
    GeocodeServiceResponseList result = apiInstance.geocodeBatch(body, datapackBundle);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeocodeServiceApi#geocodeBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeocodeRequest**](GeocodeRequest.md)| Geocode Request Object |
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium, advanced]

### Return type

[**GeocodeServiceResponseList**](GeocodeServiceResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getCapabilities"></a>
# **getCapabilities**
> GeocodeCapabilitiesResponse getCapabilities(datapackBundle, operation, country)

Get Capabilities

Get Capabilities  of Geocode API

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.GeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

GeocodeServiceApi apiInstance = new GeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
String operation = "geocode"; // String | Geocode or ReverseGeocode Operation.
String country = "USA"; // String | Country name or ISO code.
try {
    GeocodeCapabilitiesResponse result = apiInstance.getCapabilities(datapackBundle, operation, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeocodeServiceApi#getCapabilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium, advanced]
 **operation** | **String**| Geocode or ReverseGeocode Operation. | [optional] [default to geocode] [enum: geocode, reverseGeocode]
 **country** | **String**| Country name or ISO code. | [optional] [default to USA]

### Return type

[**GeocodeCapabilitiesResponse**](GeocodeCapabilitiesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDictionaries"></a>
# **getDictionaries**
> ConfiguredDictionaryResponse getDictionaries(datapackBundle, country)

Get installed Dictionaries

Get installed Dictionaries

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.GeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

GeocodeServiceApi apiInstance = new GeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
String country = "USA"; // String | Three Letter ISO Country code
try {
    ConfiguredDictionaryResponse result = apiInstance.getDictionaries(datapackBundle, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeocodeServiceApi#getDictionaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium, advanced]
 **country** | **String**| Three Letter ISO Country code | [optional] [default to USA]

### Return type

[**ConfiguredDictionaryResponse**](ConfiguredDictionaryResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getPreciselyID"></a>
# **getPreciselyID**
> PBKeyResponse getPreciselyID(address, country)

Get PreciselyID By Address

This service accepts an address and returns the corresponding PreciselyID.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.GeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

GeocodeServiceApi apiInstance = new GeocodeServiceApi();
String address = "address_example"; // String | free form address text
String country = "country_example"; // String | Country ISO code.
try {
    PBKeyResponse result = apiInstance.getPreciselyID(address, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeocodeServiceApi#getPreciselyID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text |
 **country** | **String**| Country ISO code. | [optional]

### Return type

[**PBKeyResponse**](PBKeyResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getPreciselyIDs"></a>
# **getPreciselyIDs**
> PBKeyResponseList getPreciselyIDs(body)

Post PreciselyID By Address

This is a Batch offering for &#39;PreciselyID By Address&#39; service. It accepts a single address or a list of addresses and returns the corresponding PreciselyID.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.GeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

GeocodeServiceApi apiInstance = new GeocodeServiceApi();
PBKeyAddressRequest body = new PBKeyAddressRequest(); // PBKeyAddressRequest | 
try {
    PBKeyResponseList result = apiInstance.getPreciselyIDs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeocodeServiceApi#getPreciselyIDs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBKeyAddressRequest**](PBKeyAddressRequest.md)|  |

### Return type

[**PBKeyResponseList**](PBKeyResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="keyLookup"></a>
# **keyLookup**
> GeocodeServiceResponse keyLookup(key, type, country)

Get Key Lookup

This service accepts a PreciselyID and returns the corresponding address associated with that PreciselyID.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.GeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

GeocodeServiceApi apiInstance = new GeocodeServiceApi();
String key = "key_example"; // String | free form text
String type = "type_example"; // String | 
String country = "country_example"; // String | 
try {
    GeocodeServiceResponse result = apiInstance.keyLookup(key, type, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeocodeServiceApi#keyLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| free form text |
 **type** | **String**|  | [optional]
 **country** | **String**|  | [optional]

### Return type

[**GeocodeServiceResponse**](GeocodeServiceResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="keyLookupBatch"></a>
# **keyLookupBatch**
> GeocodeServiceResponseList keyLookupBatch(body)

Post Key Lookup

This service accepts batches of PreciselyID&#39;s and returns the corresponding address associated with those PreciselyID&#39;s.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.GeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

GeocodeServiceApi apiInstance = new GeocodeServiceApi();
KeyLookupRequest body = new KeyLookupRequest(); // KeyLookupRequest | 
try {
    GeocodeServiceResponseList result = apiInstance.keyLookupBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeocodeServiceApi#keyLookupBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeyLookupRequest**](KeyLookupRequest.md)|  | [optional]

### Return type

[**GeocodeServiceResponseList**](GeocodeServiceResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="reverseGeocodBatch"></a>
# **reverseGeocodBatch**
> GeocodeServiceResponseList reverseGeocodBatch(datapackBundle, body)

Post Reverse Geocode

It accepts a single location coordinate or a list of location coordinates and returns addresses.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.GeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

GeocodeServiceApi apiInstance = new GeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
ReverseGeocodeRequest body = new ReverseGeocodeRequest(); // ReverseGeocodeRequest | Request for Reverse Geocode
try {
    GeocodeServiceResponseList result = apiInstance.reverseGeocodBatch(datapackBundle, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeocodeServiceApi#reverseGeocodBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium, advanced]
 **body** | [**ReverseGeocodeRequest**](ReverseGeocodeRequest.md)| Request for Reverse Geocode | [optional]

### Return type

[**GeocodeServiceResponseList**](GeocodeServiceResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="reverseGeocode"></a>
# **reverseGeocode**
> GeocodeServiceResponse reverseGeocode(datapackBundle, x, y, country, coordSysName, distance, distanceUnits)

Get Reverse Geocode

This service accepts location coordinate and returns an address.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.GeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

GeocodeServiceApi apiInstance = new GeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
BigDecimal x = new BigDecimal(); // BigDecimal | Longitude of the location.
BigDecimal y = new BigDecimal(); // BigDecimal | Latitude of the location.
String country = "country_example"; // String | Country name or ISO code.
String coordSysName = "EPSG:4326"; // String | Coordinate system to convert geometry to in format codespace:code.
Integer distance = 150; // Integer | Radius in which search is performed.
String distanceUnits = "METERS"; // String | Unit of measurement.
try {
    GeocodeServiceResponse result = apiInstance.reverseGeocode(datapackBundle, x, y, country, coordSysName, distance, distanceUnits);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeocodeServiceApi#reverseGeocode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium, advanced]
 **x** | **BigDecimal**| Longitude of the location. | [default to -105.240976]
 **y** | **BigDecimal**| Latitude of the location. | [default to 40.018301]
 **country** | **String**| Country name or ISO code. | [optional]
 **coordSysName** | **String**| Coordinate system to convert geometry to in format codespace:code. | [optional] [default to EPSG:4326]
 **distance** | **Integer**| Radius in which search is performed. | [optional] [default to 150]
 **distanceUnits** | **String**| Unit of measurement. | [optional] [default to METERS] [enum: METERS, FEET]

### Return type

[**GeocodeServiceResponse**](GeocodeServiceResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

