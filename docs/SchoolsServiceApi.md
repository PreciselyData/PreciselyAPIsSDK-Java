# SchoolsServiceApi

All URIs are relative to *https://api.precisely.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSchoolsByAddress**](SchoolsServiceApi.md#getSchoolsByAddress) | **GET** /schools/v1/school/byaddress | Search Nearby Schools by Address


<a name="getSchoolsByAddress"></a>
# **getSchoolsByAddress**
> SchoolsNearByResponse getSchoolsByAddress(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates)

Search Nearby Schools by Address

Search Nearby Schools by Address

### Example
```java
// Import classes:
//import com.precisely.ApiClient;
//import com.precisely.ApiException;
//import com.precisely.Configuration;
//import com.precisely.auth.*;
//import com.precisely.apis.SchoolsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

SchoolsServiceApi apiInstance = new SchoolsServiceApi();
String address = "address_example"; // String | free form address text
String edLevel = "edLevel_example"; // String | Single digit code for education level applicable values are P -> primary, M -> Middle, H -> High, O -> Mixed Grades for public school type andE -> Elementary , S -> Secondary , O -> Others mixed grades for private schools 
String schoolType = "schoolType_example"; // String | Single digit code for schoolTypes applicable values are PRI and PUB
String schoolSubType = "schoolSubType_example"; // String | Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education)
String gender = "gender_example"; // String | Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males)
String assignedSchoolsOnly = "assignedSchoolsOnly_example"; // String | Single digit code for assignedSchoolOnly applicable values are  Y/N 
String districtSchoolsOnly = "districtSchoolsOnly_example"; // String | Single digit code for districtSchoolOnly applicable values are Y/N 
String searchRadius = "searchRadius_example"; // String | Search Radius within which schools are searched
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Search Radius unit applicable values are feet,kilometers,miles,meters
String travelTime = "travelTime_example"; // String | Travel Time based on ‘travelMode’ within which schools are searched.
String travelTimeUnit = "travelTimeUnit_example"; // String | Travel Time unit applicable values are minutes,hours,seconds,milliseconds 
String travelDistance = "travelDistance_example"; // String | Travel Distance based on ‘travelMode’ within which schools are searched.
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Travel distanceUnit applicable values are feet,kilometers,miles,meters
String travelMode = "travelMode_example"; // String | Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving
String maxCandidates = "10"; // String | Max result to search 
try {
    SchoolsNearByResponse result = apiInstance.getSchoolsByAddress(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchoolsServiceApi#getSchoolsByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text |
 **edLevel** | **String**| Single digit code for education level applicable values are P -&gt; primary, M -&gt; Middle, H -&gt; High, O -&gt; Mixed Grades for public school type andE -&gt; Elementary , S -&gt; Secondary , O -&gt; Others mixed grades for private schools  | [optional]
 **schoolType** | **String**| Single digit code for schoolTypes applicable values are PRI and PUB | [optional]
 **schoolSubType** | **String**| Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education) | [optional]
 **gender** | **String**| Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males) | [optional]
 **assignedSchoolsOnly** | **String**| Single digit code for assignedSchoolOnly applicable values are  Y/N  | [optional]
 **districtSchoolsOnly** | **String**| Single digit code for districtSchoolOnly applicable values are Y/N  | [optional]
 **searchRadius** | **String**| Search Radius within which schools are searched | [optional]
 **searchRadiusUnit** | **String**| Search Radius unit applicable values are feet,kilometers,miles,meters | [optional]
 **travelTime** | **String**| Travel Time based on ‘travelMode’ within which schools are searched. | [optional]
 **travelTimeUnit** | **String**| Travel Time unit applicable values are minutes,hours,seconds,milliseconds  | [optional]
 **travelDistance** | **String**| Travel Distance based on ‘travelMode’ within which schools are searched. | [optional]
 **travelDistanceUnit** | **String**| Travel distanceUnit applicable values are feet,kilometers,miles,meters | [optional]
 **travelMode** | **String**| Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving | [optional]
 **maxCandidates** | **String**| Max result to search  | [optional] [default to 10]

### Return type

[**SchoolsNearByResponse**](SchoolsNearByResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

