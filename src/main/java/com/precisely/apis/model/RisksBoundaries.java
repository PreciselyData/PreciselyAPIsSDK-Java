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
import com.precisely.apis.model.CrimeBoundary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RisksBoundaries
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class RisksBoundaries {
  public static final String SERIALIZED_NAME_BOUNDARY = "boundary";
  @SerializedName(SERIALIZED_NAME_BOUNDARY)
  private List<CrimeBoundary> boundary = null;

  public RisksBoundaries() { 
  }

  public RisksBoundaries boundary(List<CrimeBoundary> boundary) {
    
    this.boundary = boundary;
    return this;
  }

  public RisksBoundaries addBoundaryItem(CrimeBoundary boundaryItem) {
    if (this.boundary == null) {
      this.boundary = new ArrayList<CrimeBoundary>();
    }
    this.boundary.add(boundaryItem);
    return this;
  }

   /**
   * Get boundary
   * @return boundary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CrimeBoundary> getBoundary() {
    return boundary;
  }


  public void setBoundary(List<CrimeBoundary> boundary) {
    this.boundary = boundary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RisksBoundaries risksBoundaries = (RisksBoundaries) o;
    return Objects.equals(this.boundary, risksBoundaries.boundary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RisksBoundaries {\n");
    sb.append("    boundary: ").append(toIndentedString(boundary)).append("\n");
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

