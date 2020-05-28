# TypeaheadServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](TypeaheadServiceApi.md#search) | **GET** /typeahead/v1/locations | Typeahead Search


<a name="search"></a>
# **search**
> GeosearchLocations search(searchText, latitude, longitude, searchRadius, searchRadiusUnit, maxCandidates, country, matchOnAddressNumber, autoDetectLocation, ipAddress, areaName1, areaName3, postCode, returnAdminAreasOnly, includeRangesDetails, searchType)

Typeahead Search

Performs search to retrieve list of places by input text and location vicinity.

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.TypeaheadServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

TypeaheadServiceApi apiInstance = new TypeaheadServiceApi();
String searchText = "searchText_example"; // String | The input to be searched.
String latitude = "latitude_example"; // String | Latitude of the location. Either the latitude or the longitude must be provided.
String longitude = "longitude_example"; // String | Longitude of the location. Either the latitude or the longitude must be provided.
String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters.
String maxCandidates = "maxCandidates_example"; // String | Maximum number of addresses that can be retrieved.
String country = "country_example"; // String | Country ISO code. We need to make sure that either Lat/Lng or Country is provided to API
String matchOnAddressNumber = "matchOnAddressNumber_example"; // String | Option so that we force api to match on address number
String autoDetectLocation = "true"; // String | Option to allow API to detect origin of API request automatically
String ipAddress = "ipAddress_example"; // String | 
String areaName1 = "areaName1_example"; // String | State province of the input to be searched
String areaName3 = "areaName3_example"; // String | City of the input to be searched
String postCode = "postCode_example"; // String | Postal Code of the input to be searched
String returnAdminAreasOnly = "N"; // String | if value set 'Y' then it will only do a matching on postcode or areaName1, areaName2, areaName3 and areaName4 fields in the data
String includeRangesDetails = "Y"; // String | if value set 'Y' then display all unit info of ranges, if value set 'N' then don't show ranges
String searchType = "ADDRESS"; // String | Preference to control search type of interactive requests.
try {
    GeosearchLocations result = apiInstance.search(searchText, latitude, longitude, searchRadius, searchRadiusUnit, maxCandidates, country, matchOnAddressNumber, autoDetectLocation, ipAddress, areaName1, areaName3, postCode, returnAdminAreasOnly, includeRangesDetails, searchType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TypeaheadServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchText** | **String**| The input to be searched. |
 **latitude** | **String**| Latitude of the location. Either the latitude or the longitude must be provided. | [optional]
 **longitude** | **String**| Longitude of the location. Either the latitude or the longitude must be provided. | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters. | [optional]
 **maxCandidates** | **String**| Maximum number of addresses that can be retrieved. | [optional]
 **country** | **String**| Country ISO code. We need to make sure that either Lat/Lng or Country is provided to API | [optional]
 **matchOnAddressNumber** | **String**| Option so that we force api to match on address number | [optional]
 **autoDetectLocation** | **String**| Option to allow API to detect origin of API request automatically | [optional] [default to true]
 **ipAddress** | **String**|  | [optional]
 **areaName1** | **String**| State province of the input to be searched | [optional]
 **areaName3** | **String**| City of the input to be searched | [optional]
 **postCode** | **String**| Postal Code of the input to be searched | [optional]
 **returnAdminAreasOnly** | **String**| if value set &#39;Y&#39; then it will only do a matching on postcode or areaName1, areaName2, areaName3 and areaName4 fields in the data | [optional] [default to N] [enum: Y, N]
 **includeRangesDetails** | **String**| if value set &#39;Y&#39; then display all unit info of ranges, if value set &#39;N&#39; then don&#39;t show ranges | [optional] [default to Y] [enum: Y, N]
 **searchType** | **String**| Preference to control search type of interactive requests. | [optional] [default to ADDRESS] [enum: ADDRESS, POSTAL, CITY, STREET, GEOGRAPHY, STATE, ALL]

### Return type

[**GeosearchLocations**](GeosearchLocations.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

