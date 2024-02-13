/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 18.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.AHJPlusPSAPResponse;
import com.precisely.apis.model.ErrorInfo1;
import com.precisely.apis.model.PSAPResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Psap911ServiceApi
 */
@Ignore
public class Psap911ServiceApiTest {

    private final Psap911ServiceApi api = new Psap911ServiceApi();

    
    /**
     * AHJ &amp; PSAP By Address.
     *
     * Accepts addresses as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). 911/PSAP accepts an address and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAHJPlusPSAPByAddressTest() throws ApiException {
        String address = null;
                AHJPlusPSAPResponse response = api.getAHJPlusPSAPByAddress(address);
        // TODO: test validations
    }
    
    /**
     * AHJ &amp; PSAP By Location
     *
     * Accepts latitude &amp; longitude as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). 911/PSAP accepts a location coordinate and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAHJPlusPSAPByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
                AHJPlusPSAPResponse response = api.getAHJPlusPSAPByLocation(longitude, latitude);
        // TODO: test validations
    }
    
    /**
     * PSAP By Address.
     *
     * Accepts addresses as input and Returns contact details for local Public Safety Answering Points (PSAP). 911/PSAP accepts an address as input and returns the relevant PSAP address and contact details including agency name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPSAPByAddressTest() throws ApiException {
        String address = null;
                PSAPResponse response = api.getPSAPByAddress(address);
        // TODO: test validations
    }
    
    /**
     * PSAP By Location.
     *
     * Accepts latitude &amp; longitude as input and Returns contact details for local Public Safety Answering Points (PSAP). 911/PSAP accepts a location coordinate and returns the relevant PSAP address and contact details including dispatch name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPSAPByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
                PSAPResponse response = api.getPSAPByLocation(longitude, latitude);
        // TODO: test validations
    }
    
    /**
     * AHJ &amp; PSAP By Fccid
     *
     * Accepts fccid as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). 911/PSAP accepts a location coordinate and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchByFccIdTest() throws ApiException {
        String fccId = null;
                AHJPlusPSAPResponse response = api.searchByFccId(fccId);
        // TODO: test validations
    }
    
}
