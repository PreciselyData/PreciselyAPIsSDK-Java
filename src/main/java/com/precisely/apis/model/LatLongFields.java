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
import com.precisely.apis.model.Geometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * LatLongFields
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class LatLongFields   {
  @SerializedName("matchCode")
  private String matchCode = null;

  @SerializedName("matchLevel")
  private String matchLevel = null;

  @SerializedName("streetMatchCode")
  private String streetMatchCode = null;

  @SerializedName("streetMatchLevel")
  private String streetMatchLevel = null;

  @SerializedName("geometry")
  private Geometry geometry = null;

  public LatLongFields matchCode(String matchCode) {
    this.matchCode = matchCode;
    return this;
  }

   /**
   * Get matchCode
   * @return matchCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchCode() {
    return matchCode;
  }

  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }

  public LatLongFields matchLevel(String matchLevel) {
    this.matchLevel = matchLevel;
    return this;
  }

   /**
   * Get matchLevel
   * @return matchLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchLevel() {
    return matchLevel;
  }

  public void setMatchLevel(String matchLevel) {
    this.matchLevel = matchLevel;
  }

  public LatLongFields streetMatchCode(String streetMatchCode) {
    this.streetMatchCode = streetMatchCode;
    return this;
  }

   /**
   * Get streetMatchCode
   * @return streetMatchCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreetMatchCode() {
    return streetMatchCode;
  }

  public void setStreetMatchCode(String streetMatchCode) {
    this.streetMatchCode = streetMatchCode;
  }

  public LatLongFields streetMatchLevel(String streetMatchLevel) {
    this.streetMatchLevel = streetMatchLevel;
    return this;
  }

   /**
   * Get streetMatchLevel
   * @return streetMatchLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreetMatchLevel() {
    return streetMatchLevel;
  }

  public void setStreetMatchLevel(String streetMatchLevel) {
    this.streetMatchLevel = streetMatchLevel;
  }

  public LatLongFields geometry(Geometry geometry) {
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
    LatLongFields latLongFields = (LatLongFields) o;
    return Objects.equals(this.matchCode, latLongFields.matchCode) &&
        Objects.equals(this.matchLevel, latLongFields.matchLevel) &&
        Objects.equals(this.streetMatchCode, latLongFields.streetMatchCode) &&
        Objects.equals(this.streetMatchLevel, latLongFields.streetMatchLevel) &&
        Objects.equals(this.geometry, latLongFields.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCode, matchLevel, streetMatchCode, streetMatchLevel, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatLongFields {\n");
    
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
    sb.append("    matchLevel: ").append(toIndentedString(matchLevel)).append("\n");
    sb.append("    streetMatchCode: ").append(toIndentedString(streetMatchCode)).append("\n");
    sb.append("    streetMatchLevel: ").append(toIndentedString(streetMatchLevel)).append("\n");
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

