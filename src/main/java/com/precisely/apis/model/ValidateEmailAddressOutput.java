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
 * ValidateEmailAddressOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class ValidateEmailAddressOutput {
  public static final String SERIALIZED_NAME_USER_FIELDS = "user_fields";
  @SerializedName(SERIALIZED_NAME_USER_FIELDS)
  private List<GetPostalCodesAPIOutputUserFields> userFields = null;

  public static final String SERIALIZED_NAME_E_M_A_I_L = "EMAIL";
  @SerializedName(SERIALIZED_NAME_E_M_A_I_L)
  private String EMAIL;

  public static final String SERIALIZED_NAME_F_I_N_D_I_N_G = "FINDING";
  @SerializedName(SERIALIZED_NAME_F_I_N_D_I_N_G)
  private String FINDING;

  public static final String SERIALIZED_NAME_C_O_M_M_E_N_T = "COMMENT";
  @SerializedName(SERIALIZED_NAME_C_O_M_M_E_N_T)
  private String COMMENT;

  public static final String SERIALIZED_NAME_C_O_M_M_E_N_T_C_O_D_E = "COMMENT_CODE";
  @SerializedName(SERIALIZED_NAME_C_O_M_M_E_N_T_C_O_D_E)
  private String COMMENT_CODE;

  public static final String SERIALIZED_NAME_S_U_G_G_E_M_A_I_L = "SUGG_EMAIL";
  @SerializedName(SERIALIZED_NAME_S_U_G_G_E_M_A_I_L)
  private String SUGG_EMAIL;

  public static final String SERIALIZED_NAME_S_U_G_G_C_O_M_M_E_N_T = "SUGG_COMMENT";
  @SerializedName(SERIALIZED_NAME_S_U_G_G_C_O_M_M_E_N_T)
  private String SUGG_COMMENT;

  public static final String SERIALIZED_NAME_E_R_R_O_R_R_E_S_P_O_N_S_E = "ERROR_RESPONSE";
  @SerializedName(SERIALIZED_NAME_E_R_R_O_R_R_E_S_P_O_N_S_E)
  private String ERROR_RESPONSE;

  public static final String SERIALIZED_NAME_E_R_R_O_R = "ERROR";
  @SerializedName(SERIALIZED_NAME_E_R_R_O_R)
  private String ERROR;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_CODE = "Status.Code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private String statusCode;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "Status.Description";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public ValidateEmailAddressOutput() { 
  }

  public ValidateEmailAddressOutput userFields(List<GetPostalCodesAPIOutputUserFields> userFields) {
    
    this.userFields = userFields;
    return this;
  }

  public ValidateEmailAddressOutput addUserFieldsItem(GetPostalCodesAPIOutputUserFields userFieldsItem) {
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


  public ValidateEmailAddressOutput EMAIL(String EMAIL) {
    
    this.EMAIL = EMAIL;
    return this;
  }

   /**
   * The email address submitted for verification.
   * @return EMAIL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address submitted for verification.")

  public String getEMAIL() {
    return EMAIL;
  }


  public void setEMAIL(String EMAIL) {
    this.EMAIL = EMAIL;
  }


  public ValidateEmailAddressOutput FINDING(String FINDING) {
    
    this.FINDING = FINDING;
    return this;
  }

   /**
   * One character code indicating the validity of the submitted email address.
   * @return FINDING
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One character code indicating the validity of the submitted email address.")

  public String getFINDING() {
    return FINDING;
  }


  public void setFINDING(String FINDING) {
    this.FINDING = FINDING;
  }


  public ValidateEmailAddressOutput COMMENT(String COMMENT) {
    
    this.COMMENT = COMMENT;
    return this;
  }

   /**
   * The comment string pertaining to the result of the submitted email address.
   * @return COMMENT
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The comment string pertaining to the result of the submitted email address.")

  public String getCOMMENT() {
    return COMMENT;
  }


  public void setCOMMENT(String COMMENT) {
    this.COMMENT = COMMENT;
  }


  public ValidateEmailAddressOutput COMMENT_CODE(String COMMENT_CODE) {
    
    this.COMMENT_CODE = COMMENT_CODE;
    return this;
  }

   /**
   * A short code which maps to each returned COMMENT field value.
   * @return COMMENT_CODE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short code which maps to each returned COMMENT field value.")

  public String getCOMMENTCODE() {
    return COMMENT_CODE;
  }


  public void setCOMMENTCODE(String COMMENT_CODE) {
    this.COMMENT_CODE = COMMENT_CODE;
  }


  public ValidateEmailAddressOutput SUGG_EMAIL(String SUGG_EMAIL) {
    
    this.SUGG_EMAIL = SUGG_EMAIL;
    return this;
  }

   /**
   * Suggested correction for submitted email address, if found. A suggestion will only be provided if it is valid and SafeToDeliver.
   * @return SUGG_EMAIL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suggested correction for submitted email address, if found. A suggestion will only be provided if it is valid and SafeToDeliver.")

  public String getSUGGEMAIL() {
    return SUGG_EMAIL;
  }


  public void setSUGGEMAIL(String SUGG_EMAIL) {
    this.SUGG_EMAIL = SUGG_EMAIL;
  }


  public ValidateEmailAddressOutput SUGG_COMMENT(String SUGG_COMMENT) {
    
    this.SUGG_COMMENT = SUGG_COMMENT;
    return this;
  }

   /**
   * This field contains suggestion not SafeToDeliver when ValidateEmailAddress corrected the address and the corrected version of the email address failed one or more SafeToDeliver process checks.
   * @return SUGG_COMMENT
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field contains suggestion not SafeToDeliver when ValidateEmailAddress corrected the address and the corrected version of the email address failed one or more SafeToDeliver process checks.")

  public String getSUGGCOMMENT() {
    return SUGG_COMMENT;
  }


  public void setSUGGCOMMENT(String SUGG_COMMENT) {
    this.SUGG_COMMENT = SUGG_COMMENT;
  }


  public ValidateEmailAddressOutput ERROR_RESPONSE(String ERROR_RESPONSE) {
    
    this.ERROR_RESPONSE = ERROR_RESPONSE;
    return this;
  }

   /**
   * Pre-formatted response intended to be provided to user.
   * @return ERROR_RESPONSE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pre-formatted response intended to be provided to user.")

  public String getERRORRESPONSE() {
    return ERROR_RESPONSE;
  }


  public void setERRORRESPONSE(String ERROR_RESPONSE) {
    this.ERROR_RESPONSE = ERROR_RESPONSE;
  }


  public ValidateEmailAddressOutput ERROR(String ERROR) {
    
    this.ERROR = ERROR;
    return this;
  }

   /**
   * Field reserved for special features only.
   * @return ERROR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field reserved for special features only.")

  public String getERROR() {
    return ERROR;
  }


  public void setERROR(String ERROR) {
    this.ERROR = ERROR;
  }


  public ValidateEmailAddressOutput status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ValidateEmailAddressOutput statusCode(String statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  public ValidateEmailAddressOutput statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateEmailAddressOutput validateEmailAddressOutput = (ValidateEmailAddressOutput) o;
    return Objects.equals(this.userFields, validateEmailAddressOutput.userFields) &&
        Objects.equals(this.EMAIL, validateEmailAddressOutput.EMAIL) &&
        Objects.equals(this.FINDING, validateEmailAddressOutput.FINDING) &&
        Objects.equals(this.COMMENT, validateEmailAddressOutput.COMMENT) &&
        Objects.equals(this.COMMENT_CODE, validateEmailAddressOutput.COMMENT_CODE) &&
        Objects.equals(this.SUGG_EMAIL, validateEmailAddressOutput.SUGG_EMAIL) &&
        Objects.equals(this.SUGG_COMMENT, validateEmailAddressOutput.SUGG_COMMENT) &&
        Objects.equals(this.ERROR_RESPONSE, validateEmailAddressOutput.ERROR_RESPONSE) &&
        Objects.equals(this.ERROR, validateEmailAddressOutput.ERROR) &&
        Objects.equals(this.status, validateEmailAddressOutput.status) &&
        Objects.equals(this.statusCode, validateEmailAddressOutput.statusCode) &&
        Objects.equals(this.statusDescription, validateEmailAddressOutput.statusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, EMAIL, FINDING, COMMENT, COMMENT_CODE, SUGG_EMAIL, SUGG_COMMENT, ERROR_RESPONSE, ERROR, status, statusCode, statusDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateEmailAddressOutput {\n");
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    EMAIL: ").append(toIndentedString(EMAIL)).append("\n");
    sb.append("    FINDING: ").append(toIndentedString(FINDING)).append("\n");
    sb.append("    COMMENT: ").append(toIndentedString(COMMENT)).append("\n");
    sb.append("    COMMENT_CODE: ").append(toIndentedString(COMMENT_CODE)).append("\n");
    sb.append("    SUGG_EMAIL: ").append(toIndentedString(SUGG_EMAIL)).append("\n");
    sb.append("    SUGG_COMMENT: ").append(toIndentedString(SUGG_COMMENT)).append("\n");
    sb.append("    ERROR_RESPONSE: ").append(toIndentedString(ERROR_RESPONSE)).append("\n");
    sb.append("    ERROR: ").append(toIndentedString(ERROR)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
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

