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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ValidateMailingAddressPremiumOptions
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class ValidateMailingAddressPremiumOptions   {
  @SerializedName("OutputAddressBlocks")
  private String outputAddressBlocks = "Y";

  @SerializedName("KeepMultimatch")
  private String keepMultimatch = "N";

  @SerializedName("OutputCountryFormat")
  private String outputCountryFormat = "E";

  @SerializedName("OutputRecordType")
  private String outputRecordType = "A";

  @SerializedName("OutputFieldLevelReturnCodes")
  private String outputFieldLevelReturnCodes = "N";

  @SerializedName("OutputScript")
  private String outputScript = "InputScript";

  @SerializedName("OutputCasing")
  private String outputCasing = "M";

  @SerializedName("MaximumResults")
  private String maximumResults = "10";

  public ValidateMailingAddressPremiumOptions outputAddressBlocks(String outputAddressBlocks) {
    this.outputAddressBlocks = outputAddressBlocks;
    return this;
  }

   /**
   * Specifies whether to return a formatted version of the address as it would be printed on a physical mail piece.
   * @return outputAddressBlocks
  **/
  @ApiModelProperty(example = "null", value = "Specifies whether to return a formatted version of the address as it would be printed on a physical mail piece.")
  public String getOutputAddressBlocks() {
    return outputAddressBlocks;
  }

  public void setOutputAddressBlocks(String outputAddressBlocks) {
    this.outputAddressBlocks = outputAddressBlocks;
  }

  public ValidateMailingAddressPremiumOptions keepMultimatch(String keepMultimatch) {
    this.keepMultimatch = keepMultimatch;
    return this;
  }

   /**
   * Specifies whether to return multiple address for those input addresses that have more than one possible match.
   * @return keepMultimatch
  **/
  @ApiModelProperty(example = "null", value = "Specifies whether to return multiple address for those input addresses that have more than one possible match.")
  public String getKeepMultimatch() {
    return keepMultimatch;
  }

  public void setKeepMultimatch(String keepMultimatch) {
    this.keepMultimatch = keepMultimatch;
  }

  public ValidateMailingAddressPremiumOptions outputCountryFormat(String outputCountryFormat) {
    this.outputCountryFormat = outputCountryFormat;
    return this;
  }

   /**
   * Specifies the format to use for the country name returned in the Country output field.
   * @return outputCountryFormat
  **/
  @ApiModelProperty(example = "null", value = "Specifies the format to use for the country name returned in the Country output field.")
  public String getOutputCountryFormat() {
    return outputCountryFormat;
  }

  public void setOutputCountryFormat(String outputCountryFormat) {
    this.outputCountryFormat = outputCountryFormat;
  }

  public ValidateMailingAddressPremiumOptions outputRecordType(String outputRecordType) {
    this.outputRecordType = outputRecordType;
    return this;
  }

   /**
   * Specifies the type of output record you get.
   * @return outputRecordType
  **/
  @ApiModelProperty(example = "null", value = "Specifies the type of output record you get.")
  public String getOutputRecordType() {
    return outputRecordType;
  }

  public void setOutputRecordType(String outputRecordType) {
    this.outputRecordType = outputRecordType;
  }

  public ValidateMailingAddressPremiumOptions outputFieldLevelReturnCodes(String outputFieldLevelReturnCodes) {
    this.outputFieldLevelReturnCodes = outputFieldLevelReturnCodes;
    return this;
  }

   /**
   * Specifies whether to include field-level result indicators.
   * @return outputFieldLevelReturnCodes
  **/
  @ApiModelProperty(example = "null", value = "Specifies whether to include field-level result indicators.")
  public String getOutputFieldLevelReturnCodes() {
    return outputFieldLevelReturnCodes;
  }

  public void setOutputFieldLevelReturnCodes(String outputFieldLevelReturnCodes) {
    this.outputFieldLevelReturnCodes = outputFieldLevelReturnCodes;
  }

  public ValidateMailingAddressPremiumOptions outputScript(String outputScript) {
    this.outputScript = outputScript;
    return this;
  }

   /**
   * Specifies the alphabet or script in which the output should be returned.
   * @return outputScript
  **/
  @ApiModelProperty(example = "null", value = "Specifies the alphabet or script in which the output should be returned.")
  public String getOutputScript() {
    return outputScript;
  }

  public void setOutputScript(String outputScript) {
    this.outputScript = outputScript;
  }

  public ValidateMailingAddressPremiumOptions outputCasing(String outputCasing) {
    this.outputCasing = outputCasing;
    return this;
  }

   /**
   * Specify the casing of the output data.
   * @return outputCasing
  **/
  @ApiModelProperty(example = "null", value = "Specify the casing of the output data.")
  public String getOutputCasing() {
    return outputCasing;
  }

  public void setOutputCasing(String outputCasing) {
    this.outputCasing = outputCasing;
  }

  public ValidateMailingAddressPremiumOptions maximumResults(String maximumResults) {
    this.maximumResults = maximumResults;
    return this;
  }

   /**
   * A number between 1 and 10 that indicates the maximum number of addresses to return.
   * @return maximumResults
  **/
  @ApiModelProperty(example = "null", value = "A number between 1 and 10 that indicates the maximum number of addresses to return.")
  public String getMaximumResults() {
    return maximumResults;
  }

  public void setMaximumResults(String maximumResults) {
    this.maximumResults = maximumResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressPremiumOptions validateMailingAddressPremiumOptions = (ValidateMailingAddressPremiumOptions) o;
    return Objects.equals(this.outputAddressBlocks, validateMailingAddressPremiumOptions.outputAddressBlocks) &&
        Objects.equals(this.keepMultimatch, validateMailingAddressPremiumOptions.keepMultimatch) &&
        Objects.equals(this.outputCountryFormat, validateMailingAddressPremiumOptions.outputCountryFormat) &&
        Objects.equals(this.outputRecordType, validateMailingAddressPremiumOptions.outputRecordType) &&
        Objects.equals(this.outputFieldLevelReturnCodes, validateMailingAddressPremiumOptions.outputFieldLevelReturnCodes) &&
        Objects.equals(this.outputScript, validateMailingAddressPremiumOptions.outputScript) &&
        Objects.equals(this.outputCasing, validateMailingAddressPremiumOptions.outputCasing) &&
        Objects.equals(this.maximumResults, validateMailingAddressPremiumOptions.maximumResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputAddressBlocks, keepMultimatch, outputCountryFormat, outputRecordType, outputFieldLevelReturnCodes, outputScript, outputCasing, maximumResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressPremiumOptions {\n");
    
    sb.append("    outputAddressBlocks: ").append(toIndentedString(outputAddressBlocks)).append("\n");
    sb.append("    keepMultimatch: ").append(toIndentedString(keepMultimatch)).append("\n");
    sb.append("    outputCountryFormat: ").append(toIndentedString(outputCountryFormat)).append("\n");
    sb.append("    outputRecordType: ").append(toIndentedString(outputRecordType)).append("\n");
    sb.append("    outputFieldLevelReturnCodes: ").append(toIndentedString(outputFieldLevelReturnCodes)).append("\n");
    sb.append("    outputScript: ").append(toIndentedString(outputScript)).append("\n");
    sb.append("    outputCasing: ").append(toIndentedString(outputCasing)).append("\n");
    sb.append("    maximumResults: ").append(toIndentedString(maximumResults)).append("\n");
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

