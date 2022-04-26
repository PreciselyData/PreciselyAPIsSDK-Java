/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3
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
import com.precisely.apis.model.POIBoundaryPreferences;
import com.precisely.apis.model.ZonesAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * POIBoundaryAddressRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class POIBoundaryAddressRequest {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<ZonesAddress> addresses = new ArrayList<ZonesAddress>();

  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private POIBoundaryPreferences preferences;

  public POIBoundaryAddressRequest() { 
  }

  public POIBoundaryAddressRequest addresses(List<ZonesAddress> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public POIBoundaryAddressRequest addAddressesItem(ZonesAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ZonesAddress> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<ZonesAddress> addresses) {
    this.addresses = addresses;
  }


  public POIBoundaryAddressRequest preferences(POIBoundaryPreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public POIBoundaryPreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(POIBoundaryPreferences preferences) {
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
    POIBoundaryAddressRequest poIBoundaryAddressRequest = (POIBoundaryAddressRequest) o;
    return Objects.equals(this.addresses, poIBoundaryAddressRequest.addresses) &&
        Objects.equals(this.preferences, poIBoundaryAddressRequest.preferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, preferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POIBoundaryAddressRequest {\n");
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

