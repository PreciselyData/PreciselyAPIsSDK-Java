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
import com.precisely.apis.model.GeoRiskBoundaries;
import com.precisely.apis.model.GeoRiskCrimeTheme;
import com.precisely.apis.model.MatchedAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * CrimeRiskResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-23T11:56:04.654+05:30")
public class CrimeRiskResponse   {
  @SerializedName("themes")
  private List<GeoRiskCrimeTheme> themes = new ArrayList<GeoRiskCrimeTheme>();

  @SerializedName("boundaries")
  private GeoRiskBoundaries boundaries = null;

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  public CrimeRiskResponse themes(List<GeoRiskCrimeTheme> themes) {
    this.themes = themes;
    return this;
  }

   /**
   * Get themes
   * @return themes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<GeoRiskCrimeTheme> getThemes() {
    return themes;
  }

  public void setThemes(List<GeoRiskCrimeTheme> themes) {
    this.themes = themes;
  }

  public CrimeRiskResponse boundaries(GeoRiskBoundaries boundaries) {
    this.boundaries = boundaries;
    return this;
  }

   /**
   * Get boundaries
   * @return boundaries
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeoRiskBoundaries getBoundaries() {
    return boundaries;
  }

  public void setBoundaries(GeoRiskBoundaries boundaries) {
    this.boundaries = boundaries;
  }

  public CrimeRiskResponse matchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchedAddress getMatchedAddress() {
    return matchedAddress;
  }

  public void setMatchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrimeRiskResponse crimeRiskResponse = (CrimeRiskResponse) o;
    return Objects.equals(this.themes, crimeRiskResponse.themes) &&
        Objects.equals(this.boundaries, crimeRiskResponse.boundaries) &&
        Objects.equals(this.matchedAddress, crimeRiskResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(themes, boundaries, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrimeRiskResponse {\n");
    
    sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
    sb.append("    boundaries: ").append(toIndentedString(boundaries)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
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

