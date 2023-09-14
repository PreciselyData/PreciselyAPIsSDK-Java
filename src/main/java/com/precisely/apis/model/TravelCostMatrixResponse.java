/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 17.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.Matrix;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TravelCostMatrixResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-14T13:16:01.386923100+05:30[Asia/Calcutta]")
public class TravelCostMatrixResponse {
  public static final String SERIALIZED_NAME_MATRIX = "matrix";
  @SerializedName(SERIALIZED_NAME_MATRIX)
  private List<Matrix> matrix = null;

  public TravelCostMatrixResponse() { 
  }

  public TravelCostMatrixResponse matrix(List<Matrix> matrix) {
    
    this.matrix = matrix;
    return this;
  }

  public TravelCostMatrixResponse addMatrixItem(Matrix matrixItem) {
    if (this.matrix == null) {
      this.matrix = new ArrayList<Matrix>();
    }
    this.matrix.add(matrixItem);
    return this;
  }

   /**
   * Get matrix
   * @return matrix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Matrix> getMatrix() {
    return matrix;
  }


  public void setMatrix(List<Matrix> matrix) {
    this.matrix = matrix;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelCostMatrixResponse travelCostMatrixResponse = (TravelCostMatrixResponse) o;
    return Objects.equals(this.matrix, travelCostMatrixResponse.matrix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matrix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelCostMatrixResponse {\n");
    sb.append("    matrix: ").append(toIndentedString(matrix)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

