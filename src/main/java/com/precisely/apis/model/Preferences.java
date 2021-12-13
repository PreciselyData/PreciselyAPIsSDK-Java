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
import com.precisely.apis.model.CustomPreferences;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Preferences
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-08T14:42:40.451+05:30")
public class Preferences   {
  @SerializedName("fallbackToGeographic")
  private String fallbackToGeographic = null;

  @SerializedName("useGeoTaxAuxiliaryFile")
  private String useGeoTaxAuxiliaryFile = null;

  @SerializedName("matchMode")
  private String matchMode = "EXACT";

  @SerializedName("latLongOffset")
  private String latLongOffset = "40";

  @SerializedName("squeeze")
  private String squeeze = null;

  @SerializedName("latLongFormat")
  private String latLongFormat = "Decimal";

  @SerializedName("defaultBufferWidth")
  private String defaultBufferWidth = "0";

  @SerializedName("distanceUnits")
  private String distanceUnits = "Feet";

  @SerializedName("outputCasing")
  private String outputCasing = "M";

  @SerializedName("returnCensusFields")
  private String returnCensusFields = null;

  @SerializedName("returnLatLongFields")
  private String returnLatLongFields = null;

  @SerializedName("customPreferences")
  private CustomPreferences customPreferences = null;

  public Preferences fallbackToGeographic(String fallbackToGeographic) {
    this.fallbackToGeographic = fallbackToGeographic;
    return this;
  }

