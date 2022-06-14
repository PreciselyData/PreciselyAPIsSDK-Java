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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Road
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T17:32:51.155+05:30[Asia/Calcutta]")
public class Road {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ALT_NAME = "altName";
  @SerializedName(SERIALIZED_NAME_ALT_NAME)
  private String altName;

  public static final String SERIALIZED_NAME_ROAD_CLASS = "roadClass";
  @SerializedName(SERIALIZED_NAME_ROAD_CLASS)
  private String roadClass;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LENGTH_IN_METERS = "lengthInMeters";
  @SerializedName(SERIALIZED_NAME_LENGTH_IN_METERS)
  private String lengthInMeters;

  public static final String SERIALIZED_NAME_ROUTE_NUMBER = "routeNumber";
  @SerializedName(SERIALIZED_NAME_ROUTE_NUMBER)
  private String routeNumber;

  public static final String SERIALIZED_NAME_SURFACE_TYPE = "surfaceType";
  @SerializedName(SERIALIZED_NAME_SURFACE_TYPE)
  private String surfaceType;

  public static final String SERIALIZED_NAME_TRAFFIC_FLOW = "trafficFlow";
  @SerializedName(SERIALIZED_NAME_TRAFFIC_FLOW)
  private String trafficFlow;

  public static final String SERIALIZED_NAME_IS_TOLL = "isToll";
  @SerializedName(SERIALIZED_NAME_IS_TOLL)
  private String isToll;

  public static final String SERIALIZED_NAME_BEGINNING_LEVEL = "beginningLevel";
  @SerializedName(SERIALIZED_NAME_BEGINNING_LEVEL)
  private String beginningLevel;

  public static final String SERIALIZED_NAME_ENDING_LEVEL = "endingLevel";
  @SerializedName(SERIALIZED_NAME_ENDING_LEVEL)
  private String endingLevel;

  public Road() { 
  }

  public Road id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Road name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Road altName(String altName) {
    
    this.altName = altName;
    return this;
  }

   /**
   * Get altName
   * @return altName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAltName() {
    return altName;
  }


  public void setAltName(String altName) {
    this.altName = altName;
  }


  public Road roadClass(String roadClass) {
    
    this.roadClass = roadClass;
    return this;
  }

   /**
   * Get roadClass
   * @return roadClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoadClass() {
    return roadClass;
  }


  public void setRoadClass(String roadClass) {
    this.roadClass = roadClass;
  }


  public Road type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Road lengthInMeters(String lengthInMeters) {
    
    this.lengthInMeters = lengthInMeters;
    return this;
  }

   /**
   * Get lengthInMeters
   * @return lengthInMeters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLengthInMeters() {
    return lengthInMeters;
  }


  public void setLengthInMeters(String lengthInMeters) {
    this.lengthInMeters = lengthInMeters;
  }


  public Road routeNumber(String routeNumber) {
    
    this.routeNumber = routeNumber;
    return this;
  }

   /**
   * Get routeNumber
   * @return routeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouteNumber() {
    return routeNumber;
  }


  public void setRouteNumber(String routeNumber) {
    this.routeNumber = routeNumber;
  }


  public Road surfaceType(String surfaceType) {
    
    this.surfaceType = surfaceType;
    return this;
  }

   /**
   * Get surfaceType
   * @return surfaceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSurfaceType() {
    return surfaceType;
  }


  public void setSurfaceType(String surfaceType) {
    this.surfaceType = surfaceType;
  }


  public Road trafficFlow(String trafficFlow) {
    
    this.trafficFlow = trafficFlow;
    return this;
  }

   /**
   * Get trafficFlow
   * @return trafficFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrafficFlow() {
    return trafficFlow;
  }


  public void setTrafficFlow(String trafficFlow) {
    this.trafficFlow = trafficFlow;
  }


  public Road isToll(String isToll) {
    
    this.isToll = isToll;
    return this;
  }

   /**
   * Get isToll
   * @return isToll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIsToll() {
    return isToll;
  }


  public void setIsToll(String isToll) {
    this.isToll = isToll;
  }


  public Road beginningLevel(String beginningLevel) {
    
    this.beginningLevel = beginningLevel;
    return this;
  }

   /**
   * Get beginningLevel
   * @return beginningLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBeginningLevel() {
    return beginningLevel;
  }


  public void setBeginningLevel(String beginningLevel) {
    this.beginningLevel = beginningLevel;
  }


  public Road endingLevel(String endingLevel) {
    
    this.endingLevel = endingLevel;
    return this;
  }

   /**
   * Get endingLevel
   * @return endingLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndingLevel() {
    return endingLevel;
  }


  public void setEndingLevel(String endingLevel) {
    this.endingLevel = endingLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Road road = (Road) o;
    return Objects.equals(this.id, road.id) &&
        Objects.equals(this.name, road.name) &&
        Objects.equals(this.altName, road.altName) &&
        Objects.equals(this.roadClass, road.roadClass) &&
        Objects.equals(this.type, road.type) &&
        Objects.equals(this.lengthInMeters, road.lengthInMeters) &&
        Objects.equals(this.routeNumber, road.routeNumber) &&
        Objects.equals(this.surfaceType, road.surfaceType) &&
        Objects.equals(this.trafficFlow, road.trafficFlow) &&
        Objects.equals(this.isToll, road.isToll) &&
        Objects.equals(this.beginningLevel, road.beginningLevel) &&
        Objects.equals(this.endingLevel, road.endingLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, altName, roadClass, type, lengthInMeters, routeNumber, surfaceType, trafficFlow, isToll, beginningLevel, endingLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Road {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    altName: ").append(toIndentedString(altName)).append("\n");
    sb.append("    roadClass: ").append(toIndentedString(roadClass)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lengthInMeters: ").append(toIndentedString(lengthInMeters)).append("\n");
    sb.append("    routeNumber: ").append(toIndentedString(routeNumber)).append("\n");
    sb.append("    surfaceType: ").append(toIndentedString(surfaceType)).append("\n");
    sb.append("    trafficFlow: ").append(toIndentedString(trafficFlow)).append("\n");
    sb.append("    isToll: ").append(toIndentedString(isToll)).append("\n");
    sb.append("    beginningLevel: ").append(toIndentedString(beginningLevel)).append("\n");
    sb.append("    endingLevel: ").append(toIndentedString(endingLevel)).append("\n");
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

