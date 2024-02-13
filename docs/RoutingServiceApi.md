# RoutingServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRouteByAddress**](RoutingServiceApi.md#getRouteByAddress) | **GET** /routing/v1/route/byaddress | Gets Route By Address.
[**getRouteByLocation**](RoutingServiceApi.md#getRouteByLocation) | **GET** /routing/v1/route/bylocation | Gets Route By Location.
[**getTravelCostMatrixByAddress**](RoutingServiceApi.md#getTravelCostMatrixByAddress) | **GET** /routing/v1/travelcostmatrix/byaddress | Get Cost Matrix By Address.
[**getTravelCostMatrixByLocation**](RoutingServiceApi.md#getTravelCostMatrixByLocation) | **GET** /routing/v1/travelcostmatrix/bylocation | Get Cost Matrix By Location.


<a name="getRouteByAddress"></a>
# **getRouteByAddress**
> RouteResponse getRouteByAddress(startAddress, endAddress, db, country, intermediateAddresses, returnIntermediatePoints, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit)

Gets Route By Address.

Accepts addresses as input and Returns Point-to-Point and Multi-Point travel directions by various travel modes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RoutingServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RoutingServiceApi apiInstance = new RoutingServiceApi(defaultClient);
    String startAddress = "startAddress_example"; // String | Starting address of the route.
    String endAddress = "endAddress_example"; // String | Ending address of the route.
    String db = "driving"; // String | Mode of commute.
    String country = "USA"; // String | Three digit ISO country code.
    String intermediateAddresses = "intermediateAddresses_example"; // String | List of intermediate points of the route.
    String returnIntermediatePoints = "false"; // String | return intermediate points
    String oip = "false"; // String | Specifies whether waypoints need to be optimized.
    String destinationSrs = "destinationSrs_example"; // String | Specifies the desired coordinate system of the returned route.
    String optimizeBy = "time"; // String | Specifies whether the route should be optimized by time or distance.
    String returnDistance = "true"; // String | Specifies whether distance needs to be part of direction information in response.
    String distanceUnit = "m"; // String | Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
    String returnTime = "true"; // String | Specifies whether time needs to be part of direction information in response.
    String timeUnit = "min"; // String | Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond)
    String language = "language_example"; // String | Specifies the language of travel directions.
    String directionsStyle = "None"; // String | Specifies whether route directions text is to be returned in the response and in what detail (Normal or Terse).
    String segmentGeometryStyle = "none"; // String | Specifies whether the route geometry is to be returned in the response and in what detail (End or All).
    String primaryNameOnly = "false"; // String | If true then only the primary street name is returned otherwise all the names for a street.
    String majorRoads = "false"; // String | Whether to include all roads in route calculation or just major roads.
    String historicTrafficTimeBucket = "None"; // String | Specifies whether routing calculation uses the historic traffic speeds.
    String returnDirectionGeometry = "false"; // String | Whether to include geometry associated with each route instruction in response.
    String useCvr = "N"; // String | This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs.
    String looseningBarrierRestrictions = "Y"; // String | Specifies that barriers will be removed when determining the route.
    String vehicleType = "ALL"; // String | vehicle type.
    String weight = ""; // String | Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String weightUnit = "kg"; // String | The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton).
    String height = ""; // String | Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String heightUnit = "ft"; // String | The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    String length = ""; // String | Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String lengthUnit = "ft"; // String | The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    String width = ""; // String | Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String widthUnit = "ft"; // String | The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    try {
      RouteResponse result = apiInstance.getRouteByAddress(startAddress, endAddress, db, country, intermediateAddresses, returnIntermediatePoints, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingServiceApi#getRouteByAddress");
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
 **startAddress** | **String**| Starting address of the route. | [optional]
 **endAddress** | **String**| Ending address of the route. | [optional]
 **db** | **String**| Mode of commute. | [optional] [default to driving]
 **country** | **String**| Three digit ISO country code. | [optional] [default to USA]
 **intermediateAddresses** | **String**| List of intermediate points of the route. | [optional]
 **returnIntermediatePoints** | **String**| return intermediate points | [optional] [default to false]
 **oip** | **String**| Specifies whether waypoints need to be optimized. | [optional] [default to false]
 **destinationSrs** | **String**| Specifies the desired coordinate system of the returned route. | [optional]
 **optimizeBy** | **String**| Specifies whether the route should be optimized by time or distance. | [optional] [default to time]
 **returnDistance** | **String**| Specifies whether distance needs to be part of direction information in response. | [optional] [default to true]
 **distanceUnit** | **String**| Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [default to m]
 **returnTime** | **String**| Specifies whether time needs to be part of direction information in response. | [optional] [default to true]
 **timeUnit** | **String**| Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond) | [optional] [default to min]
 **language** | **String**| Specifies the language of travel directions. | [optional]
 **directionsStyle** | **String**| Specifies whether route directions text is to be returned in the response and in what detail (Normal or Terse). | [optional] [default to None]
 **segmentGeometryStyle** | **String**| Specifies whether the route geometry is to be returned in the response and in what detail (End or All). | [optional] [default to none]
 **primaryNameOnly** | **String**| If true then only the primary street name is returned otherwise all the names for a street. | [optional] [default to false]
 **majorRoads** | **String**| Whether to include all roads in route calculation or just major roads. | [optional] [default to false]
 **historicTrafficTimeBucket** | **String**| Specifies whether routing calculation uses the historic traffic speeds. | [optional] [default to None]
 **returnDirectionGeometry** | **String**| Whether to include geometry associated with each route instruction in response. | [optional] [default to false]
 **useCvr** | **String**| This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs. | [optional] [default to N]
 **looseningBarrierRestrictions** | **String**| Specifies that barriers will be removed when determining the route. | [optional] [default to Y]
 **vehicleType** | **String**| vehicle type. | [optional] [default to ALL]
 **weight** | **String**| Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **weightUnit** | **String**| The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton). | [optional] [default to kg]
 **height** | **String**| Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **heightUnit** | **String**| The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]
 **length** | **String**| Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **lengthUnit** | **String**| The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]
 **width** | **String**| Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **widthUnit** | **String**| The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]

