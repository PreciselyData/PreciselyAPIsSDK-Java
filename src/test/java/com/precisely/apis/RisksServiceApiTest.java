/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.1
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
import com.precisely.apis.model.CrimeRiskResponse;
import com.precisely.apis.model.CrimeRiskByAddressRequest;
import com.precisely.apis.model.CrimeRiskResponseList;
import com.precisely.apis.model.CrimeRiskLocationResponse;
import com.precisely.apis.model.CrimeRiskByLocationRequest;
import com.precisely.apis.model.CrimeRiskLocationResponseList;
import com.precisely.apis.model.WaterBodyResponse;
import com.precisely.apis.model.DistanceToFloodHazardResponse;
import com.precisely.apis.model.DistanceToFloodHazardAddressRequest;
import com.precisely.apis.model.WaterBodyLocationResponse;
import com.precisely.apis.model.DistanceToFloodHazardLocationResponse;
import com.precisely.apis.model.DistanceToFloodHazardLocationRequest;
import com.precisely.apis.model.EarthquakeHistory;
import com.precisely.apis.model.EarthquakeRiskResponse;
import com.precisely.apis.model.EarthquakeRiskByAddressRequest;
import com.precisely.apis.model.EarthquakeRiskResponseList;
import com.precisely.apis.model.EarthquakeRiskLocationResponse;
import com.precisely.apis.model.EarthquakeRiskLocationResponseList;
import com.precisely.apis.model.EarthquakeRiskByLocationRequest;
import com.precisely.apis.model.FireHistory;
import com.precisely.apis.model.FireRiskResponse;
import com.precisely.apis.model.FireRiskByAddressRequest;
import com.precisely.apis.model.FireRiskResponseList;
import com.precisely.apis.model.FireRiskLocationResponse;
import com.precisely.apis.model.FireRiskLocationResponseList;
import com.precisely.apis.model.FireRiskByLocationRequest;
import com.precisely.apis.model.FireStations;
import com.precisely.apis.model.FireStationsLocation;
import com.precisely.apis.model.FloodRiskResponse;
import com.precisely.apis.model.FloodRiskByAddressRequest;
import com.precisely.apis.model.FloodRiskResponseList;
import com.precisely.apis.model.FloodRiskLocationResponse;
import com.precisely.apis.model.FloodRiskByLocationRequest;
import com.precisely.apis.model.FloodRiskLocationResponseList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RisksServiceApi
 */
public class RisksServiceApiTest {

