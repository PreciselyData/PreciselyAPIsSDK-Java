# TypeaheadServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchV2**](TypeaheadServiceApi.md#searchV2) | **GET** /typeahead/v1/locations | Typeahead Search


<a name="searchV2"></a>
# **searchV2**
> TypeaheadLocations searchV2(searchText, latitude, longitude, searchRadius, searchRadiusUnit, maxCandidates, country, matchOnAddressNumber, autoDetectLocation, ipAddress, areaName1, areaName3, postCode, returnAdminAreasOnly, includeRangesDetails, searchType, searchOnAddressNumber)

Typeahead Search

Performs search to retrieve list of places by input text and location vicinity.

### Example
```java
// Import classes:
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.Configuration;
import com.precisely.auth.*;
import com.precisely.models.*;
import com.precisely.apis.TypeaheadServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.precisely.com");
    
    // Configure OAuth2 access token for authorization: oAuth2Password
    OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
    oAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

    TypeaheadServiceApi apiInstance = new TypeaheadServiceApi(defaultClient);
    String searchText = "searchText_example"; // String | The input to be searched.
    String latitude = "latitude_example"; // String | Latitude of the location. We need to make sure that either Lat/Lng or Country is provided to API
    String longitude = "longitude_example"; // String | Longitude of the location. We need to make sure that either Lat/Lng or Country is provided to API
    String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
    String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters.
    String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved.
    String country = "country_example"; // String | Country ISO code. We need to make sure that either Lat/Lng or Country is provided to API
    String matchOnAddressNumber = "matchOnAddressNumber_example"; // String | Option so that we force api to match on address number
    String autoDetectLocation = "autoDetectLocation_example"; // String | Option to allow API to detect origin of API request automatically
    String ipAddress = "ipAddress_example"; // String | 
    String areaName1 = "areaName1_example"; // String | State province of the input to be searched
    String areaName3 = "areaName3_example"; // String | City of the input to be searched
    String postCode = "postCode_example"; // String | Postal Code of the input to be searched
    String returnAdminAreasOnly = "returnAdminAreasOnly_example"; // String | if value set 'Y' then it will only do a matching on postcode or areaName1, areaName2, areaName3 and areaName4 fields in the data
    String includeRangesDetails = "includeRangesDetails_example"; // String | if value set 'Y' then display all unit info of ranges, if value set 'N' then don't show ranges
    String searchType = "searchType_example"; // String | Preference to control search type of interactive requests.
    String searchOnAddressNumber = "searchOnAddressNumber_example"; // String | Preference to search on address number.
    try {
      TypeaheadLocations result = apiInstance.searchV2(searchText, latitude, longitude, searchRadius, searchRadiusUnit, maxCandidates, country, matchOnAddressNumber, autoDetectLocation, ipAddress, areaName1, areaName3, postCode, returnAdminAreasOnly, includeRangesDetails, searchType, searchOnAddressNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TypeaheadServiceApi#searchV2");
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
 **searchText** | **String**| The input to be searched. |
 **latitude** | **String**| Latitude of the location. We need to make sure that either Lat/Lng or Country is provided to API | [optional]
 **longitude** | **String**| Longitude of the location. We need to make sure that either Lat/Lng or Country is provided to API | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters. | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved. | [optional]
 **country** | **String**| Country ISO code. We need to make sure that either Lat/Lng or Country is provided to API | [optional]
 **matchOnAddressNumber** | **String**| Option so that we force api to match on address number | [optional]
 **autoDetectLocation** | **String**| Option to allow API to detect origin of API request automatically | [optional]
 **ipAddress** | **String**|  | [optional]
 **areaName1** | **String**| State province of the input to be searched | [optional]
 **areaName3** | **String**| City of the input to be searched | [optional]
 **postCode** | **String**| Postal Code of the input to be searched | [optional]
 **returnAdminAreasOnly** | **String**| if value set &#39;Y&#39; then it will only do a matching on postcode or areaName1, areaName2, areaName3 and areaName4 fields in the data | [optional]
 **includeRangesDetails** | **String**| if value set &#39;Y&#39; then display all unit info of ranges, if value set &#39;N&#39; then don&#39;t show ranges | [optional]
 **searchType** | **String**| Preference to control search type of interactive requests. | [optional]
 **searchOnAddressNumber** | **String**| Preference to search on address number. | [optional]

### Return type

[**TypeaheadLocations**](TypeaheadLocations.md)

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

