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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FieldsMatching
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T12:37:28.987707300+05:30[Asia/Calcutta]")
public class FieldsMatching {
  public static final String SERIALIZED_NAME_MATCH_ON_ADDRESS_NUMBER = "matchOnAddressNumber";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_ADDRESS_NUMBER)
  private Boolean matchOnAddressNumber;

  public static final String SERIALIZED_NAME_MATCH_ON_POST_CODE1 = "matchOnPostCode1";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_POST_CODE1)
  private Boolean matchOnPostCode1;

  public static final String SERIALIZED_NAME_MATCH_ON_POST_CODE2 = "matchOnPostCode2";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_POST_CODE2)
  private Boolean matchOnPostCode2;

  public static final String SERIALIZED_NAME_MATCH_ON_AREA_NAME1 = "matchOnAreaName1";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_AREA_NAME1)
  private Boolean matchOnAreaName1;

  public static final String SERIALIZED_NAME_MATCH_ON_AREA_NAME2 = "matchOnAreaName2";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_AREA_NAME2)
  private Boolean matchOnAreaName2;

  public static final String SERIALIZED_NAME_MATCH_ON_AREA_NAME3 = "matchOnAreaName3";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_AREA_NAME3)
  private Boolean matchOnAreaName3;

  public static final String SERIALIZED_NAME_MATCH_ON_AREA_NAME4 = "matchOnAreaName4";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_AREA_NAME4)
  private Boolean matchOnAreaName4;

  public static final String SERIALIZED_NAME_MATCH_ON_ALL_STREET_FIELDS = "matchOnAllStreetFields";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_ALL_STREET_FIELDS)
  private Boolean matchOnAllStreetFields;

  public static final String SERIALIZED_NAME_MATCH_ON_STREET_NAME = "matchOnStreetName";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_STREET_NAME)
  private Boolean matchOnStreetName;

  public static final String SERIALIZED_NAME_MATCH_ON_STREET_TYPE = "matchOnStreetType";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_STREET_TYPE)
  private Boolean matchOnStreetType;

  public static final String SERIALIZED_NAME_MATCH_ON_STREET_DIRECTIONAL = "matchOnStreetDirectional";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_STREET_DIRECTIONAL)
  private Boolean matchOnStreetDirectional;

  public static final String SERIALIZED_NAME_MATCH_ON_PLACE_NAME = "matchOnPlaceName";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_PLACE_NAME)
  private Boolean matchOnPlaceName;

  public static final String SERIALIZED_NAME_MATCH_ON_INPUT_FIELDS = "matchOnInputFields";
  @SerializedName(SERIALIZED_NAME_MATCH_ON_INPUT_FIELDS)
  private Boolean matchOnInputFields;

  public FieldsMatching() { 
  }

  public FieldsMatching matchOnAddressNumber(Boolean matchOnAddressNumber) {
    
    this.matchOnAddressNumber = matchOnAddressNumber;
    return this;
  }

   /**
   * Get matchOnAddressNumber
   * @return matchOnAddressNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnAddressNumber() {
    return matchOnAddressNumber;
  }


  public void setMatchOnAddressNumber(Boolean matchOnAddressNumber) {
    this.matchOnAddressNumber = matchOnAddressNumber;
  }


  public FieldsMatching matchOnPostCode1(Boolean matchOnPostCode1) {
    
    this.matchOnPostCode1 = matchOnPostCode1;
    return this;
  }

   /**
   * Get matchOnPostCode1
   * @return matchOnPostCode1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnPostCode1() {
    return matchOnPostCode1;
  }


  public void setMatchOnPostCode1(Boolean matchOnPostCode1) {
    this.matchOnPostCode1 = matchOnPostCode1;
  }


  public FieldsMatching matchOnPostCode2(Boolean matchOnPostCode2) {
    
    this.matchOnPostCode2 = matchOnPostCode2;
    return this;
  }

   /**
   * Get matchOnPostCode2
   * @return matchOnPostCode2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnPostCode2() {
    return matchOnPostCode2;
  }


  public void setMatchOnPostCode2(Boolean matchOnPostCode2) {
    this.matchOnPostCode2 = matchOnPostCode2;
  }


  public FieldsMatching matchOnAreaName1(Boolean matchOnAreaName1) {
    
    this.matchOnAreaName1 = matchOnAreaName1;
    return this;
  }

   /**
   * Get matchOnAreaName1
   * @return matchOnAreaName1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnAreaName1() {
    return matchOnAreaName1;
  }


  public void setMatchOnAreaName1(Boolean matchOnAreaName1) {
    this.matchOnAreaName1 = matchOnAreaName1;
  }


  public FieldsMatching matchOnAreaName2(Boolean matchOnAreaName2) {
    
    this.matchOnAreaName2 = matchOnAreaName2;
    return this;
  }

   /**
   * Get matchOnAreaName2
   * @return matchOnAreaName2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnAreaName2() {
    return matchOnAreaName2;
  }


  public void setMatchOnAreaName2(Boolean matchOnAreaName2) {
    this.matchOnAreaName2 = matchOnAreaName2;
  }


  public FieldsMatching matchOnAreaName3(Boolean matchOnAreaName3) {
    
    this.matchOnAreaName3 = matchOnAreaName3;
    return this;
  }

   /**
   * Get matchOnAreaName3
   * @return matchOnAreaName3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnAreaName3() {
    return matchOnAreaName3;
  }


  public void setMatchOnAreaName3(Boolean matchOnAreaName3) {
    this.matchOnAreaName3 = matchOnAreaName3;
  }


  public FieldsMatching matchOnAreaName4(Boolean matchOnAreaName4) {
    
    this.matchOnAreaName4 = matchOnAreaName4;
    return this;
  }

   /**
   * Get matchOnAreaName4
   * @return matchOnAreaName4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnAreaName4() {
    return matchOnAreaName4;
  }


  public void setMatchOnAreaName4(Boolean matchOnAreaName4) {
    this.matchOnAreaName4 = matchOnAreaName4;
  }


  public FieldsMatching matchOnAllStreetFields(Boolean matchOnAllStreetFields) {
    
    this.matchOnAllStreetFields = matchOnAllStreetFields;
    return this;
  }

   /**
   * Get matchOnAllStreetFields
   * @return matchOnAllStreetFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnAllStreetFields() {
    return matchOnAllStreetFields;
  }


  public void setMatchOnAllStreetFields(Boolean matchOnAllStreetFields) {
    this.matchOnAllStreetFields = matchOnAllStreetFields;
  }


  public FieldsMatching matchOnStreetName(Boolean matchOnStreetName) {
    
    this.matchOnStreetName = matchOnStreetName;
    return this;
  }

   /**
   * Get matchOnStreetName
   * @return matchOnStreetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnStreetName() {
    return matchOnStreetName;
  }


  public void setMatchOnStreetName(Boolean matchOnStreetName) {
    this.matchOnStreetName = matchOnStreetName;
  }


  public FieldsMatching matchOnStreetType(Boolean matchOnStreetType) {
    
    this.matchOnStreetType = matchOnStreetType;
    return this;
  }

   /**
   * Get matchOnStreetType
   * @return matchOnStreetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnStreetType() {
    return matchOnStreetType;
  }


  public void setMatchOnStreetType(Boolean matchOnStreetType) {
    this.matchOnStreetType = matchOnStreetType;
  }


  public FieldsMatching matchOnStreetDirectional(Boolean matchOnStreetDirectional) {
    
    this.matchOnStreetDirectional = matchOnStreetDirectional;
    return this;
  }

   /**
   * Get matchOnStreetDirectional
   * @return matchOnStreetDirectional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnStreetDirectional() {
    return matchOnStreetDirectional;
  }


  public void setMatchOnStreetDirectional(Boolean matchOnStreetDirectional) {
    this.matchOnStreetDirectional = matchOnStreetDirectional;
  }


  public FieldsMatching matchOnPlaceName(Boolean matchOnPlaceName) {
    
    this.matchOnPlaceName = matchOnPlaceName;
    return this;
  }

   /**
   * Get matchOnPlaceName
   * @return matchOnPlaceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnPlaceName() {
    return matchOnPlaceName;
  }


  public void setMatchOnPlaceName(Boolean matchOnPlaceName) {
    this.matchOnPlaceName = matchOnPlaceName;
  }


  public FieldsMatching matchOnInputFields(Boolean matchOnInputFields) {
    
    this.matchOnInputFields = matchOnInputFields;
    return this;
  }

   /**
   * Get matchOnInputFields
   * @return matchOnInputFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMatchOnInputFields() {
    return matchOnInputFields;
  }


  public void setMatchOnInputFields(Boolean matchOnInputFields) {
    this.matchOnInputFields = matchOnInputFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldsMatching fieldsMatching = (FieldsMatching) o;
    return Objects.equals(this.matchOnAddressNumber, fieldsMatching.matchOnAddressNumber) &&
        Objects.equals(this.matchOnPostCode1, fieldsMatching.matchOnPostCode1) &&
        Objects.equals(this.matchOnPostCode2, fieldsMatching.matchOnPostCode2) &&
        Objects.equals(this.matchOnAreaName1, fieldsMatching.matchOnAreaName1) &&
        Objects.equals(this.matchOnAreaName2, fieldsMatching.matchOnAreaName2) &&
        Objects.equals(this.matchOnAreaName3, fieldsMatching.matchOnAreaName3) &&
        Objects.equals(this.matchOnAreaName4, fieldsMatching.matchOnAreaName4) &&
        Objects.equals(this.matchOnAllStreetFields, fieldsMatching.matchOnAllStreetFields) &&
        Objects.equals(this.matchOnStreetName, fieldsMatching.matchOnStreetName) &&
        Objects.equals(this.matchOnStreetType, fieldsMatching.matchOnStreetType) &&
        Objects.equals(this.matchOnStreetDirectional, fieldsMatching.matchOnStreetDirectional) &&
        Objects.equals(this.matchOnPlaceName, fieldsMatching.matchOnPlaceName) &&
        Objects.equals(this.matchOnInputFields, fieldsMatching.matchOnInputFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchOnAddressNumber, matchOnPostCode1, matchOnPostCode2, matchOnAreaName1, matchOnAreaName2, matchOnAreaName3, matchOnAreaName4, matchOnAllStreetFields, matchOnStreetName, matchOnStreetType, matchOnStreetDirectional, matchOnPlaceName, matchOnInputFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsMatching {\n");
    sb.append("    matchOnAddressNumber: ").append(toIndentedString(matchOnAddressNumber)).append("\n");
    sb.append("    matchOnPostCode1: ").append(toIndentedString(matchOnPostCode1)).append("\n");
    sb.append("    matchOnPostCode2: ").append(toIndentedString(matchOnPostCode2)).append("\n");
    sb.append("    matchOnAreaName1: ").append(toIndentedString(matchOnAreaName1)).append("\n");
    sb.append("    matchOnAreaName2: ").append(toIndentedString(matchOnAreaName2)).append("\n");
    sb.append("    matchOnAreaName3: ").append(toIndentedString(matchOnAreaName3)).append("\n");
    sb.append("    matchOnAreaName4: ").append(toIndentedString(matchOnAreaName4)).append("\n");
    sb.append("    matchOnAllStreetFields: ").append(toIndentedString(matchOnAllStreetFields)).append("\n");
    sb.append("    matchOnStreetName: ").append(toIndentedString(matchOnStreetName)).append("\n");
    sb.append("    matchOnStreetType: ").append(toIndentedString(matchOnStreetType)).append("\n");
    sb.append("    matchOnStreetDirectional: ").append(toIndentedString(matchOnStreetDirectional)).append("\n");
    sb.append("    matchOnPlaceName: ").append(toIndentedString(matchOnPlaceName)).append("\n");
    sb.append("    matchOnInputFields: ").append(toIndentedString(matchOnInputFields)).append("\n");
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

