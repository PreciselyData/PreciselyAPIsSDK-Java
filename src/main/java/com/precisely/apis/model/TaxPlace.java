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
 * TaxPlace
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T16:39:48.889177+05:30[Asia/Calcutta]")
public class TaxPlace {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_GNIS_CODE = "gnisCode";
  @SerializedName(SERIALIZED_NAME_GNIS_CODE)
  private String gnisCode;

  public static final String SERIALIZED_NAME_SELF_COLLECTED = "selfCollected";
  @SerializedName(SERIALIZED_NAME_SELF_COLLECTED)
  private Boolean selfCollected;

  public static final String SERIALIZED_NAME_CLASS_CODE = "classCode";
  @SerializedName(SERIALIZED_NAME_CLASS_CODE)
  private String classCode;

  public static final String SERIALIZED_NAME_INCORPORATED_FLAG = "incorporatedFlag";
  @SerializedName(SERIALIZED_NAME_INCORPORATED_FLAG)
  private String incorporatedFlag;

  public static final String SERIALIZED_NAME_LAST_ANNEXED_DATE = "lastAnnexedDate";
  @SerializedName(SERIALIZED_NAME_LAST_ANNEXED_DATE)
  private String lastAnnexedDate;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE = "lastUpdatedDate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE)
  private String lastUpdatedDate;

  public static final String SERIALIZED_NAME_LAST_VERIFIED_DATE = "lastVerifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_VERIFIED_DATE)
  private String lastVerifiedDate;

  public TaxPlace() { 
  }

  public TaxPlace name(String name) {
    
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


  public TaxPlace code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public TaxPlace gnisCode(String gnisCode) {
    
    this.gnisCode = gnisCode;
    return this;
  }

   /**
   * Get gnisCode
   * @return gnisCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGnisCode() {
    return gnisCode;
  }


  public void setGnisCode(String gnisCode) {
    this.gnisCode = gnisCode;
  }


  public TaxPlace selfCollected(Boolean selfCollected) {
    
    this.selfCollected = selfCollected;
    return this;
  }

   /**
   * Get selfCollected
   * @return selfCollected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSelfCollected() {
    return selfCollected;
  }


  public void setSelfCollected(Boolean selfCollected) {
    this.selfCollected = selfCollected;
  }


  public TaxPlace classCode(String classCode) {
    
    this.classCode = classCode;
    return this;
  }

   /**
   * Get classCode
   * @return classCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClassCode() {
    return classCode;
  }


  public void setClassCode(String classCode) {
    this.classCode = classCode;
  }


  public TaxPlace incorporatedFlag(String incorporatedFlag) {
    
    this.incorporatedFlag = incorporatedFlag;
    return this;
  }

   /**
   * Get incorporatedFlag
   * @return incorporatedFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIncorporatedFlag() {
    return incorporatedFlag;
  }


  public void setIncorporatedFlag(String incorporatedFlag) {
    this.incorporatedFlag = incorporatedFlag;
  }


  public TaxPlace lastAnnexedDate(String lastAnnexedDate) {
    
    this.lastAnnexedDate = lastAnnexedDate;
    return this;
  }

   /**
   * Get lastAnnexedDate
   * @return lastAnnexedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastAnnexedDate() {
    return lastAnnexedDate;
  }


  public void setLastAnnexedDate(String lastAnnexedDate) {
    this.lastAnnexedDate = lastAnnexedDate;
  }


  public TaxPlace lastUpdatedDate(String lastUpdatedDate) {
    
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }


  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }


  public TaxPlace lastVerifiedDate(String lastVerifiedDate) {
    
    this.lastVerifiedDate = lastVerifiedDate;
    return this;
  }

   /**
   * Get lastVerifiedDate
   * @return lastVerifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastVerifiedDate() {
    return lastVerifiedDate;
  }


  public void setLastVerifiedDate(String lastVerifiedDate) {
    this.lastVerifiedDate = lastVerifiedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxPlace taxPlace = (TaxPlace) o;
    return Objects.equals(this.name, taxPlace.name) &&
        Objects.equals(this.code, taxPlace.code) &&
        Objects.equals(this.gnisCode, taxPlace.gnisCode) &&
        Objects.equals(this.selfCollected, taxPlace.selfCollected) &&
        Objects.equals(this.classCode, taxPlace.classCode) &&
        Objects.equals(this.incorporatedFlag, taxPlace.incorporatedFlag) &&
        Objects.equals(this.lastAnnexedDate, taxPlace.lastAnnexedDate) &&
        Objects.equals(this.lastUpdatedDate, taxPlace.lastUpdatedDate) &&
        Objects.equals(this.lastVerifiedDate, taxPlace.lastVerifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, gnisCode, selfCollected, classCode, incorporatedFlag, lastAnnexedDate, lastUpdatedDate, lastVerifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxPlace {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    gnisCode: ").append(toIndentedString(gnisCode)).append("\n");
    sb.append("    selfCollected: ").append(toIndentedString(selfCollected)).append("\n");
    sb.append("    classCode: ").append(toIndentedString(classCode)).append("\n");
    sb.append("    incorporatedFlag: ").append(toIndentedString(incorporatedFlag)).append("\n");
    sb.append("    lastAnnexedDate: ").append(toIndentedString(lastAnnexedDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    lastVerifiedDate: ").append(toIndentedString(lastVerifiedDate)).append("\n");
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

