# RoutingServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRouteByAddress**](RoutingServiceApi.md#getRouteByAddress) | **GET** /routing/v1/route/byaddress | Gets Route by Address
[**getRouteByLocation**](RoutingServiceApi.md#getRouteByLocation) | **GET** /routing/v1/route/bylocation | Gets Route by Location
[**getTravelCostMatrixByAddress**](RoutingServiceApi.md#getTravelCostMatrixByAddress) | **GET** /routing/v1/travelcostmatrix/byaddress | Gets Cost Matrix by Address
[**getTravelCostMatrixByLocation**](RoutingServiceApi.md#getTravelCostMatrixByLocation) | **GET** /routing/v1/travelcostmatrix/bylocation | Gets Cost Matrix by Location


<a name="getRouteByAddress"></a>
# **getRouteByAddress**
> GeoRouteResponse getRouteByAddress(startAddress, endAddress, db, country, intermediateAddresses, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit, returnIntermediatePoints)

Gets Route by Address

Routing Directions for Single and Multiple Origin &amp; Destination Inputs. Accepts addresses as input and Returns Point-to-Point and Multi-Point travel directions by various travel modes.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RoutingServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RoutingServiceApi apiInstance = new RoutingServiceApi();
String startAddress = "startAddress_example"; // String | Starting address of the route.
String endAddress = "endAddress_example"; // String | Ending address of the route.
String db = "driving"; // String | Mode of commute.
String country = "USA"; // String | Three digit ISO country code
String intermediateAddresses = "intermediateAddresses_example"; // String | List of intermediate addresses of the route.
String oip = "false"; // String | Specifies whether waypoints need to be optimized.
String destinationSrs = "destinationSrs_example"; // String | Specifies the desired coordinate system of the returned route.
String optimizeBy = "time"; // String | Specifies whether the route should be optimized by time or distance.
String returnDistance = "true"; // String | Specifies whether distance needs to be part of direction information in response.
String distanceUnit = "m"; // String | Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
String returnTime = "true"; // String | Specifies whether time needs to be part of direction information in response.
String timeUnit = "min"; // String | Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond).
String language = "en"; // String | Language of travel directions.
String directionsStyle = "None"; // String | Specifies whether route directions text is to be returned in the response and in what detail (Normal or Terse).
String segmentGeometryStyle = "none"; // String | Specifies whether the route geometry is to be returned in the response and in what detail (End or All).
String primaryNameOnly = "false"; // String | If true then only the primary street name is returned otherwise all the names for a street.
String majorRoads = "false"; // String | Whether to include all roads in route calculation or just major roads.
String historicTrafficTimeBucket = "None"; // String | Specifies whether routing calculation uses the historic traffic speeds.
String returnDirectionGeometry = "false"; // String | Whether to include geometry associated with each route instruction in response.
String useCvr = "N"; // String | This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs
String looseningBarrierRestrictions = "Y"; // String | Specifies that barriers will be removed when determining the route
String vehicleType = "ALL"; // String | vehicle type
String weight = "weight_example"; // String | Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route.
String weightUnit = "kg"; // String | The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton)
String height = "height_example"; // String | Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route.
String heightUnit = "ft"; // String | The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
String length = "length_example"; // String | Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route.
String lengthUnit = "ft"; // String | The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
String width = "width_example"; // String | Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route.
String widthUnit = "ft"; // String | The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
String returnIntermediatePoints = "false"; // String | Specifies whether Intermediate points needs to be part of response.
try {
    GeoRouteResponse result = apiInstance.getRouteByAddress(startAddress, endAddress, db, country, intermediateAddresses, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit, returnIntermediatePoints);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingServiceApi#getRouteByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAddress** | **String**| Starting address of the route. |
 **endAddress** | **String**| Ending address of the route. |
 **db** | **String**| Mode of commute. | [optional] [default to driving] [enum: driving, walking]
 **country** | **String**| Three digit ISO country code | [optional] [default to USA]
 **intermediateAddresses** | **String**| List of intermediate addresses of the route. | [optional]
 **oip** | **String**| Specifies whether waypoints need to be optimized. | [optional] [default to false] [enum: true, false]
 **destinationSrs** | **String**| Specifies the desired coordinate system of the returned route. | [optional]
 **optimizeBy** | **String**| Specifies whether the route should be optimized by time or distance. | [optional] [default to time] [enum: time, distance]
 **returnDistance** | **String**| Specifies whether distance needs to be part of direction information in response. | [optional] [default to true] [enum: true, false]
 **distanceUnit** | **String**| Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [default to m] [enum: m, km, yd, ft, mi]
 **returnTime** | **String**| Specifies whether time needs to be part of direction information in response. | [optional] [default to true] [enum: true, false]
 **timeUnit** | **String**| Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). | [optional] [default to min] [enum: min, msec, s, h]
 **language** | **String**| Language of travel directions. | [optional] [default to en]
 **directionsStyle** | **String**| Specifies whether route directions text is to be returned in the response and in what detail (Normal or Terse). | [optional] [default to None] [enum: None, Normal, Terse]
 **segmentGeometryStyle** | **String**| Specifies whether the route geometry is to be returned in the response and in what detail (End or All). | [optional] [default to none] [enum: none, end, all]
 **primaryNameOnly** | **String**| If true then only the primary street name is returned otherwise all the names for a street. | [optional] [default to false] [enum: true, false]
 **majorRoads** | **String**| Whether to include all roads in route calculation or just major roads. | [optional] [default to false] [enum: true, false]
 **historicTrafficTimeBucket** | **String**| Specifies whether routing calculation uses the historic traffic speeds. | [optional] [default to None] [enum: None, AMPeak, PMPeak, OffPeak, Night]
 **returnDirectionGeometry** | **String**| Whether to include geometry associated with each route instruction in response. | [optional] [default to false] [enum: true, false]
 **useCvr** | **String**| This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs | [optional] [default to N] [enum: Y, N]
 **looseningBarrierRestrictions** | **String**| Specifies that barriers will be removed when determining the route | [optional] [default to Y] [enum: Y, N]
 **vehicleType** | **String**| vehicle type | [optional] [default to ALL] [enum: STRAIGHT, SEMI_TRAILOR, STANDARD_DOUBLE, INTERMEDIATE_DOUBLE, LONG_DOUBLE, TRIPLE, OTHER_LONG_COMBINATION_VEHICLE]
 **weight** | **String**| Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **weightUnit** | **String**| The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton) | [optional] [default to kg] [enum: kg, lb, mt, t]
 **height** | **String**| Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **heightUnit** | **String**| The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]
 **length** | **String**| Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **lengthUnit** | **String**| The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]
 **width** | **String**| Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **widthUnit** | **String**| The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]
 **returnIntermediatePoints** | **String**| Specifies whether Intermediate points needs to be part of response. | [optional] [default to false] [enum: true, false]

