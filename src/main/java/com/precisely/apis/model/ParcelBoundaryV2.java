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
import com.precisely.apis.model.Center;
import com.precisely.apis.model.MatchedAddress;
import com.precisely.apis.model.ParcelV2;
import com.precisely.apis.model.PropertyInformationGeometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ParcelBoundaryV2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-25T12:02:09.428568400+05:30[Asia/Calcutta]")
public class ParcelBoundaryV2 {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_PARCEL_APN = "parcelApn";
  @SerializedName(SERIALIZED_NAME_PARCEL_APN)
  private String parcelApn;

  public static final String SERIALIZED_NAME_GEO_ID = "geoId";
  @SerializedName(SERIALIZED_NAME_GEO_ID)
  private String geoId;

  public static final String SERIALIZED_NAME_CENTER = "center";
  @SerializedName(SERIALIZED_NAME_CENTER)
  private Center center;

  public static final String SERIALIZED_NAME_COUNTYFIPS = "countyfips";
  @SerializedName(SERIALIZED_NAME_COUNTYFIPS)
  private String countyfips;

  public static final String SERIALIZED_NAME_PARCEL_AREA_SQ_FT = "parcelAreaSqFt";
  @SerializedName(SERIALIZED_NAME_PARCEL_AREA_SQ_FT)
  private String parcelAreaSqFt;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private PropertyInformationGeometry geometry;

  public static final String SERIALIZED_NAME_PARCEL_LIST = "parcelList";
  @SerializedName(SERIALIZED_NAME_PARCEL_LIST)
  private List<ParcelV2> parcelList = null;

  public static final String SERIALIZED_NAME_ADJACENT_PARCEL_BOUNDARY = "adjacentParcelBoundary";
  @SerializedName(SERIALIZED_NAME_ADJACENT_PARCEL_BOUNDARY)
  private List<ParcelBoundaryV2> adjacentParcelBoundary = null;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private MatchedAddress matchedAddress;

  public ParcelBoundaryV2() { 
  }

  public ParcelBoundaryV2 objectId(String objectId) {
    
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


  public ParcelBoundaryV2 parcelApn(String parcelApn) {
    
    this.parcelApn = parcelApn;
    return this;
  }

   /**
   * Get parcelApn
   * @return parcelApn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParcelApn() {
    return parcelApn;
  }


  public void setParcelApn(String parcelApn) {
    this.parcelApn = parcelApn;
  }


  public ParcelBoundaryV2 geoId(String geoId) {
    
    this.geoId = geoId;
    return this;
  }

   /**
   * Get geoId
   * @return geoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGeoId() {
    return geoId;
  }


  public void setGeoId(String geoId) {
    this.geoId = geoId;
  }


  public ParcelBoundaryV2 center(Center center) {
    
    this.center = center;
    return this;
  }

   /**
   * Get center
   * @return center
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Center getCenter() {
    return center;
  }


  public void setCenter(Center center) {
    this.center = center;
  }


  public ParcelBoundaryV2 countyfips(String countyfips) {
    
    this.countyfips = countyfips;
    return this;
  }

   /**
   * Get countyfips
   * @return countyfips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountyfips() {
    return countyfips;
  }


  public void setCountyfips(String countyfips) {
    this.countyfips = countyfips;
  }


  public ParcelBoundaryV2 parcelAreaSqFt(String parcelAreaSqFt) {
    
    this.parcelAreaSqFt = parcelAreaSqFt;
    return this;
  }

   /**
   * Get parcelAreaSqFt
   * @return parcelAreaSqFt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParcelAreaSqFt() {
    return parcelAreaSqFt;
  }


  public void setParcelAreaSqFt(String parcelAreaSqFt) {
    this.parcelAreaSqFt = parcelAreaSqFt;
  }


  public ParcelBoundaryV2 geometry(PropertyInformationGeometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PropertyInformationGeometry getGeometry() {
    return geometry;
  }


  public void setGeometry(PropertyInformationGeometry geometry) {
    this.geometry = geometry;
  }


  public ParcelBoundaryV2 parcelList(List<ParcelV2> parcelList) {
    
    this.parcelList = parcelList;
    return this;
  }

  public ParcelBoundaryV2 addParcelListItem(ParcelV2 parcelListItem) {
    if (this.parcelList == null) {
      this.parcelList = new ArrayList<ParcelV2>();
    }
    this.parcelList.add(parcelListItem);
    return this;
  }

   /**
   * Get parcelList
   * @return parcelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ParcelV2> getParcelList() {
    return parcelList;
  }


  public void setParcelList(List<ParcelV2> parcelList) {
    this.parcelList = parcelList;
  }


  public ParcelBoundaryV2 adjacentParcelBoundary(List<ParcelBoundaryV2> adjacentParcelBoundary) {
    
    this.adjacentParcelBoundary = adjacentParcelBoundary;
    return this;
  }

  public ParcelBoundaryV2 addAdjacentParcelBoundaryItem(ParcelBoundaryV2 adjacentParcelBoundaryItem) {
    if (this.adjacentParcelBoundary == null) {
      this.adjacentParcelBoundary = new ArrayList<ParcelBoundaryV2>();
    }
    this.adjacentParcelBoundary.add(adjacentParcelBoundaryItem);
    return this;
  }

   /**
   * Get adjacentParcelBoundary
   * @return adjacentParcelBoundary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ParcelBoundaryV2> getAdjacentParcelBoundary() {
    return adjacentParcelBoundary;
  }


  public void setAdjacentParcelBoundary(List<ParcelBoundaryV2> adjacentParcelBoundary) {
    this.adjacentParcelBoundary = adjacentParcelBoundary;
  }


  public ParcelBoundaryV2 matchedAddress(MatchedAddress matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchedAddress getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(MatchedAddress matchedAddress) {
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
    ParcelBoundaryV2 parcelBoundaryV2 = (ParcelBoundaryV2) o;
    return Objects.equals(this.objectId, parcelBoundaryV2.objectId) &&
        Objects.equals(this.parcelApn, parcelBoundaryV2.parcelApn) &&
        Objects.equals(this.geoId, parcelBoundaryV2.geoId) &&
        Objects.equals(this.center, parcelBoundaryV2.center) &&
        Objects.equals(this.countyfips, parcelBoundaryV2.countyfips) &&
        Objects.equals(this.parcelAreaSqFt, parcelBoundaryV2.parcelAreaSqFt) &&
        Objects.equals(this.geometry, parcelBoundaryV2.geometry) &&
        Objects.equals(this.parcelList, parcelBoundaryV2.parcelList) &&
        Objects.equals(this.adjacentParcelBoundary, parcelBoundaryV2.adjacentParcelBoundary) &&
        Objects.equals(this.matchedAddress, parcelBoundaryV2.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, parcelApn, geoId, center, countyfips, parcelAreaSqFt, geometry, parcelList, adjacentParcelBoundary, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelBoundaryV2 {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    parcelApn: ").append(toIndentedString(parcelApn)).append("\n");
    sb.append("    geoId: ").append(toIndentedString(geoId)).append("\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    countyfips: ").append(toIndentedString(countyfips)).append("\n");
    sb.append("    parcelAreaSqFt: ").append(toIndentedString(parcelAreaSqFt)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    parcelList: ").append(toIndentedString(parcelList)).append("\n");
    sb.append("    adjacentParcelBoundary: ").append(toIndentedString(adjacentParcelBoundary)).append("\n");
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

