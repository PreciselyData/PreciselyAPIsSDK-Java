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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BuildgImproveArea
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T16:39:48.889177+05:30[Asia/Calcutta]")
public class BuildgImproveArea {
  public static final String SERIALIZED_NAME_IMPROVE_AREA = "improveArea";
  @SerializedName(SERIALIZED_NAME_IMPROVE_AREA)
  private String improveArea;

  public static final String SERIALIZED_NAME_AREA_INDICATOR = "areaIndicator";
  @SerializedName(SERIALIZED_NAME_AREA_INDICATOR)
  private String areaIndicator;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public BuildgImproveArea() { 
  }

  public BuildgImproveArea improveArea(String improveArea) {
    
    this.improveArea = improveArea;
    return this;
  }

   /**
   * Get improveArea
   * @return improveArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImproveArea() {
    return improveArea;
  }


  public void setImproveArea(String improveArea) {
    this.improveArea = improveArea;
  }


  public BuildgImproveArea areaIndicator(String areaIndicator) {
    
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


  public BuildgImproveArea description(String description) {
    
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
    BuildgImproveArea buildgImproveArea = (BuildgImproveArea) o;
    return Objects.equals(this.improveArea, buildgImproveArea.improveArea) &&
        Objects.equals(this.areaIndicator, buildgImproveArea.areaIndicator) &&
        Objects.equals(this.description, buildgImproveArea.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(improveArea, areaIndicator, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildgImproveArea {\n");
    sb.append("    improveArea: ").append(toIndentedString(improveArea)).append("\n");
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

