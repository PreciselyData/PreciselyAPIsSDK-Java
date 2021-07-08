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
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * InputParameter
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class InputParameter   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("defaultValue")
  private String defaultValue = null;

  @SerializedName("lowBoundary")
  private String lowBoundary = null;

  @SerializedName("highBoundary")
  private String highBoundary = null;

  @SerializedName("allowedValuesWithDescriptions")
  private Map<String, Object> allowedValuesWithDescriptions = new HashMap<String, Object>();

  public InputParameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InputParameter description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InputParameter type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InputParameter defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public InputParameter lowBoundary(String lowBoundary) {
    this.lowBoundary = lowBoundary;
    return this;
  }

   /**
   * Get lowBoundary
   * @return lowBoundary
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLowBoundary() {
    return lowBoundary;
  }

  public void setLowBoundary(String lowBoundary) {
    this.lowBoundary = lowBoundary;
  }

  public InputParameter highBoundary(String highBoundary) {
    this.highBoundary = highBoundary;
    return this;
  }

   /**
   * Get highBoundary
   * @return highBoundary
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHighBoundary() {
    return highBoundary;
  }

  public void setHighBoundary(String highBoundary) {
    this.highBoundary = highBoundary;
  }

  public InputParameter allowedValuesWithDescriptions(Map<String, Object> allowedValuesWithDescriptions) {
    this.allowedValuesWithDescriptions = allowedValuesWithDescriptions;
    return this;
  }

   /**
   * Get allowedValuesWithDescriptions
   * @return allowedValuesWithDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getAllowedValuesWithDescriptions() {
    return allowedValuesWithDescriptions;
  }

  public void setAllowedValuesWithDescriptions(Map<String, Object> allowedValuesWithDescriptions) {
    this.allowedValuesWithDescriptions = allowedValuesWithDescriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputParameter inputParameter = (InputParameter) o;
    return Objects.equals(this.name, inputParameter.name) &&
        Objects.equals(this.description, inputParameter.description) &&
        Objects.equals(this.type, inputParameter.type) &&
        Objects.equals(this.defaultValue, inputParameter.defaultValue) &&
        Objects.equals(this.lowBoundary, inputParameter.lowBoundary) &&
        Objects.equals(this.highBoundary, inputParameter.highBoundary) &&
        Objects.equals(this.allowedValuesWithDescriptions, inputParameter.allowedValuesWithDescriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, defaultValue, lowBoundary, highBoundary, allowedValuesWithDescriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputParameter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    lowBoundary: ").append(toIndentedString(lowBoundary)).append("\n");
    sb.append("    highBoundary: ").append(toIndentedString(highBoundary)).append("\n");
    sb.append("    allowedValuesWithDescriptions: ").append(toIndentedString(allowedValuesWithDescriptions)).append("\n");
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

