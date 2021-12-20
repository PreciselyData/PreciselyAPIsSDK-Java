/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.8.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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

import com.precisely.apis.model.AHJPlusPSAPResponse;
import com.precisely.apis.model.PSAPResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _911PSAPServiceApi {
    private ApiClient apiClient;

    public _911PSAPServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public _911PSAPServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getAHJPlusPSAPByAddress */
    private com.squareup.okhttp.Call getAHJPlusPSAPByAddressCall(String address, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getAHJPlusPSAPByAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/911/v1/ahj-psap/byaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * AHJ &amp; PSAP By Address.
     * Accepts addresses as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). Geo911 accepts an address and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     * @param address The address to be searched. (required)
     * @return AHJPlusPSAPResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AHJPlusPSAPResponse getAHJPlusPSAPByAddress(String address) throws ApiException {
        ApiResponse<AHJPlusPSAPResponse> resp = getAHJPlusPSAPByAddressWithHttpInfo(address);
        return resp.getData();
    }

    /**
     * AHJ &amp; PSAP By Address.
     * Accepts addresses as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). Geo911 accepts an address and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     * @param address The address to be searched. (required)
     * @return ApiResponse&lt;AHJPlusPSAPResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AHJPlusPSAPResponse> getAHJPlusPSAPByAddressWithHttpInfo(String address) throws ApiException {
        com.squareup.okhttp.Call call = getAHJPlusPSAPByAddressCall(address, null, null);
        Type localVarReturnType = new TypeToken<AHJPlusPSAPResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * AHJ &amp; PSAP By Address. (asynchronously)
     * Accepts addresses as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). Geo911 accepts an address and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     * @param address The address to be searched. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAHJPlusPSAPByAddressAsync(String address, final ApiCallback<AHJPlusPSAPResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAHJPlusPSAPByAddressCall(address, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AHJPlusPSAPResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAHJPlusPSAPByLocation */
    private com.squareup.okhttp.Call getAHJPlusPSAPByLocationCall(String longitude, String latitude, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'longitude' is set
        if (longitude == null) {
            throw new ApiException("Missing the required parameter 'longitude' when calling getAHJPlusPSAPByLocation(Async)");
        }
        
        // verify the required parameter 'latitude' is set
        if (latitude == null) {
            throw new ApiException("Missing the required parameter 'latitude' when calling getAHJPlusPSAPByLocation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/911/v1/ahj-psap/bylocation".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (longitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
        if (latitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * AHJ &amp; PSAP By Location
     * Accepts latitude &amp; longitude as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). Geo911 accepts a location coordinate and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @return AHJPlusPSAPResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AHJPlusPSAPResponse getAHJPlusPSAPByLocation(String longitude, String latitude) throws ApiException {
        ApiResponse<AHJPlusPSAPResponse> resp = getAHJPlusPSAPByLocationWithHttpInfo(longitude, latitude);
        return resp.getData();
    }

    /**
     * AHJ &amp; PSAP By Location
     * Accepts latitude &amp; longitude as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). Geo911 accepts a location coordinate and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @return ApiResponse&lt;AHJPlusPSAPResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AHJPlusPSAPResponse> getAHJPlusPSAPByLocationWithHttpInfo(String longitude, String latitude) throws ApiException {
        com.squareup.okhttp.Call call = getAHJPlusPSAPByLocationCall(longitude, latitude, null, null);
        Type localVarReturnType = new TypeToken<AHJPlusPSAPResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * AHJ &amp; PSAP By Location (asynchronously)
     * Accepts latitude &amp; longitude as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). Geo911 accepts a location coordinate and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAHJPlusPSAPByLocationAsync(String longitude, String latitude, final ApiCallback<AHJPlusPSAPResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAHJPlusPSAPByLocationCall(longitude, latitude, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AHJPlusPSAPResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getPSAPByAddress */
    private com.squareup.okhttp.Call getPSAPByAddressCall(String address, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getPSAPByAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/911/v1/psap/byaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (address != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * PSAP By Address.
     * Accepts addresses as input and returns contact details for local Public Safety Answering Points (PSAP). Geo911 accepts an address as input and returns the relevant PSAP address and contact details including agency name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.
     * @param address The address to be searched. (required)
     * @return PSAPResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PSAPResponse getPSAPByAddress(String address) throws ApiException {
        ApiResponse<PSAPResponse> resp = getPSAPByAddressWithHttpInfo(address);
        return resp.getData();
    }

    /**
     * PSAP By Address.
     * Accepts addresses as input and returns contact details for local Public Safety Answering Points (PSAP). Geo911 accepts an address as input and returns the relevant PSAP address and contact details including agency name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.
     * @param address The address to be searched. (required)
     * @return ApiResponse&lt;PSAPResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PSAPResponse> getPSAPByAddressWithHttpInfo(String address) throws ApiException {
        com.squareup.okhttp.Call call = getPSAPByAddressCall(address, null, null);
        Type localVarReturnType = new TypeToken<PSAPResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PSAP By Address. (asynchronously)
     * Accepts addresses as input and returns contact details for local Public Safety Answering Points (PSAP). Geo911 accepts an address as input and returns the relevant PSAP address and contact details including agency name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.
     * @param address The address to be searched. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPSAPByAddressAsync(String address, final ApiCallback<PSAPResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPSAPByAddressCall(address, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PSAPResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getPSAPByLocation */
    private com.squareup.okhttp.Call getPSAPByLocationCall(String longitude, String latitude, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'longitude' is set
        if (longitude == null) {
            throw new ApiException("Missing the required parameter 'longitude' when calling getPSAPByLocation(Async)");
        }
        
        // verify the required parameter 'latitude' is set
        if (latitude == null) {
            throw new ApiException("Missing the required parameter 'latitude' when calling getPSAPByLocation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/911/v1/psap/bylocation".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (longitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
        if (latitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * PSAP By Location.
     * Accepts latitude &amp; longitude as input and Returns contact details for local Public Safety Answering Points (PSAP). Geo911 accepts a location coordinate and returns the relevant PSAP address and contact details including dispatch name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @return PSAPResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PSAPResponse getPSAPByLocation(String longitude, String latitude) throws ApiException {
        ApiResponse<PSAPResponse> resp = getPSAPByLocationWithHttpInfo(longitude, latitude);
        return resp.getData();
    }

    /**
     * PSAP By Location.
     * Accepts latitude &amp; longitude as input and Returns contact details for local Public Safety Answering Points (PSAP). Geo911 accepts a location coordinate and returns the relevant PSAP address and contact details including dispatch name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @return ApiResponse&lt;PSAPResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PSAPResponse> getPSAPByLocationWithHttpInfo(String longitude, String latitude) throws ApiException {
        com.squareup.okhttp.Call call = getPSAPByLocationCall(longitude, latitude, null, null);
        Type localVarReturnType = new TypeToken<PSAPResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * PSAP By Location. (asynchronously)
     * Accepts latitude &amp; longitude as input and Returns contact details for local Public Safety Answering Points (PSAP). Geo911 accepts a location coordinate and returns the relevant PSAP address and contact details including dispatch name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPSAPByLocationAsync(String longitude, String latitude, final ApiCallback<PSAPResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPSAPByLocationCall(longitude, latitude, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PSAPResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
