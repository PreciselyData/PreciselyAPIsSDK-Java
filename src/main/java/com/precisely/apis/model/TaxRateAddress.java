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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * TaxRateAddress
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T18:29:18.933+05:30")
public class TaxRateAddress   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("mainAddressLine")
  private String mainAddressLine = null;

  @SerializedName("placeName")
  private String placeName = null;

  @SerializedName("areaName1")
  private String areaName1 = null;

  @SerializedName("areaName3")
  private String areaName3 = null;

  @SerializedName("postCode1")
  private String postCode1 = null;

  @SerializedName("country")
  private String country = null;

  public TaxRateAddress objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public TaxRateAddress mainAddressLine(String mainAddressLine) {
    this.mainAddressLine = mainAddressLine;
    return this;
  }

   /**
   * Get mainAddressLine
   * @return mainAddressLine
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMainAddressLine() {
    return mainAddressLine;
  }

  public void setMainAddressLine(String mainAddressLine) {
    this.mainAddressLine = mainAddressLine;
  }

  public TaxRateAddress placeName(String placeName) {
    this.placeName = placeName;
    return this;
  }

   /**
   * Get placeName
   * @return placeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlaceName() {
    return placeName;
  }

  public void setPlaceName(String placeName) {
    this.placeName = placeName;
  }

  public TaxRateAddress areaName1(String areaName1) {
    this.areaName1 = areaName1;
    return this;
  }

   /**
   * Get areaName1
   * @return areaName1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAreaName1() {
    return areaName1;
  }

  public void setAreaName1(String areaName1) {
    this.areaName1 = areaName1;
  }

  public TaxRateAddress areaName3(String areaName3) {
    this.areaName3 = areaName3;
    return this;
  }

   /**
   * Get areaName3
   * @return areaName3
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAreaName3() {
    return areaName3;
  }

  public void setAreaName3(String areaName3) {
    this.areaName3 = areaName3;
  }

  public TaxRateAddress postCode1(String postCode1) {
    this.postCode1 = postCode1;
    return this;
  }

   /**
   * Get postCode1
   * @return postCode1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostCode1() {
    return postCode1;
  }

  public void setPostCode1(String postCode1) {
    this.postCode1 = postCode1;
  }

  public TaxRateAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRateAddress taxRateAddress = (TaxRateAddress) o;
    return Objects.equals(this.objectId, taxRateAddress.objectId) &&
        Objects.equals(this.mainAddressLine, taxRateAddress.mainAddressLine) &&
        Objects.equals(this.placeName, taxRateAddress.placeName) &&
        Objects.equals(this.areaName1, taxRateAddress.areaName1) &&
        Objects.equals(this.areaName3, taxRateAddress.areaName3) &&
        Objects.equals(this.postCode1, taxRateAddress.postCode1) &&
        Objects.equals(this.country, taxRateAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, mainAddressLine, placeName, areaName1, areaName3, postCode1, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRateAddress {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    mainAddressLine: ").append(toIndentedString(mainAddressLine)).append("\n");
    sb.append("    placeName: ").append(toIndentedString(placeName)).append("\n");
    sb.append("    areaName1: ").append(toIndentedString(areaName1)).append("\n");
    sb.append("    areaName3: ").append(toIndentedString(areaName3)).append("\n");
    sb.append("    postCode1: ").append(toIndentedString(postCode1)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

