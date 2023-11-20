/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 17.1.0
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
 * ValidateEmailAddressInputRow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class ValidateEmailAddressInputRow {
  public static final String SERIALIZED_NAME_USER_FIELDS = "user_fields";
  @SerializedName(SERIALIZED_NAME_USER_FIELDS)
  private List<GetPostalCodesAPIOutputUserFields> userFields = null;

  public static final String SERIALIZED_NAME_RTC = "rtc";
  @SerializedName(SERIALIZED_NAME_RTC)
  private String rtc;

  public static final String SERIALIZED_NAME_BOGUS = "bogus";
  @SerializedName(SERIALIZED_NAME_BOGUS)
  private String bogus;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_EMPS = "emps";
  @SerializedName(SERIALIZED_NAME_EMPS)
  private String emps;

  public static final String SERIALIZED_NAME_FCCWIRELESS = "fccwireless";
  @SerializedName(SERIALIZED_NAME_FCCWIRELESS)
  private String fccwireless;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_COMPLAIN = "complain";
  @SerializedName(SERIALIZED_NAME_COMPLAIN)
  private String complain;

  public static final String SERIALIZED_NAME_DISPOSABLE = "disposable";
  @SerializedName(SERIALIZED_NAME_DISPOSABLE)
  private String disposable;

  public static final String SERIALIZED_NAME_ATC = "atc";
  @SerializedName(SERIALIZED_NAME_ATC)
  private String atc;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_RTC_TIMEOUT = "rtc_timeout";
  @SerializedName(SERIALIZED_NAME_RTC_TIMEOUT)
  private String rtcTimeout;

  public ValidateEmailAddressInputRow() { 
  }

  public ValidateEmailAddressInputRow userFields(List<GetPostalCodesAPIOutputUserFields> userFields) {
    
    this.userFields = userFields;
    return this;
  }

  public ValidateEmailAddressInputRow addUserFieldsItem(GetPostalCodesAPIOutputUserFields userFieldsItem) {
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


  public ValidateEmailAddressInputRow rtc(String rtc) {
    
    this.rtc = rtc;
    return this;
  }

   /**
   * Enables or disables real-time confirmation. If the deliverability of an email address cannot be determined via our knowledge base, a real-time confirmation can be attempted.
   * @return rtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enables or disables real-time confirmation. If the deliverability of an email address cannot be determined via our knowledge base, a real-time confirmation can be attempted.")

  public String getRtc() {
    return rtc;
  }


  public void setRtc(String rtc) {
    this.rtc = rtc;
  }


  public ValidateEmailAddressInputRow bogus(String bogus) {
    
    this.bogus = bogus;
    return this;
  }

   /**
   * Specifies whether to check if the email address is fictitious. For example, bgates@microsoft.com.
   * @return bogus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether to check if the email address is fictitious. For example, bgates@microsoft.com.")

  public String getBogus() {
    return bogus;
  }


  public void setBogus(String bogus) {
    this.bogus = bogus;
  }


  public ValidateEmailAddressInputRow role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Specifies whether to check if the email address has a non-personal handle, such as info@, sales@, or webmaster@. For example, sales@example.com.
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether to check if the email address has a non-personal handle, such as info@, sales@, or webmaster@. For example, sales@example.com.")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public ValidateEmailAddressInputRow emps(String emps) {
    
    this.emps = emps;
    return this;
  }

   /**
   * Specifies whether to check if the email address appears on the Direct Marketing Association&#39;s Do Not Email list (Electronic Mail Preference Service).
   * @return emps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether to check if the email address appears on the Direct Marketing Association's Do Not Email list (Electronic Mail Preference Service).")

  public String getEmps() {
    return emps;
  }


  public void setEmps(String emps) {
    this.emps = emps;
  }


  public ValidateEmailAddressInputRow fccwireless(String fccwireless) {
    
    this.fccwireless = fccwireless;
    return this;
  }

   /**
   * Specifies whether to check if the email address is associated with a domain that has restrictions on commercial email per the FCC.
   * @return fccwireless
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether to check if the email address is associated with a domain that has restrictions on commercial email per the FCC.")

  public String getFccwireless() {
    return fccwireless;
  }


  public void setFccwireless(String fccwireless) {
    this.fccwireless = fccwireless;
  }


  public ValidateEmailAddressInputRow language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Specifies whether to check if the email address handle contains derogatory words.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether to check if the email address handle contains derogatory words.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public ValidateEmailAddressInputRow complain(String complain) {
    
    this.complain = complain;
    return this;
  }

   /**
   * Specifies whether to check if the owner of the email address is known to submit spam complaints.
   * @return complain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether to check if the owner of the email address is known to submit spam complaints.")

  public String getComplain() {
    return complain;
  }


  public void setComplain(String complain) {
    this.complain = complain;
  }


  public ValidateEmailAddressInputRow disposable(String disposable) {
    
    this.disposable = disposable;
    return this;
  }

   /**
   * Specifies whether to check if the email address originates from a website that provides temporary email addresses, or if the email address appears to be temporary
   * @return disposable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether to check if the email address originates from a website that provides temporary email addresses, or if the email address appears to be temporary")

  public String getDisposable() {
    return disposable;
  }


  public void setDisposable(String disposable) {
    this.disposable = disposable;
  }


  public ValidateEmailAddressInputRow atc(String atc) {
    
    this.atc = atc;
    return this;
  }

   /**
   * One character code controlling the advanced suggestion behavior.The possible values are: a, c, and n
   * @return atc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One character code controlling the advanced suggestion behavior.The possible values are: a, c, and n")

  public String getAtc() {
    return atc;
  }


  public void setAtc(String atc) {
    this.atc = atc;
  }


  public ValidateEmailAddressInputRow emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address you want to validate.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address you want to validate.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public ValidateEmailAddressInputRow rtcTimeout(String rtcTimeout) {
    
    this.rtcTimeout = rtcTimeout;
    return this;
  }

   /**
   * Specifies the timeout for real-time confirmation. See the description of the rtc parameter. Specify the timeout value in milliseconds. Valid values are 0 to 4000. By default, the system allows 1200 milliseconds for this check.
   * @return rtcTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the timeout for real-time confirmation. See the description of the rtc parameter. Specify the timeout value in milliseconds. Valid values are 0 to 4000. By default, the system allows 1200 milliseconds for this check.")

  public String getRtcTimeout() {
    return rtcTimeout;
  }


  public void setRtcTimeout(String rtcTimeout) {
    this.rtcTimeout = rtcTimeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateEmailAddressInputRow validateEmailAddressInputRow = (ValidateEmailAddressInputRow) o;
    return Objects.equals(this.userFields, validateEmailAddressInputRow.userFields) &&
        Objects.equals(this.rtc, validateEmailAddressInputRow.rtc) &&
        Objects.equals(this.bogus, validateEmailAddressInputRow.bogus) &&
        Objects.equals(this.role, validateEmailAddressInputRow.role) &&
        Objects.equals(this.emps, validateEmailAddressInputRow.emps) &&
        Objects.equals(this.fccwireless, validateEmailAddressInputRow.fccwireless) &&
        Objects.equals(this.language, validateEmailAddressInputRow.language) &&
        Objects.equals(this.complain, validateEmailAddressInputRow.complain) &&
        Objects.equals(this.disposable, validateEmailAddressInputRow.disposable) &&
        Objects.equals(this.atc, validateEmailAddressInputRow.atc) &&
        Objects.equals(this.emailAddress, validateEmailAddressInputRow.emailAddress) &&
        Objects.equals(this.rtcTimeout, validateEmailAddressInputRow.rtcTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, rtc, bogus, role, emps, fccwireless, language, complain, disposable, atc, emailAddress, rtcTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateEmailAddressInputRow {\n");
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    rtc: ").append(toIndentedString(rtc)).append("\n");
    sb.append("    bogus: ").append(toIndentedString(bogus)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    emps: ").append(toIndentedString(emps)).append("\n");
    sb.append("    fccwireless: ").append(toIndentedString(fccwireless)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    complain: ").append(toIndentedString(complain)).append("\n");
    sb.append("    disposable: ").append(toIndentedString(disposable)).append("\n");
    sb.append("    atc: ").append(toIndentedString(atc)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    rtcTimeout: ").append(toIndentedString(rtcTimeout)).append("\n");
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

