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
 * ValidateMailingAddressOptions
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T18:29:18.933+05:30")
public class ValidateMailingAddressOptions   {
  @SerializedName("OutputCasing")
  private String outputCasing = "M";

  public ValidateMailingAddressOptions outputCasing(String outputCasing) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressOptions validateMailingAddressOptions = (ValidateMailingAddressOptions) o;
    return Objects.equals(this.outputCasing, validateMailingAddressOptions.outputCasing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputCasing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressOptions {\n");
    
    sb.append("    outputCasing: ").append(toIndentedString(outputCasing)).append("\n");
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

