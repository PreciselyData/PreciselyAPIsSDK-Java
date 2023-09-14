/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 17.0.0
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


import com.precisely.apis.model.GeoLocationAccessPoint;
import com.precisely.apis.model.GeoLocationIpAddr;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeolocationServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GeolocationServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GeolocationServiceApi(ApiClient apiClient) {
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
     * Build call for getLocationByIPAddress
     * @param ipAddress This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLocationByIPAddressCall(String ipAddress, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/geolocation/v1/location/byipaddress";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ipAddress != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ipAddress", ipAddress));
        }

        final String[] localVarAccepts = {
            "application/xml", "application/json"
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
    private okhttp3.Call getLocationByIPAddressValidateBeforeCall(String ipAddress, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ipAddress' is set
        if (ipAddress == null) {
            throw new ApiException("Missing the required parameter 'ipAddress' when calling getLocationByIPAddress(Async)");
        }
        

        okhttp3.Call localVarCall = getLocationByIPAddressCall(ipAddress, _callback);
        return localVarCall;

    }

    /**
     * Location By IP Address.
     * This service accepts an IP address and returns the location coordinates corresponding to that IP address.
     * @param ipAddress This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address. (required)
     * @return GeoLocationIpAddr
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public GeoLocationIpAddr getLocationByIPAddress(String ipAddress) throws ApiException {
        ApiResponse<GeoLocationIpAddr> localVarResp = getLocationByIPAddressWithHttpInfo(ipAddress);
        return localVarResp.getData();
    }

    /**
     * Location By IP Address.
     * This service accepts an IP address and returns the location coordinates corresponding to that IP address.
     * @param ipAddress This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address. (required)
     * @return ApiResponse&lt;GeoLocationIpAddr&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GeoLocationIpAddr> getLocationByIPAddressWithHttpInfo(String ipAddress) throws ApiException {
        okhttp3.Call localVarCall = getLocationByIPAddressValidateBeforeCall(ipAddress, null);
        Type localVarReturnType = new TypeToken<GeoLocationIpAddr>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Location By IP Address. (asynchronously)
     * This service accepts an IP address and returns the location coordinates corresponding to that IP address.
     * @param ipAddress This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLocationByIPAddressAsync(String ipAddress, final ApiCallback<GeoLocationIpAddr> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLocationByIPAddressValidateBeforeCall(ipAddress, _callback);
        Type localVarReturnType = new TypeToken<GeoLocationIpAddr>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLocationByWiFiAccessPoint
     * @param mac This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons. (optional)
     * @param ssid The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters. (optional)
     * @param rsid This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm. (optional)
     * @param speed This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps. (optional)
     * @param accessPoint This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLocationByWiFiAccessPointCall(String mac, String ssid, String rsid, String speed, String accessPoint, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/geolocation/v1/location/byaccesspoint";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (mac != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mac", mac));
        }

        if (ssid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ssid", ssid));
        }

        if (rsid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rsid", rsid));
        }

        if (speed != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("speed", speed));
        }

        if (accessPoint != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("accessPoint", accessPoint));
        }

        final String[] localVarAccepts = {
            "application/xml", "application/json"
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
    private okhttp3.Call getLocationByWiFiAccessPointValidateBeforeCall(String mac, String ssid, String rsid, String speed, String accessPoint, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getLocationByWiFiAccessPointCall(mac, ssid, rsid, speed, accessPoint, _callback);
        return localVarCall;

    }

    /**
     * Location by WiFi Access Point.
     * This service accepts a WiFi access point MAC address and returns the location coordinates corresponding to that access point. Only mac or accessPoint are mandatory parameters (one of them has to be provided), rest are optional.
     * @param mac This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons. (optional)
     * @param ssid The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters. (optional)
     * @param rsid This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm. (optional)
     * @param speed This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps. (optional)
     * @param accessPoint This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location. (optional)
     * @return GeoLocationAccessPoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public GeoLocationAccessPoint getLocationByWiFiAccessPoint(String mac, String ssid, String rsid, String speed, String accessPoint) throws ApiException {
        ApiResponse<GeoLocationAccessPoint> localVarResp = getLocationByWiFiAccessPointWithHttpInfo(mac, ssid, rsid, speed, accessPoint);
        return localVarResp.getData();
    }

    /**
     * Location by WiFi Access Point.
     * This service accepts a WiFi access point MAC address and returns the location coordinates corresponding to that access point. Only mac or accessPoint are mandatory parameters (one of them has to be provided), rest are optional.
     * @param mac This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons. (optional)
     * @param ssid The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters. (optional)
     * @param rsid This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm. (optional)
     * @param speed This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps. (optional)
     * @param accessPoint This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location. (optional)
     * @return ApiResponse&lt;GeoLocationAccessPoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GeoLocationAccessPoint> getLocationByWiFiAccessPointWithHttpInfo(String mac, String ssid, String rsid, String speed, String accessPoint) throws ApiException {
        okhttp3.Call localVarCall = getLocationByWiFiAccessPointValidateBeforeCall(mac, ssid, rsid, speed, accessPoint, null);
        Type localVarReturnType = new TypeToken<GeoLocationAccessPoint>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Location by WiFi Access Point. (asynchronously)
     * This service accepts a WiFi access point MAC address and returns the location coordinates corresponding to that access point. Only mac or accessPoint are mandatory parameters (one of them has to be provided), rest are optional.
     * @param mac This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons. (optional)
     * @param ssid The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters. (optional)
     * @param rsid This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm. (optional)
     * @param speed This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps. (optional)
     * @param accessPoint This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLocationByWiFiAccessPointAsync(String mac, String ssid, String rsid, String speed, String accessPoint, final ApiCallback<GeoLocationAccessPoint> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLocationByWiFiAccessPointValidateBeforeCall(mac, ssid, rsid, speed, accessPoint, _callback);
        Type localVarReturnType = new TypeToken<GeoLocationAccessPoint>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
