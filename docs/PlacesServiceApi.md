# PlacesServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryCodeMetadata**](PlacesServiceApi.md#getCategoryCodeMetadata) | **GET** /places/v1/metadata/category | Category Code Metadata.
[**getPOIById**](PlacesServiceApi.md#getPOIById) | **GET** /places/v1/poi/{id} | Points Of Interest Details By Id
[**getPOIsByAddress**](PlacesServiceApi.md#getPOIsByAddress) | **GET** /places/v1/poi/byaddress | Get POIs By Address.
[**getPOIsByArea**](PlacesServiceApi.md#getPOIsByArea) | **GET** /places/v1/poi/byarea | GET Points Of Interest By Area.
[**getPOIsByGeometry**](PlacesServiceApi.md#getPOIsByGeometry) | **POST** /places/v1/poi/byboundary | Points Of Interest By Boundary
[**getPOIsByLocation**](PlacesServiceApi.md#getPOIsByLocation) | **GET** /places/v1/poi/bylocation | Get POIs By Location.
[**getPOIsCount**](PlacesServiceApi.md#getPOIsCount) | **POST** /places/v1/poicount | Points Of Interest Count
[**getSICMetadata**](PlacesServiceApi.md#getSICMetadata) | **GET** /places/v1/metadata/sic | Get SIC Metadata
[**poisAutocomplete**](PlacesServiceApi.md#poisAutocomplete) | **GET** /places/v1/poi/autocomplete | Points Of Interest Autocomplete


<a name="getCategoryCodeMetadata"></a>
# **getCategoryCodeMetadata**
> MetadataResponse getCategoryCodeMetadata(categoryCode, level)

Category Code Metadata.

This service returns a list of Category codes &amp; associated metadata which can then be used as inputs for querying the Points of Interest By Address or Location methods listed above.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PlacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PlacesServiceApi apiInstance = new PlacesServiceApi(defaultClient);
    String categoryCode = "categoryCode_example"; // String | 4, 6, or 11 digits category code to filter the response.
    String level = "level_example"; // String | 1, 2, or 3.
    try {
      MetadataResponse result = apiInstance.getCategoryCodeMetadata(categoryCode, level);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesServiceApi#getCategoryCodeMetadata");
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
 **categoryCode** | **String**| 4, 6, or 11 digits category code to filter the response. | [optional]
 **level** | **String**| 1, 2, or 3. | [optional]

### Return type

[**MetadataResponse**](MetadataResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getPOIById"></a>
# **getPOIById**
> Poi getPOIById(id)

Points Of Interest Details By Id

This service returns complete details of a chosen point of interest by an identifier. The identifier could be selected from Autocomplete API response.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PlacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PlacesServiceApi apiInstance = new PlacesServiceApi(defaultClient);
    String id = "id_example"; // String | POI unique Identifier.
    try {
      Poi result = apiInstance.getPOIById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesServiceApi#getPOIById");
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
 **id** | **String**| POI unique Identifier. |

### Return type

[**Poi**](Poi.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getPOIsByAddress"></a>
# **getPOIsByAddress**
> PlacesResponse getPOIsByAddress(address, country, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, matchMode, specificMatchOn)

Get POIs By Address.

This service accepts an address as input and returns nearby points-of-interest places around that address. Additional input features include retrieving data by name, type, standard industrial classifications and category codes, as well as geographic filtering by radius, travel times and travel distances. Response features include JSON as well as CSV download.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PlacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PlacesServiceApi apiInstance = new PlacesServiceApi(defaultClient);
    String address = "address_example"; // String | The address to be searched.
    String country = "country_example"; // String | Country ISO code.
    String name = "name_example"; // String | Specifies the name of the place (POI) to be searched. Also performs search on partially specified names. It requires minimum 3 characters to search.
    String type = "type_example"; // String | Filters the points of interest (POIs) by place types.
    String categoryCode = "categoryCode_example"; // String | Acts as a filter to narrow down and refine POI search results. The category codes are unique 4, 6, or 11 digit numeric values.
    String sicCode = "sicCode_example"; // String | Acts as a filter to narrow down and refine POI search results. The SIC codes are unique 4 or 8 digit numerical values
    String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved
    String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
    String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters (default).
    String travelTime = "travelTime_example"; // String | Travel time within which search is performed (POIs which can be reached within travel time).
    String travelTimeUnit = "travelTimeUnit_example"; // String | Travel time unit such as minutes (default), hours, seconds or milliseconds.
    String travelDistance = "travelDistance_example"; // String | Travel distance within which search is performed (POIs which can be reached within travel distance).
    String travelDistanceUnit = "travelDistanceUnit_example"; // String | Travel distance unit such as Feet (default), Kilometers, Miles or Meters.
    String travelMode = "driving"; // String | Mode of commute.
    String sortBy = "sortBy_example"; // String | Whether to sort the results based on relevance (best match) or by nearest distance from input location.
    String fuzzyOnName = "fuzzyOnName_example"; // String | Whether to allow fuzzy seacrh on name input.
    String page = "page_example"; // String | Specifies the page number of results where page size is the value of maxCandidates input in request.
    String matchMode = "matchMode_example"; // String | Determine the leniency used to make a match between the input name and the reference data.
    String specificMatchOn = "specificMatchOn_example"; // String | Specifies the field for the Specific Match Mode.
    try {
      PlacesResponse result = apiInstance.getPOIsByAddress(address, country, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, matchMode, specificMatchOn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesServiceApi#getPOIsByAddress");
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
 **address** | **String**| The address to be searched. | [optional]
 **country** | **String**| Country ISO code. | [optional]
 **name** | **String**| Specifies the name of the place (POI) to be searched. Also performs search on partially specified names. It requires minimum 3 characters to search. | [optional]
 **type** | **String**| Filters the points of interest (POIs) by place types. | [optional]
 **categoryCode** | **String**| Acts as a filter to narrow down and refine POI search results. The category codes are unique 4, 6, or 11 digit numeric values. | [optional]
 **sicCode** | **String**| Acts as a filter to narrow down and refine POI search results. The SIC codes are unique 4 or 8 digit numerical values | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters (default). | [optional]
 **travelTime** | **String**| Travel time within which search is performed (POIs which can be reached within travel time). | [optional]
 **travelTimeUnit** | **String**| Travel time unit such as minutes (default), hours, seconds or milliseconds. | [optional]
 **travelDistance** | **String**| Travel distance within which search is performed (POIs which can be reached within travel distance). | [optional]
 **travelDistanceUnit** | **String**| Travel distance unit such as Feet (default), Kilometers, Miles or Meters. | [optional]
 **travelMode** | **String**| Mode of commute. | [optional] [default to driving]
 **sortBy** | **String**| Whether to sort the results based on relevance (best match) or by nearest distance from input location. | [optional]
 **fuzzyOnName** | **String**| Whether to allow fuzzy seacrh on name input. | [optional]
 **page** | **String**| Specifies the page number of results where page size is the value of maxCandidates input in request. | [optional]
 **matchMode** | **String**| Determine the leniency used to make a match between the input name and the reference data. | [optional]
 **specificMatchOn** | **String**| Specifies the field for the Specific Match Mode. | [optional]

### Return type

[**PlacesResponse**](PlacesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getPOIsByArea"></a>
# **getPOIsByArea**
> PlacesResponse getPOIsByArea(areaName1, areaName3, postcode1, postcode2, country, name, type, categoryCode, sicCode, maxCandidates, fuzzyOnName, page, matchMode, specificMatchOn)

GET Points Of Interest By Area.

This service accepts city or postcode (alongwith country) and returns points-of-interest places within a city or postcode. Additional input features include retrieving data by name, type, standard industrial classifications and category codes, as well as geographic filtering by radius, travel times and travel distances. Response features include JSON as well as CSV download.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PlacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PlacesServiceApi apiInstance = new PlacesServiceApi(defaultClient);
    String areaName1 = "areaName1_example"; // String | Specifies the largest geographical area, typically a state or province
    String areaName3 = "areaName3_example"; // String | Specifies a city or town name
    String postcode1 = "postcode1_example"; // String | Specifies the postcode(ZIP code) in the appropriate format for the country
    String postcode2 = "postcode2_example"; // String | Specifies the postcode(ZIP code) extension
    String country = "country_example"; // String | Country ISO code
    String name = "name_example"; // String | Specifies the name of the place (POI) to be searched. Also performs search on partially specified names. It requires minimum 3 characters to search
    String type = "type_example"; // String | Filters the points of interest (POIs) by place types
    String categoryCode = "categoryCode_example"; // String | Acts as a filter to narrow down and refine POI search results. The category codes are unique 4, 6, or 11 digit numeric values
    String sicCode = "sicCode_example"; // String | Acts as a filter to narrow down and refine POI search results. The SIC codes are unique 4 or 8 digit numerical values
    String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved
    String fuzzyOnName = "fuzzyOnName_example"; // String | Whether to allow fuzzy seacrh on name input
    String page = "page_example"; // String | Specifies the page number of results where page size is the value of maxCandidates input in request
    String matchMode = "matchMode_example"; // String | Determine the leniency used to make a match between the input name and the reference data
    String specificMatchOn = "specificMatchOn_example"; // String | Specifies the field for the Specific Match Mode
    try {
      PlacesResponse result = apiInstance.getPOIsByArea(areaName1, areaName3, postcode1, postcode2, country, name, type, categoryCode, sicCode, maxCandidates, fuzzyOnName, page, matchMode, specificMatchOn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesServiceApi#getPOIsByArea");
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
 **areaName1** | **String**| Specifies the largest geographical area, typically a state or province | [optional]
 **areaName3** | **String**| Specifies a city or town name | [optional]
 **postcode1** | **String**| Specifies the postcode(ZIP code) in the appropriate format for the country | [optional]
 **postcode2** | **String**| Specifies the postcode(ZIP code) extension | [optional]
 **country** | **String**| Country ISO code | [optional]
 **name** | **String**| Specifies the name of the place (POI) to be searched. Also performs search on partially specified names. It requires minimum 3 characters to search | [optional]
 **type** | **String**| Filters the points of interest (POIs) by place types | [optional]
 **categoryCode** | **String**| Acts as a filter to narrow down and refine POI search results. The category codes are unique 4, 6, or 11 digit numeric values | [optional]
 **sicCode** | **String**| Acts as a filter to narrow down and refine POI search results. The SIC codes are unique 4 or 8 digit numerical values | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved | [optional]
 **fuzzyOnName** | **String**| Whether to allow fuzzy seacrh on name input | [optional]
 **page** | **String**| Specifies the page number of results where page size is the value of maxCandidates input in request | [optional]
 **matchMode** | **String**| Determine the leniency used to make a match between the input name and the reference data | [optional]
 **specificMatchOn** | **String**| Specifies the field for the Specific Match Mode | [optional]

### Return type

[**PlacesResponse**](PlacesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getPOIsByGeometry"></a>
# **getPOIsByGeometry**
> PlacesResponse getPOIsByGeometry(poIByGeometryRequest)

Points Of Interest By Boundary

Accepts a user-defined boundary as input and returns all Points of Interest within the boundary. Additionally, user can filter the response by name, type, standard industrial classifications and category codes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PlacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PlacesServiceApi apiInstance = new PlacesServiceApi(defaultClient);
    POIByGeometryRequest poIByGeometryRequest = new POIByGeometryRequest(); // POIByGeometryRequest | 
    try {
      PlacesResponse result = apiInstance.getPOIsByGeometry(poIByGeometryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesServiceApi#getPOIsByGeometry");
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
 **poIByGeometryRequest** | [**POIByGeometryRequest**](POIByGeometryRequest.md)|  |

### Return type

[**PlacesResponse**](PlacesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getPOIsByLocation"></a>
# **getPOIsByLocation**
> PlacesResponse getPOIsByLocation(longitude, latitude, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, matchMode, specificMatchOn)

Get POIs By Location.

This service accepts latitude/longitude as input and returns nearby points-of-interest places around that location. Additional input features include retrieving data by name, type, standard industrial classifications and category codes, as well as geographic filtering by radius, travel times and travel distances. Response features include JSON as well as CSV download

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PlacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PlacesServiceApi apiInstance = new PlacesServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of the location.
    String latitude = "latitude_example"; // String | Latitude of the location.
    String name = "name_example"; // String | Specifies the name of the place (POI) to be searched. Also performs search on partially specified names. It requires minimum 3 characters to search.
    String type = "type_example"; // String | Filters the points of interest (POIs) by place types.
    String categoryCode = "categoryCode_example"; // String | Acts as a filter to narrow down and refine POI search results. The category codes are unique 4, 6, or 11 digit numeric values.
    String sicCode = "sicCode_example"; // String | Acts as a filter to narrow down and refine POI search results. The SIC codes are unique 4 or 8 digit numerical values
    String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved
    String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
    String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters (default).
    String travelTime = "travelTime_example"; // String | Travel time within which search is performed (POIs which can be reached within travel time).
    String travelTimeUnit = "travelTimeUnit_example"; // String | Travel time unit such as minutes (default), hours, seconds or milliseconds.
    String travelDistance = "travelDistance_example"; // String | Travel distance within which search is performed (POIs which can be reached within travel distance).
    String travelDistanceUnit = "travelDistanceUnit_example"; // String | Travel distance unit such as Feet (default), Kilometers, Miles or Meters.
    String travelMode = "travelMode_example"; // String | Mode of commute.
    String sortBy = "sortBy_example"; // String | Whether to sort the results based on relevance (best match) or by nearest distance from input location.
    String fuzzyOnName = "fuzzyOnName_example"; // String | Whether to allow fuzzy seacrh on name input.
    String page = "page_example"; // String | Specifies the page number of results where page size is the value of maxCandidates input in request.
    String matchMode = "matchMode_example"; // String | Determine the leniency used to make a match between the input name and the reference data.
    String specificMatchOn = "specificMatchOn_example"; // String | Specifies the field for the Specific Match Mode.
    try {
      PlacesResponse result = apiInstance.getPOIsByLocation(longitude, latitude, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, matchMode, specificMatchOn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesServiceApi#getPOIsByLocation");
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
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **name** | **String**| Specifies the name of the place (POI) to be searched. Also performs search on partially specified names. It requires minimum 3 characters to search. | [optional]
 **type** | **String**| Filters the points of interest (POIs) by place types. | [optional]
 **categoryCode** | **String**| Acts as a filter to narrow down and refine POI search results. The category codes are unique 4, 6, or 11 digit numeric values. | [optional]
 **sicCode** | **String**| Acts as a filter to narrow down and refine POI search results. The SIC codes are unique 4 or 8 digit numerical values | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters (default). | [optional]
 **travelTime** | **String**| Travel time within which search is performed (POIs which can be reached within travel time). | [optional]
 **travelTimeUnit** | **String**| Travel time unit such as minutes (default), hours, seconds or milliseconds. | [optional]
 **travelDistance** | **String**| Travel distance within which search is performed (POIs which can be reached within travel distance). | [optional]
 **travelDistanceUnit** | **String**| Travel distance unit such as Feet (default), Kilometers, Miles or Meters. | [optional]
 **travelMode** | **String**| Mode of commute. | [optional]
 **sortBy** | **String**| Whether to sort the results based on relevance (best match) or by nearest distance from input location. | [optional]
 **fuzzyOnName** | **String**| Whether to allow fuzzy seacrh on name input. | [optional]
 **page** | **String**| Specifies the page number of results where page size is the value of maxCandidates input in request. | [optional]
 **matchMode** | **String**| Determine the leniency used to make a match between the input name and the reference data. | [optional]
 **specificMatchOn** | **String**| Specifies the field for the Specific Match Mode. | [optional]

### Return type

[**PlacesResponse**](PlacesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getPOIsCount"></a>
# **getPOIsCount**
> PoiCount getPOIsCount(contentType, poiCountRequest)

Points Of Interest Count

Accepts a user-defined boundary as input and returns the Count number of POIs within the boundary. Additionally, user can request the count of filtered POIs by name, type, standard industrial classifications and category codes within the given polygon.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PlacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PlacesServiceApi apiInstance = new PlacesServiceApi(defaultClient);
    String contentType = "contentType_example"; // String | 
    PoiCountRequest poiCountRequest = new PoiCountRequest(); // PoiCountRequest | 
    try {
      PoiCount result = apiInstance.getPOIsCount(contentType, poiCountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesServiceApi#getPOIsCount");
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
 **contentType** | **String**|  |
 **poiCountRequest** | [**PoiCountRequest**](PoiCountRequest.md)|  |

### Return type

[**PoiCount**](PoiCount.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getSICMetadata"></a>
# **getSICMetadata**
> MetadataResponse getSICMetadata(sicCode, level)

Get SIC Metadata

This service returns a list of standard industrial classification codes &amp; associated metadata which can then be used as inputs for querying the Points of Interest By Address or Location methods listed above.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PlacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PlacesServiceApi apiInstance = new PlacesServiceApi(defaultClient);
    String sicCode = "sicCode_example"; // String | 4 or 8 digits SIC code to filter the response.
    String level = "level_example"; // String | 1 or 2.
    try {
      MetadataResponse result = apiInstance.getSICMetadata(sicCode, level);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesServiceApi#getSICMetadata");
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
 **sicCode** | **String**| 4 or 8 digits SIC code to filter the response. | [optional]
 **level** | **String**| 1 or 2. | [optional]

### Return type

[**MetadataResponse**](MetadataResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="poisAutocomplete"></a>
# **poisAutocomplete**
> PlacesResponse poisAutocomplete(xForwardedFor, longitude, latitude, searchText, searchOnNameOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, country, areaName1, areaName3, postcode1, postcode2, ipAddress, autoDetectLocation, type, categoryCode, sicCode, maxCandidates, sortBy, matchMode, specificMatchOn)

Points Of Interest Autocomplete

This service accepts partial text input and returns matching points of interest, sorted by relevance or distance.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.PlacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    PlacesServiceApi apiInstance = new PlacesServiceApi(defaultClient);
    String xForwardedFor = "xForwardedFor_example"; // String | 
    String longitude = "longitude_example"; // String | Longitude of the location.
    String latitude = "latitude_example"; // String | Latitude of the location.
    String searchText = "searchText_example"; // String | Free text which will accept a multi-word string. Combination of POI name and address is possible.
    String searchOnNameOnly = "N"; // String | 
    String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
    String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters (default).
    String travelTime = "travelTime_example"; // String | Travel time within which search is performed (POIs which can be reached within travel time).
    String travelTimeUnit = "travelTimeUnit_example"; // String | Travel time unit such as minutes (default), hours, seconds or milliseconds.
    String travelDistance = "travelDistance_example"; // String | Travel distance within which search is performed (POIs which can be reached within travel distance).
    String travelDistanceUnit = "travelDistanceUnit_example"; // String | Travel distance unit such as Feet (default), Kilometers, Miles or Meters.
    String travelMode = "driving"; // String | Mode of commute.
    String country = "country_example"; // String | Country ISO code.
    String areaName1 = "areaName1_example"; // String | Specifies the largest geographical area, typically a state or province.
    String areaName3 = "areaName3_example"; // String | Specifies a city or town name.
    String postcode1 = "postcode1_example"; // String | Specifies the postcode(ZIP code) in the appropriate format for the country.
    String postcode2 = "postcode2_example"; // String | Specifies the postcode(ZIP code) extension.
    String ipAddress = "ipAddress_example"; // String | IP address which will be used to auto detect the location in order to serve contextually relevant results.
    String autoDetectLocation = "autoDetectLocation_example"; // String | Specifies whether to detect client's location using IP address. If IP address(below) is not provided and autoDetectLocation is set 'True' then IP address will be picked from HTTP request automatically.
    String type = "type_example"; // String | Filters the points of interest (POIs) by place types.
    String categoryCode = "categoryCode_example"; // String | Acts as a filter to narrow down and refine POI search results. The category codes are unique 4, 6, or 11 digit numeric values.
    String sicCode = "sicCode_example"; // String | Acts as a filter to narrow down and refine POI search results. The SIC codes are unique 4 or 8 digit numerical values.
    String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved.
    String sortBy = "sortBy_example"; // String | sortBy
    String matchMode = "matchMode_example"; // String | Determine the leniency used to make a match between the input name and the reference data.
    String specificMatchOn = "specificMatchOn_example"; // String | Specifies the field for the Specific Match Mode.
    try {
      PlacesResponse result = apiInstance.poisAutocomplete(xForwardedFor, longitude, latitude, searchText, searchOnNameOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, country, areaName1, areaName3, postcode1, postcode2, ipAddress, autoDetectLocation, type, categoryCode, sicCode, maxCandidates, sortBy, matchMode, specificMatchOn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesServiceApi#poisAutocomplete");
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
 **xForwardedFor** | **String**|  | [optional]
 **longitude** | **String**| Longitude of the location. | [optional]
 **latitude** | **String**| Latitude of the location. | [optional]
 **searchText** | **String**| Free text which will accept a multi-word string. Combination of POI name and address is possible. | [optional]
 **searchOnNameOnly** | **String**|  | [optional] [default to N]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters (default). | [optional]
 **travelTime** | **String**| Travel time within which search is performed (POIs which can be reached within travel time). | [optional]
 **travelTimeUnit** | **String**| Travel time unit such as minutes (default), hours, seconds or milliseconds. | [optional]
 **travelDistance** | **String**| Travel distance within which search is performed (POIs which can be reached within travel distance). | [optional]
 **travelDistanceUnit** | **String**| Travel distance unit such as Feet (default), Kilometers, Miles or Meters. | [optional]
 **travelMode** | **String**| Mode of commute. | [optional] [default to driving]
 **country** | **String**| Country ISO code. | [optional]
 **areaName1** | **String**| Specifies the largest geographical area, typically a state or province. | [optional]
 **areaName3** | **String**| Specifies a city or town name. | [optional]
 **postcode1** | **String**| Specifies the postcode(ZIP code) in the appropriate format for the country. | [optional]
 **postcode2** | **String**| Specifies the postcode(ZIP code) extension. | [optional]
 **ipAddress** | **String**| IP address which will be used to auto detect the location in order to serve contextually relevant results. | [optional]
 **autoDetectLocation** | **String**| Specifies whether to detect client&#39;s location using IP address. If IP address(below) is not provided and autoDetectLocation is set &#39;True&#39; then IP address will be picked from HTTP request automatically. | [optional]
 **type** | **String**| Filters the points of interest (POIs) by place types. | [optional]
 **categoryCode** | **String**| Acts as a filter to narrow down and refine POI search results. The category codes are unique 4, 6, or 11 digit numeric values. | [optional]
 **sicCode** | **String**| Acts as a filter to narrow down and refine POI search results. The SIC codes are unique 4 or 8 digit numerical values. | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved. | [optional]
 **sortBy** | **String**| sortBy | [optional]
 **matchMode** | **String**| Determine the leniency used to make a match between the input name and the reference data. | [optional]
 **specificMatchOn** | **String**| Specifies the field for the Specific Match Mode. | [optional]

### Return type

[**PlacesResponse**](PlacesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

