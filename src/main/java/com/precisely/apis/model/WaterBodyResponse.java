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


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.RiskAddress;
import com.precisely.apis.model.WaterBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WaterBodyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T16:39:48.889177+05:30[Asia/Calcutta]")
public class WaterBodyResponse {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_WATER_BODY = "waterBody";
  @SerializedName(SERIALIZED_NAME_WATER_BODY)
  private List<WaterBody> waterBody = null;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private RiskAddress matchedAddress;

  public WaterBodyResponse() { 
  }

  public WaterBodyResponse objectId(String objectId) {
    
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


  public WaterBodyResponse waterBody(List<WaterBody> waterBody) {
    
    this.waterBody = waterBody;
    return this;
  }

  public WaterBodyResponse addWaterBodyItem(WaterBody waterBodyItem) {
    if (this.waterBody == null) {
      this.waterBody = new ArrayList<WaterBody>();
    }
    this.waterBody.add(waterBodyItem);
    return this;
  }

   /**
   * Get waterBody
   * @return waterBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WaterBody> getWaterBody() {
    return waterBody;
  }


  public void setWaterBody(List<WaterBody> waterBody) {
    this.waterBody = waterBody;
  }


  public WaterBodyResponse matchedAddress(RiskAddress matchedAddress) {
    
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
    WaterBodyResponse waterBodyResponse = (WaterBodyResponse) o;
    return Objects.equals(this.objectId, waterBodyResponse.objectId) &&
        Objects.equals(this.waterBody, waterBodyResponse.waterBody) &&
        Objects.equals(this.matchedAddress, waterBodyResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, waterBody, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaterBodyResponse {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    waterBody: ").append(toIndentedString(waterBody)).append("\n");
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

