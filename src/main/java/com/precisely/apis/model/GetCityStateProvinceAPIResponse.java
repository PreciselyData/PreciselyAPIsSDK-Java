/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 16.0.1
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
import com.precisely.apis.model.GetCityStateProvinceAPIOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetCityStateProvinceAPIResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T12:37:28.987707300+05:30[Asia/Calcutta]")
public class GetCityStateProvinceAPIResponse {
  public static final String SERIALIZED_NAME_OUTPUT = "Output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private List<GetCityStateProvinceAPIOutput> output = null;

  public GetCityStateProvinceAPIResponse() { 
  }

  public GetCityStateProvinceAPIResponse output(List<GetCityStateProvinceAPIOutput> output) {
    
    this.output = output;
    return this;
  }

  public GetCityStateProvinceAPIResponse addOutputItem(GetCityStateProvinceAPIOutput outputItem) {
    if (this.output == null) {
      this.output = new ArrayList<GetCityStateProvinceAPIOutput>();
    }
    this.output.add(outputItem);
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetCityStateProvinceAPIOutput> getOutput() {
    return output;
  }


  public void setOutput(List<GetCityStateProvinceAPIOutput> output) {
    this.output = output;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCityStateProvinceAPIResponse getCityStateProvinceAPIResponse = (GetCityStateProvinceAPIResponse) o;
    return Objects.equals(this.output, getCityStateProvinceAPIResponse.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCityStateProvinceAPIResponse {\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