### Return type

[**RouteResponse**](RouteResponse.md)

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

<a name="getRouteByLocation"></a>
# **getRouteByLocation**
> RouteResponse getRouteByLocation(startPoint, endPoint, db, intermediatePoints, returnIntermediatePoints, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit)

Gets Route By Location.

Accepts latitude &amp; longitude as input and Returns Point-to-Point and Multi-Point travel directions by various travel modes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RoutingServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RoutingServiceApi apiInstance = new RoutingServiceApi(defaultClient);
    String startPoint = "startPoint_example"; // String | Start Point in 'Lat,Long,coordsys' format.
    String endPoint = "endPoint_example"; // String | End Point in 'Lat,Long,coordsys' format.
    String db = "driving"; // String | Mode of commute.
    String intermediatePoints = "intermediatePoints_example"; // String | List of intermediate points of the route.
    String returnIntermediatePoints = "false"; // String | returnIntermediatePoints route.
    String oip = "false"; // String | Specifies whether waypoints need to be optimized.
    String destinationSrs = "destinationSrs_example"; // String | Specifies the desired coordinate system of the returned route.
    String optimizeBy = "time"; // String | Specifies whether the route should be optimized by time or distance.
    String returnDistance = "true"; // String | Specifies whether distance needs to be part of direction information in response.
    String distanceUnit = "m"; // String | Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
    String returnTime = "true"; // String | Specifies whether time needs to be part of direction information in response.
    String timeUnit = "min"; // String | Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond)
    String language = "language_example"; // String | Specifies the language of travel directions.
    String directionsStyle = "None"; // String | Specifies whether route directions text is to be returned in the response and in what detail (Normal or Terse).
    String segmentGeometryStyle = "none"; // String | Specifies whether the route geometry is to be returned in the response and in what detail (End or All).
    String primaryNameOnly = "false"; // String | If true then only the primary street name is returned otherwise all the names for a street.
    String majorRoads = "false"; // String | Whether to include all roads in route calculation or just major roads.
    String historicTrafficTimeBucket = "None"; // String | Specifies whether routing calculation uses the historic traffic speeds.
    String returnDirectionGeometry = "false"; // String | Whether to include geometry associated with each route instruction in response.
    String useCvr = "N"; // String | This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs.
    String looseningBarrierRestrictions = "Y"; // String | Specifies that barriers will be removed when determining the route.
    String vehicleType = "ALL"; // String | vehicle type.
    String weight = ""; // String | Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String weightUnit = "kg"; // String | The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton).
    String height = ""; // String | Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String heightUnit = "ft"; // String | The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    String length = ""; // String | Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String lengthUnit = "ft"; // String | The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    String width = ""; // String | Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String widthUnit = "ft"; // String | The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    try {
      RouteResponse result = apiInstance.getRouteByLocation(startPoint, endPoint, db, intermediatePoints, returnIntermediatePoints, oip, destinationSrs, optimizeBy, returnDistance, distanceUnit, returnTime, timeUnit, language, directionsStyle, segmentGeometryStyle, primaryNameOnly, majorRoads, historicTrafficTimeBucket, returnDirectionGeometry, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingServiceApi#getRouteByLocation");
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
 **startPoint** | **String**| Start Point in &#39;Lat,Long,coordsys&#39; format. | [optional]
 **endPoint** | **String**| End Point in &#39;Lat,Long,coordsys&#39; format. | [optional]
 **db** | **String**| Mode of commute. | [optional] [default to driving]
 **intermediatePoints** | **String**| List of intermediate points of the route. | [optional]
 **returnIntermediatePoints** | **String**| returnIntermediatePoints route. | [optional] [default to false]
 **oip** | **String**| Specifies whether waypoints need to be optimized. | [optional] [default to false]
 **destinationSrs** | **String**| Specifies the desired coordinate system of the returned route. | [optional]
 **optimizeBy** | **String**| Specifies whether the route should be optimized by time or distance. | [optional] [default to time]
 **returnDistance** | **String**| Specifies whether distance needs to be part of direction information in response. | [optional] [default to true]
 **distanceUnit** | **String**| Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [default to m]
 **returnTime** | **String**| Specifies whether time needs to be part of direction information in response. | [optional] [default to true]
 **timeUnit** | **String**| Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond) | [optional] [default to min]
 **language** | **String**| Specifies the language of travel directions. | [optional]
 **directionsStyle** | **String**| Specifies whether route directions text is to be returned in the response and in what detail (Normal or Terse). | [optional] [default to None]
 **segmentGeometryStyle** | **String**| Specifies whether the route geometry is to be returned in the response and in what detail (End or All). | [optional] [default to none]
 **primaryNameOnly** | **String**| If true then only the primary street name is returned otherwise all the names for a street. | [optional] [default to false]
 **majorRoads** | **String**| Whether to include all roads in route calculation or just major roads. | [optional] [default to false]
 **historicTrafficTimeBucket** | **String**| Specifies whether routing calculation uses the historic traffic speeds. | [optional] [default to None]
 **returnDirectionGeometry** | **String**| Whether to include geometry associated with each route instruction in response. | [optional] [default to false]
 **useCvr** | **String**| This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs. | [optional] [default to N]
 **looseningBarrierRestrictions** | **String**| Specifies that barriers will be removed when determining the route. | [optional] [default to Y]
 **vehicleType** | **String**| vehicle type. | [optional] [default to ALL]
 **weight** | **String**| Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **weightUnit** | **String**| The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton). | [optional] [default to kg]
 **height** | **String**| Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **heightUnit** | **String**| The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]
 **length** | **String**| Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **lengthUnit** | **String**| The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]
 **width** | **String**| Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **widthUnit** | **String**| The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]

