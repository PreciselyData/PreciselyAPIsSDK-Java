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
import com.precisely.apis.model.RouteGeometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * RouteDirection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-25T12:02:09.428568400+05:30[Asia/Calcutta]")
public class RouteDirection {
  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private BigDecimal distance;

  public static final String SERIALIZED_NAME_DISTANCE_UNIT = "distanceUnit";
  @SerializedName(SERIALIZED_NAME_DISTANCE_UNIT)
  private String distanceUnit;

  public static final String SERIALIZED_NAME_TIME_UNIT = "timeUnit";
  @SerializedName(SERIALIZED_NAME_TIME_UNIT)
  private String timeUnit;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private BigDecimal time;

  public static final String SERIALIZED_NAME_INSTRUCTION = "instruction";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION)
  private String instruction;

  public static final String SERIALIZED_NAME_DIRECTION_GEOMETRY = "directionGeometry";
  @SerializedName(SERIALIZED_NAME_DIRECTION_GEOMETRY)
  private RouteGeometry directionGeometry;

  public RouteDirection() { 
  }

  public RouteDirection distance(BigDecimal distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDistance() {
    return distance;
  }


  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }


  public RouteDirection distanceUnit(String distanceUnit) {
    
    this.distanceUnit = distanceUnit;
    return this;
  }

   /**
   * Get distanceUnit
   * @return distanceUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistanceUnit() {
    return distanceUnit;
  }


  public void setDistanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
  }


  public RouteDirection timeUnit(String timeUnit) {
    
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeUnit() {
    return timeUnit;
  }


  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }


  public RouteDirection time(BigDecimal time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTime() {
    return time;
  }


  public void setTime(BigDecimal time) {
    this.time = time;
  }


  public RouteDirection instruction(String instruction) {
    
    this.instruction = instruction;
    return this;
  }

   /**
   * Get instruction
   * @return instruction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstruction() {
    return instruction;
  }


  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }


  public RouteDirection directionGeometry(RouteGeometry directionGeometry) {
    
    this.directionGeometry = directionGeometry;
    return this;
  }

   /**
   * Get directionGeometry
   * @return directionGeometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RouteGeometry getDirectionGeometry() {
    return directionGeometry;
  }


  public void setDirectionGeometry(RouteGeometry directionGeometry) {
    this.directionGeometry = directionGeometry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteDirection routeDirection = (RouteDirection) o;
    return Objects.equals(this.distance, routeDirection.distance) &&
        Objects.equals(this.distanceUnit, routeDirection.distanceUnit) &&
        Objects.equals(this.timeUnit, routeDirection.timeUnit) &&
        Objects.equals(this.time, routeDirection.time) &&
        Objects.equals(this.instruction, routeDirection.instruction) &&
        Objects.equals(this.directionGeometry, routeDirection.directionGeometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, distanceUnit, timeUnit, time, instruction, directionGeometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteDirection {\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    distanceUnit: ").append(toIndentedString(distanceUnit)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    directionGeometry: ").append(toIndentedString(directionGeometry)).append("\n");
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

