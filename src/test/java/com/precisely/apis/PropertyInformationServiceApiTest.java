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

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.ParcelBoundaryV2;
import com.precisely.apis.model.PropertyInfoAddressRequest;
import com.precisely.apis.model.PropertyInfoResponse;
import com.precisely.apis.model.PropertyInfoResponses;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PropertyInformationServiceApi
 */
@Ignore
public class PropertyInformationServiceApiTest {

    private final PropertyInformationServiceApi api = new PropertyInformationServiceApi();

    
    /**
     * Get Parcel Boundary By Address
     *
     * Accepts address as input and returns property parcel boundary around that address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParcelBoundaryByAddressTest() throws ApiException {
        String address = null;
                ParcelBoundaryV2 response = api.getParcelBoundaryByAddress(address);
        // TODO: test validations
    }
    
    /**
     * Get Parcel Boundary By Location
     *
     * Accepts latitude/longitude as input and returns property parcel boundary around that location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParcelBoundaryByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
                ParcelBoundaryV2 response = api.getParcelBoundaryByLocation(longitude, latitude);
        // TODO: test validations
    }
    
    /**
     * Get Parcel Boundary By PreciselyID
     *
     * Accepts PB key as input and returns property attributes for the matched address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParcelBoundaryByPreciselyIDTest() throws ApiException {
        String preciselyID = null;
                ParcelBoundaryV2 response = api.getParcelBoundaryByPreciselyID(preciselyID);
        // TODO: test validations
    }
    
    /**
     * PropertyV2 Attributes By Address.
     *
     * GetPropertyAttributesbyAddress Endpoint will take address as an input and will return key property attributes in response. Optionally user will have the option to filter the attributes and will pay for only returned attributes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPropertyAttributesByAddressTest() throws ApiException {
        String address = null;
        String attributes = null;
                PropertyInfoResponse response = api.getPropertyAttributesByAddress(address, attributes);
        // TODO: test validations
    }
    
    /**
     * PropertyV2 Attributes By Address Batch.
     *
     * GetPropertyAttributesbyAddressBatch Endpoint will take the list of addresses as an input and will return key property attributes for the given addresses in response. Optionally user will have the option to filter the attributes and will pay for only returned attributes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPropertyAttributesByAddressBatchTest() throws ApiException {
        PropertyInfoAddressRequest propertyInfoAddressRequest = null;
                PropertyInfoResponses response = api.getPropertyAttributesByAddressBatch(propertyInfoAddressRequest);
        // TODO: test validations
    }
    
}