    private final RisksServiceApi api = new RisksServiceApi();

    
    /**
     * Get Crime Risk By Address
     *
     * Accepts addresses as input and Returns local crime indexes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCrimeRiskByAddressTest() throws ApiException {
        String address = null;
        String type = null;
        String includeGeometry = null;
        // CrimeRiskResponse response = api.getCrimeRiskByAddress(address, type, includeGeometry);

        // TODO: test validations
    }
    
    /**
     * Post Crime Risk By Address
     *
     * This is a Batch offering for &#39;Crime Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve local crime indexes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCrimeRiskByAddressBatchTest() throws ApiException {
        CrimeRiskByAddressRequest body = null;
        // CrimeRiskResponseList response = api.getCrimeRiskByAddressBatch(body);

        // TODO: test validations
    }
    
    /**
     * Get Crime Risk By Location
     *
     * Returns the crime data or crime indexes for a given location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCrimeRiskByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String type = null;
        String includeGeometry = null;
        // CrimeRiskLocationResponse response = api.getCrimeRiskByLocation(longitude, latitude, type, includeGeometry);

        // TODO: test validations
    }
    
    /**
     * Post Crime Risk By Location
     *
     * This is a Batch offering for &#39;Crime Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve local crime indexes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCrimeRiskByLocationBatchTest() throws ApiException {
        CrimeRiskByLocationRequest body = null;
        // CrimeRiskLocationResponseList response = api.getCrimeRiskByLocationBatch(body);

        // TODO: test validations
    }
    
    /**
     * Get Distance To Flood Hazard By Address
     *
     * Accepts addresses as input and Returns the distance from nearest water bodies along with body name and location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistanceToFloodHazardByAddressTest() throws ApiException {
        String address = null;
        String maxCandidates = null;
        String waterBodyType = null;
        String searchDistance = null;
        String searchDistanceUnit = null;
        // WaterBodyResponse response = api.getDistanceToFloodHazardByAddress(address, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit);

        // TODO: test validations
    }
    
    /**
     * Post Distance To Flood Hazard By Address
     *
     * This is a Batch offering for &#39;Distance To Flood Hazard By Address&#39; service. It accepts a single address or a list of addresses and retrieve the distance from nearest water bodies along with body name and location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistanceToFloodHazardByAddressBatchTest() throws ApiException {
        DistanceToFloodHazardAddressRequest body = null;
        // DistanceToFloodHazardResponse response = api.getDistanceToFloodHazardByAddressBatch(body);

        // TODO: test validations
    }
    
    /**
     * Get Distance To Flood Hazard By Location
     *
     * Accepts latitude &amp; longitude as input and Returns the distance from nearest water bodies along with body name and location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistanceToFloodHazardByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String maxCandidates = null;
        String waterBodyType = null;
        String searchDistance = null;
        String searchDistanceUnit = null;
        // WaterBodyLocationResponse response = api.getDistanceToFloodHazardByLocation(longitude, latitude, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit);

        // TODO: test validations
    }
    
    /**
     * Post Distance To Flood Hazard By Location
     *
     * This is a Batch offering for &#39;Distance To Flood Hazard By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve the distance from nearest water bodies along with body name and location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistanceToFloodHazardByLocationBatchTest() throws ApiException {
        DistanceToFloodHazardLocationRequest body = null;
        // DistanceToFloodHazardLocationResponse response = api.getDistanceToFloodHazardByLocationBatch(body);

        // TODO: test validations
    }
    
    /**
     * Earthquake History
     *
     * Accepts postcode as input and Returns historical earthquake details for a particular postcode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEarthquakeHistoryTest() throws ApiException {
        String postCode = null;
        String startDate = null;
        String endDate = null;
        String minMagnitude = null;
        String maxMagnitude = null;
        String maxCandidates = null;
        // EarthquakeHistory response = api.getEarthquakeHistory(postCode, startDate, endDate, minMagnitude, maxMagnitude, maxCandidates);

        // TODO: test validations
    }
    
    /**
     * Get Earthquake Risk By Address
     *
     * Accepts addresses as input and Returns counts of earthquakes for various richter measurements and values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEarthquakeRiskByAddressTest() throws ApiException {
        String address = null;
        String richterValue = null;
        String includeGeometry = null;
        // EarthquakeRiskResponse response = api.getEarthquakeRiskByAddress(address, richterValue, includeGeometry);

        // TODO: test validations
    }
    
    /**
     * Post Earthquake Risk By Address
     *
     * This is a Batch offering for &#39;Earthquake Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve counts of earthquakes for various richter measurements and values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEarthquakeRiskByAddressBatchTest() throws ApiException {
        EarthquakeRiskByAddressRequest body = null;
        // EarthquakeRiskResponseList response = api.getEarthquakeRiskByAddressBatch(body);

        // TODO: test validations
    }
    
    /**
     * Get Earthquake Risk By Location
     *
     * Accepts latitude &amp; longitude as input and Returns counts of earthquakes for various richter measurements and values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEarthquakeRiskByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String richterValue = null;
        String includeGeometry = null;
        // EarthquakeRiskLocationResponse response = api.getEarthquakeRiskByLocation(longitude, latitude, richterValue, includeGeometry);

        // TODO: test validations
    }
    
    /**
     * Post Earthquake Risk By Location
     *
     * This is a Batch offering for &#39;Earthquake Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve counts of earthquakes for various richter measurements and values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEarthquakeRiskByLocationBatchTest() throws ApiException {
        EarthquakeRiskByLocationRequest body = null;
        // EarthquakeRiskLocationResponseList response = api.getEarthquakeRiskByLocationBatch(body);

        // TODO: test validations
    }
    
    /**
     * Get Fire History
     *
     * Accepts postcode as input and Returns fire event details for a particular postcode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFireHistoryTest() throws ApiException {
        String postCode = null;
        String startDate = null;
        String endDate = null;
        String maxCandidates = null;
        // FireHistory response = api.getFireHistory(postCode, startDate, endDate, maxCandidates);

        // TODO: test validations
    }
    
    /**
     * Get Fire Risk By Address
     *
     * Accepts addresses as input and Returns fire risk data by risk types.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFireRiskByAddressTest() throws ApiException {
        String address = null;
        // FireRiskResponse response = api.getFireRiskByAddress(address);

        // TODO: test validations
    }
    
    /**
     * Post Fire Risk By Address
     *
     * This is a Batch offering for &#39;Fire Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve fire risk data by risk types.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFireRiskByAddressBatchTest() throws ApiException {
        FireRiskByAddressRequest body = null;
        // FireRiskResponseList response = api.getFireRiskByAddressBatch(body);

        // TODO: test validations
    }
    
    /**
     * Get Fire Risk By Location
     *
     * Accepts latitude &amp; longitude as input and Returns fire risk data by risk types.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFireRiskByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        // FireRiskLocationResponse response = api.getFireRiskByLocation(longitude, latitude);

        // TODO: test validations
    }
    
    /**
     * Post Fire Risk By Location
     *
     * This is a Batch offering for &#39;Fire Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve fire risk data by risk types.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFireRiskByLocationBatchTest() throws ApiException {
        FireRiskByLocationRequest body = null;
        // FireRiskLocationResponseList response = api.getFireRiskByLocationBatch(body);

        // TODO: test validations
    }
    
    /**
     * Fire Station By Address
     *
     * Accepts addresses as input and Returns nearest fire stations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFireStationByAddressTest() throws ApiException {
        String address = null;
        String maxCandidates = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String sortBy = null;
        String historicTrafficTimeBucket = null;
        // FireStations response = api.getFireStationByAddress(address, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket);

        // TODO: test validations
    }
    
    /**
     * Fire Station By Location
     *
     * Accepts latitude &amp; longitude as input and Returns nearest fire stations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFireStationByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String maxCandidates = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String sortBy = null;
        String historicTrafficTimeBucket = null;
        // FireStationsLocation response = api.getFireStationByLocation(longitude, latitude, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket);

        // TODO: test validations
    }
    
    /**
     * Get Flood Risk By Address
     *
     * Accepts addresses as input and Returns flood risk data for flood zones and base flood elevation values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFloodRiskByAddressTest() throws ApiException {
        String address = null;
        String includeZoneDesc = null;
        String includeGeometry = null;
        // FloodRiskResponse response = api.getFloodRiskByAddress(address, includeZoneDesc, includeGeometry);

        // TODO: test validations
    }
    
    /**
     * Post Flood Risk By Address
     *
     * This is a Batch offering for &#39;Flood Risk By Address&#39; service. It accepts a single address or a list of addresses and retrieve flood risk data for flood zones and base flood elevation values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFloodRiskByAddressBatchTest() throws ApiException {
        FloodRiskByAddressRequest body = null;
        // FloodRiskResponseList response = api.getFloodRiskByAddressBatch(body);

        // TODO: test validations
    }
    
    /**
     * Get Flood Risk By Location
     *
     * Accepts latitude &amp; longitude as input and Returns flood risk data for flood zones and base flood elevation values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFloodRiskByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String includeZoneDesc = null;
        String includeGeometry = null;
        // FloodRiskLocationResponse response = api.getFloodRiskByLocation(longitude, latitude, includeZoneDesc, includeGeometry);

        // TODO: test validations
    }
    
    /**
     * Post Flood Risk By Location
     *
     * This is a Batch offering for &#39;Flood Risk By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve flood risk data for flood zones and base flood elevation values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFloodRiskByLocationBatchTest() throws ApiException {
        FloodRiskByLocationRequest body = null;
        // FloodRiskLocationResponseList response = api.getFloodRiskByLocationBatch(body);

        // TODO: test validations
    }
    
}