### Return type

[**RouteResponse**](RouteResponse.md)

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

<a name="getTravelCostMatrixByAddress"></a>
# **getTravelCostMatrixByAddress**
> TravelCostMatrixResponse getTravelCostMatrixByAddress(startAddresses, endAddresses, country, db, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit)

Get Cost Matrix By Address.

Accepts addresses as input and Returns travel distances and times for multiple origins to multiple destinations by various travel modes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RoutingServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RoutingServiceApi apiInstance = new RoutingServiceApi(defaultClient);
    String startAddresses = "startAddresses_example"; // String | Start locations in text based addresses.
    String endAddresses = "endAddresses_example"; // String | End locations in text based addresses.
    String country = "USA"; // String | 3 Digit ISO country code.
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
    String useCvr = "N"; // String | This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs.
    String looseningBarrierRestrictions = "Y"; // String | Specifies that barriers will be removed when determining the route.
    String vehicleType = "ALL"; // String | vehicle type.
    String weight = ""; // String | Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String weightUnit = "kg"; // String | The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton).
    String height = ""; // String | Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String heightUnit = "ft"; // String | The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    String length = ""; // String | Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String lengthUnit = "ft"; // String | The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    String width = ""; // String | Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String widthUnit = "ft"; // String | The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    try {
      TravelCostMatrixResponse result = apiInstance.getTravelCostMatrixByAddress(startAddresses, endAddresses, country, db, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingServiceApi#getTravelCostMatrixByAddress");
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
 **startAddresses** | **String**| Start locations in text based addresses. | [optional]
 **endAddresses** | **String**| End locations in text based addresses. | [optional]
 **country** | **String**| 3 Digit ISO country code. | [optional] [default to USA]
 **db** | **String**| Mode of commute. | [optional] [default to driving]
 **optimizeBy** | **String**| Specifies whether routes should be optimized by time or distance. | [optional] [default to time]
 **returnDistance** | **String**| Specifies whether distance needs to be returned in response. | [optional] [default to true]
 **destinationSrs** | **String**| Specifies the desired coordinate system of returned routes. | [optional]
 **distanceUnit** | **String**| Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [default to m]
 **returnTime** | **String**| Specifies whether time needs to be returned in response. | [optional] [default to true]
 **timeUnit** | **String**| Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). | [optional] [default to min]
 **majorRoads** | **String**| Whether to include all roads in routes calculation or just major roads. | [optional] [default to false]
 **returnOptimalRoutesOnly** | **String**| Specifies whether to return only the optimized route for each start and end point combination. | [optional] [default to true]
 **historicTrafficTimeBucket** | **String**| Specifies whether routing calculation uses the historic traffic speeds. | [optional] [default to None]
 **useCvr** | **String**| This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs. | [optional] [default to N]
 **looseningBarrierRestrictions** | **String**| Specifies that barriers will be removed when determining the route. | [optional] [default to Y]
 **vehicleType** | **String**| vehicle type. | [optional] [default to ALL]
 **weight** | **String**| Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **weightUnit** | **String**| The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton). | [optional] [default to kg]
 **height** | **String**| Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **heightUnit** | **String**| The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]
 **length** | **String**| Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **lengthUnit** | **String**| The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]
 **width** | **String**| Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **widthUnit** | **String**| The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]

