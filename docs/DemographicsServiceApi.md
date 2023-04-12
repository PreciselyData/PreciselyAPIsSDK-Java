# DemographicsServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDemographicsAdvanced**](DemographicsServiceApi.md#getDemographicsAdvanced) | **POST** /demographics-segmentation/v1/advanced/demographics | Demographics Advanced Endpoint
[**getDemographicsBasic**](DemographicsServiceApi.md#getDemographicsBasic) | **GET** /demographics-segmentation/v1/basic/demographics | Demographics Basic
[**getDemographicsByAddress**](DemographicsServiceApi.md#getDemographicsByAddress) | **GET** /demographics-segmentation/v1/demographics/byaddress | Demographics By Address.
[**getDemographicsByBoundaryIds**](DemographicsServiceApi.md#getDemographicsByBoundaryIds) | **GET** /demographics-segmentation/v1/demographics/byboundaryids | Demographics By Boundaryids.
[**getDemographicsByLocation**](DemographicsServiceApi.md#getDemographicsByLocation) | **GET** /demographics-segmentation/v1/demographics/bylocation | Demographics By Location.
[**getSegmentationByAddress**](DemographicsServiceApi.md#getSegmentationByAddress) | **GET** /demographics-segmentation/v1/segmentation/byaddress | Segmentation By Address.
[**getSegmentationByLocation**](DemographicsServiceApi.md#getSegmentationByLocation) | **GET** /demographics-segmentation/v1/segmentation/bylocation | Segmentation By Location.


<a name="getDemographicsAdvanced"></a>
# **getDemographicsAdvanced**
> Demographics getDemographicsAdvanced(demographicsAdvancedRequest)

Demographics Advanced Endpoint

Demographics Advanced Endpoint will return the aggregated values of the selected demographics variables of the regions falling inside a user provided geometry or travel time/distance boundaries. All the intersecting demographic boundaries will be snapped completely, and user will have option to request these boundaries in response.  

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.DemographicsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    DemographicsServiceApi apiInstance = new DemographicsServiceApi(defaultClient);
    DemographicsAdvancedRequest demographicsAdvancedRequest = new DemographicsAdvancedRequest(); // DemographicsAdvancedRequest | 
    try {
      Demographics result = apiInstance.getDemographicsAdvanced(demographicsAdvancedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemographicsServiceApi#getDemographicsAdvanced");
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
 **demographicsAdvancedRequest** | [**DemographicsAdvancedRequest**](DemographicsAdvancedRequest.md)|  |

### Return type

[**Demographics**](Demographics.md)

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

<a name="getDemographicsBasic"></a>
# **getDemographicsBasic**
> Demographics getDemographicsBasic(address, longitude, latitude, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, country, profile, filter, includeGeometry)

Demographics Basic

Demographics Basic Endpoint will return the aggregated values of the selected demographics variables of the regions falling inside the search radius. All the intersecting demographic boundaries will be snapped completely and user will have option to request these boundaries in response.  

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.DemographicsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    DemographicsServiceApi apiInstance = new DemographicsServiceApi(defaultClient);
    String address = "address_example"; // String | Address to be searched
    String longitude = "longitude_example"; // String | Longitude of the location
    String latitude = "latitude_example"; // String | Latitude of the location
    String searchRadius = "searchRadius_example"; // String | Radius within which demographics details are required. Max. value is 52800 Feet or 10 miles
    String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters 
    String travelTime = "travelTime_example"; // String | Travel Time based on ‘travelMode’ within which demographics details are required. Max. value is 1 hour.
    String travelTimeUnit = "travelTimeUnit_example"; // String | minutes,hours,seconds,milliseconds. Default is meters.Default is minutes.
    String travelDistance = "travelDistance_example"; // String | Travel Distance based on ‘travelMode’ within which demographics details are required. Max. value is 10 miles.
    String travelDistanceUnit = "travelDistanceUnit_example"; // String | feet,kilometers,miles,meters.  Default is feet.
    String travelMode = "travelMode_example"; // String | Default is driving.
    String country = "country_example"; // String | 3 digit ISO country code (Used in case address is mentioned).
    String profile = "profile_example"; // String | Applicable on ranged variables. Returns top sorted result based on the input value.
    String filter = "filter_example"; // String | If Y, demographic boundaries are returned in response.
    String includeGeometry = "includeGeometry_example"; // String | 
    try {
      Demographics result = apiInstance.getDemographicsBasic(address, longitude, latitude, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, country, profile, filter, includeGeometry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemographicsServiceApi#getDemographicsBasic");
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
 **address** | **String**| Address to be searched | [optional]
 **longitude** | **String**| Longitude of the location | [optional]
 **latitude** | **String**| Latitude of the location | [optional]
 **searchRadius** | **String**| Radius within which demographics details are required. Max. value is 52800 Feet or 10 miles | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters  | [optional]
 **travelTime** | **String**| Travel Time based on ‘travelMode’ within which demographics details are required. Max. value is 1 hour. | [optional]
 **travelTimeUnit** | **String**| minutes,hours,seconds,milliseconds. Default is meters.Default is minutes. | [optional]
 **travelDistance** | **String**| Travel Distance based on ‘travelMode’ within which demographics details are required. Max. value is 10 miles. | [optional]
 **travelDistanceUnit** | **String**| feet,kilometers,miles,meters.  Default is feet. | [optional]
 **travelMode** | **String**| Default is driving. | [optional]
 **country** | **String**| 3 digit ISO country code (Used in case address is mentioned). | [optional]
 **profile** | **String**| Applicable on ranged variables. Returns top sorted result based on the input value. | [optional]
 **filter** | **String**| If Y, demographic boundaries are returned in response. | [optional]
 **includeGeometry** | **String**|  | [optional]

### Return type

[**Demographics**](Demographics.md)

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

<a name="getDemographicsByAddress"></a>
# **getDemographicsByAddress**
> Demographics getDemographicsByAddress(address, country, profile, filter, valueFormat, variableLevel)

Demographics By Address.

Provides the demographic details around a specified address. GeoLife &#39;byaddress&#39; service accepts address as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.DemographicsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    DemographicsServiceApi apiInstance = new DemographicsServiceApi(defaultClient);
    String address = "address_example"; // String | The address to be searched.
    String country = "country_example"; // String | 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,AUS.
    String profile = "profile_example"; // String | Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by location) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending
    String filter = "filter_example"; // String | The 'filter' parameter retrieves the demographic data based upon specified input themes.
    String valueFormat = "valueFormat_example"; // String | The 'valueFormat' parameter is applicable for few ranged variables where percent & count both are available and filter response based on the input value.
    String variableLevel = "variableLevel_example"; // String | The 'variableLevel' retrieves demographic facts in response based on the input value
    try {
      Demographics result = apiInstance.getDemographicsByAddress(address, country, profile, filter, valueFormat, variableLevel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemographicsServiceApi#getDemographicsByAddress");
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
 **address** | **String**| The address to be searched. |
 **country** | **String**| 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,AUS. | [optional]
 **profile** | **String**| Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by location) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending | [optional]
 **filter** | **String**| The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. | [optional]
 **valueFormat** | **String**| The &#39;valueFormat&#39; parameter is applicable for few ranged variables where percent &amp; count both are available and filter response based on the input value. | [optional]
 **variableLevel** | **String**| The &#39;variableLevel&#39; retrieves demographic facts in response based on the input value | [optional]

### Return type

[**Demographics**](Demographics.md)

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

<a name="getDemographicsByBoundaryIds"></a>
# **getDemographicsByBoundaryIds**
> Demographics getDemographicsByBoundaryIds(boundaryIds, profile, filter, valueFormat, variableLevel)

Demographics By Boundaryids.

This endpoint will allow the user to request demographics details by census boundary id. Multiple comma separated boundary ids will be accepted. 

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.DemographicsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    DemographicsServiceApi apiInstance = new DemographicsServiceApi(defaultClient);
    String boundaryIds = "boundaryIds_example"; // String | Accepts comma separated multiple boundary ids.
    String profile = "profile_example"; // String | Applicable on ranged variables. Returns top sorted result based on the input value.
    String filter = "filter_example"; // String | Accept the comma separated theme names and filter response based on value. Maximum 10 can be provided.
    String valueFormat = "valueFormat_example"; // String | Applicable for few ranged variables where percent & count both are available and filter response based on the input value.
    String variableLevel = "variableLevel_example"; // String | Retrieves demographic facts in response based on the input value.
    try {
      Demographics result = apiInstance.getDemographicsByBoundaryIds(boundaryIds, profile, filter, valueFormat, variableLevel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemographicsServiceApi#getDemographicsByBoundaryIds");
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
 **boundaryIds** | **String**| Accepts comma separated multiple boundary ids. | [optional]
 **profile** | **String**| Applicable on ranged variables. Returns top sorted result based on the input value. | [optional]
 **filter** | **String**| Accept the comma separated theme names and filter response based on value. Maximum 10 can be provided. | [optional]
 **valueFormat** | **String**| Applicable for few ranged variables where percent &amp; count both are available and filter response based on the input value. | [optional]
 **variableLevel** | **String**| Retrieves demographic facts in response based on the input value. | [optional]

### Return type

[**Demographics**](Demographics.md)

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

<a name="getDemographicsByLocation"></a>
# **getDemographicsByLocation**
> Demographics getDemographicsByLocation(longitude, latitude, profile, filter, valueFormat, variableLevel)

Demographics By Location.

Provides the demographic details around a specified location. GeoLife &#39;bylocation&#39; service accepts longitude and latitude as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.DemographicsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    DemographicsServiceApi apiInstance = new DemographicsServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of the location.
    String latitude = "latitude_example"; // String | Latitude of the location.
    String profile = "profile_example"; // String | Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by location) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending
    String filter = "filter_example"; // String | The 'filter' parameter retrieves the demographic data based upon specified input themes.
    String valueFormat = "valueFormat_example"; // String | The 'valueFormat' parameter is applicable for few ranged variables where percent & count both are available and filter response based on the input value.
    String variableLevel = "variableLevel_example"; // String | The 'variableLevel' retrieves demographic facts in response based on the input value
    try {
      Demographics result = apiInstance.getDemographicsByLocation(longitude, latitude, profile, filter, valueFormat, variableLevel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemographicsServiceApi#getDemographicsByLocation");
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
 **longitude** | **String**| Longitude of the location. | [optional]
 **latitude** | **String**| Latitude of the location. | [optional]
 **profile** | **String**| Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by location) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending | [optional]
 **filter** | **String**| The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. | [optional]
 **valueFormat** | **String**| The &#39;valueFormat&#39; parameter is applicable for few ranged variables where percent &amp; count both are available and filter response based on the input value. | [optional]
 **variableLevel** | **String**| The &#39;variableLevel&#39; retrieves demographic facts in response based on the input value | [optional]

### Return type

[**Demographics**](Demographics.md)

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

<a name="getSegmentationByAddress"></a>
# **getSegmentationByAddress**
> Segmentation getSegmentationByAddress(address, country)

Segmentation By Address.

Provides the segmentation details around a specified address. GeoLife &#39;Segmentation by Address&#39; service accepts address as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.DemographicsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    DemographicsServiceApi apiInstance = new DemographicsServiceApi(defaultClient);
    String address = "address_example"; // String | The address to be searched.
    String country = "country_example"; // String | 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,ITA,AUS,DEU.
    try {
      Segmentation result = apiInstance.getSegmentationByAddress(address, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemographicsServiceApi#getSegmentationByAddress");
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
 **address** | **String**| The address to be searched. |
 **country** | **String**| 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,ITA,AUS,DEU. | [optional]

### Return type

[**Segmentation**](Segmentation.md)

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

<a name="getSegmentationByLocation"></a>
# **getSegmentationByLocation**
> Segmentation getSegmentationByLocation(longitude, latitude)

Segmentation By Location.

Provides the segmentation details around a specified location. GeoLife &#39;segmentation bylocation&#39; service accepts longitude and latitude as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.DemographicsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    DemographicsServiceApi apiInstance = new DemographicsServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of the location.
    String latitude = "latitude_example"; // String | Latitude of the location.
    try {
      Segmentation result = apiInstance.getSegmentationByLocation(longitude, latitude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemographicsServiceApi#getSegmentationByLocation");
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

### Return type

[**Segmentation**](Segmentation.md)

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

