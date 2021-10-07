/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.5.0
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

import com.precisely.apis.model.AddressesResponse;
import com.precisely.apis.model.AddressesByBoundaryRequest;
import com.precisely.apis.model.AddressesCount;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressesAPIServiceApi {
    private ApiClient apiClient;

    public AddressesAPIServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AddressesAPIServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getAddressesByBoundaryName */
    private com.squareup.okhttp.Call getAddressesByBoundaryNameCall(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, String maxCandidates, String page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'country' is set
        if (country == null) {
            throw new ApiException("Missing the required parameter 'country' when calling getAddressesByBoundaryName(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/addresses/v1/address/byboundaryname".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (areaName1 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "areaName1", areaName1));
        if (areaName2 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "areaName2", areaName2));
        if (areaName3 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "areaName3", areaName3));
        if (areaName4 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "areaName4", areaName4));
        if (postCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "postCode", postCode));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        if (maxCandidates != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCandidates", maxCandidates));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
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
     * Addresses By Boundary Area.
     * This service accepts zip code, neighborhood, county, or city names, and returns all known &amp; valid addresses associated with these names.
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @param maxCandidates Maximum number of addresses to be returned in response. Max. value is 100 for XML/JSON, and 2000 for CSV. (optional)
     * @param page Response will indicate the page number. (optional)
     * @return AddressesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddressesResponse getAddressesByBoundaryName(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, String maxCandidates, String page) throws ApiException {
        ApiResponse<AddressesResponse> resp = getAddressesByBoundaryNameWithHttpInfo(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page);
        return resp.getData();
    }

    /**
     * Addresses By Boundary Area.
     * This service accepts zip code, neighborhood, county, or city names, and returns all known &amp; valid addresses associated with these names.
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @param maxCandidates Maximum number of addresses to be returned in response. Max. value is 100 for XML/JSON, and 2000 for CSV. (optional)
     * @param page Response will indicate the page number. (optional)
     * @return ApiResponse&lt;AddressesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddressesResponse> getAddressesByBoundaryNameWithHttpInfo(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, String maxCandidates, String page) throws ApiException {
        com.squareup.okhttp.Call call = getAddressesByBoundaryNameCall(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page, null, null);
        Type localVarReturnType = new TypeToken<AddressesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Addresses By Boundary Area. (asynchronously)
     * This service accepts zip code, neighborhood, county, or city names, and returns all known &amp; valid addresses associated with these names.
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @param maxCandidates Maximum number of addresses to be returned in response. Max. value is 100 for XML/JSON, and 2000 for CSV. (optional)
     * @param page Response will indicate the page number. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAddressesByBoundaryNameAsync(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, String maxCandidates, String page, final ApiCallback<AddressesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAddressesByBoundaryNameCall(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddressesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAddressesCountByBoundary */
    private com.squareup.okhttp.Call getAddressesCountByBoundaryCall(AddressesByBoundaryRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        

        // create path and map variables
        String localVarPath = "/addresses/v1/addresscount/byboundary".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Address Counts by Boundary.
     * This service accepts custom geographic boundaries or drivetimes &amp; drive distances, returns the total number of addresses within these boundaries.
     * @param body  (optional)
     * @return AddressesCount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddressesCount getAddressesCountByBoundary(AddressesByBoundaryRequest body) throws ApiException {
        ApiResponse<AddressesCount> resp = getAddressesCountByBoundaryWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Address Counts by Boundary.
     * This service accepts custom geographic boundaries or drivetimes &amp; drive distances, returns the total number of addresses within these boundaries.
     * @param body  (optional)
     * @return ApiResponse&lt;AddressesCount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddressesCount> getAddressesCountByBoundaryWithHttpInfo(AddressesByBoundaryRequest body) throws ApiException {
        com.squareup.okhttp.Call call = getAddressesCountByBoundaryCall(body, null, null);
        Type localVarReturnType = new TypeToken<AddressesCount>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Address Counts by Boundary. (asynchronously)
     * This service accepts custom geographic boundaries or drivetimes &amp; drive distances, returns the total number of addresses within these boundaries.
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAddressesCountByBoundaryAsync(AddressesByBoundaryRequest body, final ApiCallback<AddressesCount> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAddressesCountByBoundaryCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddressesCount>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAddressesCountByBoundaryName */
    private com.squareup.okhttp.Call getAddressesCountByBoundaryNameCall(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'country' is set
        if (country == null) {
            throw new ApiException("Missing the required parameter 'country' when calling getAddressesCountByBoundaryName(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/addresses/v1/addresscount/byboundaryname".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (areaName1 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "areaName1", areaName1));
        if (areaName2 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "areaName2", areaName2));
        if (areaName3 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "areaName3", areaName3));
        if (areaName4 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "areaName4", areaName4));
        if (postCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "postCode", postCode));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
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
     * Address Counts by Boundary Name.
     * This service accepts zip code, neighborhood, county, or city names, and returns the total number of addresses associated with these names. 
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @return AddressesCount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddressesCount getAddressesCountByBoundaryName(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode) throws ApiException {
        ApiResponse<AddressesCount> resp = getAddressesCountByBoundaryNameWithHttpInfo(country, areaName1, areaName2, areaName3, areaName4, postCode);
        return resp.getData();
    }

    /**
     * Address Counts by Boundary Name.
     * This service accepts zip code, neighborhood, county, or city names, and returns the total number of addresses associated with these names. 
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @return ApiResponse&lt;AddressesCount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddressesCount> getAddressesCountByBoundaryNameWithHttpInfo(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode) throws ApiException {
        com.squareup.okhttp.Call call = getAddressesCountByBoundaryNameCall(country, areaName1, areaName2, areaName3, areaName4, postCode, null, null);
        Type localVarReturnType = new TypeToken<AddressesCount>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Address Counts by Boundary Name. (asynchronously)
     * This service accepts zip code, neighborhood, county, or city names, and returns the total number of addresses associated with these names. 
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAddressesCountByBoundaryNameAsync(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, final ApiCallback<AddressesCount> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAddressesCountByBoundaryNameCall(country, areaName1, areaName2, areaName3, areaName4, postCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddressesCount>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAddressesbyBoundary */
    private com.squareup.okhttp.Call getAddressesbyBoundaryCall(AddressesByBoundaryRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        

        // create path and map variables
        String localVarPath = "/addresses/v1/address/byboundary".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Addresses by Boundary.
     * This service accepts custom geographic boundaries or drivetimes &amp; drive distances, returns all known &amp; valid addresses within these boundaries.
     * @param body  (optional)
     * @return AddressesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddressesResponse getAddressesbyBoundary(AddressesByBoundaryRequest body) throws ApiException {
        ApiResponse<AddressesResponse> resp = getAddressesbyBoundaryWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Addresses by Boundary.
     * This service accepts custom geographic boundaries or drivetimes &amp; drive distances, returns all known &amp; valid addresses within these boundaries.
     * @param body  (optional)
     * @return ApiResponse&lt;AddressesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddressesResponse> getAddressesbyBoundaryWithHttpInfo(AddressesByBoundaryRequest body) throws ApiException {
        com.squareup.okhttp.Call call = getAddressesbyBoundaryCall(body, null, null);
        Type localVarReturnType = new TypeToken<AddressesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Addresses by Boundary. (asynchronously)
     * This service accepts custom geographic boundaries or drivetimes &amp; drive distances, returns all known &amp; valid addresses within these boundaries.
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAddressesbyBoundaryAsync(AddressesByBoundaryRequest body, final ApiCallback<AddressesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAddressesbyBoundaryCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddressesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