### Return type

[**TravelCostMatrixResponse**](TravelCostMatrixResponse.md)

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

<a name="getTravelCostMatrixByLocation"></a>
# **getTravelCostMatrixByLocation**
> TravelCostMatrixResponse getTravelCostMatrixByLocation(startPoints, endPoints, db, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit)

Get Cost Matrix By Location.

Accepts latitude &amp; longitude as input and Returns travel distances and times for multiple origins to multiple destinations by various travel modes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RoutingServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RoutingServiceApi apiInstance = new RoutingServiceApi(defaultClient);
    String startPoints = "startPoints_example"; // String | The address to be searched.
    String endPoints = "endPoints_example"; // String | The address to be searched.
    String db = "driving"; // String | Mode of commute.
    String optimizeBy = "time"; // String | Specifies whether routes should be optimized by time or distance.
    String returnDistance = "true"; // String | Specifies whether distance needs to be returned in response.
    String destinationSrs = "epsg:4326"; // String | Specifies the desired coordinate system of returned routes.
    String distanceUnit = "m"; // String | Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
    String returnTime = "true"; // String | Specifies whether time needs to be returned in response.
    String timeUnit = "min"; // String | Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond).
    String majorRoads = "false"; // String | Whether to include all roads in routes calculation or just major roads.
    String returnOptimalRoutesOnly = "true"; // String | Specifies whether to return only the optimized route for each start and end point combination.
    String historicTrafficTimeBucket = "None"; // String | Specifies whether routing calculation uses the historic traffic speeds.
    String useCvr = "N"; // String | This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs.
    String looseningBarrierRestrictions = "Y"; // String | Specifies that barriers will be removed when determining the route.
    String vehicleType = "ALL"; // String | vehicle type.
    String weight = ""; // String | Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String weightUnit = "kg"; // String | The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton).
    String height = ""; // String | Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String heightUnit = "ft"; // String | The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    String length = ""; // String | Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String lengthUnit = "ft"; // String | The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    String width = ""; // String | Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route.
    String widthUnit = "ft"; // String | The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile).
    try {
      TravelCostMatrixResponse result = apiInstance.getTravelCostMatrixByLocation(startPoints, endPoints, db, optimizeBy, returnDistance, destinationSrs, distanceUnit, returnTime, timeUnit, majorRoads, returnOptimalRoutesOnly, historicTrafficTimeBucket, useCvr, looseningBarrierRestrictions, vehicleType, weight, weightUnit, height, heightUnit, length, lengthUnit, width, widthUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingServiceApi#getTravelCostMatrixByLocation");
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
 **startPoints** | **String**| The address to be searched. | [optional]
 **endPoints** | **String**| The address to be searched. | [optional]
 **db** | **String**| Mode of commute. | [optional] [default to driving]
 **optimizeBy** | **String**| Specifies whether routes should be optimized by time or distance. | [optional] [default to time]
 **returnDistance** | **String**| Specifies whether distance needs to be returned in response. | [optional] [default to true]
 **destinationSrs** | **String**| Specifies the desired coordinate system of returned routes. | [optional] [default to epsg:4326]
 **distanceUnit** | **String**| Return Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [default to m]
 **returnTime** | **String**| Specifies whether time needs to be returned in response. | [optional] [default to true]
 **timeUnit** | **String**| Return time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). | [optional] [default to min]
 **majorRoads** | **String**| Whether to include all roads in routes calculation or just major roads. | [optional] [default to false]
 **returnOptimalRoutesOnly** | **String**| Specifies whether to return only the optimized route for each start and end point combination. | [optional] [default to true]
 **historicTrafficTimeBucket** | **String**| Specifies whether routing calculation uses the historic traffic speeds. | [optional] [default to None]
 **useCvr** | **String**| This parameter will enable/disable CVR (Commercial Vehicle Restrictions) capability in our APIs. | [optional] [default to N]
 **looseningBarrierRestrictions** | **String**| Specifies that barriers will be removed when determining the route. | [optional] [default to Y]
 **vehicleType** | **String**| vehicle type. | [optional] [default to ALL]
 **weight** | **String**| Specifies the maximum weight of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **weightUnit** | **String**| The unit of weight eg. kg(kilogram), lb(pound), mt(metric ton), t(ton). | [optional] [default to kg]
 **height** | **String**| Specifies the maximum height of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **heightUnit** | **String**| The unit of height e.g m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]
 **length** | **String**| Specifies the maximum length of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **lengthUnit** | **String**| The unit of length eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]
 **width** | **String**| Specifies the maximum width of a vehicle. Any vehicles over this value will be restricted when determining the route. | [optional] [default to ]
 **widthUnit** | **String**| The unit of width eg. m(meter), km(kilometer), yd(yard), ft(foot), mi(mile). | [optional] [default to ft]

### Return type

[**TravelCostMatrixResponse**](TravelCostMatrixResponse.md)

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

