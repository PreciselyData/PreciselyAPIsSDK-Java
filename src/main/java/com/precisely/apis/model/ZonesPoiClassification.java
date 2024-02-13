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
import com.precisely.apis.model.Category;
import com.precisely.apis.model.ZonesSic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ZonesPoiClassification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T16:39:48.889177+05:30[Asia/Calcutta]")
public class ZonesPoiClassification {
  public static final String SERIALIZED_NAME_SIC = "sic";
  @SerializedName(SERIALIZED_NAME_SIC)
  private ZonesSic sic;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private Category category;

  public static final String SERIALIZED_NAME_ALTERNATE_INDUSTRY_CODE = "alternateIndustryCode";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_INDUSTRY_CODE)
  private String alternateIndustryCode;

  public ZonesPoiClassification() { 
  }

  public ZonesPoiClassification sic(ZonesSic sic) {
    
    this.sic = sic;
    return this;
  }

   /**
   * Get sic
   * @return sic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZonesSic getSic() {
    return sic;
  }


  public void setSic(ZonesSic sic) {
    this.sic = sic;
  }


  public ZonesPoiClassification category(Category category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Category getCategory() {
    return category;
  }


  public void setCategory(Category category) {
    this.category = category;
  }


  public ZonesPoiClassification alternateIndustryCode(String alternateIndustryCode) {
    
    this.alternateIndustryCode = alternateIndustryCode;
    return this;
  }

   /**
   * Get alternateIndustryCode
   * @return alternateIndustryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlternateIndustryCode() {
    return alternateIndustryCode;
  }


  public void setAlternateIndustryCode(String alternateIndustryCode) {
    this.alternateIndustryCode = alternateIndustryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZonesPoiClassification zonesPoiClassification = (ZonesPoiClassification) o;
    return Objects.equals(this.sic, zonesPoiClassification.sic) &&
        Objects.equals(this.category, zonesPoiClassification.category) &&
        Objects.equals(this.alternateIndustryCode, zonesPoiClassification.alternateIndustryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sic, category, alternateIndustryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZonesPoiClassification {\n");
    sb.append("    sic: ").append(toIndentedString(sic)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    alternateIndustryCode: ").append(toIndentedString(alternateIndustryCode)).append("\n");
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

