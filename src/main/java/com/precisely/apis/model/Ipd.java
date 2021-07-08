/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.1
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
import com.precisely.apis.model.BoundaryBuffer;
import com.precisely.apis.model.DistrictType;
import com.precisely.apis.model.Rate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Ipd
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class Ipd   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("districtName")
  private String districtName = null;

  @SerializedName("districtType")
  private DistrictType districtType = null;

  @SerializedName("taxCodeDescription")
  private String taxCodeDescription = null;

  @SerializedName("effectiveDate")
  private String effectiveDate = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  @SerializedName("boundaryBuffer")
  private BoundaryBuffer boundaryBuffer = null;

  @SerializedName("rates")
  private List<Rate> rates = new ArrayList<Rate>();

  public Ipd id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Ipd districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

   /**
   * Get districtName
   * @return districtName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public Ipd districtType(DistrictType districtType) {
    this.districtType = districtType;
    return this;
  }

   /**
   * Get districtType
   * @return districtType
  **/
  @ApiModelProperty(example = "null", value = "")
  public DistrictType getDistrictType() {
    return districtType;
  }

  public void setDistrictType(DistrictType districtType) {
    this.districtType = districtType;
  }

  public Ipd taxCodeDescription(String taxCodeDescription) {
    this.taxCodeDescription = taxCodeDescription;
    return this;
  }

   /**
   * Get taxCodeDescription
   * @return taxCodeDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTaxCodeDescription() {
    return taxCodeDescription;
  }

  public void setTaxCodeDescription(String taxCodeDescription) {
    this.taxCodeDescription = taxCodeDescription;
  }

  public Ipd effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public Ipd expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Ipd boundaryBuffer(BoundaryBuffer boundaryBuffer) {
    this.boundaryBuffer = boundaryBuffer;
    return this;
  }

   /**
   * Get boundaryBuffer
   * @return boundaryBuffer
  **/
  @ApiModelProperty(example = "null", value = "")
  public BoundaryBuffer getBoundaryBuffer() {
    return boundaryBuffer;
  }

  public void setBoundaryBuffer(BoundaryBuffer boundaryBuffer) {
    this.boundaryBuffer = boundaryBuffer;
  }

  public Ipd rates(List<Rate> rates) {
    this.rates = rates;
    return this;
  }

   /**
   * Get rates
   * @return rates
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Rate> getRates() {
    return rates;
  }

  public void setRates(List<Rate> rates) {
    this.rates = rates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ipd ipd = (Ipd) o;
    return Objects.equals(this.id, ipd.id) &&
        Objects.equals(this.districtName, ipd.districtName) &&
        Objects.equals(this.districtType, ipd.districtType) &&
        Objects.equals(this.taxCodeDescription, ipd.taxCodeDescription) &&
        Objects.equals(this.effectiveDate, ipd.effectiveDate) &&
        Objects.equals(this.expirationDate, ipd.expirationDate) &&
        Objects.equals(this.boundaryBuffer, ipd.boundaryBuffer) &&
        Objects.equals(this.rates, ipd.rates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, districtName, districtType, taxCodeDescription, effectiveDate, expirationDate, boundaryBuffer, rates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ipd {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    districtType: ").append(toIndentedString(districtType)).append("\n");
    sb.append("    taxCodeDescription: ").append(toIndentedString(taxCodeDescription)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    boundaryBuffer: ").append(toIndentedString(boundaryBuffer)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
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

