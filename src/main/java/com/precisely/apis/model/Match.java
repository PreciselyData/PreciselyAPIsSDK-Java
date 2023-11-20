/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 17.1.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Match
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class Match {
  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private String confidence;

  public static final String SERIALIZED_NAME_PERCENT_GEOCODE = "percentGeocode";
  @SerializedName(SERIALIZED_NAME_PERCENT_GEOCODE)
  private String percentGeocode;

  public static final String SERIALIZED_NAME_PRECISION_LEVEL = "precisionLevel";
  @SerializedName(SERIALIZED_NAME_PRECISION_LEVEL)
  private String precisionLevel;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_MATCH_CODE = "matchCode";
  @SerializedName(SERIALIZED_NAME_MATCH_CODE)
  private String matchCode;

  public Match() { 
  }

  public Match confidence(String confidence) {
    
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConfidence() {
    return confidence;
  }


  public void setConfidence(String confidence) {
    this.confidence = confidence;
  }


  public Match percentGeocode(String percentGeocode) {
    
    this.percentGeocode = percentGeocode;
    return this;
  }

   /**
   * Get percentGeocode
   * @return percentGeocode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPercentGeocode() {
    return percentGeocode;
  }


  public void setPercentGeocode(String percentGeocode) {
    this.percentGeocode = percentGeocode;
  }


  public Match precisionLevel(String precisionLevel) {
    
    this.precisionLevel = precisionLevel;
    return this;
  }

   /**
   * Get precisionLevel
   * @return precisionLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrecisionLevel() {
    return precisionLevel;
  }


  public void setPrecisionLevel(String precisionLevel) {
    this.precisionLevel = precisionLevel;
  }


  public Match locationCode(String locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Get locationCode
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  public Match matchCode(String matchCode) {
    
    this.matchCode = matchCode;
    return this;
  }

   /**
   * Get matchCode
   * @return matchCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchCode() {
    return matchCode;
  }


  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Match match = (Match) o;
    return Objects.equals(this.confidence, match.confidence) &&
        Objects.equals(this.percentGeocode, match.percentGeocode) &&
        Objects.equals(this.precisionLevel, match.precisionLevel) &&
        Objects.equals(this.locationCode, match.locationCode) &&
        Objects.equals(this.matchCode, match.matchCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, percentGeocode, precisionLevel, locationCode, matchCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Match {\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    percentGeocode: ").append(toIndentedString(percentGeocode)).append("\n");
    sb.append("    precisionLevel: ").append(toIndentedString(precisionLevel)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
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

