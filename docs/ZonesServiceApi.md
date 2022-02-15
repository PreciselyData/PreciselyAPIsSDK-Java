# ZonesServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBasicBoundaryByAddress**](ZonesServiceApi.md#getBasicBoundaryByAddress) | **GET** /zones/v1/basicboundary/byaddress | Gets Basic Boundary by Address
[**getBasicBoundaryByLocation**](ZonesServiceApi.md#getBasicBoundaryByLocation) | **GET** /zones/v1/basicboundary/bylocation | Gets Basic Boundary by Location
[**getPOIBoundaryByAddress**](ZonesServiceApi.md#getPOIBoundaryByAddress) | **GET** /zones/v1/poiboundary/byaddress | Get Point of Interests Boundary by Address
[**getPOIBoundaryByAddressBatch**](ZonesServiceApi.md#getPOIBoundaryByAddressBatch) | **POST** /zones/v1/poiboundary/byaddress | Batch method for getting Point of Interests Boundary by Address
[**getPOIBoundaryByLocation**](ZonesServiceApi.md#getPOIBoundaryByLocation) | **GET** /zones/v1/poiboundary/bylocation | Get Point of Interests Boundary by Location
[**getPOIBoundaryByLocationBatch**](ZonesServiceApi.md#getPOIBoundaryByLocationBatch) | **POST** /zones/v1/poiboundary/bylocation | Batch method for getting Point of Interests Boundary by Location
[**getTravelBoundaryByDistance**](ZonesServiceApi.md#getTravelBoundaryByDistance) | **GET** /zones/v1/travelboundary/bydistance | Gets travel Boundary by Distance
[**getTravelBoundaryByTime**](ZonesServiceApi.md#getTravelBoundaryByTime) | **GET** /zones/v1/travelboundary/bytime | Gets travel Boundary by Time


<a name="getBasicBoundaryByAddress"></a>
# **getBasicBoundaryByAddress**
> BasicBoundaryAddress getBasicBoundaryByAddress(address, distance, country, distanceUnit, resolution, responseSrs)

Gets Basic Boundary by Address

Gets Basic Boundary by Address

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.ZonesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

ZonesServiceApi apiInstance = new ZonesServiceApi();
String address = "address_example"; // String | Address around which Basic Boundary is requested
String distance = "distance_example"; // String | This is width of the buffer (in a complete circular buffer, it would be radius of the buffer). This has to be a positive number.
String country = "USA"; // String | Three digit ISO country code
String distanceUnit = "feet"; // String | Longitude around which Basic Boundary is requested
String resolution = "resolution_example"; // String | This is resolution of the buffer. Curves generated in buffer are approximated by line segments and it is measured in segments per circle. The higher the resolution, the smoother the curves of the buffer but more points would be required in the boundary geometry. Number greater than 0 and in multiple of 4. If not in 4, then it is approximated to nearest multiple of 4.
String responseSrs = "epsg:4326"; // String | The spatial reference system to express the response in. By default, it would be epsg:4326
try {
    BasicBoundaryAddress result = apiInstance.getBasicBoundaryByAddress(address, distance, country, distanceUnit, resolution, responseSrs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesServiceApi#getBasicBoundaryByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address around which Basic Boundary is requested |
 **distance** | **String**| This is width of the buffer (in a complete circular buffer, it would be radius of the buffer). This has to be a positive number. |
 **country** | **String**| Three digit ISO country code | [optional] [default to USA]
 **distanceUnit** | **String**| Longitude around which Basic Boundary is requested | [optional] [default to feet] [enum: feet, kilometers, meters, miles]
 **resolution** | **String**| This is resolution of the buffer. Curves generated in buffer are approximated by line segments and it is measured in segments per circle. The higher the resolution, the smoother the curves of the buffer but more points would be required in the boundary geometry. Number greater than 0 and in multiple of 4. If not in 4, then it is approximated to nearest multiple of 4. | [optional]
 **responseSrs** | **String**| The spatial reference system to express the response in. By default, it would be epsg:4326 | [optional] [default to epsg:4326]

### Return type

[**BasicBoundaryAddress**](BasicBoundaryAddress.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

<a name="getBasicBoundaryByLocation"></a>
# **getBasicBoundaryByLocation**
> BasicBoundary getBasicBoundaryByLocation(latitude, longitude, distance, distanceUnit, resolution, responseSrs, srsName)

Gets Basic Boundary by Location

Gets Basic Boundary by Location

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.ZonesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

ZonesServiceApi apiInstance = new ZonesServiceApi();
String latitude = "latitude_example"; // String | Latitude around which Basic Boundary is requested
String longitude = "longitude_example"; // String | Longitude around which Basic Boundary is requested
String distance = "distance_example"; // String | This is width of the buffer (in a complete circular buffer, it would be radius of the buffer). This has to be a positive number.
String distanceUnit = "feet"; // String | Longitude around which Basic Boundary is requested
String resolution = "resolution_example"; // String | This is resolution of the buffer. Curves generated in buffer are approximated by line segments and it is measured in segments per circle. The higher the resolution, the smoother the curves of the buffer but more points would be required in the boundary geometry. Number greater than 0 and in multiple of 4. If not in 4, then it is approximated to nearest multiple of 4.
String responseSrs = "epsg:4326"; // String | The spatial reference system to express the response in. By default, it would be epsg:4326
String srsName = "epsg:4326"; // String | The spatial reference system for input. By default, it would be epsg:4326
try {
    BasicBoundary result = apiInstance.getBasicBoundaryByLocation(latitude, longitude, distance, distanceUnit, resolution, responseSrs, srsName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesServiceApi#getBasicBoundaryByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **String**| Latitude around which Basic Boundary is requested |
 **longitude** | **String**| Longitude around which Basic Boundary is requested |
 **distance** | **String**| This is width of the buffer (in a complete circular buffer, it would be radius of the buffer). This has to be a positive number. |
 **distanceUnit** | **String**| Longitude around which Basic Boundary is requested | [optional] [default to feet] [enum: feet, kilometers, meters, miles]
 **resolution** | **String**| This is resolution of the buffer. Curves generated in buffer are approximated by line segments and it is measured in segments per circle. The higher the resolution, the smoother the curves of the buffer but more points would be required in the boundary geometry. Number greater than 0 and in multiple of 4. If not in 4, then it is approximated to nearest multiple of 4. | [optional]
 **responseSrs** | **String**| The spatial reference system to express the response in. By default, it would be epsg:4326 | [optional] [default to epsg:4326]
 **srsName** | **String**| The spatial reference system for input. By default, it would be epsg:4326 | [optional] [default to epsg:4326]

### Return type

[**BasicBoundary**](BasicBoundary.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

<a name="getPOIBoundaryByAddress"></a>
# **getPOIBoundaryByAddress**
> PoiBoundary getPOIBoundaryByAddress(address, categoryCode, sicCode, naicsCode)

Get Point of Interests Boundary by Address

Gets Point of Interests Boundary by Address

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.ZonesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

ZonesServiceApi apiInstance = new ZonesServiceApi();
String address = "address_example"; // String | Address around which POI Boundary is requested
String categoryCode = "categoryCode_example"; // String | Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes.
String sicCode = "sicCode_example"; // String | Specify starting digits or full sic code to filter the response
String naicsCode = "naicsCode_example"; // String | Will accept naicsCode to filter POIs in results. Max 10 allowed.
try {
    PoiBoundary result = apiInstance.getPOIBoundaryByAddress(address, categoryCode, sicCode, naicsCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesServiceApi#getPOIBoundaryByAddress");
    e.printStackTrace();
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

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

<a name="getPOIBoundaryByAddressBatch"></a>
# **getPOIBoundaryByAddressBatch**
> POIBoundaryResponse getPOIBoundaryByAddressBatch(body)

Batch method for getting Point of Interests Boundary by Address

Batch method for getting Point of Interests Boundary by Address

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.ZonesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

ZonesServiceApi apiInstance = new ZonesServiceApi();
POIBoundaryAddressRequest body = new POIBoundaryAddressRequest(); // POIBoundaryAddressRequest | 
try {
    POIBoundaryResponse result = apiInstance.getPOIBoundaryByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesServiceApi#getPOIBoundaryByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**POIBoundaryAddressRequest**](POIBoundaryAddressRequest.md)|  | [optional]

### Return type

[**POIBoundaryResponse**](POIBoundaryResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getPOIBoundaryByLocation"></a>
# **getPOIBoundaryByLocation**
> PoiBoundary getPOIBoundaryByLocation(latitude, longitude, categoryCode, sicCode, naicsCode)

Get Point of Interests Boundary by Location

Get Point of Interests Boundary by Location

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.ZonesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

ZonesServiceApi apiInstance = new ZonesServiceApi();
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
    e.printStackTrace();
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

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

<a name="getPOIBoundaryByLocationBatch"></a>
# **getPOIBoundaryByLocationBatch**
> POIBoundaryResponse getPOIBoundaryByLocationBatch(body)

Batch method for getting Point of Interests Boundary by Location

Batch method for getting Point of Interests Boundary by Location

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.ZonesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

ZonesServiceApi apiInstance = new ZonesServiceApi();
POIBoundaryLocationRequest body = new POIBoundaryLocationRequest(); // POIBoundaryLocationRequest | 
try {
    POIBoundaryResponse result = apiInstance.getPOIBoundaryByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesServiceApi#getPOIBoundaryByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**POIBoundaryLocationRequest**](POIBoundaryLocationRequest.md)|  | [optional]

### Return type

[**POIBoundaryResponse**](POIBoundaryResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getTravelBoundaryByDistance"></a>
# **getTravelBoundaryByDistance**
> TravelBoundaries getTravelBoundaryByDistance(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit)

Gets travel Boundary by Distance

Returns the travel boundary based on travel distance.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.ZonesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

ZonesServiceApi apiInstance = new ZonesServiceApi();
String costs = "costs_example"; // String | Travel distance(s)
String point = "point_example"; // String | Starting point from where the travel boundary is calculated. Point in 'Lat,Long,coordsys' format
String address = "address_example"; // String | Starting address from where the travel boundary is calculated.
String costUnit = "m"; // String | Travel distance such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
String db = "driving"; // String | Mode of commute.
String country = "USA"; // String | Three digit ISO country code.
String maxOffroadDistance = "maxOffroadDistance_example"; // String | Maximum distance to allow travel off the road network.
String maxOffroadDistanceUnit = "maxOffroadDistanceUnit_example"; // String | MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
String destinationSrs = "destinationSrs_example"; // String | Desired coordinate system of the travel boundary.
String majorRoads = "false"; // String | Whether to include all roads in the calculation or just major roads.
String returnHoles = "false"; // String | Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired distance.
String returnIslands = "false"; // String | Whether to return islands, which are small areas outside the main boundary that can be reached within the desired distance.
String simplificationFactor = "0.5"; // String | Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex.
String bandingStyle = "Donut"; // String | Style of banding to be used in the result.
String historicTrafficTimeBucket = "None"; // String | Whether routing calculation uses the historic traffic speeds.
String defaultAmbientSpeed = "defaultAmbientSpeed_example"; // String | The speed to travel when going off a network road to find the travel boundary (for all road types).
String ambientSpeedUnit = "MPH"; // String | The unit of measure to use to calculate the ambient speed.
try {
    TravelBoundaries result = apiInstance.getTravelBoundaryByDistance(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesServiceApi#getTravelBoundaryByDistance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **costs** | **String**| Travel distance(s) |
 **point** | **String**| Starting point from where the travel boundary is calculated. Point in &#39;Lat,Long,coordsys&#39; format | [optional]
 **address** | **String**| Starting address from where the travel boundary is calculated. | [optional]
 **costUnit** | **String**| Travel distance such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [default to m] [enum: m, ft, km, mi, yd]
 **db** | **String**| Mode of commute. | [optional] [default to driving] [enum: driving, walking]
 **country** | **String**| Three digit ISO country code. | [optional] [default to USA]
 **maxOffroadDistance** | **String**| Maximum distance to allow travel off the road network. | [optional]
 **maxOffroadDistanceUnit** | **String**| MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional]
 **destinationSrs** | **String**| Desired coordinate system of the travel boundary. | [optional]
 **majorRoads** | **String**| Whether to include all roads in the calculation or just major roads. | [optional] [default to false] [enum: true, false]
 **returnHoles** | **String**| Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired distance. | [optional] [default to false] [enum: true, false]
 **returnIslands** | **String**| Whether to return islands, which are small areas outside the main boundary that can be reached within the desired distance. | [optional] [default to false] [enum: true, false]
 **simplificationFactor** | **String**| Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex. | [optional] [default to 0.5]
 **bandingStyle** | **String**| Style of banding to be used in the result. | [optional] [default to Donut] [enum: Donut, Encompassing]
 **historicTrafficTimeBucket** | **String**| Whether routing calculation uses the historic traffic speeds. | [optional] [default to None] [enum: None, AMPeak, PMPeak, OffPeak, Night]
 **defaultAmbientSpeed** | **String**| The speed to travel when going off a network road to find the travel boundary (for all road types). | [optional]
 **ambientSpeedUnit** | **String**| The unit of measure to use to calculate the ambient speed. | [optional] [default to MPH] [enum: MPH, KPH, MTPS, MTPM]

### Return type

[**TravelBoundaries**](TravelBoundaries.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

<a name="getTravelBoundaryByTime"></a>
# **getTravelBoundaryByTime**
> TravelBoundaries getTravelBoundaryByTime(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit)

Gets travel Boundary by Time

Travel boundary based on travel time.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.ZonesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

ZonesServiceApi apiInstance = new ZonesServiceApi();
String costs = "costs_example"; // String | Travel time used to calculate the travel boundary.
String point = "point_example"; // String | Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format
String address = "address_example"; // String | Starting address from where the travel boundary is calculated.
String costUnit = "min"; // String | Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond).
String db = "driving"; // String | Mode of commute.
String country = "USA"; // String | 3 character ISO code or country name.
String maxOffroadDistance = "maxOffroadDistance_example"; // String | Maximum distance to allow travel off the road network.
String maxOffroadDistanceUnit = "maxOffroadDistanceUnit_example"; // String | MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
String destinationSrs = "destinationSrs_example"; // String | Desired coordinate system of the travel boundary.
String majorRoads = "false"; // String | Whether to include all roads in the calculation or just major roads.
String returnHoles = "false"; // String | Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time.
String returnIslands = "false"; // String | Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time.
String simplificationFactor = "0.5"; // String | Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex.
String bandingStyle = "Donut"; // String | Style of banding to be used in the result.
String historicTrafficTimeBucket = "None"; // String | Whether routing calculation uses the historic traffic speeds.
String defaultAmbientSpeed = "defaultAmbientSpeed_example"; // String | The speed to travel when going off a network road to find the travel boundary (for all road types).
String ambientSpeedUnit = "MPH"; // String | The unit of measure to use to calculate the ambient speed.
try {
    TravelBoundaries result = apiInstance.getTravelBoundaryByTime(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesServiceApi#getTravelBoundaryByTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **costs** | **String**| Travel time used to calculate the travel boundary. |
 **point** | **String**| Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format | [optional]
 **address** | **String**| Starting address from where the travel boundary is calculated. | [optional]
 **costUnit** | **String**| Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). | [optional] [default to min] [enum: min, msec, s, h]
 **db** | **String**| Mode of commute. | [optional] [default to driving] [enum: driving, walking]
 **country** | **String**| 3 character ISO code or country name. | [optional] [default to USA]
 **maxOffroadDistance** | **String**| Maximum distance to allow travel off the road network. | [optional]
 **maxOffroadDistanceUnit** | **String**| MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [enum: m, km, yd, ft, mi]
 **destinationSrs** | **String**| Desired coordinate system of the travel boundary. | [optional]
 **majorRoads** | **String**| Whether to include all roads in the calculation or just major roads. | [optional] [default to false] [enum: true, false]
 **returnHoles** | **String**| Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time. | [optional] [default to false] [enum: true, false]
 **returnIslands** | **String**| Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time. | [optional] [default to false] [enum: true, false]
 **simplificationFactor** | **String**| Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex. | [optional] [default to 0.5]
 **bandingStyle** | **String**| Style of banding to be used in the result. | [optional] [default to Donut] [enum: Donut, Encompassing]
 **historicTrafficTimeBucket** | **String**| Whether routing calculation uses the historic traffic speeds. | [optional] [default to None] [enum: None, AMPeak, PMPeak, OffPeak, Night]
 **defaultAmbientSpeed** | **String**| The speed to travel when going off a network road to find the travel boundary (for all road types). | [optional]
 **ambientSpeedUnit** | **String**| The unit of measure to use to calculate the ambient speed. | [optional] [default to MPH] [enum: MPH, KPH, MTPS, MTPM]

### Return type

[**TravelBoundaries**](TravelBoundaries.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

