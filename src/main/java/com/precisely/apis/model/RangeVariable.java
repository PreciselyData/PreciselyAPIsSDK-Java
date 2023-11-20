/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 17.1.0
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
import com.precisely.apis.model.Field;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RangeVariable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T12:58:41.974187600+05:30[Asia/Calcutta]")
public class RangeVariable {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private String count;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BASE_VARIABLE = "baseVariable";
  @SerializedName(SERIALIZED_NAME_BASE_VARIABLE)
  private String baseVariable;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private List<Field> field = new ArrayList<Field>();

  public RangeVariable() { 
  }

  public RangeVariable count(String count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCount() {
    return count;
  }


  public void setCount(String count) {
    this.count = count;
  }


  public RangeVariable order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    this.order = order;
  }


  public RangeVariable name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RangeVariable alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public RangeVariable description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RangeVariable baseVariable(String baseVariable) {
    
    this.baseVariable = baseVariable;
    return this;
  }

   /**
   * Get baseVariable
   * @return baseVariable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBaseVariable() {
    return baseVariable;
  }


  public void setBaseVariable(String baseVariable) {
    this.baseVariable = baseVariable;
  }


  public RangeVariable year(String year) {
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    this.year = year;
  }


  public RangeVariable field(List<Field> field) {
    
    this.field = field;
    return this;
  }

  public RangeVariable addFieldItem(Field fieldItem) {
    this.field.add(fieldItem);
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Field> getField() {
    return field;
  }


  public void setField(List<Field> field) {
    this.field = field;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeVariable rangeVariable = (RangeVariable) o;
    return Objects.equals(this.count, rangeVariable.count) &&
        Objects.equals(this.order, rangeVariable.order) &&
        Objects.equals(this.name, rangeVariable.name) &&
        Objects.equals(this.alias, rangeVariable.alias) &&
        Objects.equals(this.description, rangeVariable.description) &&
        Objects.equals(this.baseVariable, rangeVariable.baseVariable) &&
        Objects.equals(this.year, rangeVariable.year) &&
        Objects.equals(this.field, rangeVariable.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, order, name, alias, description, baseVariable, year, field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeVariable {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    baseVariable: ").append(toIndentedString(baseVariable)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

