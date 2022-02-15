# NeighborhoodsServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlaceByLocation**](NeighborhoodsServiceApi.md#getPlaceByLocation) | **GET** /neighborhoods/v1/place/bylocation | Place By Location.


<a name="getPlaceByLocation"></a>
# **getPlaceByLocation**
> NeighborhoodsResponse getPlaceByLocation(longitude, latitude, levelHint)

Place By Location.

Identifies and retrieves the nearest neighborhood around a specific location. This service accepts latitude &amp; longitude as input and returns a place name.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.NeighborhoodsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    NeighborhoodsServiceApi apiInstance = new NeighborhoodsServiceApi(defaultClient);
    String longitude = "longitude_example"; // String | Longitude of the location.
    String latitude = "latitude_example"; // String | Latitude of the location.
    String levelHint = "levelHint_example"; // String | Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6
    try {
      NeighborhoodsResponse result = apiInstance.getPlaceByLocation(longitude, latitude, levelHint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NeighborhoodsServiceApi#getPlaceByLocation");
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
 **levelHint** | **String**| Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6 | [optional]

### Return type

[**NeighborhoodsResponse**](NeighborhoodsResponse.md)

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

