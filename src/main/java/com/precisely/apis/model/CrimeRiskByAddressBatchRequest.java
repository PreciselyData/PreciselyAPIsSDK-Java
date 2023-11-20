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
import com.precisely.apis.model.CrimeRiskPreferences;
import com.precisely.apis.model.RiskAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CrimeRiskByAddressBatchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class CrimeRiskByAddressBatchRequest {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<RiskAddress> addresses = new ArrayList<RiskAddress>();

  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private CrimeRiskPreferences preferences;

  public CrimeRiskByAddressBatchRequest() { 
  }

  public CrimeRiskByAddressBatchRequest addresses(List<RiskAddress> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public CrimeRiskByAddressBatchRequest addAddressesItem(RiskAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<RiskAddress> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<RiskAddress> addresses) {
    this.addresses = addresses;
  }


  public CrimeRiskByAddressBatchRequest preferences(CrimeRiskPreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrimeRiskPreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(CrimeRiskPreferences preferences) {
    this.preferences = preferences;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrimeRiskByAddressBatchRequest crimeRiskByAddressBatchRequest = (CrimeRiskByAddressBatchRequest) o;
    return Objects.equals(this.addresses, crimeRiskByAddressBatchRequest.addresses) &&
        Objects.equals(this.preferences, crimeRiskByAddressBatchRequest.preferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, preferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrimeRiskByAddressBatchRequest {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
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

