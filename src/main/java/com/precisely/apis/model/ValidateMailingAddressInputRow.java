/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 9.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.precisely.apis.model.ValidateMailingAddressInputRowUserFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ValidateMailingAddressInputRow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T18:29:18.933+05:30")
public class ValidateMailingAddressInputRow   {
  @SerializedName("user_fields")
  private List<ValidateMailingAddressInputRowUserFields> userFields = new ArrayList<ValidateMailingAddressInputRowUserFields>();

  @SerializedName("AddressLine1")
  private String addressLine1 = null;

  @SerializedName("AddressLine2")
  private String addressLine2 = null;

  @SerializedName("FirmName")
  private String firmName = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("StateProvince")
  private String stateProvince = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  public ValidateMailingAddressInputRow userFields(List<ValidateMailingAddressInputRowUserFields> userFields) {
    this.userFields = userFields;
    return this;
  }

   /**
   * These fields are returned, unmodified, in the user_fields section of the response.
   * @return userFields
  **/
  @ApiModelProperty(example = "null", value = "These fields are returned, unmodified, in the user_fields section of the response.")
  public List<ValidateMailingAddressInputRowUserFields> getUserFields() {
    return userFields;
  }

  public void setUserFields(List<ValidateMailingAddressInputRowUserFields> userFields) {
    this.userFields = userFields;
  }

  public ValidateMailingAddressInputRow addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first address line.
   * @return addressLine1
  **/
  @ApiModelProperty(example = "null", value = "The first address line.")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public ValidateMailingAddressInputRow addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second address line.
   * @return addressLine2
  **/
  @ApiModelProperty(example = "null", value = "The second address line.")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public ValidateMailingAddressInputRow firmName(String firmName) {
    this.firmName = firmName;
    return this;
  }

   /**
   * The company or firm name.
   * @return firmName
  **/
  @ApiModelProperty(example = "null", value = "The company or firm name.")
  public String getFirmName() {
    return firmName;
  }

  public void setFirmName(String firmName) {
    this.firmName = firmName;
  }

  public ValidateMailingAddressInputRow city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city name.
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "The city name.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ValidateMailingAddressInputRow stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * The state or province.
   * @return stateProvince
  **/
  @ApiModelProperty(example = "null", value = "The state or province.")
  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  public ValidateMailingAddressInputRow country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country code or name.
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "The country code or name.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ValidateMailingAddressInputRow postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code for the address.
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", value = "The postal code for the address.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressInputRow validateMailingAddressInputRow = (ValidateMailingAddressInputRow) o;
    return Objects.equals(this.userFields, validateMailingAddressInputRow.userFields) &&
        Objects.equals(this.addressLine1, validateMailingAddressInputRow.addressLine1) &&
        Objects.equals(this.addressLine2, validateMailingAddressInputRow.addressLine2) &&
        Objects.equals(this.firmName, validateMailingAddressInputRow.firmName) &&
        Objects.equals(this.city, validateMailingAddressInputRow.city) &&
        Objects.equals(this.stateProvince, validateMailingAddressInputRow.stateProvince) &&
        Objects.equals(this.country, validateMailingAddressInputRow.country) &&
        Objects.equals(this.postalCode, validateMailingAddressInputRow.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, addressLine1, addressLine2, firmName, city, stateProvince, country, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressInputRow {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

