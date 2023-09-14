/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 17.0.0
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
import com.precisely.apis.model.GetPostalCodesAPIOutputUserFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidateMailingAddressProInputRow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-14T13:16:01.386923100+05:30[Asia/Calcutta]")
public class ValidateMailingAddressProInputRow {
  public static final String SERIALIZED_NAME_USER_FIELDS = "user_fields";
  @SerializedName(SERIALIZED_NAME_USER_FIELDS)
  private List<GetPostalCodesAPIOutputUserFields> userFields = null;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "AddressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "AddressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_FIRM_NAME = "FirmName";
  @SerializedName(SERIALIZED_NAME_FIRM_NAME)
  private String firmName;

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "StateProvince";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "PostalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public ValidateMailingAddressProInputRow() { 
  }

  public ValidateMailingAddressProInputRow userFields(List<GetPostalCodesAPIOutputUserFields> userFields) {
    
    this.userFields = userFields;
    return this;
  }

  public ValidateMailingAddressProInputRow addUserFieldsItem(GetPostalCodesAPIOutputUserFields userFieldsItem) {
    if (this.userFields == null) {
      this.userFields = new ArrayList<GetPostalCodesAPIOutputUserFields>();
    }
    this.userFields.add(userFieldsItem);
    return this;
  }

   /**
   * These fields are returned, unmodified, in the user_fields section of the response.
   * @return userFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "These fields are returned, unmodified, in the user_fields section of the response.")

  public List<GetPostalCodesAPIOutputUserFields> getUserFields() {
    return userFields;
  }


  public void setUserFields(List<GetPostalCodesAPIOutputUserFields> userFields) {
    this.userFields = userFields;
  }


  public ValidateMailingAddressProInputRow addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first address line.
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first address line.")

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public ValidateMailingAddressProInputRow addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second address line.
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The second address line.")

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public ValidateMailingAddressProInputRow firmName(String firmName) {
    
    this.firmName = firmName;
    return this;
  }

   /**
   * The company or firm name.
   * @return firmName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The company or firm name.")

  public String getFirmName() {
    return firmName;
  }


  public void setFirmName(String firmName) {
    this.firmName = firmName;
  }


  public ValidateMailingAddressProInputRow city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city name.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city name.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ValidateMailingAddressProInputRow stateProvince(String stateProvince) {
    
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * The state or province.
   * @return stateProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state or province.")

  public String getStateProvince() {
    return stateProvince;
  }


  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }


  public ValidateMailingAddressProInputRow country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country code or name.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country code or name.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public ValidateMailingAddressProInputRow postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code for the address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code for the address.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressProInputRow validateMailingAddressProInputRow = (ValidateMailingAddressProInputRow) o;
    return Objects.equals(this.userFields, validateMailingAddressProInputRow.userFields) &&
        Objects.equals(this.addressLine1, validateMailingAddressProInputRow.addressLine1) &&
        Objects.equals(this.addressLine2, validateMailingAddressProInputRow.addressLine2) &&
        Objects.equals(this.firmName, validateMailingAddressProInputRow.firmName) &&
        Objects.equals(this.city, validateMailingAddressProInputRow.city) &&
        Objects.equals(this.stateProvince, validateMailingAddressProInputRow.stateProvince) &&
        Objects.equals(this.country, validateMailingAddressProInputRow.country) &&
        Objects.equals(this.postalCode, validateMailingAddressProInputRow.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, addressLine1, addressLine2, firmName, city, stateProvince, country, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressProInputRow {\n");
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    firmName: ").append(toIndentedString(firmName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

