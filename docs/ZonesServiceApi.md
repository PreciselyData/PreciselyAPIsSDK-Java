# ZonesServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBasicBoundaryByAddress**](ZonesServiceApi.md#getBasicBoundaryByAddress) | **GET** /zones/v1/basicboundary/byaddress | Gets Basic Boundary by Address.
[**getBasicBoundaryByLocation**](ZonesServiceApi.md#getBasicBoundaryByLocation) | **GET** /zones/v1/basicboundary/bylocation | Gets Basic Boundary by Location.
[**getPOIBoundaryByAddress**](ZonesServiceApi.md#getPOIBoundaryByAddress) | **GET** /zones/v1/poiboundary/byaddress | Gets Point of Interests Boundary by Address.
[**getPOIBoundaryByAddressBatch**](ZonesServiceApi.md#getPOIBoundaryByAddressBatch) | **POST** /zones/v1/poiboundary/byaddress | Batch method for getting Point of Interests Boundary by Address.
[**getPOIBoundaryByLocation**](ZonesServiceApi.md#getPOIBoundaryByLocation) | **GET** /zones/v1/poiboundary/bylocation | Get Point of Interests Boundary by Location.
[**getPOIBoundaryByLocationBatch**](ZonesServiceApi.md#getPOIBoundaryByLocationBatch) | **POST** /zones/v1/poiboundary/bylocation | Batch method for getting Point of Interests Boundary by Location.
[**getTravelBoundaryByDistance**](ZonesServiceApi.md#getTravelBoundaryByDistance) | **GET** /zones/v1/travelboundary/bydistance | Get TravelBoundary By Distance.
[**getTravelBoundaryByTime**](ZonesServiceApi.md#getTravelBoundaryByTime) | **GET** /zones/v1/travelboundary/bytime | Get TravelBoundary By Time.


<a name="getBasicBoundaryByAddress"></a>
# **getBasicBoundaryByAddress**
> BasicBoundary getBasicBoundaryByAddress(address, country, distance, distanceUnit, resolution, responseSrs)

Gets Basic Boundary by Address.

Gets Basic Boundary by Address.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.ZonesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    ZonesServiceApi apiInstance = new ZonesServiceApi(defaultClient);
    String address = "address_example"; // String | Address around which Basic Boundary is requested
    String country = "country_example"; // String | Three digit ISO country code
    String distance = "distance_example"; // String | 
    String distanceUnit = "distanceUnit_example"; // String | 
    String resolution = "resolution_example"; // String | This is resolution of the buffer. Curves generated in buffer are approximated by line segments and it is measured in segments per circle. The higher the resolution, the smoother the curves of the buffer but more points would be required in the boundary geometry. Number greater than 0 and in multiple of 4. If not in 4, then it is approximated to nearest multiple of 4.
    String responseSrs = "responseSrs_example"; // String | 
    try {
      BasicBoundary result = apiInstance.getBasicBoundaryByAddress(address, country, distance, distanceUnit, resolution, responseSrs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesServiceApi#getBasicBoundaryByAddress");
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
 **address** | **String**| Address around which Basic Boundary is requested |
 **country** | **String**| Three digit ISO country code | [optional]
 **distance** | **String**|  | [optional]
 **distanceUnit** | **String**|  | [optional]
 **resolution** | **String**| This is resolution of the buffer. Curves generated in buffer are approximated by line segments and it is measured in segments per circle. The higher the resolution, the smoother the curves of the buffer but more points would be required in the boundary geometry. Number greater than 0 and in multiple of 4. If not in 4, then it is approximated to nearest multiple of 4. | [optional]
 **responseSrs** | **String**|  | [optional]

### Return type

[**BasicBoundary**](BasicBoundary.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getBasicBoundaryByLocation"></a>
# **getBasicBoundaryByLocation**
> BasicBoundary getBasicBoundaryByLocation(latitude, longitude, distance, distanceUnit, resolution, responseSrs, srsName)

Gets Basic Boundary by Location.

Gets Basic Boundary by Location.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.ZonesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    ZonesServiceApi apiInstance = new ZonesServiceApi(defaultClient);
    String latitude = "latitude_example"; // String | Latitude around which Basic Boundary is requested
    String longitude = "longitude_example"; // String | Longitude around which Basic Boundary is requested
    String distance = "distance_example"; // String | This is width of the buffer (in a complete circular buffer, it would be radius of the buffer). This has to be a positive number.
    String distanceUnit = "distanceUnit_example"; // String | 
    String resolution = "resolution_example"; // String | This is resolution of the buffer. Curves generated in buffer are approximated by line segments and it is measured in segments per circle. The higher the resolution, the smoother the curves of the buffer but more points would be required in the boundary geometry. Number greater than 0 and in multiple of 4. If not in 4, then it is approximated to nearest multiple of 4.
    String responseSrs = "responseSrs_example"; // String | 
    String srsName = "srsName_example"; // String | 
    try {
      BasicBoundary result = apiInstance.getBasicBoundaryByLocation(latitude, longitude, distance, distanceUnit, resolution, responseSrs, srsName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesServiceApi#getBasicBoundaryByLocation");
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
 **latitude** | **String**| Latitude around which Basic Boundary is requested |
 **longitude** | **String**| Longitude around which Basic Boundary is requested |
 **distance** | **String**| This is width of the buffer (in a complete circular buffer, it would be radius of the buffer). This has to be a positive number. |
 **distanceUnit** | **String**|  | [optional]
 **resolution** | **String**| This is resolution of the buffer. Curves generated in buffer are approximated by line segments and it is measured in segments per circle. The higher the resolution, the smoother the curves of the buffer but more points would be required in the boundary geometry. Number greater than 0 and in multiple of 4. If not in 4, then it is approximated to nearest multiple of 4. | [optional]
 **responseSrs** | **String**|  | [optional]
 **srsName** | **String**|  | [optional]

### Return type

[**BasicBoundary**](BasicBoundary.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getPOIBoundaryByAddress"></a>
# **getPOIBoundaryByAddress**
> PoiBoundary getPOIBoundaryByAddress(address, categoryCode, sicCode, naicsCode)

Gets Point of Interests Boundary by Address.

Gets Point of Interests Boundary by Address.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.ZonesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    ZonesServiceApi apiInstance = new ZonesServiceApi(defaultClient);
    String address = "address_example"; // String | Address around which POI Boundary is requested
    String categoryCode = "categoryCode_example"; // String | Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes.
    String sicCode = "sicCode_example"; // String | Specify starting digits or full sic code to filter the response
    String naicsCode = "naicsCode_example"; // String | Will accept naicsCode to filter POIs in results. Max 10 allowed.
    try {
      PoiBoundary result = apiInstance.getPOIBoundaryByAddress(address, categoryCode, sicCode, naicsCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesServiceApi#getPOIBoundaryByAddress");
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
 **address** | **String**| Address around which POI Boundary is requested |
 **categoryCode** | **String**| Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. | [optional]
 **sicCode** | **String**| Specify starting digits or full sic code to filter the response | [optional]
 **naicsCode** | **String**| Will accept naicsCode to filter POIs in results. Max 10 allowed. | [optional]

### Return type

[**PoiBoundary**](PoiBoundary.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getPOIBoundaryByAddressBatch"></a>
# **getPOIBoundaryByAddressBatch**
> POIBoundaryResponse getPOIBoundaryByAddressBatch(poIBoundaryAddressRequest)

Batch method for getting Point of Interests Boundary by Address.

Batch method for getting Point of Interests Boundary by Address.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.ZonesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    ZonesServiceApi apiInstance = new ZonesServiceApi(defaultClient);
    POIBoundaryAddressRequest poIBoundaryAddressRequest = new POIBoundaryAddressRequest(); // POIBoundaryAddressRequest | 
    try {
      POIBoundaryResponse result = apiInstance.getPOIBoundaryByAddressBatch(poIBoundaryAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesServiceApi#getPOIBoundaryByAddressBatch");
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
 **poIBoundaryAddressRequest** | [**POIBoundaryAddressRequest**](POIBoundaryAddressRequest.md)|  |

### Return type

[**POIBoundaryResponse**](POIBoundaryResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getPOIBoundaryByLocation"></a>
# **getPOIBoundaryByLocation**
> PoiBoundary getPOIBoundaryByLocation(latitude, longitude, categoryCode, sicCode, naicsCode)

Get Point of Interests Boundary by Location.

Get Point of Interests Boundary by Location.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.ZonesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    ZonesServiceApi apiInstance = new ZonesServiceApi(defaultClient);
    String latitude = "latitude_example"; // String | Latitude around which POI Boundary is requested
    String longitude = "longitude_example"; // String | Longitude around which POI Boundary is requested
    String categoryCode = "categoryCode_example"; // String | Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes
    String sicCode = "sicCode_example"; // String | Specify starting digits or full sic code to filter the response
    String naicsCode = "naicsCode_example"; // String | Will accept naicsCode to filter POIs in results. Max 10 allowed.
    try {
      PoiBoundary result = apiInstance.getPOIBoundaryByLocation(latitude, longitude, categoryCode, sicCode, naicsCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesServiceApi#getPOIBoundaryByLocation");
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
 **latitude** | **String**| Latitude around which POI Boundary is requested |
 **longitude** | **String**| Longitude around which POI Boundary is requested |
 **categoryCode** | **String**| Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes | [optional]
 **sicCode** | **String**| Specify starting digits or full sic code to filter the response | [optional]
 **naicsCode** | **String**| Will accept naicsCode to filter POIs in results. Max 10 allowed. | [optional]

### Return type

[**PoiBoundary**](PoiBoundary.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getPOIBoundaryByLocationBatch"></a>
# **getPOIBoundaryByLocationBatch**
> POIBoundaryResponse getPOIBoundaryByLocationBatch(poIBoundaryLocationRequest)

Batch method for getting Point of Interests Boundary by Location.

Batch method for getting Point of Interests Boundary by Location.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.ZonesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    ZonesServiceApi apiInstance = new ZonesServiceApi(defaultClient);
    POIBoundaryLocationRequest poIBoundaryLocationRequest = new POIBoundaryLocationRequest(); // POIBoundaryLocationRequest | 
    try {
      POIBoundaryResponse result = apiInstance.getPOIBoundaryByLocationBatch(poIBoundaryLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesServiceApi#getPOIBoundaryByLocationBatch");
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
 **poIBoundaryLocationRequest** | [**POIBoundaryLocationRequest**](POIBoundaryLocationRequest.md)|  |

### Return type

[**POIBoundaryResponse**](POIBoundaryResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getTravelBoundaryByDistance"></a>
# **getTravelBoundaryByDistance**
> TravelBoundaries getTravelBoundaryByDistance(point, address, costs, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit)

Get TravelBoundary By Distance.

Returns the travel boundary based on travel distance.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.ZonesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    ZonesServiceApi apiInstance = new ZonesServiceApi(defaultClient);
    String point = "point_example"; // String | Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format
    String address = "address_example"; // String | Address around which Basic Boundary is requested.
    String costs = "costs_example"; // String | Travel time used to calculate the travel boundary.
    String costUnit = "costUnit_example"; // String | Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond).
    String db = "db_example"; // String | Mode of commute.
    String country = "country_example"; // String | 3 character ISO code or country name.
    String maxOffroadDistance = "maxOffroadDistance_example"; // String | Maximum distance to allow travel off the road network.
    String maxOffroadDistanceUnit = "maxOffroadDistanceUnit_example"; // String | MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
    String destinationSrs = "destinationSrs_example"; // String | Desired coordinate system of the travel boundary.
    String majorRoads = "true"; // String | Whether to include all roads in the calculation or just major roads.
    String returnHoles = "returnHoles_example"; // String | Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time
    String returnIslands = "returnIslands_example"; // String | Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time
    String simplificationFactor = "simplificationFactor_example"; // String | Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex
    String bandingStyle = "bandingStyle_example"; // String | Style of banding to be used in the result
    String historicTrafficTimeBucket = "historicTrafficTimeBucket_example"; // String | Whether routing calculation uses the historic traffic speeds
    String defaultAmbientSpeed = "defaultAmbientSpeed_example"; // String | The speed to travel when going off a network road to find the travel boundary (for all road types).
    String ambientSpeedUnit = "ambientSpeedUnit_example"; // String | The unit of measure to use to calculate the ambient speed.
    try {
      TravelBoundaries result = apiInstance.getTravelBoundaryByDistance(point, address, costs, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesServiceApi#getTravelBoundaryByDistance");
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
 **point** | **String**| Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format | [optional]
 **address** | **String**| Address around which Basic Boundary is requested. | [optional]
 **costs** | **String**| Travel time used to calculate the travel boundary. | [optional]
 **costUnit** | **String**| Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). | [optional]
 **db** | **String**| Mode of commute. | [optional]
 **country** | **String**| 3 character ISO code or country name. | [optional]
 **maxOffroadDistance** | **String**| Maximum distance to allow travel off the road network. | [optional]
 **maxOffroadDistanceUnit** | **String**| MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional]
 **destinationSrs** | **String**| Desired coordinate system of the travel boundary. | [optional]
 **majorRoads** | **String**| Whether to include all roads in the calculation or just major roads. | [optional] [default to true]
 **returnHoles** | **String**| Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time | [optional]
 **returnIslands** | **String**| Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time | [optional]
 **simplificationFactor** | **String**| Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex | [optional]
 **bandingStyle** | **String**| Style of banding to be used in the result | [optional]
 **historicTrafficTimeBucket** | **String**| Whether routing calculation uses the historic traffic speeds | [optional]
 **defaultAmbientSpeed** | **String**| The speed to travel when going off a network road to find the travel boundary (for all road types). | [optional]
 **ambientSpeedUnit** | **String**| The unit of measure to use to calculate the ambient speed. | [optional]

### Return type

[**TravelBoundaries**](TravelBoundaries.md)

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

<a name="getTravelBoundaryByTime"></a>
# **getTravelBoundaryByTime**
> TravelBoundaries getTravelBoundaryByTime(point, address, costs, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit)

Get TravelBoundary By Time.

Travel boundary based on travel time.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.ZonesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    ZonesServiceApi apiInstance = new ZonesServiceApi(defaultClient);
    String point = "point_example"; // String | Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format
    String address = "address_example"; // String | Starting address from where the travel boundary is calculated.
    String costs = "costs_example"; // String | Travel time used to calculate the travel boundary.
    String costUnit = "costUnit_example"; // String | Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond).
    String db = "db_example"; // String | Mode of commute.
    String country = "country_example"; // String | 3 character ISO code or country name.
    String maxOffroadDistance = "maxOffroadDistance_example"; // String | Maximum distance to allow travel off the road network.
    String maxOffroadDistanceUnit = "maxOffroadDistanceUnit_example"; // String | MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
    String destinationSrs = "destinationSrs_example"; // String | Desired coordinate system of the travel boundary.
    String majorRoads = "true"; // String | Whether to include all roads in the calculation or just major roads.
    String returnHoles = "returnHoles_example"; // String | Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time
    String returnIslands = "returnIslands_example"; // String | Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time
    String simplificationFactor = "simplificationFactor_example"; // String | Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex
    String bandingStyle = "bandingStyle_example"; // String | Style of banding to be used in the result
    String historicTrafficTimeBucket = "historicTrafficTimeBucket_example"; // String | Whether routing calculation uses the historic traffic speeds
    String defaultAmbientSpeed = "defaultAmbientSpeed_example"; // String | The speed to travel when going off a network road to find the travel boundary (for all road types).
    String ambientSpeedUnit = "ambientSpeedUnit_example"; // String | The unit of measure to use to calculate the ambient speed.
    try {
      TravelBoundaries result = apiInstance.getTravelBoundaryByTime(point, address, costs, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZonesServiceApi#getTravelBoundaryByTime");
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
 **point** | **String**| Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format | [optional]
 **address** | **String**| Starting address from where the travel boundary is calculated. | [optional]
 **costs** | **String**| Travel time used to calculate the travel boundary. | [optional]
 **costUnit** | **String**| Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). | [optional]
 **db** | **String**| Mode of commute. | [optional]
 **country** | **String**| 3 character ISO code or country name. | [optional]
 **maxOffroadDistance** | **String**| Maximum distance to allow travel off the road network. | [optional]
 **maxOffroadDistanceUnit** | **String**| MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional]
 **destinationSrs** | **String**| Desired coordinate system of the travel boundary. | [optional]
 **majorRoads** | **String**| Whether to include all roads in the calculation or just major roads. | [optional] [default to true]
 **returnHoles** | **String**| Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time | [optional]
 **returnIslands** | **String**| Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time | [optional]
 **simplificationFactor** | **String**| Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex | [optional]
 **bandingStyle** | **String**| Style of banding to be used in the result | [optional]
 **historicTrafficTimeBucket** | **String**| Whether routing calculation uses the historic traffic speeds | [optional]
 **defaultAmbientSpeed** | **String**| The speed to travel when going off a network road to find the travel boundary (for all road types). | [optional]
 **ambientSpeedUnit** | **String**| The unit of measure to use to calculate the ambient speed. | [optional]

### Return type

[**TravelBoundaries**](TravelBoundaries.md)

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