### Return type

[**GeoRouteResponse**](GeoRouteResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

<a name="getRouteByLocation"></a>
# **getRouteByLocation**
> GeoRouteResponse getRouteByLocation(startPoint, endPoint, db, intermediatePoints, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit, returnIntermediatePoints)

Gets Route by Location

Returns the fastest or shortest route based on a starting and ending location with optional intermediate points as input.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RoutingServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RoutingServiceApi apiInstance = new RoutingServiceApi();
String startPoint = "startPoint_example"; // String | Start Point in 'Lat,Long,coordsys' format
String endPoint = "endPoint_example"; // String | End Point in 'Lat,Long,coordsys' format
String db = "driving"; // String | Mode of commute.
String intermediatePoints = "intermediatePoints_example"; // String | List of intermediate points of the route.
String oip = "false"; // String | Specifies whether waypoints need to be optimized.
String destinationSrs = "destinationSrs_example"; // String | Specifies the desired coordinate system of the returned route.
String optimizeBy = "time"; // String | Specifies whether the route should be optimized by time or distance.
String returnDistance = "true"; // String | Specifies whether distance needs to be part of direction information in response.
String distanceUnit = "m"; // String | Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
String returnTime = "true"; // String | Specifies whether time needs to be part of direction information in response.
String timeUnit = "min"; // String | Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond).
String language = "en"; // String | Specifies the language of travel directions.
String directionsStyle = "None"; // String | Specifies whether route directions text is to be returned in the response and in what detail (Normal or Terse).
String segmentGeometryStyle = "none"; // String | Specifies whether the route geometry is to be returned in the response and in what detail (End or All).
String primaryNameOnly = "false"; // String | If true then only the primary street name is returned otherwise all the names for a street.
String majorRoads = "false"; // String | Whether to include all roads in route calculation or just major roads.
String historicTrafficTimeBucket = "None"; // String | Specifies whether routing calculation uses the historic traffic speeds.
String returnDirectionGeometry = "false"; // String | Whether to include geometry associated with each route instruction in response.
String useCvr = "N"; // String | This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs
String looseningBarrierRestrictions = "Y"; // String | Specifies that barriers will be removed when determining the route
String vehicleType = "ALL"; // String | vehicle type
String weight = "weight_example"; // String | Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route.
String weightUnit = "kg"; // String | The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton)
String height = "height_example"; // String | Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route.
String heightUnit = "ft"; // String | The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
String length = "length_example"; // String | Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route.
String lengthUnit = "ft"; // String | The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
String width = "width_example"; // String | Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route.
String widthUnit = "ft"; // String | The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
String returnIntermediatePoints = "false"; // String | Specifies whether Intermediate points needs to be part of response.
try {
    GeoRouteResponse result = apiInstance.getRouteByLocation(startPoint, endPoint, db, intermediatePoints, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit, returnIntermediatePoints);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingServiceApi#getRouteByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startPoint** | **String**| Start Point in &#39;Lat,Long,coordsys&#39; format |
 **endPoint** | **String**| End Point in &#39;Lat,Long,coordsys&#39; format |
 **db** | **String**| Mode of commute. | [optional] [default to driving] [enum: driving, walking]
 **intermediatePoints** | **String**| List of intermediate points of the route. | [optional]
 **oip** | **String**| Specifies whether waypoints need to be optimized. | [optional] [default to false] [enum: true, false]
 **destinationSrs** | **String**| Specifies the desired coordinate system of the returned route. | [optional]
 **optimizeBy** | **String**| Specifies whether the route should be optimized by time or distance. | [optional] [default to time] [enum: time, distance]
 **returnDistance** | **String**| Specifies whether distance needs to be part of direction information in response. | [optional] [default to true] [enum: true, false]
 **distanceUnit** | **String**| Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [default to m] [enum: m, km, yd, ft, mi]
 **returnTime** | **String**| Specifies whether time needs to be part of direction information in response. | [optional] [default to true] [enum: true, false]
 **timeUnit** | **String**| Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). | [optional] [default to min] [enum: min, msec, s, h]
 **language** | **String**| Specifies the language of travel directions. | [optional] [default to en]
 **directionsStyle** | **String**| Specifies whether route directions text is to be returned in the response and in what detail (Normal or Terse). | [optional] [default to None] [enum: None, Normal, Terse]
 **segmentGeometryStyle** | **String**| Specifies whether the route geometry is to be returned in the response and in what detail (End or All). | [optional] [default to none] [enum: none, end, all]
 **primaryNameOnly** | **String**| If true then only the primary street name is returned otherwise all the names for a street. | [optional] [default to false] [enum: true, false]
 **majorRoads** | **String**| Whether to include all roads in route calculation or just major roads. | [optional] [default to false] [enum: true, false]
 **historicTrafficTimeBucket** | **String**| Specifies whether routing calculation uses the historic traffic speeds. | [optional] [default to None] [enum: None, AMPeak, PMPeak, OffPeak, Night]
 **returnDirectionGeometry** | **String**| Whether to include geometry associated with each route instruction in response. | [optional] [default to false] [enum: true, false]
 **useCvr** | **String**| This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs | [optional] [default to N] [enum: Y, N]
 **looseningBarrierRestrictions** | **String**| Specifies that barriers will be removed when determining the route | [optional] [default to Y] [enum: Y, N]
 **vehicleType** | **String**| vehicle type | [optional] [default to ALL] [enum: STRAIGHT, SEMI_TRAILOR, STANDARD_DOUBLE, INTERMEDIATE_DOUBLE, LONG_DOUBLE, TRIPLE, OTHER_LONG_COMBINATION_VEHICLE]
 **weight** | **String**| Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **weightUnit** | **String**| The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton) | [optional] [default to kg] [enum: kg, lb, mt, t]
 **height** | **String**| Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **heightUnit** | **String**| The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]
 **length** | **String**| Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **lengthUnit** | **String**| The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]
 **width** | **String**| Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **widthUnit** | **String**| The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]
 **returnIntermediatePoints** | **String**| Specifies whether Intermediate points needs to be part of response. | [optional] [default to false] [enum: true, false]

