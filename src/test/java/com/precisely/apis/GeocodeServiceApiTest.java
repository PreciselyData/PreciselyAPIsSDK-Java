/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 9.0.0
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

import com.precisely.ApiException;
import com.precisely.apis.model.GeocodeServiceResponse;
import com.precisely.apis.model.GeocodeServiceResponseList;
import com.precisely.apis.model.GeocodeRequest;
import com.precisely.apis.model.GeocodeCapabilitiesResponse;
import com.precisely.apis.model.ConfiguredDictionaryResponse;
import com.precisely.apis.model.PBKeyResponse;
import com.precisely.apis.model.PBKeyAddressRequest;
import com.precisely.apis.model.PBKeyResponseList;
import com.precisely.apis.model.KeyLookupRequest;
import com.precisely.apis.model.ReverseGeocodeRequest;
import java.math.BigDecimal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeocodeServiceApi
 */
public class GeocodeServiceApiTest {

    private final GeocodeServiceApi api = new GeocodeServiceApi();

    
    /**
     * Get Forward Geocode
     *
     * This service accepts an address and returns the location coordinates corresponding to that address. Premium offers the best accuracy and is a high precision geocoder leveraging Master Location Data - geocodes to Street or building level.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void geocodeTest() throws ApiException {
        String datapackBundle = null;
        String country = null;
        String placeName = null;
        String mainAddress = null;
        String lastLine = null;
        String areaName1 = null;
        String areaName2 = null;
        String areaName3 = null;
        String areaName4 = null;
        Integer postalCode = null;
        String matchMode = null;
        Boolean fallbackGeo = null;
        Boolean fallbackPostal = null;
        Integer maxCands = null;
        Integer streetOffset = null;
        String streetOffsetUnits = null;
        Integer cornerOffset = null;
        String cornerOffsetUnits = null;
        // GeocodeServiceResponse response = api.geocode(datapackBundle, country, placeName, mainAddress, lastLine, areaName1, areaName2, areaName3, areaName4, postalCode, matchMode, fallbackGeo, fallbackPostal, maxCands, streetOffset, streetOffsetUnits, cornerOffset, cornerOffsetUnits);

        // TODO: test validations
    }
    
    /**
     * Post Forward Geocode
     *
     * This is a Batch offering for geocode service. It accepts a single address or a list of addresses and returns location coordinates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void geocodeBatchTest() throws ApiException {
        GeocodeRequest body = null;
        String datapackBundle = null;
        // GeocodeServiceResponseList response = api.geocodeBatch(body, datapackBundle);

        // TODO: test validations
    }
    
    /**
     * Get Capabilities
     *
     * Get Capabilities  of Geocode API
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCapabilitiesTest() throws ApiException {
        String datapackBundle = null;
        String operation = null;
        String country = null;
        // GeocodeCapabilitiesResponse response = api.getCapabilities(datapackBundle, operation, country);

        // TODO: test validations
    }
    
    /**
     * Get installed Dictionaries
     *
     * Get installed Dictionaries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDictionariesTest() throws ApiException {
        String datapackBundle = null;
        String country = null;
        // ConfiguredDictionaryResponse response = api.getDictionaries(datapackBundle, country);

        // TODO: test validations
    }
    
    /**
     * Get PreciselyID By Address
     *
     * This service accepts an address and returns the corresponding PreciselyID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPreciselyIDTest() throws ApiException {
        String address = null;
        String country = null;
        // PBKeyResponse response = api.getPreciselyID(address, country);

        // TODO: test validations
    }
    
    /**
     * Post PreciselyID By Address
     *
     * This is a Batch offering for &#39;PreciselyID By Address&#39; service. It accepts a single address or a list of addresses and returns the corresponding PreciselyID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPreciselyIDsTest() throws ApiException {
        PBKeyAddressRequest body = null;
        // PBKeyResponseList response = api.getPreciselyIDs(body);

        // TODO: test validations
    }
    
    /**
     * Get Key Lookup
     *
     * This service accepts a PreciselyID and returns the corresponding address associated with that PreciselyID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyLookupTest() throws ApiException {
        String key = null;
        String type = null;
        String country = null;
        // GeocodeServiceResponse response = api.keyLookup(key, type, country);

        // TODO: test validations
    }
    
    /**
     * Post Key Lookup
     *
     * This service accepts batches of PreciselyID&#39;s and returns the corresponding address associated with those PreciselyID&#39;s.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyLookupBatchTest() throws ApiException {
        KeyLookupRequest body = null;
        // GeocodeServiceResponseList response = api.keyLookupBatch(body);

        // TODO: test validations
    }
    
    /**
     * Post Reverse Geocode
     *
     * It accepts a single location coordinate or a list of location coordinates and returns addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reverseGeocodBatchTest() throws ApiException {
        String datapackBundle = null;
        ReverseGeocodeRequest body = null;
        // GeocodeServiceResponseList response = api.reverseGeocodBatch(datapackBundle, body);

        // TODO: test validations
    }
    
    /**
     * Get Reverse Geocode
     *
     * This service accepts location coordinate and returns an address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reverseGeocodeTest() throws ApiException {
        String datapackBundle = null;
        BigDecimal x = null;
        BigDecimal y = null;
        String country = null;
        String coordSysName = null;
        Integer distance = null;
        String distanceUnits = null;
        // GeocodeServiceResponse response = api.reverseGeocode(datapackBundle, x, y, country, coordSysName, distance, distanceUnits);

        // TODO: test validations
    }
    
}
