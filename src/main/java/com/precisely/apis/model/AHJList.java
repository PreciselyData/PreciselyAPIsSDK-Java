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
import com.precisely.apis.model.AHJ;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AHJList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-25T18:30:10.262+05:30[Asia/Calcutta]")
public class AHJList {
  public static final String SERIALIZED_NAME_AHJS = "ahjs";
  @SerializedName(SERIALIZED_NAME_AHJS)
  private List<AHJ> ahjs = null;

  public AHJList() { 
  }

  public AHJList ahjs(List<AHJ> ahjs) {
    
    this.ahjs = ahjs;
    return this;
  }

  public AHJList addAhjsItem(AHJ ahjsItem) {
    if (this.ahjs == null) {
      this.ahjs = new ArrayList<AHJ>();
    }
    this.ahjs.add(ahjsItem);
    return this;
  }

   /**
   * Get ahjs
   * @return ahjs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AHJ> getAhjs() {
    return ahjs;
  }


  public void setAhjs(List<AHJ> ahjs) {
    this.ahjs = ahjs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AHJList ahJList = (AHJList) o;
    return Objects.equals(this.ahjs, ahJList.ahjs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ahjs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AHJList {\n");
    sb.append("    ahjs: ").append(toIndentedString(ahjs)).append("\n");
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

