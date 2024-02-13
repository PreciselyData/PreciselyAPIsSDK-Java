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
import com.precisely.apis.model.CrimeRiskByAddressBatchRequest;
import com.precisely.apis.model.CrimeRiskByLocationBatchRequest;
import com.precisely.apis.model.CrimeRiskResponse;
import com.precisely.apis.model.CrimeRiskResponseList;
import com.precisely.apis.model.DistanceToFloodHazardAddressRequest;
import com.precisely.apis.model.DistanceToFloodHazardLocationRequest;
import com.precisely.apis.model.DistanceToFloodHazardResponse;
import com.precisely.apis.model.EarthquakeHistory;
import com.precisely.apis.model.EarthquakeRiskByAddressRequest;
import com.precisely.apis.model.EarthquakeRiskByLocationRequest;
import com.precisely.apis.model.EarthquakeRiskResponse;
import com.precisely.apis.model.EarthquakeRiskResponseList;
import com.precisely.apis.model.ErrorInfo1;
import com.precisely.apis.model.FireHistory;
import com.precisely.apis.model.FireHistoryV2;
import com.precisely.apis.model.FireRiskByAddressRequest;
import com.precisely.apis.model.FireRiskByLocationRequest;
import com.precisely.apis.model.FireRiskResponse;
import com.precisely.apis.model.FireRiskResponseList;
import com.precisely.apis.model.FireRiskV2Response;
import com.precisely.apis.model.FireRiskV2ResponseList;
import com.precisely.apis.model.FireStations;
import com.precisely.apis.model.FloodRiskByAddressRequest;
import com.precisely.apis.model.FloodRiskByLocationRequest;
import com.precisely.apis.model.FloodRiskResponse;
import com.precisely.apis.model.FloodRiskResponseList;
import com.precisely.apis.model.WaterBodyResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RisksServiceApi
 */
@Ignore
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
                CrimeRiskResponse response = api.getCrimeRiskByAddress(address, type, includeGeometry);
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
        CrimeRiskByAddressBatchRequest crimeRiskByAddressBatchRequest = null;
                CrimeRiskResponseList response = api.getCrimeRiskByAddressBatch(crimeRiskByAddressBatchRequest);
        // TODO: test validations
    }
    
    /**
     * Get Crime Risk By  Location
     *
     * Accepts latitude/longitude as input and returns and Returns local crime indexes.
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
                CrimeRiskResponse response = api.getCrimeRiskByLocation(longitude, latitude, type, includeGeometry);
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
        CrimeRiskByLocationBatchRequest crimeRiskByLocationBatchRequest = null;
                CrimeRiskResponseList response = api.getCrimeRiskByLocationBatch(crimeRiskByLocationBatchRequest);
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
    public void getDistanceToCoastByAddressTest() throws ApiException {
        String address = null;
        String maxCandidates = null;
        String waterBodyType = null;
        String searchDistance = null;
        String searchDistanceUnit = null;
                WaterBodyResponse response = api.getDistanceToCoastByAddress(address, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit);
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
    public void getDistanceToCoastByAddressBatchTest() throws ApiException {
        DistanceToFloodHazardAddressRequest distanceToFloodHazardAddressRequest = null;
                DistanceToFloodHazardResponse response = api.getDistanceToCoastByAddressBatch(distanceToFloodHazardAddressRequest);
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
    public void getDistanceToCoastByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String maxCandidates = null;
        String waterBodyType = null;
        String searchDistance = null;
        String searchDistanceUnit = null;
                WaterBodyResponse response = api.getDistanceToCoastByLocation(longitude, latitude, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit);
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
    public void getDistanceToCoastByLocationBatchTest() throws ApiException {
        DistanceToFloodHazardLocationRequest distanceToFloodHazardLocationRequest = null;
                DistanceToFloodHazardResponse response = api.getDistanceToCoastByLocationBatch(distanceToFloodHazardLocationRequest);
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
                EarthquakeHistory response = api.getEarthquakeHistory(postCode, startDate, endDate, minMagnitude, maxMagnitude, maxCandidates);
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
                EarthquakeRiskResponse response = api.getEarthquakeRiskByAddress(address, richterValue, includeGeometry);
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
        EarthquakeRiskByAddressRequest earthquakeRiskByAddressRequest = null;
                EarthquakeRiskResponseList response = api.getEarthquakeRiskByAddressBatch(earthquakeRiskByAddressRequest);
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
                EarthquakeRiskResponse response = api.getEarthquakeRiskByLocation(longitude, latitude, richterValue, includeGeometry);
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
        EarthquakeRiskByLocationRequest earthquakeRiskByLocationRequest = null;
                EarthquakeRiskResponseList response = api.getEarthquakeRiskByLocationBatch(earthquakeRiskByLocationRequest);
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
                FireHistory response = api.getFireHistory(postCode, startDate, endDate, maxCandidates);
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
    public void getFireHistoryV2Test() throws ApiException {
        String postCode = null;
        String startDate = null;
        String endDate = null;
        String maxCandidates = null;
                FireHistoryV2 response = api.getFireHistoryV2(postCode, startDate, endDate, maxCandidates);
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
        String includeGeometry = null;
                FireRiskResponse response = api.getFireRiskByAddress(address, includeGeometry);
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
        FireRiskByAddressRequest fireRiskByAddressRequest = null;
                FireRiskResponseList response = api.getFireRiskByAddressBatch(fireRiskByAddressRequest);
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
        String includeGeometry = null;
                FireRiskResponse response = api.getFireRiskByLocation(longitude, latitude, includeGeometry);
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
        FireRiskByLocationRequest fireRiskByLocationRequest = null;
                FireRiskResponseList response = api.getFireRiskByLocationBatch(fireRiskByLocationRequest);
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
    public void getFireRiskV2ByAddressTest() throws ApiException {
        String address = null;
        String includeGeometry = null;
                FireRiskV2Response response = api.getFireRiskV2ByAddress(address, includeGeometry);
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
    public void getFireRiskV2ByAddressBatchTest() throws ApiException {
        FireRiskByAddressRequest fireRiskByAddressRequest = null;
                FireRiskV2ResponseList response = api.getFireRiskV2ByAddressBatch(fireRiskByAddressRequest);
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
    public void getFireRiskV2ByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String includeGeometry = null;
                FireRiskV2Response response = api.getFireRiskV2ByLocation(longitude, latitude, includeGeometry);
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
    public void getFireRiskV2ByLocationBatchTest() throws ApiException {
        FireRiskByLocationRequest fireRiskByLocationRequest = null;
                FireRiskV2ResponseList response = api.getFireRiskV2ByLocationBatch(fireRiskByLocationRequest);
        // TODO: test validations
    }
    
    /**
     * Get Fire Station By Address
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
                FireStations response = api.getFireStationByAddress(address, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket);
        // TODO: test validations
    }
    
    /**
     * Get Fire Station By Location
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
                FireStations response = api.getFireStationByLocation(longitude, latitude, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket);
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
                FloodRiskResponse response = api.getFloodRiskByAddress(address, includeZoneDesc, includeGeometry);
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
        FloodRiskByAddressRequest floodRiskByAddressRequest = null;
                FloodRiskResponseList response = api.getFloodRiskByAddressBatch(floodRiskByAddressRequest);
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
                FloodRiskResponse response = api.getFloodRiskByLocation(longitude, latitude, includeZoneDesc, includeGeometry);
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
        FloodRiskByLocationRequest floodRiskByLocationRequest = null;
                FloodRiskResponseList response = api.getFloodRiskByLocationBatch(floodRiskByLocationRequest);
        // TODO: test validations
    }
    
}
