/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 18.1.0
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
 * BuildgFeaturesSqft
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-25T12:02:09.428568400+05:30[Asia/Calcutta]")
public class BuildgFeaturesSqft {
  public static final String SERIALIZED_NAME_FEATURE_AREA_SQ_FT = "featureAreaSqFt";
  @SerializedName(SERIALIZED_NAME_FEATURE_AREA_SQ_FT)
  private String featureAreaSqFt;

  public static final String SERIALIZED_NAME_AREA_INDICATOR = "areaIndicator";
  @SerializedName(SERIALIZED_NAME_AREA_INDICATOR)
  private String areaIndicator;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public BuildgFeaturesSqft() { 
  }

  public BuildgFeaturesSqft featureAreaSqFt(String featureAreaSqFt) {
    
    this.featureAreaSqFt = featureAreaSqFt;
    return this;
  }

   /**
   * Get featureAreaSqFt
   * @return featureAreaSqFt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFeatureAreaSqFt() {
    return featureAreaSqFt;
  }


  public void setFeatureAreaSqFt(String featureAreaSqFt) {
    this.featureAreaSqFt = featureAreaSqFt;
  }


  public BuildgFeaturesSqft areaIndicator(String areaIndicator) {
    
    this.areaIndicator = areaIndicator;
    return this;
  }

   /**
   * Get areaIndicator
   * @return areaIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaIndicator() {
    return areaIndicator;
  }


  public void setAreaIndicator(String areaIndicator) {
    this.areaIndicator = areaIndicator;
  }


  public BuildgFeaturesSqft description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildgFeaturesSqft buildgFeaturesSqft = (BuildgFeaturesSqft) o;
    return Objects.equals(this.featureAreaSqFt, buildgFeaturesSqft.featureAreaSqFt) &&
        Objects.equals(this.areaIndicator, buildgFeaturesSqft.areaIndicator) &&
        Objects.equals(this.description, buildgFeaturesSqft.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureAreaSqFt, areaIndicator, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildgFeaturesSqft {\n");
    sb.append("    featureAreaSqFt: ").append(toIndentedString(featureAreaSqFt)).append("\n");
    sb.append("    areaIndicator: ").append(toIndentedString(areaIndicator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

