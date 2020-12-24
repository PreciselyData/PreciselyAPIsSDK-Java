/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 10.0.0
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
 * IdentityName
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-22T15:11:18.794+05:30")
public class IdentityName   {
  @SerializedName("given")
  private String given = null;

  @SerializedName("family")
  private String family = null;

  public IdentityName given(String given) {
    this.given = given;
    return this;
  }

   /**
   * Get given
   * @return given
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGiven() {
    return given;
  }

  public void setGiven(String given) {
    this.given = given;
  }

  public IdentityName family(String family) {
    this.family = family;
    return this;
  }

   /**
   * Get family
   * @return family
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityName identityName = (IdentityName) o;
    return Objects.equals(this.given, identityName.given) &&
        Objects.equals(this.family, identityName.family);
  }

  @Override
  public int hashCode() {
    return Objects.hash(given, family);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityName {\n");
    
    sb.append("    given: ").append(toIndentedString(given)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
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