   /**
   * Get fallbackToGeographic
   * @return fallbackToGeographic
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFallbackToGeographic() {
    return fallbackToGeographic;
  }

  public void setFallbackToGeographic(String fallbackToGeographic) {
    this.fallbackToGeographic = fallbackToGeographic;
  }

  public Preferences useGeoTaxAuxiliaryFile(String useGeoTaxAuxiliaryFile) {
    this.useGeoTaxAuxiliaryFile = useGeoTaxAuxiliaryFile;
    return this;
  }

   /**
   * Get useGeoTaxAuxiliaryFile
   * @return useGeoTaxAuxiliaryFile
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUseGeoTaxAuxiliaryFile() {
    return useGeoTaxAuxiliaryFile;
  }

  public void setUseGeoTaxAuxiliaryFile(String useGeoTaxAuxiliaryFile) {
    this.useGeoTaxAuxiliaryFile = useGeoTaxAuxiliaryFile;
  }

  public Preferences matchMode(String matchMode) {
    this.matchMode = matchMode;
    return this;
  }

   /**
   * Get matchMode
   * @return matchMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchMode() {
    return matchMode;
  }

  public void setMatchMode(String matchMode) {
    this.matchMode = matchMode;
  }

  public Preferences latLongOffset(String latLongOffset) {
    this.latLongOffset = latLongOffset;
    return this;
  }

   /**
   * Get latLongOffset
   * @return latLongOffset
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLatLongOffset() {
    return latLongOffset;
  }

  public void setLatLongOffset(String latLongOffset) {
    this.latLongOffset = latLongOffset;
  }

  public Preferences squeeze(String squeeze) {
    this.squeeze = squeeze;
    return this;
  }

   /**
   * Get squeeze
   * @return squeeze
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSqueeze() {
    return squeeze;
  }

  public void setSqueeze(String squeeze) {
    this.squeeze = squeeze;
  }

  public Preferences latLongFormat(String latLongFormat) {
    this.latLongFormat = latLongFormat;
    return this;
  }

   /**
   * Get latLongFormat
   * @return latLongFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLatLongFormat() {
    return latLongFormat;
  }

  public void setLatLongFormat(String latLongFormat) {
    this.latLongFormat = latLongFormat;
  }

  public Preferences defaultBufferWidth(String defaultBufferWidth) {
    this.defaultBufferWidth = defaultBufferWidth;
    return this;
  }

   /**
   * Get defaultBufferWidth
   * @return defaultBufferWidth
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDefaultBufferWidth() {
    return defaultBufferWidth;
  }

  public void setDefaultBufferWidth(String defaultBufferWidth) {
    this.defaultBufferWidth = defaultBufferWidth;
  }

  public Preferences distanceUnits(String distanceUnits) {
    this.distanceUnits = distanceUnits;
    return this;
  }

   /**
   * Get distanceUnits
   * @return distanceUnits
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDistanceUnits() {
    return distanceUnits;
  }

  public void setDistanceUnits(String distanceUnits) {
    this.distanceUnits = distanceUnits;
  }

  public Preferences outputCasing(String outputCasing) {
    this.outputCasing = outputCasing;
    return this;
  }

   /**
   * Get outputCasing
   * @return outputCasing
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOutputCasing() {
    return outputCasing;
  }

  public void setOutputCasing(String outputCasing) {
    this.outputCasing = outputCasing;
  }

  public Preferences returnCensusFields(String returnCensusFields) {
    this.returnCensusFields = returnCensusFields;
    return this;
  }

   /**
   * Get returnCensusFields
   * @return returnCensusFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReturnCensusFields() {
    return returnCensusFields;
  }

  public void setReturnCensusFields(String returnCensusFields) {
    this.returnCensusFields = returnCensusFields;
  }

  public Preferences returnLatLongFields(String returnLatLongFields) {
    this.returnLatLongFields = returnLatLongFields;
    return this;
  }

   /**
   * Get returnLatLongFields
   * @return returnLatLongFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReturnLatLongFields() {
    return returnLatLongFields;
  }

  public void setReturnLatLongFields(String returnLatLongFields) {
    this.returnLatLongFields = returnLatLongFields;
  }

  public Preferences customPreferences(CustomPreferences customPreferences) {
    this.customPreferences = customPreferences;
    return this;
  }

   /**
   * Get customPreferences
   * @return customPreferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public CustomPreferences getCustomPreferences() {
    return customPreferences;
  }

  public void setCustomPreferences(CustomPreferences customPreferences) {
    this.customPreferences = customPreferences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preferences preferences = (Preferences) o;
    return Objects.equals(this.fallbackToGeographic, preferences.fallbackToGeographic) &&
        Objects.equals(this.useGeoTaxAuxiliaryFile, preferences.useGeoTaxAuxiliaryFile) &&
        Objects.equals(this.matchMode, preferences.matchMode) &&
        Objects.equals(this.latLongOffset, preferences.latLongOffset) &&
        Objects.equals(this.squeeze, preferences.squeeze) &&
        Objects.equals(this.latLongFormat, preferences.latLongFormat) &&
        Objects.equals(this.defaultBufferWidth, preferences.defaultBufferWidth) &&
        Objects.equals(this.distanceUnits, preferences.distanceUnits) &&
        Objects.equals(this.outputCasing, preferences.outputCasing) &&
        Objects.equals(this.returnCensusFields, preferences.returnCensusFields) &&
        Objects.equals(this.returnLatLongFields, preferences.returnLatLongFields) &&
        Objects.equals(this.customPreferences, preferences.customPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fallbackToGeographic, useGeoTaxAuxiliaryFile, matchMode, latLongOffset, squeeze, latLongFormat, defaultBufferWidth, distanceUnits, outputCasing, returnCensusFields, returnLatLongFields, customPreferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preferences {\n");
    
    sb.append("    fallbackToGeographic: ").append(toIndentedString(fallbackToGeographic)).append("\n");
    sb.append("    useGeoTaxAuxiliaryFile: ").append(toIndentedString(useGeoTaxAuxiliaryFile)).append("\n");
    sb.append("    matchMode: ").append(toIndentedString(matchMode)).append("\n");
    sb.append("    latLongOffset: ").append(toIndentedString(latLongOffset)).append("\n");
    sb.append("    squeeze: ").append(toIndentedString(squeeze)).append("\n");
    sb.append("    latLongFormat: ").append(toIndentedString(latLongFormat)).append("\n");
    sb.append("    defaultBufferWidth: ").append(toIndentedString(defaultBufferWidth)).append("\n");
    sb.append("    distanceUnits: ").append(toIndentedString(distanceUnits)).append("\n");
    sb.append("    outputCasing: ").append(toIndentedString(outputCasing)).append("\n");
    sb.append("    returnCensusFields: ").append(toIndentedString(returnCensusFields)).append("\n");
    sb.append("    returnLatLongFields: ").append(toIndentedString(returnLatLongFields)).append("\n");
    sb.append("    customPreferences: ").append(toIndentedString(customPreferences)).append("\n");
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

