/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiCallback;
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.ApiResponse;
import com.precisely.Configuration;
import com.precisely.Pair;
import com.precisely.ProgressRequestBody;
import com.precisely.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.TimezoneAddressRequest;
import com.precisely.apis.model.TimezoneLocationRequest;
import com.precisely.apis.model.TimezoneResponse;
import com.precisely.apis.model.TimezoneResponseList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeZoneServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TimeZoneServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TimeZoneServiceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getBatchTimezoneByLocation
     * @param timezoneLocationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBatchTimezoneByLocationCall(TimezoneLocationRequest timezoneLocationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = timezoneLocationRequest;

        // create path and map variables
        String localVarPath = "/timezone/v1/timezone/bylocation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBatchTimezoneByLocationValidateBeforeCall(TimezoneLocationRequest timezoneLocationRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'timezoneLocationRequest' is set
        if (timezoneLocationRequest == null) {
            throw new ApiException("Missing the required parameter 'timezoneLocationRequest' when calling getBatchTimezoneByLocation(Async)");
        }
        

        okhttp3.Call localVarCall = getBatchTimezoneByLocationCall(timezoneLocationRequest, _callback);
        return localVarCall;

    }

    /**
     * Timezone Batch by Location.
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     * @param timezoneLocationRequest  (required)
     * @return TimezoneResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public TimezoneResponseList getBatchTimezoneByLocation(TimezoneLocationRequest timezoneLocationRequest) throws ApiException {
        ApiResponse<TimezoneResponseList> localVarResp = getBatchTimezoneByLocationWithHttpInfo(timezoneLocationRequest);
        return localVarResp.getData();
    }

    /**
     * Timezone Batch by Location.
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     * @param timezoneLocationRequest  (required)
     * @return ApiResponse&lt;TimezoneResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TimezoneResponseList> getBatchTimezoneByLocationWithHttpInfo(TimezoneLocationRequest timezoneLocationRequest) throws ApiException {
        okhttp3.Call localVarCall = getBatchTimezoneByLocationValidateBeforeCall(timezoneLocationRequest, null);
        Type localVarReturnType = new TypeToken<TimezoneResponseList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Timezone Batch by Location. (asynchronously)
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     * @param timezoneLocationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBatchTimezoneByLocationAsync(TimezoneLocationRequest timezoneLocationRequest, final ApiCallback<TimezoneResponseList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBatchTimezoneByLocationValidateBeforeCall(timezoneLocationRequest, _callback);
        Type localVarReturnType = new TypeToken<TimezoneResponseList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTimezoneByAddress
     * @param timestamp Timestamp in miliseconds. (required)
     * @param address The address to be searched. (required)
     * @param matchMode Match modes determine the leniency used to make a match between the input address and the reference data (Default is relaxed) (optional)
     * @param country Country ISO code (Default is USA) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTimezoneByAddressCall(String timestamp, String address, String matchMode, String country, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/timezone/v1/timezone/byaddress";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (timestamp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timestamp", timestamp));
        }

        if (address != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("address", address));
        }

        if (matchMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("matchMode", matchMode));
        }

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTimezoneByAddressValidateBeforeCall(String timestamp, String address, String matchMode, String country, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling getTimezoneByAddress(Async)");
        }
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getTimezoneByAddress(Async)");
        }
        

        okhttp3.Call localVarCall = getTimezoneByAddressCall(timestamp, address, matchMode, country, _callback);
        return localVarCall;

    }

    /**
     * Timezone By Address.
     * Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param address The address to be searched. (required)
     * @param matchMode Match modes determine the leniency used to make a match between the input address and the reference data (Default is relaxed) (optional)
     * @param country Country ISO code (Default is USA) (optional)
     * @return TimezoneResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public TimezoneResponse getTimezoneByAddress(String timestamp, String address, String matchMode, String country) throws ApiException {
        ApiResponse<TimezoneResponse> localVarResp = getTimezoneByAddressWithHttpInfo(timestamp, address, matchMode, country);
        return localVarResp.getData();
    }

    /**
     * Timezone By Address.
     * Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param address The address to be searched. (required)
     * @param matchMode Match modes determine the leniency used to make a match between the input address and the reference data (Default is relaxed) (optional)
     * @param country Country ISO code (Default is USA) (optional)
     * @return ApiResponse&lt;TimezoneResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TimezoneResponse> getTimezoneByAddressWithHttpInfo(String timestamp, String address, String matchMode, String country) throws ApiException {
        okhttp3.Call localVarCall = getTimezoneByAddressValidateBeforeCall(timestamp, address, matchMode, country, null);
        Type localVarReturnType = new TypeToken<TimezoneResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Timezone By Address. (asynchronously)
     * Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param address The address to be searched. (required)
     * @param matchMode Match modes determine the leniency used to make a match between the input address and the reference data (Default is relaxed) (optional)
     * @param country Country ISO code (Default is USA) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTimezoneByAddressAsync(String timestamp, String address, String matchMode, String country, final ApiCallback<TimezoneResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTimezoneByAddressValidateBeforeCall(timestamp, address, matchMode, country, _callback);
        Type localVarReturnType = new TypeToken<TimezoneResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTimezoneByAddressBatch
     * @param timezoneAddressRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTimezoneByAddressBatchCall(TimezoneAddressRequest timezoneAddressRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = timezoneAddressRequest;

        // create path and map variables
        String localVarPath = "/timezone/v1/timezone/byaddress";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTimezoneByAddressBatchValidateBeforeCall(TimezoneAddressRequest timezoneAddressRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'timezoneAddressRequest' is set
        if (timezoneAddressRequest == null) {
            throw new ApiException("Missing the required parameter 'timezoneAddressRequest' when calling getTimezoneByAddressBatch(Async)");
        }
        

        okhttp3.Call localVarCall = getTimezoneByAddressBatchCall(timezoneAddressRequest, _callback);
        return localVarCall;

    }

    /**
     * Timezone Batch by Address.
     * Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.
     * @param timezoneAddressRequest  (required)
     * @return TimezoneResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public TimezoneResponseList getTimezoneByAddressBatch(TimezoneAddressRequest timezoneAddressRequest) throws ApiException {
        ApiResponse<TimezoneResponseList> localVarResp = getTimezoneByAddressBatchWithHttpInfo(timezoneAddressRequest);
        return localVarResp.getData();
    }

    /**
     * Timezone Batch by Address.
     * Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.
     * @param timezoneAddressRequest  (required)
     * @return ApiResponse&lt;TimezoneResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TimezoneResponseList> getTimezoneByAddressBatchWithHttpInfo(TimezoneAddressRequest timezoneAddressRequest) throws ApiException {
        okhttp3.Call localVarCall = getTimezoneByAddressBatchValidateBeforeCall(timezoneAddressRequest, null);
        Type localVarReturnType = new TypeToken<TimezoneResponseList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Timezone Batch by Address. (asynchronously)
     * Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.
     * @param timezoneAddressRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTimezoneByAddressBatchAsync(TimezoneAddressRequest timezoneAddressRequest, final ApiCallback<TimezoneResponseList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTimezoneByAddressBatchValidateBeforeCall(timezoneAddressRequest, _callback);
        Type localVarReturnType = new TypeToken<TimezoneResponseList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTimezoneByLocation
     * @param timestamp Timestamp in miliseconds. (required)
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTimezoneByLocationCall(String timestamp, String longitude, String latitude, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/timezone/v1/timezone/bylocation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (timestamp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timestamp", timestamp));
        }

        if (longitude != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("longitude", longitude));
        }

        if (latitude != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("latitude", latitude));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTimezoneByLocationValidateBeforeCall(String timestamp, String longitude, String latitude, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling getTimezoneByLocation(Async)");
        }
        
        // verify the required parameter 'longitude' is set
        if (longitude == null) {
            throw new ApiException("Missing the required parameter 'longitude' when calling getTimezoneByLocation(Async)");
        }
        
        // verify the required parameter 'latitude' is set
        if (latitude == null) {
            throw new ApiException("Missing the required parameter 'latitude' when calling getTimezoneByLocation(Async)");
        }
        

        okhttp3.Call localVarCall = getTimezoneByLocationCall(timestamp, longitude, latitude, _callback);
        return localVarCall;

    }

    /**
     * Timezone By Location.
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @return TimezoneResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public TimezoneResponse getTimezoneByLocation(String timestamp, String longitude, String latitude) throws ApiException {
        ApiResponse<TimezoneResponse> localVarResp = getTimezoneByLocationWithHttpInfo(timestamp, longitude, latitude);
        return localVarResp.getData();
    }

    /**
     * Timezone By Location.
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @return ApiResponse&lt;TimezoneResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TimezoneResponse> getTimezoneByLocationWithHttpInfo(String timestamp, String longitude, String latitude) throws ApiException {
        okhttp3.Call localVarCall = getTimezoneByLocationValidateBeforeCall(timestamp, longitude, latitude, null);
        Type localVarReturnType = new TypeToken<TimezoneResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Timezone By Location. (asynchronously)
     * Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.
     * @param timestamp Timestamp in miliseconds. (required)
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTimezoneByLocationAsync(String timestamp, String longitude, String latitude, final ApiCallback<TimezoneResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTimezoneByLocationValidateBeforeCall(timestamp, longitude, latitude, _callback);
        Type localVarReturnType = new TypeToken<TimezoneResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
