/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 16.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.EventsCount;
import com.precisely.apis.model.Grid;
import com.precisely.apis.model.RiskAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EarthquakeRiskResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T16:21:07.975623200+05:30[Asia/Calcutta]")
public class EarthquakeRiskResponse {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "riskLevel";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private String riskLevel;

  public static final String SERIALIZED_NAME_EVENTS_COUNT = "eventsCount";
  @SerializedName(SERIALIZED_NAME_EVENTS_COUNT)
  private EventsCount eventsCount;

  public static final String SERIALIZED_NAME_GRID = "grid";
  @SerializedName(SERIALIZED_NAME_GRID)
  private Grid grid;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private RiskAddress matchedAddress;

  public EarthquakeRiskResponse() { 
  }

  public EarthquakeRiskResponse objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectId() {
    return objectId;
  }


  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public EarthquakeRiskResponse riskLevel(String riskLevel) {
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }


  public EarthquakeRiskResponse eventsCount(EventsCount eventsCount) {
    
    this.eventsCount = eventsCount;
    return this;
  }

   /**
   * Get eventsCount
   * @return eventsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventsCount getEventsCount() {
    return eventsCount;
  }


  public void setEventsCount(EventsCount eventsCount) {
    this.eventsCount = eventsCount;
  }


  public EarthquakeRiskResponse grid(Grid grid) {
    
    this.grid = grid;
    return this;
  }

   /**
   * Get grid
   * @return grid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Grid getGrid() {
    return grid;
  }


  public void setGrid(Grid grid) {
    this.grid = grid;
  }


  public EarthquakeRiskResponse matchedAddress(RiskAddress matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RiskAddress getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(RiskAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarthquakeRiskResponse earthquakeRiskResponse = (EarthquakeRiskResponse) o;
    return Objects.equals(this.objectId, earthquakeRiskResponse.objectId) &&
        Objects.equals(this.riskLevel, earthquakeRiskResponse.riskLevel) &&
        Objects.equals(this.eventsCount, earthquakeRiskResponse.eventsCount) &&
        Objects.equals(this.grid, earthquakeRiskResponse.grid) &&
        Objects.equals(this.matchedAddress, earthquakeRiskResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, riskLevel, eventsCount, grid, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarthquakeRiskResponse {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    eventsCount: ").append(toIndentedString(eventsCount)).append("\n");
    sb.append("    grid: ").append(toIndentedString(grid)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