### Return type

[**GeoRouteResponse**](GeoRouteResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

<a name="getTravelCostMatrixByAddress"></a>
# **getTravelCostMatrixByAddress**
> TravelCostMatrixResponse getTravelCostMatrixByAddress(startAddresses, endAddresses, db, country, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit)

Gets Cost Matrix by Address

Calculates the travel time and distances between an array of start and end addresses.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RoutingServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RoutingServiceApi apiInstance = new RoutingServiceApi();
String startAddresses = "startAddresses_example"; // String | Start locations in text based addresses.
String endAddresses = "endAddresses_example"; // String | End locations in text based addresses.
String db = "driving"; // String | Mode of commute.
String country = "USA"; // String | 3 Digit ISO country code.
String optimizeBy = "time"; // String | Specifies the type of optimizing to use for the route (time/distance).
String returnDistance = "true"; // String | Specifies whether to return the travel distance in the response or not.
String destinationSrs = "destinationSrs_example"; // String | Coordinate system used for the returned routes.
String distanceUnit = "m"; // String | Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
String returnTime = "true"; // String | Specifies whether to return the travel time in the response or not.
String timeUnit = "min"; // String | Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond).
String majorRoads = "false"; // String | Whether to include all roads in routes calculation or just major roads.
String returnOptimalRoutesOnly = "true"; // String | Specifies whether to return only the optimized route for each start and end point combination.
String historicTrafficTimeBucket = "None"; // String | Specifies whether routing calculation uses the historic traffic speeds.
String useCvr = "N"; // String | This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs
String looseningBarrierRestrictions = "Y"; // String | Specifies that barriers will be removed when determining the route
String vehicleType = "ALL"; // String | vehicle type
String weight = "weight_example"; // String | Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route.
String weightUnit = "kg"; // String | The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton)
String height = "height_example"; // String | Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route.
String heightUnit = "ft"; // String | The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
String length = "length_example"; // String | Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route.
String lengthUnit = "ft"; // String | The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
String width = "width_example"; // String | Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route.
String widthUnit = "ft"; // String | The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
try {
    TravelCostMatrixResponse result = apiInstance.getTravelCostMatrixByAddress(startAddresses, endAddresses, db, country, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingServiceApi#getTravelCostMatrixByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAddresses** | **String**| Start locations in text based addresses. |
 **endAddresses** | **String**| End locations in text based addresses. |
 **db** | **String**| Mode of commute. | [optional] [default to driving] [enum: driving, walking]
 **country** | **String**| 3 Digit ISO country code. | [optional] [default to USA]
 **optimizeBy** | **String**| Specifies the type of optimizing to use for the route (time/distance). | [optional] [default to time] [enum: time, distance]
 **returnDistance** | **String**| Specifies whether to return the travel distance in the response or not. | [optional] [default to true] [enum: true, false]
 **destinationSrs** | **String**| Coordinate system used for the returned routes. | [optional]
 **distanceUnit** | **String**| Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [default to m] [enum: m, km, yd, ft, mi]
 **returnTime** | **String**| Specifies whether to return the travel time in the response or not. | [optional] [default to true] [enum: true, false]
 **timeUnit** | **String**| Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). | [optional] [default to min] [enum: min, msec, s, h]
 **majorRoads** | **String**| Whether to include all roads in routes calculation or just major roads. | [optional] [default to false] [enum: true, false]
 **returnOptimalRoutesOnly** | **String**| Specifies whether to return only the optimized route for each start and end point combination. | [optional] [default to true] [enum: true, false]
 **historicTrafficTimeBucket** | **String**| Specifies whether routing calculation uses the historic traffic speeds. | [optional] [default to None] [enum: None, AMPeak, PMPeak, OffPeak, Night]
 **useCvr** | **String**| This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs | [optional] [default to N] [enum: Y, N]
 **looseningBarrierRestrictions** | **String**| Specifies that barriers will be removed when determining the route | [optional] [default to Y] [enum: Y, N]
 **vehicleType** | **String**| vehicle type | [optional] [default to ALL] [enum: STRAIGHT, SEMI_TRAILOR, STANDARD_DOUBLE, INTERMEDIATE_DOUBLE, LONG_DOUBLE, TRIPLE, OTHER_LONG_COMBINATION_VEHICLE]
 **weight** | **String**| Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **weightUnit** | **String**| The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton) | [optional] [default to kg] [enum: kg, lb, mt, t]
 **height** | **String**| Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **heightUnit** | **String**| The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]
 **length** | **String**| Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **lengthUnit** | **String**| The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]
 **width** | **String**| Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **widthUnit** | **String**| The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]

