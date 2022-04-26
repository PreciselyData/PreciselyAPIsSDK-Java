/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3
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
import com.precisely.apis.model.RateCenterResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelecommInfoServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TelecommInfoServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TelecommInfoServiceApi(ApiClient apiClient) {
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
     * Build call for getRateCenterByAddress
     * @param address The address to be searched (optional)
     * @param country 3 letter ISO code of the country to be searched. Allowed values USA,CAN (optional)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional)
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
    public okhttp3.Call getRateCenterByAddressCall(String address, String country, String areaCodeInfo, String level, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/telecomm/v1/ratecenter/byaddress";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (address != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("address", address));
        }

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        if (areaCodeInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("areaCodeInfo", areaCodeInfo));
        }

        if (level != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("level", level));
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
    private okhttp3.Call getRateCenterByAddressValidateBeforeCall(String address, String country, String areaCodeInfo, String level, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getRateCenterByAddressCall(address, country, areaCodeInfo, level, _callback);
        return localVarCall;

    }

    /**
     * Rate Center By Address.
     * Accepts addresses as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param address The address to be searched (optional)
     * @param country 3 letter ISO code of the country to be searched. Allowed values USA,CAN (optional)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional)
     * @return RateCenterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public RateCenterResponse getRateCenterByAddress(String address, String country, String areaCodeInfo, String level) throws ApiException {
        ApiResponse<RateCenterResponse> localVarResp = getRateCenterByAddressWithHttpInfo(address, country, areaCodeInfo, level);
        return localVarResp.getData();
    }

    /**
     * Rate Center By Address.
     * Accepts addresses as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param address The address to be searched (optional)
     * @param country 3 letter ISO code of the country to be searched. Allowed values USA,CAN (optional)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional)
     * @return ApiResponse&lt;RateCenterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RateCenterResponse> getRateCenterByAddressWithHttpInfo(String address, String country, String areaCodeInfo, String level) throws ApiException {
        okhttp3.Call localVarCall = getRateCenterByAddressValidateBeforeCall(address, country, areaCodeInfo, level, null);
        Type localVarReturnType = new TypeToken<RateCenterResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Rate Center By Address. (asynchronously)
     * Accepts addresses as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param address The address to be searched (optional)
     * @param country 3 letter ISO code of the country to be searched. Allowed values USA,CAN (optional)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional)
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
    public okhttp3.Call getRateCenterByAddressAsync(String address, String country, String areaCodeInfo, String level, final ApiCallback<RateCenterResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRateCenterByAddressValidateBeforeCall(address, country, areaCodeInfo, level, _callback);
        Type localVarReturnType = new TypeToken<RateCenterResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRateCenterByLocation
     * @param longitude Longitude of the location (optional)
     * @param latitude Latitude of the location (optional)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional)
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
    public okhttp3.Call getRateCenterByLocationCall(String longitude, String latitude, String areaCodeInfo, String level, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/telecomm/v1/ratecenter/bylocation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (longitude != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("longitude", longitude));
        }

        if (latitude != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("latitude", latitude));
        }

        if (areaCodeInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("areaCodeInfo", areaCodeInfo));
        }

        if (level != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("level", level));
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
    private okhttp3.Call getRateCenterByLocationValidateBeforeCall(String longitude, String latitude, String areaCodeInfo, String level, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getRateCenterByLocationCall(longitude, latitude, areaCodeInfo, level, _callback);
        return localVarCall;

    }

    /**
     * Rate Center By Location.
     * Accepts latitude &amp; longitude as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param longitude Longitude of the location (optional)
     * @param latitude Latitude of the location (optional)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional)
     * @return RateCenterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public RateCenterResponse getRateCenterByLocation(String longitude, String latitude, String areaCodeInfo, String level) throws ApiException {
        ApiResponse<RateCenterResponse> localVarResp = getRateCenterByLocationWithHttpInfo(longitude, latitude, areaCodeInfo, level);
        return localVarResp.getData();
    }

    /**
     * Rate Center By Location.
     * Accepts latitude &amp; longitude as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param longitude Longitude of the location (optional)
     * @param latitude Latitude of the location (optional)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional)
     * @return ApiResponse&lt;RateCenterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RateCenterResponse> getRateCenterByLocationWithHttpInfo(String longitude, String latitude, String areaCodeInfo, String level) throws ApiException {
        okhttp3.Call localVarCall = getRateCenterByLocationValidateBeforeCall(longitude, latitude, areaCodeInfo, level, null);
        Type localVarReturnType = new TypeToken<RateCenterResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Rate Center By Location. (asynchronously)
     * Accepts latitude &amp; longitude as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     * @param longitude Longitude of the location (optional)
     * @param latitude Latitude of the location (optional)
     * @param areaCodeInfo Specifies whether area code information will be part of response.Allowed values True,False. (optional)
     * @param level Level (basic/detail).Allowed values detail,basic. (optional)
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
    public okhttp3.Call getRateCenterByLocationAsync(String longitude, String latitude, String areaCodeInfo, String level, final ApiCallback<RateCenterResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRateCenterByLocationValidateBeforeCall(longitude, latitude, areaCodeInfo, level, _callback);
        Type localVarReturnType = new TypeToken<RateCenterResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
