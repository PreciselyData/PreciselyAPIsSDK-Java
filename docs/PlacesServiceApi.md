# PlacesServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryCodeMetadata**](PlacesServiceApi.md#getCategoryCodeMetadata) | **GET** /places/v1/metadata/category | Returns Category Codes with their sub-categories (if exist), descriptions and SIC Codes mapping
[**getPOIById**](PlacesServiceApi.md#getPOIById) | **GET** /places/v1/poi/{id} | Points Of Interest Details By Id
[**getPOIsByAddress**](PlacesServiceApi.md#getPOIsByAddress) | **GET** /places/v1/poi/byaddress | Points of Interest By Address.
[**getPOIsByArea**](PlacesServiceApi.md#getPOIsByArea) | **GET** /places/v1/poi/byarea | Points of Interest By Area.
[**getPOIsByBoundary**](PlacesServiceApi.md#getPOIsByBoundary) | **POST** /places/v1/poi/byboundary | Points Of Interest By Boundary
[**getPOIsByLocation**](PlacesServiceApi.md#getPOIsByLocation) | **GET** /places/v1/poi/bylocation | Points of Interest By Location.
[**getPOIsCount**](PlacesServiceApi.md#getPOIsCount) | **POST** /places/v1/poicount | Point of Interests count By Geometry.
[**getSICMetadata**](PlacesServiceApi.md#getSICMetadata) | **GET** /places/v1/metadata/sic | Returns SIC Codes with their Industry Titles and Category Codes mapping
[**poisAutocomplete**](PlacesServiceApi.md#poisAutocomplete) | **GET** /places/v1/poi/autocomplete | Points of Interest Autocomplete.


<a name="getCategoryCodeMetadata"></a>
# **getCategoryCodeMetadata**
> GeoEnrichMetadataResponse getCategoryCodeMetadata(categoryCode, level)

Returns Category Codes with their sub-categories (if exist), descriptions and SIC Codes mapping

Accepts first partial digits or full category codes to filter the response

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PlacesServiceApi apiInstance = new PlacesServiceApi();
String categoryCode = "categoryCode_example"; // String | Specify starting digits or full category code to filter the response
String level = "level_example"; // String | Allowed values are 1,2,3. If level=1, then only 4 digits category codes will be returned, level=2 means only 6 digits category codes   will be returned, level=3 means only 11 digits category codes will be returned. Multiple comma-separated values will also be accepted. So level='1,2' means return 4 digits and 6 digits category codes.
try {
    GeoEnrichMetadataResponse result = apiInstance.getCategoryCodeMetadata(categoryCode, level);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacesServiceApi#getCategoryCodeMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryCode** | **String**| Specify starting digits or full category code to filter the response | [optional]
 **level** | **String**| Allowed values are 1,2,3. If level&#x3D;1, then only 4 digits category codes will be returned, level&#x3D;2 means only 6 digits category codes   will be returned, level&#x3D;3 means only 11 digits category codes will be returned. Multiple comma-separated values will also be accepted. So level&#x3D;&#39;1,2&#39; means return 4 digits and 6 digits category codes. | [optional]

### Return type

[**GeoEnrichMetadataResponse**](GeoEnrichMetadataResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

<a name="getPOIById"></a>
# **getPOIById**
> POIPlaces getPOIById(id)

Points Of Interest Details By Id

This service returns complete details of a chosen point of interest by an identifier. The identifier could be selected from Autocomplete API response.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PlacesServiceApi apiInstance = new PlacesServiceApi();
String id = "id_example"; // String | POI unique Identifier. Accepts only numbers.
try {
    POIPlaces result = apiInstance.getPOIById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacesServiceApi#getPOIById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| POI unique Identifier. Accepts only numbers. |

### Return type

[**POIPlaces**](POIPlaces.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getPOIsByAddress"></a>
# **getPOIsByAddress**
> GeoEnrichResponse getPOIsByAddress(address, country, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, matchMode, specificMatchOn)

Points of Interest By Address.

Accepts address as an input to retrieve nearby points of interest.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PlacesServiceApi apiInstance = new PlacesServiceApi();
String address = "address_example"; // String | Address
String country = "country_example"; // String | Country
String name = "name_example"; // String | Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1)
String type = "type_example"; // String | Matched against the content which defines the type of the poi. 
String categoryCode = "categoryCode_example"; // String | Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://developer.precisely.com/download?CategoryCodes.xlsx 
String sicCode = "sicCode_example"; // String | Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes.
String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved.
String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters.
String travelTime = "travelTime_example"; // String | Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in 'travelTimeUnit'. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time.
String travelTimeUnit = "travelTimeUnit_example"; // String | Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds
String travelDistance = "travelDistance_example"; // String | Specifies the search boundary in terms of distance mentioned in 'travelDistanceUnit'. The results are retrieved from the polygon formed based on the travel distance specified.
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters
String travelMode = "travelMode_example"; // String | Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time. Allowed values driving and walking
String sortBy = "distance"; // String | Specifies the order in which POIs are retrieved.
String fuzzyOnName = "fuzzyOnName_example"; // String | Allowed values are Y/N. If N, the search on name will not allow fuzziness.
String page = "page_example"; // String | Will support pagination, by default 1st page with maxCandidates results are returned.
String matchMode = "matchMode_example"; // String | 
String specificMatchOn = "specificMatchOn_example"; // String | 
try {
    GeoEnrichResponse result = apiInstance.getPOIsByAddress(address, country, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, matchMode, specificMatchOn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacesServiceApi#getPOIsByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address |
 **country** | **String**| Country | [optional]
 **name** | **String**| Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1) | [optional]
 **type** | **String**| Matched against the content which defines the type of the poi.  | [optional]
 **categoryCode** | **String**| Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://developer.precisely.com/download?CategoryCodes.xlsx  | [optional]
 **sicCode** | **String**| Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes. | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved. | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters. | [optional]
 **travelTime** | **String**| Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in &#39;travelTimeUnit&#39;. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time. | [optional]
 **travelTimeUnit** | **String**| Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds | [optional] [enum: minutes, hours, seconds and milliseconds]
 **travelDistance** | **String**| Specifies the search boundary in terms of distance mentioned in &#39;travelDistanceUnit&#39;. The results are retrieved from the polygon formed based on the travel distance specified. | [optional]
 **travelDistanceUnit** | **String**| Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters | [optional] [enum: feet, kilometers, miles and meters]
 **travelMode** | **String**| Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time. Allowed values driving and walking | [optional] [enum: driving, walking]
 **sortBy** | **String**| Specifies the order in which POIs are retrieved. | [optional] [default to distance] [enum: distance, relevance]
 **fuzzyOnName** | **String**| Allowed values are Y/N. If N, the search on name will not allow fuzziness. | [optional]
 **page** | **String**| Will support pagination, by default 1st page with maxCandidates results are returned. | [optional]
 **matchMode** | **String**|  | [optional]
 **specificMatchOn** | **String**|  | [optional]

### Return type

[**GeoEnrichResponse**](GeoEnrichResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

<a name="getPOIsByArea"></a>
# **getPOIsByArea**
> GeoEnrichResponse getPOIsByArea(country, areaName3, postcode1, postcode2, name, type, categoryCode, sicCode, maxCandidates, fuzzyOnName, page, matchMode, specificMatchOn)

Points of Interest By Area.

Accepts postcode or city as an input to retrieve nearby points of interest.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PlacesServiceApi apiInstance = new PlacesServiceApi();
String country = "country_example"; // String | Country
String areaName3 = "areaName3_example"; // String | Either areaName3 or postcode is required
String postcode1 = "postcode1_example"; // String | Either areaName3 or postcode is required
String postcode2 = "postcode2_example"; // String | postcode extension
String name = "name_example"; // String | Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1)
String type = "type_example"; // String | Matched against the content which defines the type of the poi. 
String categoryCode = "categoryCode_example"; // String | Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://developer.precisely.com/download?CategoryCodes.xlsx 
String sicCode = "sicCode_example"; // String | Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes.
String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved.
String fuzzyOnName = "fuzzyOnName_example"; // String | Allowed values are Y/N. If N, the search on name will not allow fuzziness.
String page = "page_example"; // String | Will support pagination, by default 1st page with maxCandidates results are returned.
String matchMode = "matchMode_example"; // String | 
String specificMatchOn = "specificMatchOn_example"; // String | 
try {
    GeoEnrichResponse result = apiInstance.getPOIsByArea(country, areaName3, postcode1, postcode2, name, type, categoryCode, sicCode, maxCandidates, fuzzyOnName, page, matchMode, specificMatchOn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacesServiceApi#getPOIsByArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Country |
 **areaName3** | **String**| Either areaName3 or postcode is required | [optional]
 **postcode1** | **String**| Either areaName3 or postcode is required | [optional]
 **postcode2** | **String**| postcode extension | [optional]
 **name** | **String**| Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1) | [optional]
 **type** | **String**| Matched against the content which defines the type of the poi.  | [optional]
 **categoryCode** | **String**| Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://developer.precisely.com/download?CategoryCodes.xlsx  | [optional]
 **sicCode** | **String**| Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes. | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved. | [optional]
 **fuzzyOnName** | **String**| Allowed values are Y/N. If N, the search on name will not allow fuzziness. | [optional]
 **page** | **String**| Will support pagination, by default 1st page with maxCandidates results are returned. | [optional]
 **matchMode** | **String**|  | [optional]
 **specificMatchOn** | **String**|  | [optional]

### Return type

[**GeoEnrichResponse**](GeoEnrichResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

<a name="getPOIsByBoundary"></a>
# **getPOIsByBoundary**
> Pois getPOIsByBoundary(accept, contentType, body)

Points Of Interest By Boundary

Accepts a user-defined boundary as input and returns all Points of Interest within the boundary. Additionally, user can filter the response by name, type, standard industrial classifications and category codes.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PlacesServiceApi apiInstance = new PlacesServiceApi();
String accept = "accept_example"; // String | 
String contentType = "contentType_example"; // String | 
POIByGeometryRequest body = new POIByGeometryRequest(); // POIByGeometryRequest | 
try {
    Pois result = apiInstance.getPOIsByBoundary(accept, contentType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacesServiceApi#getPOIsByBoundary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [optional]
 **contentType** | **String**|  | [optional]
 **body** | [**POIByGeometryRequest**](POIByGeometryRequest.md)|  | [optional]

### Return type

[**Pois**](Pois.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

<a name="getPOIsByLocation"></a>
# **getPOIsByLocation**
> GeoEnrichResponse getPOIsByLocation(longitude, latitude, searchText, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, searchOnNameOnly, matchMode, specificMatchOn)

Points of Interest By Location.

Accepts longitude and latitude as an input to retrieve nearby points of interest.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PlacesServiceApi apiInstance = new PlacesServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String searchText = "searchText_example"; // String | Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1)
String type = "type_example"; // String | Matched against the content which defines the type of the poi. 
String categoryCode = "categoryCode_example"; // String | Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://developer.precisely.com/download?CategoryCodes.xlsx 
String sicCode = "sicCode_example"; // String | Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes.
String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved.
String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters.
String travelTime = "travelTime_example"; // String | Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in 'travelTimeUnit'. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time.
String travelTimeUnit = "travelTimeUnit_example"; // String | Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds
String travelDistance = "travelDistance_example"; // String | Specifies the search boundary in terms of distance mentioned in 'travelDistanceUnit'. The results are retrieved from the polygon formed based on the travel distance specified.
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters
String travelMode = "travelMode_example"; // String | Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time. Allowed values driving and walking
String sortBy = "distance"; // String | Specifies the order in which POIs are retrieved.
String fuzzyOnName = "fuzzyOnName_example"; // String | Allowed values are Y/N. If N, the search on name will not allow fuzziness.
String page = "page_example"; // String | Will support pagination, by default 1st page with maxCandidates results are returned.
String searchOnNameOnly = "searchOnNameOnly_example"; // String | search name description
String matchMode = "matchMode_example"; // String | 
String specificMatchOn = "specificMatchOn_example"; // String | 
try {
    GeoEnrichResponse result = apiInstance.getPOIsByLocation(longitude, latitude, searchText, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, searchOnNameOnly, matchMode, specificMatchOn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacesServiceApi#getPOIsByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **searchText** | **String**| Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1) | [optional]
 **type** | **String**| Matched against the content which defines the type of the poi.  | [optional]
 **categoryCode** | **String**| Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://developer.precisely.com/download?CategoryCodes.xlsx  | [optional]
 **sicCode** | **String**| Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes. | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved. | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters. | [optional]
 **travelTime** | **String**| Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in &#39;travelTimeUnit&#39;. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time. | [optional]
 **travelTimeUnit** | **String**| Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds | [optional] [enum: minutes, hours, seconds and milliseconds]
 **travelDistance** | **String**| Specifies the search boundary in terms of distance mentioned in &#39;travelDistanceUnit&#39;. The results are retrieved from the polygon formed based on the travel distance specified. | [optional]
 **travelDistanceUnit** | **String**| Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters | [optional] [enum: feet, kilometers, miles and meters]
 **travelMode** | **String**| Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time. Allowed values driving and walking | [optional] [enum: driving, walking]
 **sortBy** | **String**| Specifies the order in which POIs are retrieved. | [optional] [default to distance] [enum: distance, relevance]
 **fuzzyOnName** | **String**| Allowed values are Y/N. If N, the search on name will not allow fuzziness. | [optional]
 **page** | **String**| Will support pagination, by default 1st page with maxCandidates results are returned. | [optional]
 **searchOnNameOnly** | **String**| search name description | [optional]
 **matchMode** | **String**|  | [optional]
 **specificMatchOn** | **String**|  | [optional]

### Return type

[**GeoEnrichResponse**](GeoEnrichResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

<a name="getPOIsCount"></a>
# **getPOIsCount**
> PoiCount getPOIsCount(contentType, body)

Point of Interests count By Geometry.

Accepts geometry/loc/address as an input to count nearby point of interests.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PlacesServiceApi apiInstance = new PlacesServiceApi();
String contentType = "contentType_example"; // String | 
PoiCountRequest body = new PoiCountRequest(); // PoiCountRequest | 
try {
    PoiCount result = apiInstance.getPOIsCount(contentType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacesServiceApi#getPOIsCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [optional]
 **body** | [**PoiCountRequest**](PoiCountRequest.md)|  | [optional]

### Return type

[**PoiCount**](PoiCount.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getSICMetadata"></a>
# **getSICMetadata**
> GeoEnrichMetadataResponse getSICMetadata(sicCode, level)

Returns SIC Codes with their Industry Titles and Category Codes mapping

Accepts first few partial digits or full SIC codes to filter the response

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PlacesServiceApi apiInstance = new PlacesServiceApi();
String sicCode = "sicCode_example"; // String | Specify starting digits or full sic code to filter the response
String level = "level_example"; // String | Allowed values are 1,2. If level=1, then only 4 digits sic codes will be returned, level=2 means only 8 digits sic codes will be returned. Multiple comma-separated values will also be accepted. So level='1,2' means return both 4 digits and 8 digits sic codes.
try {
    GeoEnrichMetadataResponse result = apiInstance.getSICMetadata(sicCode, level);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacesServiceApi#getSICMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sicCode** | **String**| Specify starting digits or full sic code to filter the response | [optional]
 **level** | **String**| Allowed values are 1,2. If level&#x3D;1, then only 4 digits sic codes will be returned, level&#x3D;2 means only 8 digits sic codes will be returned. Multiple comma-separated values will also be accepted. So level&#x3D;&#39;1,2&#39; means return both 4 digits and 8 digits sic codes. | [optional]

### Return type

[**GeoEnrichMetadataResponse**](GeoEnrichMetadataResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

<a name="poisAutocomplete"></a>
# **poisAutocomplete**
> GeoEnrichResponse poisAutocomplete(longitude, latitude, searchText, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, country, areaName1, areaName3, postcode1, postcode2, ipAddress, autoDetectLocation, type, categoryCode, sicCode, maxCandidates, sortBy, searchOnNameOnly, matchMode, specificMatchOn)

Points of Interest Autocomplete.

POIs-Autocomplete will return POIs predictions based on the full or partial words specified in the search.The search can then be narrowed based on Location, IP Address or Country along with other supporting filters.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.PlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

PlacesServiceApi apiInstance = new PlacesServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String searchText = "searchText_example"; // String | Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1)
String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters.
String travelTime = "travelTime_example"; // String | Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in 'travelTimeUnit'. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time.
String travelTimeUnit = "travelTimeUnit_example"; // String | Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds
String travelDistance = "travelDistance_example"; // String | Specifies the search boundary in terms of distance mentioned in 'travelDistanceUnit'. The results are retrieved from the polygon formed based on the travel distance specified.
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters
String travelMode = "travelMode_example"; // String | Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time. Allowed values driving and walking
String country = "country_example"; // String | Country
String areaName1 = "areaName1_example"; // String | Specifies the largest geographical area, typically a state or province.
String areaName3 = "areaName3_example"; // String | Specifies the name of the city or town. 
String postcode1 = "postcode1_example"; // String | Postal Code of the input to be searched
String postcode2 = "postcode2_example"; // String | Postcode2
String ipAddress = "ipAddress_example"; // String | IP address of network connected device in standard IPv4 octet and a valid external address.
String autoDetectLocation = "autoDetectLocation_example"; // String | Specifies whether to auto-detect location from IP address. If 'True' is set, the location is detected from the specified ip address. If 'False' is set. the search will happen according to country or location.
String type = "type_example"; // String | Matched against the content which defines the type of the poi. 
String categoryCode = "categoryCode_example"; // String | Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://developer.precisely.com/download?CategoryCodes.xlsx 
String sicCode = "sicCode_example"; // String | Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes.
String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved.
String sortBy = "distance"; // String | Specifies the order in which POIs are retrieved.
String searchOnNameOnly = "searchOnNameOnly_example"; // String | specifies search on name
String matchMode = "matchMode_example"; // String | 
String specificMatchOn = "specificMatchOn_example"; // String | 
try {
    GeoEnrichResponse result = apiInstance.poisAutocomplete(longitude, latitude, searchText, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, country, areaName1, areaName3, postcode1, postcode2, ipAddress, autoDetectLocation, type, categoryCode, sicCode, maxCandidates, sortBy, searchOnNameOnly, matchMode, specificMatchOn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacesServiceApi#poisAutocomplete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. | [optional]
 **latitude** | **String**| Latitude of the location. | [optional]
 **searchText** | **String**| Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1) | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters. | [optional]
 **travelTime** | **String**| Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in &#39;travelTimeUnit&#39;. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time. | [optional]
 **travelTimeUnit** | **String**| Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds | [optional] [enum: minutes, hours, seconds and milliseconds]
 **travelDistance** | **String**| Specifies the search boundary in terms of distance mentioned in &#39;travelDistanceUnit&#39;. The results are retrieved from the polygon formed based on the travel distance specified. | [optional]
 **travelDistanceUnit** | **String**| Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters | [optional] [enum: feet, kilometers, miles and meters]
 **travelMode** | **String**| Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time. Allowed values driving and walking | [optional] [enum: driving, walking]
 **country** | **String**| Country | [optional]
 **areaName1** | **String**| Specifies the largest geographical area, typically a state or province. | [optional]
 **areaName3** | **String**| Specifies the name of the city or town.  | [optional]
 **postcode1** | **String**| Postal Code of the input to be searched | [optional]
 **postcode2** | **String**| Postcode2 | [optional]
 **ipAddress** | **String**| IP address of network connected device in standard IPv4 octet and a valid external address. | [optional]
 **autoDetectLocation** | **String**| Specifies whether to auto-detect location from IP address. If &#39;True&#39; is set, the location is detected from the specified ip address. If &#39;False&#39; is set. the search will happen according to country or location. | [optional]
 **type** | **String**| Matched against the content which defines the type of the poi.  | [optional]
 **categoryCode** | **String**| Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://developer.precisely.com/download?CategoryCodes.xlsx  | [optional]
 **sicCode** | **String**| Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes. | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved. | [optional]
 **sortBy** | **String**| Specifies the order in which POIs are retrieved. | [optional] [default to distance] [enum: distance, relevance]
 **searchOnNameOnly** | **String**| specifies search on name | [optional]
 **matchMode** | **String**|  | [optional]
 **specificMatchOn** | **String**|  | [optional]

### Return type

[**GeoEnrichResponse**](GeoEnrichResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

