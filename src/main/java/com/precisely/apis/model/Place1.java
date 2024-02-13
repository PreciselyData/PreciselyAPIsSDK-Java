/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 18.0.0
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
import com.precisely.apis.model.Name1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Place1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-13T16:39:48.889177+05:30[Asia/Calcutta]")
public class Place1 {
  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_LEVEL_NAME = "levelName";
  @SerializedName(SERIALIZED_NAME_LEVEL_NAME)
  private String levelName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private List<Name1> name = null;

  public Place1() { 
  }

  public Place1 level(String level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLevel() {
    return level;
  }


  public void setLevel(String level) {
    this.level = level;
  }


  public Place1 levelName(String levelName) {
    
    this.levelName = levelName;
    return this;
  }

   /**
   * Get levelName
   * @return levelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLevelName() {
    return levelName;
  }


  public void setLevelName(String levelName) {
    this.levelName = levelName;
  }


  public Place1 name(List<Name1> name) {
    
    this.name = name;
    return this;
  }

  public Place1 addNameItem(Name1 nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<Name1>();
    }
    this.name.add(nameItem);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Name1> getName() {
    return name;
  }


  public void setName(List<Name1> name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Place1 place1 = (Place1) o;
    return Objects.equals(this.level, place1.level) &&
        Objects.equals(this.levelName, place1.levelName) &&
        Objects.equals(this.name, place1.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, levelName, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Place1 {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    levelName: ").append(toIndentedString(levelName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

