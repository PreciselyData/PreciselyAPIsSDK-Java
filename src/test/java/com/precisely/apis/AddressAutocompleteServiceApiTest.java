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

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.TypeaheadLocations;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressAutocompleteServiceApi
 */
@Ignore
public class AddressAutocompleteServiceApiTest {

    private final AddressAutocompleteServiceApi api = new AddressAutocompleteServiceApi();

    
    /**
     * Address Autocomplete Search
     *
     * Performs search to retrieve list of places by input text and location vicinity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchV2Test() throws ApiException {
        String searchText = null;
        String latitude = null;
        String longitude = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String maxCandidates = null;
        String country = null;
        String matchOnAddressNumber = null;
        String autoDetectLocation = null;
        String ipAddress = null;
        String areaName1 = null;
        String areaName3 = null;
        String postCode = null;
        String returnAdminAreasOnly = null;
        String includeRangesDetails = null;
        String searchType = null;
        String searchOnAddressNumber = null;
                TypeaheadLocations response = api.searchV2(searchText, latitude, longitude, searchRadius, searchRadiusUnit, maxCandidates, country, matchOnAddressNumber, autoDetectLocation, ipAddress, areaName1, areaName3, postCode, returnAdminAreasOnly, includeRangesDetails, searchType, searchOnAddressNumber);
        // TODO: test validations
    }
    
}
