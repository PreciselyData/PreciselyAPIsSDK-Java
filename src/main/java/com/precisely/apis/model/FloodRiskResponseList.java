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


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.FloodRiskResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FloodRiskResponseList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T17:32:51.155+05:30[Asia/Calcutta]")
public class FloodRiskResponseList {
  public static final String SERIALIZED_NAME_FLOOD_RISK = "floodRisk";
  @SerializedName(SERIALIZED_NAME_FLOOD_RISK)
  private List<FloodRiskResponse> floodRisk = null;

  public FloodRiskResponseList() { 
  }

  public FloodRiskResponseList floodRisk(List<FloodRiskResponse> floodRisk) {
    
    this.floodRisk = floodRisk;
    return this;
  }

  public FloodRiskResponseList addFloodRiskItem(FloodRiskResponse floodRiskItem) {
    if (this.floodRisk == null) {
      this.floodRisk = new ArrayList<FloodRiskResponse>();
    }
    this.floodRisk.add(floodRiskItem);
    return this;
  }

   /**
   * Get floodRisk
   * @return floodRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FloodRiskResponse> getFloodRisk() {
    return floodRisk;
  }


  public void setFloodRisk(List<FloodRiskResponse> floodRisk) {
    this.floodRisk = floodRisk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloodRiskResponseList floodRiskResponseList = (FloodRiskResponseList) o;
    return Objects.equals(this.floodRisk, floodRiskResponseList.floodRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floodRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloodRiskResponseList {\n");
    sb.append("    floodRisk: ").append(toIndentedString(floodRisk)).append("\n");
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

