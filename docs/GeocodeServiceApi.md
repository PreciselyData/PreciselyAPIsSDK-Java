# GeocodeServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**geocode**](GeocodeServiceApi.md#geocode) | **GET** /geocode/v1/{datapackBundle}/geocode | Get Forward Geocode(Basic/Premium/Advanced)
[**geocodeBatch**](GeocodeServiceApi.md#geocodeBatch) | **POST** /geocode/v1/{datapackBundle}/geocode | Post Forward Geocode
[**getPBKey**](GeocodeServiceApi.md#getPBKey) | **GET** /geocode/v1/key/byaddress | Get PreciselyID By Address
[**getPBKeys**](GeocodeServiceApi.md#getPBKeys) | **POST** /geocode/v1/key/byaddress | Post PreciselyID By Address
[**keyLookup**](GeocodeServiceApi.md#keyLookup) | **GET** /geocode/v1/keylookup | Get Key Lookup
[**keyLookupBatch**](GeocodeServiceApi.md#keyLookupBatch) | **POST** /geocode/v1/keylookup | Post Key Lookup
[**reverseGeocodBatch**](GeocodeServiceApi.md#reverseGeocodBatch) | **POST** /geocode/v1/{datapackBundle}/reverseGeocode | Post Reverse Geocode
[**reverseGeocode**](GeocodeServiceApi.md#reverseGeocode) | **GET** /geocode/v1/{datapackBundle}/reverseGeocode | Get Reverse Geocode(Basic/Premium/Advanced)


<a name="geocode"></a>
# **geocode**
> GeocodeServiceResponse geocode(datapackBundle, country, mainAddress, matchMode, fallbackGeo, fallbackPostal, maxCands, streetOffset, streetOffsetUnits, cornerOffset, cornerOffsetUnits, removeAccentMarks)

Get Forward Geocode(Basic/Premium/Advanced)

This service accepts an address and returns the location coordinates corresponding to that address. Premium offers the best accuracy and is a high precision geocoder leveraging Master Location Data - geocodes to Street or building level. Advanced offers advanced accuracy and geocodes to Street level.Basic offering will geocode to a Place or Postal level. Good accuracy.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.GeocodeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    GeocodeServiceApi apiInstance = new GeocodeServiceApi(defaultClient);
    String datapackBundle = "premium"; // String | datapackBundle
    String country = "USA"; // String | Country name or ISO code.
    String mainAddress = "4750 Walnut St., Boulder CO, 80301"; // String | Single line input, treated as collection of field elements.
    String matchMode = "Exact"; // String | Match modes determine the leniency used to make a match between the input address and the reference data.
    String fallbackGeo = "true"; // String | Specifies whether to attempt to determine a geographic region centroid when an address-level geocode cannot be determined.
    String fallbackPostal = "true"; // String | Specifies whether to attempt to determine a post code centroid when an address-level geocode cannot be determined.
    String maxCands = "1"; // String | The maximum number of candidates to return.
    String streetOffset = "7"; // String | Indicates the offset distance from the street segments to use in street-level geocoding.
    String streetOffsetUnits = "METERS"; // String | Specifies the unit of measurement for the street offset.
    String cornerOffset = "7"; // String | Specifies the distance to offset the street end points in street-level matching.
    String cornerOffsetUnits = "METERS"; // String | Specifies the unit of measurement for the corner offset.
    String removeAccentMarks = "false"; // String | Specifies whether to Suppress accents and other diacritical marks.
    try {
      GeocodeServiceResponse result = apiInstance.geocode(datapackBundle, country, mainAddress, matchMode, fallbackGeo, fallbackPostal, maxCands, streetOffset, streetOffsetUnits, cornerOffset, cornerOffsetUnits, removeAccentMarks);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeocodeServiceApi#geocode");
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
 **datapackBundle** | **String**| datapackBundle | [enum: premium, basic, advanced]
 **country** | **String**| Country name or ISO code. | [optional] [default to USA]
 **mainAddress** | **String**| Single line input, treated as collection of field elements. | [optional] [default to 4750 Walnut St., Boulder CO, 80301]
 **matchMode** | **String**| Match modes determine the leniency used to make a match between the input address and the reference data. | [optional] [default to Standard] [enum: Exact, Standard, Relaxed, Custom, Interactive(USA Only), CASS(USA Only)]
 **fallbackGeo** | **String**| Specifies whether to attempt to determine a geographic region centroid when an address-level geocode cannot be determined. | [optional] [default to true]
 **fallbackPostal** | **String**| Specifies whether to attempt to determine a post code centroid when an address-level geocode cannot be determined. | [optional] [default to true]
 **maxCands** | **String**| The maximum number of candidates to return. | [optional] [default to 1]
 **streetOffset** | **String**| Indicates the offset distance from the street segments to use in street-level geocoding. | [optional] [default to 7]
 **streetOffsetUnits** | **String**| Specifies the unit of measurement for the street offset. | [optional] [default to METERS] [enum: METERS, FEET]
 **cornerOffset** | **String**| Specifies the distance to offset the street end points in street-level matching. | [optional] [default to 7]
 **cornerOffsetUnits** | **String**| Specifies the unit of measurement for the corner offset. | [optional] [default to METERS] [enum: METERS, FEET]
 **removeAccentMarks** | **String**| Specifies whether to Suppress accents and other diacritical marks. | [optional] [default to false]

### Return type

[**GeocodeServiceResponse**](GeocodeServiceResponse.md)

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

<a name="geocodeBatch"></a>
# **geocodeBatch**
> GeocodeServiceResponseList geocodeBatch(datapackBundle, geocodeRequest)

Post Forward Geocode

This is a Batch offering for geocode service. It accepts a single address or a list of addresses and returns location coordinates

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.GeocodeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    GeocodeServiceApi apiInstance = new GeocodeServiceApi(defaultClient);
    String datapackBundle = "datapackBundle_example"; // String | 
    GeocodeRequest geocodeRequest = new GeocodeRequest(); // GeocodeRequest | 
    try {
      GeocodeServiceResponseList result = apiInstance.geocodeBatch(datapackBundle, geocodeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeocodeServiceApi#geocodeBatch");
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
 **datapackBundle** | **String**|  |
 **geocodeRequest** | [**GeocodeRequest**](GeocodeRequest.md)|  |

### Return type

[**GeocodeServiceResponseList**](GeocodeServiceResponseList.md)

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

<a name="getPBKey"></a>
# **getPBKey**
> PBKeyResponse getPBKey(address, country)

Get PreciselyID By Address

This service accepts an address and returns the corresponding PreciselyID

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.GeocodeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    GeocodeServiceApi apiInstance = new GeocodeServiceApi(defaultClient);
    String address = "address_example"; // String | The address to be searched.
    String country = "country_example"; // String | 3 letter ISO code of the country to be searched.
    try {
      PBKeyResponse result = apiInstance.getPBKey(address, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeocodeServiceApi#getPBKey");
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
 **country** | **String**| 3 letter ISO code of the country to be searched. | [optional]

### Return type

[**PBKeyResponse**](PBKeyResponse.md)

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

<a name="getPBKeys"></a>
# **getPBKeys**
> PBKeyResponseList getPBKeys(pbKeyAddressRequest)

Post PreciselyID By Address

This is a Batch offering for &#39;PreciselyID By Address&#39; service. It accepts a single address or a list of addresses and returns the corresponding PreciselyID.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.GeocodeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    GeocodeServiceApi apiInstance = new GeocodeServiceApi(defaultClient);
    PBKeyAddressRequest pbKeyAddressRequest = new PBKeyAddressRequest(); // PBKeyAddressRequest | 
    try {
      PBKeyResponseList result = apiInstance.getPBKeys(pbKeyAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeocodeServiceApi#getPBKeys");
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
 **pbKeyAddressRequest** | [**PBKeyAddressRequest**](PBKeyAddressRequest.md)|  |

### Return type

[**PBKeyResponseList**](PBKeyResponseList.md)

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

<a name="keyLookup"></a>
# **keyLookup**
> GeocodeServiceResponse keyLookup(key, type, country)

Get Key Lookup

This service accepts a PreciselyID and returns the corresponding address associated with that PreciselyID.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.GeocodeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    GeocodeServiceApi apiInstance = new GeocodeServiceApi(defaultClient);
    String key = "key_example"; // String | PreciselyID which maps to a unique address.
    String type = "type_example"; // String | Specifies the key type - PreciselyID and GNAF_PID for Aus.
    String country = "country_example"; // String | 3 letter ISO code of the country to be searched.
    try {
      GeocodeServiceResponse result = apiInstance.keyLookup(key, type, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeocodeServiceApi#keyLookup");
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
 **key** | **String**| PreciselyID which maps to a unique address. |
 **type** | **String**| Specifies the key type - PreciselyID and GNAF_PID for Aus. |
 **country** | **String**| 3 letter ISO code of the country to be searched. | [optional]

### Return type

[**GeocodeServiceResponse**](GeocodeServiceResponse.md)

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

<a name="keyLookupBatch"></a>
# **keyLookupBatch**
> GeocodeServiceResponseList keyLookupBatch(keyLookupRequest)

Post Key Lookup

This service accepts batches of PreciselyID&#39;s and returns the corresponding address associated with those PreciselyID&#39;s.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.GeocodeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    GeocodeServiceApi apiInstance = new GeocodeServiceApi(defaultClient);
    KeyLookupRequest keyLookupRequest = new KeyLookupRequest(); // KeyLookupRequest | 
    try {
      GeocodeServiceResponseList result = apiInstance.keyLookupBatch(keyLookupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeocodeServiceApi#keyLookupBatch");
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
 **keyLookupRequest** | [**KeyLookupRequest**](KeyLookupRequest.md)|  |

### Return type

[**GeocodeServiceResponseList**](GeocodeServiceResponseList.md)

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

<a name="reverseGeocodBatch"></a>
# **reverseGeocodBatch**
> GeocodeServiceResponseList reverseGeocodBatch(datapackBundle, reverseGeocodeRequest)

Post Reverse Geocode

This is a Batch offering for geocode service. It accepts a single address or a list of addresses and returns location coordinates

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.GeocodeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    GeocodeServiceApi apiInstance = new GeocodeServiceApi(defaultClient);
    String datapackBundle = "datapackBundle_example"; // String | 
    ReverseGeocodeRequest reverseGeocodeRequest = new ReverseGeocodeRequest(); // ReverseGeocodeRequest | 
    try {
      GeocodeServiceResponseList result = apiInstance.reverseGeocodBatch(datapackBundle, reverseGeocodeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeocodeServiceApi#reverseGeocodBatch");
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
 **datapackBundle** | **String**|  |
 **reverseGeocodeRequest** | [**ReverseGeocodeRequest**](ReverseGeocodeRequest.md)|  |

### Return type

[**GeocodeServiceResponseList**](GeocodeServiceResponseList.md)

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

<a name="reverseGeocode"></a>
# **reverseGeocode**
> GeocodeServiceResponse reverseGeocode(datapackBundle, x, y, country, coordSysName, distance, distanceUnits)

Get Reverse Geocode(Basic/Premium/Advanced)

This service accepts location coordinate and returns an address.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.GeocodeServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    GeocodeServiceApi apiInstance = new GeocodeServiceApi(defaultClient);
    String datapackBundle = "premium"; // String | datapackBundle
    String x = "-105.240976"; // String | Longitude of the location.
    String y = "40.018301"; // String | Latitude of the location.
    String country = "country_example"; // String | Country name or ISO code.
    String coordSysName = "EPSG:4326"; // String | Coordinate system to convert geometry to in format codespace:code.
    String distance = "Radius in which search is performed."; // String | Radius in which search is performed.
    String distanceUnits = "METERS"; // String | Unit of measurement.
    try {
      GeocodeServiceResponse result = apiInstance.reverseGeocode(datapackBundle, x, y, country, coordSysName, distance, distanceUnits);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeocodeServiceApi#reverseGeocode");
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
 **datapackBundle** | **String**| datapackBundle | [enum: premium, basic, advanced]
 **x** | **String**| Longitude of the location. | [default to -105.240976]
 **y** | **String**| Latitude of the location. | [default to 40.018301]
 **country** | **String**| Country name or ISO code. | [optional]
 **coordSysName** | **String**| Coordinate system to convert geometry to in format codespace:code. | [optional] [default to EPSG:4326]
 **distance** | **String**| Radius in which search is performed. | [optional] [default to Radius in which search is performed.]
 **distanceUnits** | **String**| Unit of measurement. | [optional] [default to METERS] [enum: METERS, FEET]

### Return type

[**GeocodeServiceResponse**](GeocodeServiceResponse.md)

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

