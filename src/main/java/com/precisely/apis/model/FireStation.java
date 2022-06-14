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
import com.precisely.apis.model.Distance;
import com.precisely.apis.model.FireDepartment;
import com.precisely.apis.model.FireStationContactDetails;
import com.precisely.apis.model.Geometry;
import com.precisely.apis.model.Time;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FireStation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T17:32:51.155+05:30[Asia/Calcutta]")
public class FireStation {
  public static final String SERIALIZED_NAME_NUM_WITHIN_DEPARTMENT = "numWithinDepartment";
  @SerializedName(SERIALIZED_NAME_NUM_WITHIN_DEPARTMENT)
  private String numWithinDepartment;

  public static final String SERIALIZED_NAME_LOCATION_REFERENCE = "locationReference";
  @SerializedName(SERIALIZED_NAME_LOCATION_REFERENCE)
  private String locationReference;

  public static final String SERIALIZED_NAME_TRAVEL_DISTANCE = "travelDistance";
  @SerializedName(SERIALIZED_NAME_TRAVEL_DISTANCE)
  private Distance travelDistance;

  public static final String SERIALIZED_NAME_TRAVEL_TIME = "travelTime";
  @SerializedName(SERIALIZED_NAME_TRAVEL_TIME)
  private Time travelTime;

  public static final String SERIALIZED_NAME_CONTACT_DETAILS = "contactDetails";
  @SerializedName(SERIALIZED_NAME_CONTACT_DETAILS)
  private FireStationContactDetails contactDetails;

  public static final String SERIALIZED_NAME_FIRE_DEPARTMENT = "fireDepartment";
  @SerializedName(SERIALIZED_NAME_FIRE_DEPARTMENT)
  private FireDepartment fireDepartment;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private Geometry geometry;

  public FireStation() { 
  }

  public FireStation numWithinDepartment(String numWithinDepartment) {
    
    this.numWithinDepartment = numWithinDepartment;
    return this;
  }

   /**
   * Get numWithinDepartment
   * @return numWithinDepartment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNumWithinDepartment() {
    return numWithinDepartment;
  }


  public void setNumWithinDepartment(String numWithinDepartment) {
    this.numWithinDepartment = numWithinDepartment;
  }


  public FireStation locationReference(String locationReference) {
    
    this.locationReference = locationReference;
    return this;
  }

   /**
   * Get locationReference
   * @return locationReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationReference() {
    return locationReference;
  }


  public void setLocationReference(String locationReference) {
    this.locationReference = locationReference;
  }


  public FireStation travelDistance(Distance travelDistance) {
    
    this.travelDistance = travelDistance;
    return this;
  }

   /**
   * Get travelDistance
   * @return travelDistance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Distance getTravelDistance() {
    return travelDistance;
  }


  public void setTravelDistance(Distance travelDistance) {
    this.travelDistance = travelDistance;
  }


  public FireStation travelTime(Time travelTime) {
    
    this.travelTime = travelTime;
    return this;
  }

   /**
   * Get travelTime
   * @return travelTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Time getTravelTime() {
    return travelTime;
  }


  public void setTravelTime(Time travelTime) {
    this.travelTime = travelTime;
  }


  public FireStation contactDetails(FireStationContactDetails contactDetails) {
    
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Get contactDetails
   * @return contactDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FireStationContactDetails getContactDetails() {
    return contactDetails;
  }


  public void setContactDetails(FireStationContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }


  public FireStation fireDepartment(FireDepartment fireDepartment) {
    
    this.fireDepartment = fireDepartment;
    return this;
  }

   /**
   * Get fireDepartment
   * @return fireDepartment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FireDepartment getFireDepartment() {
    return fireDepartment;
  }


  public void setFireDepartment(FireDepartment fireDepartment) {
    this.fireDepartment = fireDepartment;
  }


  public FireStation geometry(Geometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geometry getGeometry() {
    return geometry;
  }


  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireStation fireStation = (FireStation) o;
    return Objects.equals(this.numWithinDepartment, fireStation.numWithinDepartment) &&
        Objects.equals(this.locationReference, fireStation.locationReference) &&
        Objects.equals(this.travelDistance, fireStation.travelDistance) &&
        Objects.equals(this.travelTime, fireStation.travelTime) &&
        Objects.equals(this.contactDetails, fireStation.contactDetails) &&
        Objects.equals(this.fireDepartment, fireStation.fireDepartment) &&
        Objects.equals(this.geometry, fireStation.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numWithinDepartment, locationReference, travelDistance, travelTime, contactDetails, fireDepartment, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireStation {\n");
    sb.append("    numWithinDepartment: ").append(toIndentedString(numWithinDepartment)).append("\n");
    sb.append("    locationReference: ").append(toIndentedString(locationReference)).append("\n");
    sb.append("    travelDistance: ").append(toIndentedString(travelDistance)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    fireDepartment: ").append(toIndentedString(fireDepartment)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

