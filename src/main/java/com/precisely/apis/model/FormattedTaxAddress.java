/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 12.0.0
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
 * FormattedTaxAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:38:37.800090600+05:30[Asia/Calcutta]")
public class FormattedTaxAddress {
  public static final String SERIALIZED_NAME_MAIN_ADDRESS_LINE = "mainAddressLine";
  @SerializedName(SERIALIZED_NAME_MAIN_ADDRESS_LINE)
  private String mainAddressLine;

  public static final String SERIALIZED_NAME_ADDRESS_NUMBER = "addressNumber";
  @SerializedName(SERIALIZED_NAME_ADDRESS_NUMBER)
  private String addressNumber;

  public static final String SERIALIZED_NAME_STREET_PRE_DIRECTION = "streetPreDirection";
  @SerializedName(SERIALIZED_NAME_STREET_PRE_DIRECTION)
  private String streetPreDirection;

  public static final String SERIALIZED_NAME_STREET_NAME = "streetName";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private String streetName;

  public static final String SERIALIZED_NAME_STREET_TYPE = "streetType";
  @SerializedName(SERIALIZED_NAME_STREET_TYPE)
  private String streetType;

  public static final String SERIALIZED_NAME_STREET_POST_DIRECTION = "streetPostDirection";
  @SerializedName(SERIALIZED_NAME_STREET_POST_DIRECTION)
  private String streetPostDirection;

  public static final String SERIALIZED_NAME_UNIT_TYPE = "unitType";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPE)
  private String unitType;

  public static final String SERIALIZED_NAME_UNIT_VALUE = "unitValue";
  @SerializedName(SERIALIZED_NAME_UNIT_VALUE)
  private String unitValue;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_POST_CODE1 = "postCode1";
  @SerializedName(SERIALIZED_NAME_POST_CODE1)
  private String postCode1;

  public static final String SERIALIZED_NAME_POST_CODE2 = "postCode2";
  @SerializedName(SERIALIZED_NAME_POST_CODE2)
  private String postCode2;

  public FormattedTaxAddress() { 
  }

  public FormattedTaxAddress mainAddressLine(String mainAddressLine) {
    
    this.mainAddressLine = mainAddressLine;
    return this;
  }

   /**
   * Get mainAddressLine
   * @return mainAddressLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMainAddressLine() {
    return mainAddressLine;
  }


  public void setMainAddressLine(String mainAddressLine) {
    this.mainAddressLine = mainAddressLine;
  }


  public FormattedTaxAddress addressNumber(String addressNumber) {
    
    this.addressNumber = addressNumber;
    return this;
  }

   /**
   * Get addressNumber
   * @return addressNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressNumber() {
    return addressNumber;
  }


  public void setAddressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
  }


  public FormattedTaxAddress streetPreDirection(String streetPreDirection) {
    
    this.streetPreDirection = streetPreDirection;
    return this;
  }

   /**
   * Get streetPreDirection
   * @return streetPreDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetPreDirection() {
    return streetPreDirection;
  }


  public void setStreetPreDirection(String streetPreDirection) {
    this.streetPreDirection = streetPreDirection;
  }


  public FormattedTaxAddress streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public FormattedTaxAddress streetType(String streetType) {
    
    this.streetType = streetType;
    return this;
  }

   /**
   * Get streetType
   * @return streetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetType() {
    return streetType;
  }


  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }


  public FormattedTaxAddress streetPostDirection(String streetPostDirection) {
    
    this.streetPostDirection = streetPostDirection;
    return this;
  }

   /**
   * Get streetPostDirection
   * @return streetPostDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetPostDirection() {
    return streetPostDirection;
  }


  public void setStreetPostDirection(String streetPostDirection) {
    this.streetPostDirection = streetPostDirection;
  }


  public FormattedTaxAddress unitType(String unitType) {
    
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitType() {
    return unitType;
  }


  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }


  public FormattedTaxAddress unitValue(String unitValue) {
    
    this.unitValue = unitValue;
    return this;
  }

   /**
   * Get unitValue
   * @return unitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitValue() {
    return unitValue;
  }


  public void setUnitValue(String unitValue) {
    this.unitValue = unitValue;
  }


  public FormattedTaxAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public FormattedTaxAddress state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public FormattedTaxAddress postCode1(String postCode1) {
    
    this.postCode1 = postCode1;
    return this;
  }

   /**
   * Get postCode1
   * @return postCode1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCode1() {
    return postCode1;
  }


  public void setPostCode1(String postCode1) {
    this.postCode1 = postCode1;
  }


  public FormattedTaxAddress postCode2(String postCode2) {
    
    this.postCode2 = postCode2;
    return this;
  }

   /**
   * Get postCode2
   * @return postCode2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCode2() {
    return postCode2;
  }


  public void setPostCode2(String postCode2) {
    this.postCode2 = postCode2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormattedTaxAddress formattedTaxAddress = (FormattedTaxAddress) o;
    return Objects.equals(this.mainAddressLine, formattedTaxAddress.mainAddressLine) &&
        Objects.equals(this.addressNumber, formattedTaxAddress.addressNumber) &&
        Objects.equals(this.streetPreDirection, formattedTaxAddress.streetPreDirection) &&
        Objects.equals(this.streetName, formattedTaxAddress.streetName) &&
        Objects.equals(this.streetType, formattedTaxAddress.streetType) &&
        Objects.equals(this.streetPostDirection, formattedTaxAddress.streetPostDirection) &&
        Objects.equals(this.unitType, formattedTaxAddress.unitType) &&
        Objects.equals(this.unitValue, formattedTaxAddress.unitValue) &&
        Objects.equals(this.city, formattedTaxAddress.city) &&
        Objects.equals(this.state, formattedTaxAddress.state) &&
        Objects.equals(this.postCode1, formattedTaxAddress.postCode1) &&
        Objects.equals(this.postCode2, formattedTaxAddress.postCode2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainAddressLine, addressNumber, streetPreDirection, streetName, streetType, streetPostDirection, unitType, unitValue, city, state, postCode1, postCode2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormattedTaxAddress {\n");
    sb.append("    mainAddressLine: ").append(toIndentedString(mainAddressLine)).append("\n");
    sb.append("    addressNumber: ").append(toIndentedString(addressNumber)).append("\n");
    sb.append("    streetPreDirection: ").append(toIndentedString(streetPreDirection)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    streetPostDirection: ").append(toIndentedString(streetPostDirection)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    unitValue: ").append(toIndentedString(unitValue)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postCode1: ").append(toIndentedString(postCode1)).append("\n");
    sb.append("    postCode2: ").append(toIndentedString(postCode2)).append("\n");
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
