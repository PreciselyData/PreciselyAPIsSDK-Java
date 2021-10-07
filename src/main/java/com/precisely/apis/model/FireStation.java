/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.5.0
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
import com.precisely.apis.model.Distance;
import com.precisely.apis.model.FireDepartment;
import com.precisely.apis.model.FireStationContactDetails;
import com.precisely.apis.model.Geometry;
import com.precisely.apis.model.Time;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * FireStation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-23T11:56:04.654+05:30")
public class FireStation   {
  @SerializedName("numWithinDepartment")
  private String numWithinDepartment = null;

  @SerializedName("locationReference")
  private String locationReference = null;

  @SerializedName("travelDistance")
  private Distance travelDistance = null;

  @SerializedName("travelTime")
  private Time travelTime = null;

  @SerializedName("contactDetails")
  private FireStationContactDetails contactDetails = null;

  @SerializedName("fireDepartment")
  private FireDepartment fireDepartment = null;

  @SerializedName("geometry")
  private Geometry geometry = null;

  public FireStation numWithinDepartment(String numWithinDepartment) {
    this.numWithinDepartment = numWithinDepartment;
    return this;
  }

   /**
   * Get numWithinDepartment
   * @return numWithinDepartment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumWithinDepartment() {
    return numWithinDepartment;
  }

  public void setNumWithinDepartment(String numWithinDepartment) {
    this.numWithinDepartment = numWithinDepartment;
  }

  public FireStation locationReference(String locationReference) {
    this.locationReference = locationReference;
    return this;
  }

   /**
   * Get locationReference
   * @return locationReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocationReference() {
    return locationReference;
  }

  public void setLocationReference(String locationReference) {
    this.locationReference = locationReference;
  }

  public FireStation travelDistance(Distance travelDistance) {
    this.travelDistance = travelDistance;
    return this;
  }

   /**
   * Get travelDistance
   * @return travelDistance
  **/
  @ApiModelProperty(example = "null", value = "")
  public Distance getTravelDistance() {
    return travelDistance;
  }

  public void setTravelDistance(Distance travelDistance) {
    this.travelDistance = travelDistance;
  }

  public FireStation travelTime(Time travelTime) {
    this.travelTime = travelTime;
    return this;
  }

   /**
   * Get travelTime
   * @return travelTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Time getTravelTime() {
    return travelTime;
  }

  public void setTravelTime(Time travelTime) {
    this.travelTime = travelTime;
  }

  public FireStation contactDetails(FireStationContactDetails contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Get contactDetails
   * @return contactDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public FireStationContactDetails getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(FireStationContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }

  public FireStation fireDepartment(FireDepartment fireDepartment) {
    this.fireDepartment = fireDepartment;
    return this;
  }

   /**
   * Get fireDepartment
   * @return fireDepartment
  **/
  @ApiModelProperty(example = "null", value = "")
  public FireDepartment getFireDepartment() {
    return fireDepartment;
  }

  public void setFireDepartment(FireDepartment fireDepartment) {
    this.fireDepartment = fireDepartment;
  }

  public FireStation geometry(Geometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireStation fireStation = (FireStation) o;
    return Objects.equals(this.numWithinDepartment, fireStation.numWithinDepartment) &&
        Objects.equals(this.locationReference, fireStation.locationReference) &&
        Objects.equals(this.travelDistance, fireStation.travelDistance) &&
        Objects.equals(this.travelTime, fireStation.travelTime) &&
        Objects.equals(this.contactDetails, fireStation.contactDetails) &&
        Objects.equals(this.fireDepartment, fireStation.fireDepartment) &&
        Objects.equals(this.geometry, fireStation.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numWithinDepartment, locationReference, travelDistance, travelTime, contactDetails, fireDepartment, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireStation {\n");
    
    sb.append("    numWithinDepartment: ").append(toIndentedString(numWithinDepartment)).append("\n");
    sb.append("    locationReference: ").append(toIndentedString(locationReference)).append("\n");
    sb.append("    travelDistance: ").append(toIndentedString(travelDistance)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    fireDepartment: ").append(toIndentedString(fireDepartment)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

