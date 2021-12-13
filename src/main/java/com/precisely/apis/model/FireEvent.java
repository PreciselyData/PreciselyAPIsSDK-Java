/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.7.0
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
import com.precisely.apis.model.Area;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * FireEvent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-08T14:42:40.451+05:30")
public class FireEvent   {
  @SerializedName("fireStartDate")
  private String fireStartDate = null;

  @SerializedName("fireEndDate")
  private String fireEndDate = null;

  @SerializedName("fireName")
  private String fireName = null;

  @SerializedName("area")
  private Area area = null;

  @SerializedName("agency")
  private String agency = null;

  public FireEvent fireStartDate(String fireStartDate) {
    this.fireStartDate = fireStartDate;
    return this;
  }

   /**
   * Get fireStartDate
   * @return fireStartDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFireStartDate() {
    return fireStartDate;
  }

  public void setFireStartDate(String fireStartDate) {
    this.fireStartDate = fireStartDate;
  }

  public FireEvent fireEndDate(String fireEndDate) {
    this.fireEndDate = fireEndDate;
    return this;
  }

   /**
   * Get fireEndDate
   * @return fireEndDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFireEndDate() {
    return fireEndDate;
  }

  public void setFireEndDate(String fireEndDate) {
    this.fireEndDate = fireEndDate;
  }

  public FireEvent fireName(String fireName) {
    this.fireName = fireName;
    return this;
  }

   /**
   * Get fireName
   * @return fireName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFireName() {
    return fireName;
  }

  public void setFireName(String fireName) {
    this.fireName = fireName;
  }

  public FireEvent area(Area area) {
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @ApiModelProperty(example = "null", value = "")
  public Area getArea() {
    return area;
  }

  public void setArea(Area area) {
    this.area = area;
  }

  public FireEvent agency(String agency) {
    this.agency = agency;
    return this;
  }

   /**
   * Get agency
   * @return agency
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireEvent fireEvent = (FireEvent) o;
    return Objects.equals(this.fireStartDate, fireEvent.fireStartDate) &&
        Objects.equals(this.fireEndDate, fireEvent.fireEndDate) &&
        Objects.equals(this.fireName, fireEvent.fireName) &&
        Objects.equals(this.area, fireEvent.area) &&
        Objects.equals(this.agency, fireEvent.agency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fireStartDate, fireEndDate, fireName, area, agency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireEvent {\n");
    
    sb.append("    fireStartDate: ").append(toIndentedString(fireStartDate)).append("\n");
    sb.append("    fireEndDate: ").append(toIndentedString(fireEndDate)).append("\n");
    sb.append("    fireName: ").append(toIndentedString(fireName)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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

