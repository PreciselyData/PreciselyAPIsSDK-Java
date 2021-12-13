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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Category
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-08T14:42:40.451+05:30")
public class Category   {
  @SerializedName("categoryCode")
  private String categoryCode = null;

  @SerializedName("tradeDivision")
  private String tradeDivision = null;

  @SerializedName("tradeGroup")
  private String tradeGroup = null;

  @SerializedName("subClass")
  private String subClass = null;

  @SerializedName("class")
  private String PropertyClass = null;

  public Category categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Get categoryCode
   * @return categoryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public Category tradeDivision(String tradeDivision) {
    this.tradeDivision = tradeDivision;
    return this;
  }

   /**
   * Get tradeDivision
   * @return tradeDivision
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTradeDivision() {
    return tradeDivision;
  }

  public void setTradeDivision(String tradeDivision) {
    this.tradeDivision = tradeDivision;
  }

  public Category tradeGroup(String tradeGroup) {
    this.tradeGroup = tradeGroup;
    return this;
  }

   /**
   * Get tradeGroup
   * @return tradeGroup
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTradeGroup() {
    return tradeGroup;
  }

  public void setTradeGroup(String tradeGroup) {
    this.tradeGroup = tradeGroup;
  }

  public Category subClass(String subClass) {
    this.subClass = subClass;
    return this;
  }

   /**
   * Get subClass
   * @return subClass
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubClass() {
    return subClass;
  }

  public void setSubClass(String subClass) {
    this.subClass = subClass;
  }

  public Category PropertyClass(String PropertyClass) {
    this.PropertyClass = PropertyClass;
    return this;
  }

   /**
   * Get PropertyClass
   * @return PropertyClass
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPropertyClass() {
    return PropertyClass;
  }

  public void setPropertyClass(String PropertyClass) {
    this.PropertyClass = PropertyClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.categoryCode, category.categoryCode) &&
        Objects.equals(this.tradeDivision, category.tradeDivision) &&
        Objects.equals(this.tradeGroup, category.tradeGroup) &&
        Objects.equals(this.subClass, category.subClass) &&
        Objects.equals(this.PropertyClass, category.PropertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCode, tradeDivision, tradeGroup, subClass, PropertyClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    tradeDivision: ").append(toIndentedString(tradeDivision)).append("\n");
    sb.append("    tradeGroup: ").append(toIndentedString(tradeGroup)).append("\n");
    sb.append("    subClass: ").append(toIndentedString(subClass)).append("\n");
    sb.append("    PropertyClass: ").append(toIndentedString(PropertyClass)).append("\n");
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

