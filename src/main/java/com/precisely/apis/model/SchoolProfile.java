/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.8.0
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
import com.precisely.apis.model.FreeOrReducedPriceLunches;
import com.precisely.apis.model.StudentEthnicity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SchoolProfile
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-17T18:45:55.748+05:30")
public class SchoolProfile   {
  @SerializedName("blueRibbon")
  private String blueRibbon = null;

  @SerializedName("internationalBaccalaureate")
  private String internationalBaccalaureate = null;

  @SerializedName("titleI")
  private String titleI = null;

  @SerializedName("expensePerStudent")
  private String expensePerStudent = null;

  @SerializedName("studentBelowPovertyPct")
  private String studentBelowPovertyPct = null;

  @SerializedName("advancePlacementClasses")
  private String advancePlacementClasses = null;

  @SerializedName("freeOrReducedPriceLunches")
  private FreeOrReducedPriceLunches freeOrReducedPriceLunches = null;

  @SerializedName("studentEthnicity")
  private StudentEthnicity studentEthnicity = null;

  public SchoolProfile blueRibbon(String blueRibbon) {
    this.blueRibbon = blueRibbon;
    return this;
  }

   /**
   * Get blueRibbon
   * @return blueRibbon
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBlueRibbon() {
    return blueRibbon;
  }

  public void setBlueRibbon(String blueRibbon) {
    this.blueRibbon = blueRibbon;
  }

  public SchoolProfile internationalBaccalaureate(String internationalBaccalaureate) {
    this.internationalBaccalaureate = internationalBaccalaureate;
    return this;
  }

   /**
   * Get internationalBaccalaureate
   * @return internationalBaccalaureate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInternationalBaccalaureate() {
    return internationalBaccalaureate;
  }

  public void setInternationalBaccalaureate(String internationalBaccalaureate) {
    this.internationalBaccalaureate = internationalBaccalaureate;
  }

  public SchoolProfile titleI(String titleI) {
    this.titleI = titleI;
    return this;
  }

   /**
   * Get titleI
   * @return titleI
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitleI() {
    return titleI;
  }

  public void setTitleI(String titleI) {
    this.titleI = titleI;
  }

  public SchoolProfile expensePerStudent(String expensePerStudent) {
    this.expensePerStudent = expensePerStudent;
    return this;
  }

   /**
   * Get expensePerStudent
   * @return expensePerStudent
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExpensePerStudent() {
    return expensePerStudent;
  }

  public void setExpensePerStudent(String expensePerStudent) {
    this.expensePerStudent = expensePerStudent;
  }

  public SchoolProfile studentBelowPovertyPct(String studentBelowPovertyPct) {
    this.studentBelowPovertyPct = studentBelowPovertyPct;
    return this;
  }

   /**
   * Get studentBelowPovertyPct
   * @return studentBelowPovertyPct
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStudentBelowPovertyPct() {
    return studentBelowPovertyPct;
  }

  public void setStudentBelowPovertyPct(String studentBelowPovertyPct) {
    this.studentBelowPovertyPct = studentBelowPovertyPct;
  }

  public SchoolProfile advancePlacementClasses(String advancePlacementClasses) {
    this.advancePlacementClasses = advancePlacementClasses;
    return this;
  }

   /**
   * Get advancePlacementClasses
   * @return advancePlacementClasses
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAdvancePlacementClasses() {
    return advancePlacementClasses;
  }

  public void setAdvancePlacementClasses(String advancePlacementClasses) {
    this.advancePlacementClasses = advancePlacementClasses;
  }

  public SchoolProfile freeOrReducedPriceLunches(FreeOrReducedPriceLunches freeOrReducedPriceLunches) {
    this.freeOrReducedPriceLunches = freeOrReducedPriceLunches;
    return this;
  }

   /**
   * Get freeOrReducedPriceLunches
   * @return freeOrReducedPriceLunches
  **/
  @ApiModelProperty(example = "null", value = "")
  public FreeOrReducedPriceLunches getFreeOrReducedPriceLunches() {
    return freeOrReducedPriceLunches;
  }

  public void setFreeOrReducedPriceLunches(FreeOrReducedPriceLunches freeOrReducedPriceLunches) {
    this.freeOrReducedPriceLunches = freeOrReducedPriceLunches;
  }

  public SchoolProfile studentEthnicity(StudentEthnicity studentEthnicity) {
    this.studentEthnicity = studentEthnicity;
    return this;
  }

   /**
   * Get studentEthnicity
   * @return studentEthnicity
  **/
  @ApiModelProperty(example = "null", value = "")
  public StudentEthnicity getStudentEthnicity() {
    return studentEthnicity;
  }

  public void setStudentEthnicity(StudentEthnicity studentEthnicity) {
    this.studentEthnicity = studentEthnicity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchoolProfile schoolProfile = (SchoolProfile) o;
    return Objects.equals(this.blueRibbon, schoolProfile.blueRibbon) &&
        Objects.equals(this.internationalBaccalaureate, schoolProfile.internationalBaccalaureate) &&
        Objects.equals(this.titleI, schoolProfile.titleI) &&
        Objects.equals(this.expensePerStudent, schoolProfile.expensePerStudent) &&
        Objects.equals(this.studentBelowPovertyPct, schoolProfile.studentBelowPovertyPct) &&
        Objects.equals(this.advancePlacementClasses, schoolProfile.advancePlacementClasses) &&
        Objects.equals(this.freeOrReducedPriceLunches, schoolProfile.freeOrReducedPriceLunches) &&
        Objects.equals(this.studentEthnicity, schoolProfile.studentEthnicity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueRibbon, internationalBaccalaureate, titleI, expensePerStudent, studentBelowPovertyPct, advancePlacementClasses, freeOrReducedPriceLunches, studentEthnicity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolProfile {\n");
    
    sb.append("    blueRibbon: ").append(toIndentedString(blueRibbon)).append("\n");
    sb.append("    internationalBaccalaureate: ").append(toIndentedString(internationalBaccalaureate)).append("\n");
    sb.append("    titleI: ").append(toIndentedString(titleI)).append("\n");
    sb.append("    expensePerStudent: ").append(toIndentedString(expensePerStudent)).append("\n");
    sb.append("    studentBelowPovertyPct: ").append(toIndentedString(studentBelowPovertyPct)).append("\n");
    sb.append("    advancePlacementClasses: ").append(toIndentedString(advancePlacementClasses)).append("\n");
    sb.append("    freeOrReducedPriceLunches: ").append(toIndentedString(freeOrReducedPriceLunches)).append("\n");
    sb.append("    studentEthnicity: ").append(toIndentedString(studentEthnicity)).append("\n");
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