### Return type

[**TravelCostMatrixResponse**](TravelCostMatrixResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

<a name="getTravelCostMatrixByLocation"></a>
# **getTravelCostMatrixByLocation**
> TravelCostMatrixResponse getTravelCostMatrixByLocation(startPoints, endPoints, db, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit)

Gets Cost Matrix by Location

GeoRoute&#39;s &#39;Travel Cost Matrix By Location&#39; service calculates the travel time and distances between an array of start and end points based on location coordinates.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.RoutingServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

RoutingServiceApi apiInstance = new RoutingServiceApi();
String startPoints = "startPoints_example"; // String | The address to be searched.
String endPoints = "endPoints_example"; // String | The address to be searched.
String db = "driving"; // String | Mode of commute.
String optimizeBy = "time"; // String | Specifies whether routes should be optimized by time or distance.
String returnDistance = "true"; // String | Specifies whether distance needs to be returned in response.
String destinationSrs = "destinationSrs_example"; // String | Specifies the desired coordinate system of returned routes.
String distanceUnit = "m"; // String | Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
String returnTime = "true"; // String | Specifies whether time needs to be returned in response.
String timeUnit = "min"; // String | Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond).
String majorRoads = "false"; // String | Whether to include all roads in routes calculation or just major roads.
String returnOptimalRoutesOnly = "true"; // String | Specifies whether to return only the optimized route for each start and end point combination.
String historicTrafficTimeBucket = "None"; // String | Specifies whether routing calculation uses the historic traffic speeds.
String useCvr = "N"; // String | This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs
String looseningBarrierRestrictions = "Y"; // String | Specifies that barriers will be removed when determining the route
String vehicleType = "ALL"; // String | vehicle type
String weight = "weight_example"; // String | Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route.
String weightUnit = "kg"; // String | The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton)
String height = "height_example"; // String | Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route.
String heightUnit = "ft"; // String | The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
String length = "length_example"; // String | Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route.
String lengthUnit = "ft"; // String | The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
String width = "width_example"; // String | Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route.
String widthUnit = "ft"; // String | The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile)
try {
    TravelCostMatrixResponse result = apiInstance.getTravelCostMatrixByLocation(startPoints, endPoints, db, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingServiceApi#getTravelCostMatrixByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startPoints** | **String**| The address to be searched. |
 **endPoints** | **String**| The address to be searched. |
 **db** | **String**| Mode of commute. | [optional] [default to driving] [enum: driving, walking]
 **optimizeBy** | **String**| Specifies whether routes should be optimized by time or distance. | [optional] [default to time] [enum: time, distance]
 **returnDistance** | **String**| Specifies whether distance needs to be returned in response. | [optional] [default to true] [enum: true, false]
 **destinationSrs** | **String**| Specifies the desired coordinate system of returned routes. | [optional]
 **distanceUnit** | **String**| Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [default to m] [enum: m, km, yd, ft, mi]
 **returnTime** | **String**| Specifies whether time needs to be returned in response. | [optional] [default to true] [enum: true, false]
 **timeUnit** | **String**| Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). | [optional] [default to min] [enum: min, msec, s, h]
 **majorRoads** | **String**| Whether to include all roads in routes calculation or just major roads. | [optional] [default to false] [enum: true, false]
 **returnOptimalRoutesOnly** | **String**| Specifies whether to return only the optimized route for each start and end point combination. | [optional] [default to true] [enum: true, false]
 **historicTrafficTimeBucket** | **String**| Specifies whether routing calculation uses the historic traffic speeds. | [optional] [default to None] [enum: None, AMPeak, PMPeak, OffPeak, Night]
 **useCvr** | **String**| This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs | [optional] [default to N] [enum: Y, N]
 **looseningBarrierRestrictions** | **String**| Specifies that barriers will be removed when determining the route | [optional] [default to Y] [enum: Y, N]
 **vehicleType** | **String**| vehicle type | [optional] [default to ALL] [enum: STRAIGHT, SEMI_TRAILOR, STANDARD_DOUBLE, INTERMEDIATE_DOUBLE, LONG_DOUBLE, TRIPLE, OTHER_LONG_COMBINATION_VEHICLE]
 **weight** | **String**| Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **weightUnit** | **String**| The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton) | [optional] [default to kg] [enum: kg, lb, mt, t]
 **height** | **String**| Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **heightUnit** | **String**| The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]
 **length** | **String**| Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **lengthUnit** | **String**| The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]
 **width** | **String**| Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [enum: positive integer value]
 **widthUnit** | **String**| The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile) | [optional] [default to ft] [enum: m, km, yd, ft, mi]

### Return type

[**TravelCostMatrixResponse**](TravelCostMatrixResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

