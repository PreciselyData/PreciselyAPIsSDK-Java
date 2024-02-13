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
import java.util.ArrayList;
import java.util.List;

/**
 * PhoneVerificationOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T16:39:48.889177+05:30[Asia/Calcutta]")
public class PhoneVerificationOutput {
  public static final String SERIALIZED_NAME_M_N_C = "MNC";
  @SerializedName(SERIALIZED_NAME_M_N_C)
  private String MNC;

  public static final String SERIALIZED_NAME_M_C_C = "MCC";
  @SerializedName(SERIALIZED_NAME_M_C_C)
  private String MCC;

  public static final String SERIALIZED_NAME_CARRIER_NAME = "CarrierName";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  private String carrierName;

  public static final String SERIALIZED_NAME_PHONE_TYPE = "PhoneType";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE)
  private String phoneType;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_FORMATTED = "PhoneNumberFormatted";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_FORMATTED)
  private String phoneNumberFormatted;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "CountryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "PhoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_RESULT_CODE = "ResultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_USER_FIELDS = "user_fields";
  @SerializedName(SERIALIZED_NAME_USER_FIELDS)
  private List<String> userFields = null;

  public PhoneVerificationOutput() { 
  }

  public PhoneVerificationOutput MNC(String MNC) {
    
    this.MNC = MNC;
    return this;
  }

   /**
   * Get MNC
   * @return MNC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMNC() {
    return MNC;
  }


  public void setMNC(String MNC) {
    this.MNC = MNC;
  }


  public PhoneVerificationOutput MCC(String MCC) {
    
    this.MCC = MCC;
    return this;
  }

   /**
   * Get MCC
   * @return MCC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMCC() {
    return MCC;
  }


  public void setMCC(String MCC) {
    this.MCC = MCC;
  }


  public PhoneVerificationOutput carrierName(String carrierName) {
    
    this.carrierName = carrierName;
    return this;
  }

   /**
   * Get carrierName
   * @return carrierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCarrierName() {
    return carrierName;
  }


  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public PhoneVerificationOutput phoneType(String phoneType) {
    
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneType() {
    return phoneType;
  }


  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }


  public PhoneVerificationOutput phoneNumberFormatted(String phoneNumberFormatted) {
    
    this.phoneNumberFormatted = phoneNumberFormatted;
    return this;
  }

   /**
   * Get phoneNumberFormatted
   * @return phoneNumberFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumberFormatted() {
    return phoneNumberFormatted;
  }


  public void setPhoneNumberFormatted(String phoneNumberFormatted) {
    this.phoneNumberFormatted = phoneNumberFormatted;
  }


  public PhoneVerificationOutput countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public PhoneVerificationOutput phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PhoneVerificationOutput resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Get resultCode
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public PhoneVerificationOutput userFields(List<String> userFields) {
    
    this.userFields = userFields;
    return this;
  }

  public PhoneVerificationOutput addUserFieldsItem(String userFieldsItem) {
    if (this.userFields == null) {
      this.userFields = new ArrayList<String>();
    }
    this.userFields.add(userFieldsItem);
    return this;
  }

   /**
   * Get userFields
   * @return userFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUserFields() {
    return userFields;
  }


  public void setUserFields(List<String> userFields) {
    this.userFields = userFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneVerificationOutput phoneVerificationOutput = (PhoneVerificationOutput) o;
    return Objects.equals(this.MNC, phoneVerificationOutput.MNC) &&
        Objects.equals(this.MCC, phoneVerificationOutput.MCC) &&
        Objects.equals(this.carrierName, phoneVerificationOutput.carrierName) &&
        Objects.equals(this.phoneType, phoneVerificationOutput.phoneType) &&
        Objects.equals(this.phoneNumberFormatted, phoneVerificationOutput.phoneNumberFormatted) &&
        Objects.equals(this.countryCode, phoneVerificationOutput.countryCode) &&
        Objects.equals(this.phoneNumber, phoneVerificationOutput.phoneNumber) &&
        Objects.equals(this.resultCode, phoneVerificationOutput.resultCode) &&
        Objects.equals(this.userFields, phoneVerificationOutput.userFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MNC, MCC, carrierName, phoneType, phoneNumberFormatted, countryCode, phoneNumber, resultCode, userFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneVerificationOutput {\n");
    sb.append("    MNC: ").append(toIndentedString(MNC)).append("\n");
    sb.append("    MCC: ").append(toIndentedString(MCC)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    phoneNumberFormatted: ").append(toIndentedString(phoneNumberFormatted)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
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

