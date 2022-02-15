# RisksServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrimeRiskByAddress**](RisksServiceApi.md#getCrimeRiskByAddress) | **GET** /risks/v1/crime/byaddress | Get Crime Risk By Address
[**getCrimeRiskByAddressBatch**](RisksServiceApi.md#getCrimeRiskByAddressBatch) | **POST** /risks/v1/crime/byaddress | Post Crime Risk By Address
[**getCrimeRiskByLocation**](RisksServiceApi.md#getCrimeRiskByLocation) | **GET** /risks/v1/crime/bylocation | Get Crime Risk By  Location
[**getCrimeRiskByLocationBatch**](RisksServiceApi.md#getCrimeRiskByLocationBatch) | **POST** /risks/v1/crime/bylocation | Post Crime Risk By Location
[**getDistanceToCoastByAddress**](RisksServiceApi.md#getDistanceToCoastByAddress) | **GET** /risks/v1/shoreline/distancetofloodhazard/byaddress | Get Distance To Flood Hazard By Address
[**getDistanceToCoastByAddressBatch**](RisksServiceApi.md#getDistanceToCoastByAddressBatch) | **POST** /risks/v1/shoreline/distancetofloodhazard/byaddress | Post Distance To Flood Hazard By Address
[**getDistanceToCoastByLocation**](RisksServiceApi.md#getDistanceToCoastByLocation) | **GET** /risks/v1/shoreline/distancetofloodhazard/bylocation | Get Distance To Flood Hazard By Location
[**getDistanceToCoastByLocationBatch**](RisksServiceApi.md#getDistanceToCoastByLocationBatch) | **POST** /risks/v1/shoreline/distancetofloodhazard/bylocation | Post Distance To Flood Hazard By Location
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
[**getFireStationByAddress**](RisksServiceApi.md#getFireStationByAddress) | **GET** /risks/v1/firestation/byaddress | Get Fire Station By Address
[**getFireStationByLocation**](RisksServiceApi.md#getFireStationByLocation) | **GET** /risks/v1/firestation/bylocation | Get Fire Station By Location
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
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String address = "address_example"; // String | free form address text
    String type = "type_example"; // String | this is crime type; valid values are following 11 crime types with 'all' as default (more than one can also be given as comma separated types)
    String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
    try {
      CrimeRiskResponse result = apiInstance.getCrimeRiskByAddress(address, type, includeGeometry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getCrimeRiskByAddress");
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
 **address** | **String**| free form address text |
 **type** | **String**| this is crime type; valid values are following 11 crime types with &#39;all&#39; as default (more than one can also be given as comma separated types) | [optional]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional]

### Return type

[**CrimeRiskResponse**](CrimeRiskResponse.md)

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

<a name="getCrimeRiskByAddressBatch"></a>
# **getCrimeRiskByAddressBatch**
> CrimeRiskResponseList getCrimeRiskByAddressBatch(crimeRiskByAddressBatchRequest)

Post Crime Risk By Address

This is a Batch offering for &#39;Crime Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve local crime indexes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    CrimeRiskByAddressBatchRequest crimeRiskByAddressBatchRequest = new CrimeRiskByAddressBatchRequest(); // CrimeRiskByAddressBatchRequest | 
    try {
      CrimeRiskResponseList result = apiInstance.getCrimeRiskByAddressBatch(crimeRiskByAddressBatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getCrimeRiskByAddressBatch");
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
 **crimeRiskByAddressBatchRequest** | [**CrimeRiskByAddressBatchRequest**](CrimeRiskByAddressBatchRequest.md)|  |

### Return type

[**CrimeRiskResponseList**](CrimeRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getCrimeRiskByLocation"></a>
# **getCrimeRiskByLocation**
> CrimeRiskResponse getCrimeRiskByLocation(longitude, latitude, type, includeGeometry)

Get Crime Risk By  Location

Accepts latitude/longitude as input and returns and Returns local crime indexes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | The longitude of the location
    String latitude = "latitude_example"; // String | The latitude of the location
    String type = "type_example"; // String | this is crime type; valid values are following 11 crime types with 'all' as default (more than one can also be given as comma separated types)
    String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
    try {
      CrimeRiskResponse result = apiInstance.getCrimeRiskByLocation(longitude, latitude, type, includeGeometry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getCrimeRiskByLocation");
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
 **longitude** | **String**| The longitude of the location |
 **latitude** | **String**| The latitude of the location |
 **type** | **String**| this is crime type; valid values are following 11 crime types with &#39;all&#39; as default (more than one can also be given as comma separated types) | [optional]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional]

### Return type

[**CrimeRiskResponse**](CrimeRiskResponse.md)

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

<a name="getCrimeRiskByLocationBatch"></a>
# **getCrimeRiskByLocationBatch**
> CrimeRiskResponseList getCrimeRiskByLocationBatch(crimeRiskByLocationBatchRequest)

Post Crime Risk By Location

This is a Batch offering for &#39;Crime Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve local crime indexes.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    CrimeRiskByLocationBatchRequest crimeRiskByLocationBatchRequest = new CrimeRiskByLocationBatchRequest(); // CrimeRiskByLocationBatchRequest | 
    try {
      CrimeRiskResponseList result = apiInstance.getCrimeRiskByLocationBatch(crimeRiskByLocationBatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getCrimeRiskByLocationBatch");
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
 **crimeRiskByLocationBatchRequest** | [**CrimeRiskByLocationBatchRequest**](CrimeRiskByLocationBatchRequest.md)|  |

### Return type

[**CrimeRiskResponseList**](CrimeRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getDistanceToCoastByAddress"></a>
# **getDistanceToCoastByAddress**
> WaterBodyResponse getDistanceToCoastByAddress(address, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit)

Get Distance To Flood Hazard By Address

Accepts addresses as input and Returns the distance from nearest water bodies along with body name and location.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String address = "address_example"; // String | The address of the location
    String maxCandidates = "maxCandidates_example"; // String | This specifies the value of maxCandidates
    String waterBodyType = "waterBodyType_example"; // String | This specifies the value of waterBodyType
    String searchDistance = "searchDistance_example"; // String | This specifies the search distance
    String searchDistanceUnit = "searchDistanceUnit_example"; // String | miles (default value),feet, kilometers, meters
    try {
      WaterBodyResponse result = apiInstance.getDistanceToCoastByAddress(address, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getDistanceToCoastByAddress");
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
 **address** | **String**| The address of the location | [optional]
 **maxCandidates** | **String**| This specifies the value of maxCandidates | [optional]
 **waterBodyType** | **String**| This specifies the value of waterBodyType | [optional]
 **searchDistance** | **String**| This specifies the search distance | [optional]
 **searchDistanceUnit** | **String**| miles (default value),feet, kilometers, meters | [optional]

### Return type

[**WaterBodyResponse**](WaterBodyResponse.md)

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

<a name="getDistanceToCoastByAddressBatch"></a>
# **getDistanceToCoastByAddressBatch**
> DistanceToFloodHazardResponse getDistanceToCoastByAddressBatch(distanceToFloodHazardAddressRequest)

Post Distance To Flood Hazard By Address

This is a Batch offering for &#39;Distance To Flood Hazard By Address&#39; service. It accepts a single address or a list of addresses and retrieve the distance from nearest water bodies along with body name and location.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    DistanceToFloodHazardAddressRequest distanceToFloodHazardAddressRequest = new DistanceToFloodHazardAddressRequest(); // DistanceToFloodHazardAddressRequest | 
    try {
      DistanceToFloodHazardResponse result = apiInstance.getDistanceToCoastByAddressBatch(distanceToFloodHazardAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getDistanceToCoastByAddressBatch");
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
 **distanceToFloodHazardAddressRequest** | [**DistanceToFloodHazardAddressRequest**](DistanceToFloodHazardAddressRequest.md)|  |

### Return type

[**DistanceToFloodHazardResponse**](DistanceToFloodHazardResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getDistanceToCoastByLocation"></a>
# **getDistanceToCoastByLocation**
> WaterBodyResponse getDistanceToCoastByLocation(longitude, latitude, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit)

Get Distance To Flood Hazard By Location

Accepts latitude &amp; longitude as input and Returns the distance from nearest water bodies along with body name and location.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | The longitude of the location
    String latitude = "latitude_example"; // String | The latitude of the location
    String maxCandidates = "maxCandidates_example"; // String | This specifies the value of maxCandidates
    String waterBodyType = "waterBodyType_example"; // String | This specifies the value of waterBodyType
    String searchDistance = "searchDistance_example"; // String | This specifies the search distance
    String searchDistanceUnit = "searchDistanceUnit_example"; // String | miles (default value),feet, kilometers, meters
    try {
      WaterBodyResponse result = apiInstance.getDistanceToCoastByLocation(longitude, latitude, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getDistanceToCoastByLocation");
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
 **longitude** | **String**| The longitude of the location | [optional]
 **latitude** | **String**| The latitude of the location | [optional]
 **maxCandidates** | **String**| This specifies the value of maxCandidates | [optional]
 **waterBodyType** | **String**| This specifies the value of waterBodyType | [optional]
 **searchDistance** | **String**| This specifies the search distance | [optional]
 **searchDistanceUnit** | **String**| miles (default value),feet, kilometers, meters | [optional]

### Return type

[**WaterBodyResponse**](WaterBodyResponse.md)

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

<a name="getDistanceToCoastByLocationBatch"></a>
# **getDistanceToCoastByLocationBatch**
> DistanceToFloodHazardResponse getDistanceToCoastByLocationBatch(distanceToFloodHazardLocationRequest)

Post Distance To Flood Hazard By Location

This is a Batch offering for &#39;Distance To Flood Hazard By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve the distance from nearest water bodies along with body name and location.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    DistanceToFloodHazardLocationRequest distanceToFloodHazardLocationRequest = new DistanceToFloodHazardLocationRequest(); // DistanceToFloodHazardLocationRequest | 
    try {
      DistanceToFloodHazardResponse result = apiInstance.getDistanceToCoastByLocationBatch(distanceToFloodHazardLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getDistanceToCoastByLocationBatch");
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
 **distanceToFloodHazardLocationRequest** | [**DistanceToFloodHazardLocationRequest**](DistanceToFloodHazardLocationRequest.md)|  |

### Return type

[**DistanceToFloodHazardResponse**](DistanceToFloodHazardResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getEarthquakeHistory"></a>
# **getEarthquakeHistory**
> EarthquakeHistory getEarthquakeHistory(postCode, startDate, endDate, minMagnitude, maxMagnitude, maxCandidates)

Earthquake History

Accepts postcode as input and Returns historical earthquake details for a particular postcode.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String postCode = "postCode_example"; // String | 5 digit Postal code to search
    String startDate = "startDate_example"; // String | Start time in milliseconds(UTC)
    String endDate = "endDate_example"; // String | End time in milliseconds(UTC)
    String minMagnitude = "minMagnitude_example"; // String | Minimum richter scale magnitude
    String maxMagnitude = "maxMagnitude_example"; // String | Maximum Richter scale magnitude
    String maxCandidates = "maxCandidates_example"; // String | Maximum response events
    try {
      EarthquakeHistory result = apiInstance.getEarthquakeHistory(postCode, startDate, endDate, minMagnitude, maxMagnitude, maxCandidates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getEarthquakeHistory");
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
 **postCode** | **String**| 5 digit Postal code to search |
 **startDate** | **String**| Start time in milliseconds(UTC) | [optional]
 **endDate** | **String**| End time in milliseconds(UTC) | [optional]
 **minMagnitude** | **String**| Minimum richter scale magnitude | [optional]
 **maxMagnitude** | **String**| Maximum Richter scale magnitude | [optional]
 **maxCandidates** | **String**| Maximum response events | [optional]

### Return type

[**EarthquakeHistory**](EarthquakeHistory.md)

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

<a name="getEarthquakeRiskByAddress"></a>
# **getEarthquakeRiskByAddress**
> EarthquakeRiskResponse getEarthquakeRiskByAddress(address, richterValue, includeGeometry)

Get Earthquake Risk By Address

Accepts addresses as input and Returns counts of earthquakes for various richter measurements and values.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String address = "address_example"; // String | free form address text
    String richterValue = "richterValue_example"; // String | all (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE
    String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
    try {
      EarthquakeRiskResponse result = apiInstance.getEarthquakeRiskByAddress(address, richterValue, includeGeometry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getEarthquakeRiskByAddress");
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
 **address** | **String**| free form address text |
 **richterValue** | **String**| all (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE | [optional]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional]

### Return type

[**EarthquakeRiskResponse**](EarthquakeRiskResponse.md)

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

<a name="getEarthquakeRiskByAddressBatch"></a>
# **getEarthquakeRiskByAddressBatch**
> EarthquakeRiskResponseList getEarthquakeRiskByAddressBatch(earthquakeRiskByAddressRequest)

Post Earthquake Risk By Address

This is a Batch offering for &#39;Earthquake Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve counts of earthquakes for various richter measurements and values.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    EarthquakeRiskByAddressRequest earthquakeRiskByAddressRequest = new EarthquakeRiskByAddressRequest(); // EarthquakeRiskByAddressRequest | 
    try {
      EarthquakeRiskResponseList result = apiInstance.getEarthquakeRiskByAddressBatch(earthquakeRiskByAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getEarthquakeRiskByAddressBatch");
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
 **earthquakeRiskByAddressRequest** | [**EarthquakeRiskByAddressRequest**](EarthquakeRiskByAddressRequest.md)|  |

### Return type

[**EarthquakeRiskResponseList**](EarthquakeRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getEarthquakeRiskByLocation"></a>
# **getEarthquakeRiskByLocation**
> EarthquakeRiskResponse getEarthquakeRiskByLocation(longitude, latitude, richterValue, includeGeometry)

Get Earthquake Risk By Location

Accepts latitude &amp; longitude as input and Returns counts of earthquakes for various richter measurements and values.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | The longitude of the location
    String latitude = "latitude_example"; // String | The latitude of the location
    String richterValue = "richterValue_example"; // String | all (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE
    String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
    try {
      EarthquakeRiskResponse result = apiInstance.getEarthquakeRiskByLocation(longitude, latitude, richterValue, includeGeometry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getEarthquakeRiskByLocation");
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
 **longitude** | **String**| The longitude of the location |
 **latitude** | **String**| The latitude of the location |
 **richterValue** | **String**| all (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE | [optional]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional]

### Return type

[**EarthquakeRiskResponse**](EarthquakeRiskResponse.md)

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

<a name="getEarthquakeRiskByLocationBatch"></a>
# **getEarthquakeRiskByLocationBatch**
> EarthquakeRiskResponseList getEarthquakeRiskByLocationBatch(earthquakeRiskByLocationRequest)

Post Earthquake Risk By Location

This is a Batch offering for &#39;Earthquake Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve counts of earthquakes for various richter measurements and values.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    EarthquakeRiskByLocationRequest earthquakeRiskByLocationRequest = new EarthquakeRiskByLocationRequest(); // EarthquakeRiskByLocationRequest | 
    try {
      EarthquakeRiskResponseList result = apiInstance.getEarthquakeRiskByLocationBatch(earthquakeRiskByLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getEarthquakeRiskByLocationBatch");
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
 **earthquakeRiskByLocationRequest** | [**EarthquakeRiskByLocationRequest**](EarthquakeRiskByLocationRequest.md)|  |

### Return type

[**EarthquakeRiskResponseList**](EarthquakeRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getFireHistory"></a>
# **getFireHistory**
> FireHistory getFireHistory(postCode, startDate, endDate, maxCandidates)

Get Fire History

Accepts postcode as input and Returns fire event details for a particular postcode.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String postCode = "postCode_example"; // String | 5 digit Postal code to search
    String startDate = "startDate_example"; // String | Start time in milliseconds(UTC)
    String endDate = "endDate_example"; // String | End time in milliseconds(UTC)
    String maxCandidates = "maxCandidates_example"; // String | Maximum response events
    try {
      FireHistory result = apiInstance.getFireHistory(postCode, startDate, endDate, maxCandidates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFireHistory");
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
 **postCode** | **String**| 5 digit Postal code to search |
 **startDate** | **String**| Start time in milliseconds(UTC) | [optional]
 **endDate** | **String**| End time in milliseconds(UTC) | [optional]
 **maxCandidates** | **String**| Maximum response events | [optional]

### Return type

[**FireHistory**](FireHistory.md)

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

<a name="getFireRiskByAddress"></a>
# **getFireRiskByAddress**
> FireRiskResponse getFireRiskByAddress(address, includeGeometry)

Get Fire Risk By Address

Accepts addresses as input and Returns fire risk data by risk types.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String address = "address_example"; // String | Free form address text
    String includeGeometry = "includeGeometry_example"; // String | Flag to return Geometry default is N
    try {
      FireRiskResponse result = apiInstance.getFireRiskByAddress(address, includeGeometry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFireRiskByAddress");
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
 **address** | **String**| Free form address text |
 **includeGeometry** | **String**| Flag to return Geometry default is N | [optional]

### Return type

[**FireRiskResponse**](FireRiskResponse.md)

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

<a name="getFireRiskByAddressBatch"></a>
# **getFireRiskByAddressBatch**
> FireRiskResponseList getFireRiskByAddressBatch(fireRiskByAddressRequest)

Post Fire Risk By Address

This is a Batch offering for &#39;Fire Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve fire risk data by risk types.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    FireRiskByAddressRequest fireRiskByAddressRequest = new FireRiskByAddressRequest(); // FireRiskByAddressRequest | 
    try {
      FireRiskResponseList result = apiInstance.getFireRiskByAddressBatch(fireRiskByAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFireRiskByAddressBatch");
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
 **fireRiskByAddressRequest** | [**FireRiskByAddressRequest**](FireRiskByAddressRequest.md)|  |

### Return type

[**FireRiskResponseList**](FireRiskResponseList.md)

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

<a name="getFireRiskByLocation"></a>
# **getFireRiskByLocation**
> FireRiskResponse getFireRiskByLocation(longitude, latitude, includeGeometry)

Get Fire Risk By Location

Accepts latitude &amp; longitude as input and Returns fire risk data by risk types.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of Location
    String latitude = "latitude_example"; // String | Latitude of Location
    String includeGeometry = "includeGeometry_example"; // String | Flag to return Geometry default is N
    try {
      FireRiskResponse result = apiInstance.getFireRiskByLocation(longitude, latitude, includeGeometry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFireRiskByLocation");
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
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |
 **includeGeometry** | **String**| Flag to return Geometry default is N | [optional]

### Return type

[**FireRiskResponse**](FireRiskResponse.md)

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

<a name="getFireRiskByLocationBatch"></a>
# **getFireRiskByLocationBatch**
> FireRiskResponseList getFireRiskByLocationBatch(fireRiskByLocationRequest)

Post Fire Risk By Location

This is a Batch offering for &#39;Fire Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve fire risk data by risk types.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    FireRiskByLocationRequest fireRiskByLocationRequest = new FireRiskByLocationRequest(); // FireRiskByLocationRequest | 
    try {
      FireRiskResponseList result = apiInstance.getFireRiskByLocationBatch(fireRiskByLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFireRiskByLocationBatch");
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
 **fireRiskByLocationRequest** | [**FireRiskByLocationRequest**](FireRiskByLocationRequest.md)|  |

### Return type

[**FireRiskResponseList**](FireRiskResponseList.md)

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

<a name="getFireStationByAddress"></a>
# **getFireStationByAddress**
> FireStations getFireStationByAddress(address, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket)

Get Fire Station By Address

Accepts addresses as input and Returns nearest fire stations.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String address = "address_example"; // String | Free Address
    String maxCandidates = "maxCandidates_example"; // String | Specifies the maximum number of fire stations that this service retrieves. The default value is 3 and maximum value is 5. The retrieved results are traveldistance sorted from the input location.
    String travelTime = "travelTime_example"; // String | Max travel time from input location to fire station. Maximum allowed is 2 hours
    String travelTimeUnit = "travelTimeUnit_example"; // String | minutes (default), hours, seconds, milliseconds
    String travelDistance = "travelDistance_example"; // String | Max travel distance from input location to fire station. Maximum allowed is 50 miles
    String travelDistanceUnit = "travelDistanceUnit_example"; // String | Feet (default), Kilometers, Miles, Meters
    String sortBy = "sortBy_example"; // String | time (default), distance
    String historicTrafficTimeBucket = "historicTrafficTimeBucket_example"; // String | Historic traffic time slab
    try {
      FireStations result = apiInstance.getFireStationByAddress(address, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFireStationByAddress");
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
 **address** | **String**| Free Address |
 **maxCandidates** | **String**| Specifies the maximum number of fire stations that this service retrieves. The default value is 3 and maximum value is 5. The retrieved results are traveldistance sorted from the input location. | [optional]
 **travelTime** | **String**| Max travel time from input location to fire station. Maximum allowed is 2 hours | [optional]
 **travelTimeUnit** | **String**| minutes (default), hours, seconds, milliseconds | [optional]
 **travelDistance** | **String**| Max travel distance from input location to fire station. Maximum allowed is 50 miles | [optional]
 **travelDistanceUnit** | **String**| Feet (default), Kilometers, Miles, Meters | [optional]
 **sortBy** | **String**| time (default), distance | [optional]
 **historicTrafficTimeBucket** | **String**| Historic traffic time slab | [optional]

### Return type

[**FireStations**](FireStations.md)

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

<a name="getFireStationByLocation"></a>
# **getFireStationByLocation**
> FireStations getFireStationByLocation(longitude, latitude, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket)

Get Fire Station By Location

Accepts latitude &amp; longitude as input and Returns nearest fire stations.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of Location
    String latitude = "latitude_example"; // String | Latitude of Location
    String maxCandidates = "maxCandidates_example"; // String | Specifies the maximum number of fire stations that this service retrieves. The default value is 3 and maximum value is 5. The retrieved results are traveldistance sorted from the input location.
    String travelTime = "travelTime_example"; // String | Max travel time from input location to fire station. Maximum allowed is 2 hours
    String travelTimeUnit = "travelTimeUnit_example"; // String | minutes (default), hours, seconds, milliseconds
    String travelDistance = "travelDistance_example"; // String | Max travel distance from input location to fire station. Maximum allowed is 50 miles
    String travelDistanceUnit = "travelDistanceUnit_example"; // String | Feet (default), Kilometers, Miles, Meters
    String sortBy = "sortBy_example"; // String | time (default), distance
    String historicTrafficTimeBucket = "historicTrafficTimeBucket_example"; // String | Historic traffic time slab
    try {
      FireStations result = apiInstance.getFireStationByLocation(longitude, latitude, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFireStationByLocation");
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
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |
 **maxCandidates** | **String**| Specifies the maximum number of fire stations that this service retrieves. The default value is 3 and maximum value is 5. The retrieved results are traveldistance sorted from the input location. | [optional]
 **travelTime** | **String**| Max travel time from input location to fire station. Maximum allowed is 2 hours | [optional]
 **travelTimeUnit** | **String**| minutes (default), hours, seconds, milliseconds | [optional]
 **travelDistance** | **String**| Max travel distance from input location to fire station. Maximum allowed is 50 miles | [optional]
 **travelDistanceUnit** | **String**| Feet (default), Kilometers, Miles, Meters | [optional]
 **sortBy** | **String**| time (default), distance | [optional]
 **historicTrafficTimeBucket** | **String**| Historic traffic time slab | [optional]

### Return type

[**FireStations**](FireStations.md)

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

<a name="getFloodRiskByAddress"></a>
# **getFloodRiskByAddress**
> FloodRiskResponse getFloodRiskByAddress(address, includeZoneDesc, includeGeometry)

Get Flood Risk By Address

Accepts addresses as input and Returns flood risk data for flood zones and base flood elevation values.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String address = "address_example"; // String | Free text Address
    String includeZoneDesc = "includeZoneDesc_example"; // String | Flag to return zone description
    String includeGeometry = "includeGeometry_example"; // String | Flag to return Geometry
    try {
      FloodRiskResponse result = apiInstance.getFloodRiskByAddress(address, includeZoneDesc, includeGeometry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFloodRiskByAddress");
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
 **address** | **String**| Free text Address |
 **includeZoneDesc** | **String**| Flag to return zone description | [optional]
 **includeGeometry** | **String**| Flag to return Geometry | [optional]

### Return type

[**FloodRiskResponse**](FloodRiskResponse.md)

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

<a name="getFloodRiskByAddressBatch"></a>
# **getFloodRiskByAddressBatch**
> FloodRiskResponseList getFloodRiskByAddressBatch(floodRiskByAddressRequest)

Post Flood Risk By Address

This is a Batch offering for &#39;Flood Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve flood risk data for flood zones and base flood elevation values.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    FloodRiskByAddressRequest floodRiskByAddressRequest = new FloodRiskByAddressRequest(); // FloodRiskByAddressRequest | 
    try {
      FloodRiskResponseList result = apiInstance.getFloodRiskByAddressBatch(floodRiskByAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFloodRiskByAddressBatch");
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
 **floodRiskByAddressRequest** | [**FloodRiskByAddressRequest**](FloodRiskByAddressRequest.md)|  |

### Return type

[**FloodRiskResponseList**](FloodRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="getFloodRiskByLocation"></a>
# **getFloodRiskByLocation**
> FloodRiskResponse getFloodRiskByLocation(longitude, latitude, includeZoneDesc, includeGeometry)

Get Flood Risk By Location

Accepts latitude &amp; longitude as input and Returns flood risk data for flood zones and base flood elevation values.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of Location
    String latitude = "latitude_example"; // String | Latitude of Location
    String includeZoneDesc = "includeZoneDesc_example"; // String | Flag to return zone description
    String includeGeometry = "includeGeometry_example"; // String | Flag to return Geometry
    try {
      FloodRiskResponse result = apiInstance.getFloodRiskByLocation(longitude, latitude, includeZoneDesc, includeGeometry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFloodRiskByLocation");
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
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |
 **includeZoneDesc** | **String**| Flag to return zone description | [optional]
 **includeGeometry** | **String**| Flag to return Geometry | [optional]

### Return type

[**FloodRiskResponse**](FloodRiskResponse.md)

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

<a name="getFloodRiskByLocationBatch"></a>
# **getFloodRiskByLocationBatch**
> FloodRiskResponseList getFloodRiskByLocationBatch(floodRiskByLocationRequest)

Post Flood Risk By Location

This is a Batch offering for &#39;Flood Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve flood risk data for flood zones and base flood elevation values.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.RisksServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    RisksServiceApi apiInstance = new RisksServiceApi(defaultClient);
    FloodRiskByLocationRequest floodRiskByLocationRequest = new FloodRiskByLocationRequest(); // FloodRiskByLocationRequest | 
    try {
      FloodRiskResponseList result = apiInstance.getFloodRiskByLocationBatch(floodRiskByLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RisksServiceApi#getFloodRiskByLocationBatch");
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
 **floodRiskByLocationRequest** | [**FloodRiskByLocationRequest**](FloodRiskByLocationRequest.md)|  |

### Return type

[**FloodRiskResponseList**](FloodRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

