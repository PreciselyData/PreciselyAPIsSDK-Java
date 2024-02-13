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
import com.precisely.apis.model.CrimeIndexTheme;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RisksCrimeTheme
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T16:39:48.889177+05:30[Asia/Calcutta]")
public class RisksCrimeTheme {
  public static final String SERIALIZED_NAME_CRIME_INDEX_THEME = "crimeIndexTheme";
  @SerializedName(SERIALIZED_NAME_CRIME_INDEX_THEME)
  private CrimeIndexTheme crimeIndexTheme;

  public RisksCrimeTheme() { 
  }

  public RisksCrimeTheme crimeIndexTheme(CrimeIndexTheme crimeIndexTheme) {
    
    this.crimeIndexTheme = crimeIndexTheme;
    return this;
  }

   /**
   * Get crimeIndexTheme
   * @return crimeIndexTheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrimeIndexTheme getCrimeIndexTheme() {
    return crimeIndexTheme;
  }


  public void setCrimeIndexTheme(CrimeIndexTheme crimeIndexTheme) {
    this.crimeIndexTheme = crimeIndexTheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RisksCrimeTheme risksCrimeTheme = (RisksCrimeTheme) o;
    return Objects.equals(this.crimeIndexTheme, risksCrimeTheme.crimeIndexTheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crimeIndexTheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RisksCrimeTheme {\n");
    sb.append("    crimeIndexTheme: ").append(toIndentedString(crimeIndexTheme)).append("\n");
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

