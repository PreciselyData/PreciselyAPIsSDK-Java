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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SchoolRanking
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-14T13:16:01.386923100+05:30[Asia/Calcutta]")
public class SchoolRanking {
  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private String current;

  public static final String SERIALIZED_NAME_RANK_YEAR = "rankYear";
  @SerializedName(SERIALIZED_NAME_RANK_YEAR)
  private String rankYear;

  public static final String SERIALIZED_NAME_STATE_RANK = "stateRank";
  @SerializedName(SERIALIZED_NAME_STATE_RANK)
  private String stateRank;

  public static final String SERIALIZED_NAME_NUMBER_OF_SCHOOLS = "numberOfSchools";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SCHOOLS)
  private String numberOfSchools;

  public static final String SERIALIZED_NAME_AVG_MATH_SCORE = "avgMathScore";
  @SerializedName(SERIALIZED_NAME_AVG_MATH_SCORE)
  private String avgMathScore;

  public static final String SERIALIZED_NAME_AVG_READING_SCORE = "avgReadingScore";
  @SerializedName(SERIALIZED_NAME_AVG_READING_SCORE)
  private String avgReadingScore;

  public static final String SERIALIZED_NAME_STATE_PERCENTILE_SCORE = "statePercentileScore";
  @SerializedName(SERIALIZED_NAME_STATE_PERCENTILE_SCORE)
  private String statePercentileScore;

  public SchoolRanking() { 
  }

  public SchoolRanking current(String current) {
    
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrent() {
    return current;
  }


  public void setCurrent(String current) {
    this.current = current;
  }


  public SchoolRanking rankYear(String rankYear) {
    
    this.rankYear = rankYear;
    return this;
  }

   /**
   * Get rankYear
   * @return rankYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRankYear() {
    return rankYear;
  }


  public void setRankYear(String rankYear) {
    this.rankYear = rankYear;
  }


  public SchoolRanking stateRank(String stateRank) {
    
    this.stateRank = stateRank;
    return this;
  }

   /**
   * Get stateRank
   * @return stateRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateRank() {
    return stateRank;
  }


  public void setStateRank(String stateRank) {
    this.stateRank = stateRank;
  }


  public SchoolRanking numberOfSchools(String numberOfSchools) {
    
    this.numberOfSchools = numberOfSchools;
    return this;
  }

   /**
   * Get numberOfSchools
   * @return numberOfSchools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNumberOfSchools() {
    return numberOfSchools;
  }


  public void setNumberOfSchools(String numberOfSchools) {
    this.numberOfSchools = numberOfSchools;
  }


  public SchoolRanking avgMathScore(String avgMathScore) {
    
    this.avgMathScore = avgMathScore;
    return this;
  }

   /**
   * Get avgMathScore
   * @return avgMathScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAvgMathScore() {
    return avgMathScore;
  }


  public void setAvgMathScore(String avgMathScore) {
    this.avgMathScore = avgMathScore;
  }


  public SchoolRanking avgReadingScore(String avgReadingScore) {
    
    this.avgReadingScore = avgReadingScore;
    return this;
  }

   /**
   * Get avgReadingScore
   * @return avgReadingScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAvgReadingScore() {
    return avgReadingScore;
  }


  public void setAvgReadingScore(String avgReadingScore) {
    this.avgReadingScore = avgReadingScore;
  }


  public SchoolRanking statePercentileScore(String statePercentileScore) {
    
    this.statePercentileScore = statePercentileScore;
    return this;
  }

   /**
   * Get statePercentileScore
   * @return statePercentileScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatePercentileScore() {
    return statePercentileScore;
  }


  public void setStatePercentileScore(String statePercentileScore) {
    this.statePercentileScore = statePercentileScore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchoolRanking schoolRanking = (SchoolRanking) o;
    return Objects.equals(this.current, schoolRanking.current) &&
        Objects.equals(this.rankYear, schoolRanking.rankYear) &&
        Objects.equals(this.stateRank, schoolRanking.stateRank) &&
        Objects.equals(this.numberOfSchools, schoolRanking.numberOfSchools) &&
        Objects.equals(this.avgMathScore, schoolRanking.avgMathScore) &&
        Objects.equals(this.avgReadingScore, schoolRanking.avgReadingScore) &&
        Objects.equals(this.statePercentileScore, schoolRanking.statePercentileScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, rankYear, stateRank, numberOfSchools, avgMathScore, avgReadingScore, statePercentileScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolRanking {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    rankYear: ").append(toIndentedString(rankYear)).append("\n");
    sb.append("    stateRank: ").append(toIndentedString(stateRank)).append("\n");
    sb.append("    numberOfSchools: ").append(toIndentedString(numberOfSchools)).append("\n");
    sb.append("    avgMathScore: ").append(toIndentedString(avgMathScore)).append("\n");
    sb.append("    avgReadingScore: ").append(toIndentedString(avgReadingScore)).append("\n");
    sb.append("    statePercentileScore: ").append(toIndentedString(statePercentileScore)).append("\n");
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

