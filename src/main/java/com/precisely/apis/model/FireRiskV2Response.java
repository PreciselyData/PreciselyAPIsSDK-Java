/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 18.1.0
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
import com.precisely.apis.model.CommonGeometry;
import com.precisely.apis.model.CommunityGroup;
import com.precisely.apis.model.DamageGroup;
import com.precisely.apis.model.FrequencyGroup;
import com.precisely.apis.model.MitigationGroup;
import com.precisely.apis.model.RiskAddress;
import com.precisely.apis.model.SeverityGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FireRiskV2Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-25T12:02:09.428568400+05:30[Asia/Calcutta]")
public class FireRiskV2Response {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_NOHARM_ID = "noharmId";
  @SerializedName(SERIALIZED_NAME_NOHARM_ID)
  private String noharmId;

  public static final String SERIALIZED_NAME_NOHARM_CLS = "noharmCls";
  @SerializedName(SERIALIZED_NAME_NOHARM_CLS)
  private String noharmCls;

  public static final String SERIALIZED_NAME_NOHARM_MODEL = "noharmModel";
  @SerializedName(SERIALIZED_NAME_NOHARM_MODEL)
  private String noharmModel;

  public static final String SERIALIZED_NAME_RISK_DESC = "riskDesc";
  @SerializedName(SERIALIZED_NAME_RISK_DESC)
  private String riskDesc;

  public static final String SERIALIZED_NAME_RISK50 = "risk50";
  @SerializedName(SERIALIZED_NAME_RISK50)
  private Integer risk50;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Integer severity;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private Integer frequency;

  public static final String SERIALIZED_NAME_COMMUNITY = "community";
  @SerializedName(SERIALIZED_NAME_COMMUNITY)
  private Integer community;

  public static final String SERIALIZED_NAME_DAMAGE = "damage";
  @SerializedName(SERIALIZED_NAME_DAMAGE)
  private Integer damage;

  public static final String SERIALIZED_NAME_MITIGATION = "mitigation";
  @SerializedName(SERIALIZED_NAME_MITIGATION)
  private Integer mitigation;

  public static final String SERIALIZED_NAME_SEVERITY_GROUP_ELEMENTS = "severityGroupElements";
  @SerializedName(SERIALIZED_NAME_SEVERITY_GROUP_ELEMENTS)
  private SeverityGroup severityGroupElements;

  public static final String SERIALIZED_NAME_FREQUENCY_GROUP_ELEMENTS = "frequencyGroupElements";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_GROUP_ELEMENTS)
  private FrequencyGroup frequencyGroupElements;

  public static final String SERIALIZED_NAME_COMMUNITY_GROUP_ELEMENTS = "communityGroupElements";
  @SerializedName(SERIALIZED_NAME_COMMUNITY_GROUP_ELEMENTS)
  private CommunityGroup communityGroupElements;

  public static final String SERIALIZED_NAME_DAMAGE_GROUP_ELEMENTS = "damageGroupElements";
  @SerializedName(SERIALIZED_NAME_DAMAGE_GROUP_ELEMENTS)
  private DamageGroup damageGroupElements;

  public static final String SERIALIZED_NAME_MITIGATION_GROUP_ELEMENTS = "mitigationGroupElements";
  @SerializedName(SERIALIZED_NAME_MITIGATION_GROUP_ELEMENTS)
  private MitigationGroup mitigationGroupElements;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private CommonGeometry geometry;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private RiskAddress matchedAddress;

  public FireRiskV2Response() { 
  }

  public FireRiskV2Response objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectId() {
    return objectId;
  }


  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public FireRiskV2Response state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public FireRiskV2Response noharmId(String noharmId) {
    
    this.noharmId = noharmId;
    return this;
  }

   /**
   * Get noharmId
   * @return noharmId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNoharmId() {
    return noharmId;
  }


  public void setNoharmId(String noharmId) {
    this.noharmId = noharmId;
  }


  public FireRiskV2Response noharmCls(String noharmCls) {
    
    this.noharmCls = noharmCls;
    return this;
  }

   /**
   * Get noharmCls
   * @return noharmCls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNoharmCls() {
    return noharmCls;
  }


  public void setNoharmCls(String noharmCls) {
    this.noharmCls = noharmCls;
  }


  public FireRiskV2Response noharmModel(String noharmModel) {
    
    this.noharmModel = noharmModel;
    return this;
  }

   /**
   * Get noharmModel
   * @return noharmModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNoharmModel() {
    return noharmModel;
  }


  public void setNoharmModel(String noharmModel) {
    this.noharmModel = noharmModel;
  }


  public FireRiskV2Response riskDesc(String riskDesc) {
    
    this.riskDesc = riskDesc;
    return this;
  }

   /**
   * Get riskDesc
   * @return riskDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRiskDesc() {
    return riskDesc;
  }


  public void setRiskDesc(String riskDesc) {
    this.riskDesc = riskDesc;
  }


  public FireRiskV2Response risk50(Integer risk50) {
    
    this.risk50 = risk50;
    return this;
  }

   /**
   * Get risk50
   * @return risk50
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRisk50() {
    return risk50;
  }


  public void setRisk50(Integer risk50) {
    this.risk50 = risk50;
  }


  public FireRiskV2Response severity(Integer severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeverity() {
    return severity;
  }


  public void setSeverity(Integer severity) {
    this.severity = severity;
  }


  public FireRiskV2Response frequency(Integer frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFrequency() {
    return frequency;
  }


  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }


  public FireRiskV2Response community(Integer community) {
    
    this.community = community;
    return this;
  }

   /**
   * Get community
   * @return community
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCommunity() {
    return community;
  }


  public void setCommunity(Integer community) {
    this.community = community;
  }


  public FireRiskV2Response damage(Integer damage) {
    
    this.damage = damage;
    return this;
  }

   /**
   * Get damage
   * @return damage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDamage() {
    return damage;
  }


  public void setDamage(Integer damage) {
    this.damage = damage;
  }


  public FireRiskV2Response mitigation(Integer mitigation) {
    
    this.mitigation = mitigation;
    return this;
  }

   /**
   * Get mitigation
   * @return mitigation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMitigation() {
    return mitigation;
  }


  public void setMitigation(Integer mitigation) {
    this.mitigation = mitigation;
  }


  public FireRiskV2Response severityGroupElements(SeverityGroup severityGroupElements) {
    
    this.severityGroupElements = severityGroupElements;
    return this;
  }

   /**
   * Get severityGroupElements
   * @return severityGroupElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeverityGroup getSeverityGroupElements() {
    return severityGroupElements;
  }


  public void setSeverityGroupElements(SeverityGroup severityGroupElements) {
    this.severityGroupElements = severityGroupElements;
  }


  public FireRiskV2Response frequencyGroupElements(FrequencyGroup frequencyGroupElements) {
    
    this.frequencyGroupElements = frequencyGroupElements;
    return this;
  }

   /**
   * Get frequencyGroupElements
   * @return frequencyGroupElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FrequencyGroup getFrequencyGroupElements() {
    return frequencyGroupElements;
  }


  public void setFrequencyGroupElements(FrequencyGroup frequencyGroupElements) {
    this.frequencyGroupElements = frequencyGroupElements;
  }


  public FireRiskV2Response communityGroupElements(CommunityGroup communityGroupElements) {
    
    this.communityGroupElements = communityGroupElements;
    return this;
  }

   /**
   * Get communityGroupElements
   * @return communityGroupElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommunityGroup getCommunityGroupElements() {
    return communityGroupElements;
  }


  public void setCommunityGroupElements(CommunityGroup communityGroupElements) {
    this.communityGroupElements = communityGroupElements;
  }


  public FireRiskV2Response damageGroupElements(DamageGroup damageGroupElements) {
    
    this.damageGroupElements = damageGroupElements;
    return this;
  }

   /**
   * Get damageGroupElements
   * @return damageGroupElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DamageGroup getDamageGroupElements() {
    return damageGroupElements;
  }


  public void setDamageGroupElements(DamageGroup damageGroupElements) {
    this.damageGroupElements = damageGroupElements;
  }


  public FireRiskV2Response mitigationGroupElements(MitigationGroup mitigationGroupElements) {
    
    this.mitigationGroupElements = mitigationGroupElements;
    return this;
  }

   /**
   * Get mitigationGroupElements
   * @return mitigationGroupElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MitigationGroup getMitigationGroupElements() {
    return mitigationGroupElements;
  }


  public void setMitigationGroupElements(MitigationGroup mitigationGroupElements) {
    this.mitigationGroupElements = mitigationGroupElements;
  }


  public FireRiskV2Response geometry(CommonGeometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonGeometry getGeometry() {
    return geometry;
  }


  public void setGeometry(CommonGeometry geometry) {
    this.geometry = geometry;
  }


  public FireRiskV2Response matchedAddress(RiskAddress matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RiskAddress getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(RiskAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireRiskV2Response fireRiskV2Response = (FireRiskV2Response) o;
    return Objects.equals(this.objectId, fireRiskV2Response.objectId) &&
        Objects.equals(this.state, fireRiskV2Response.state) &&
        Objects.equals(this.noharmId, fireRiskV2Response.noharmId) &&
        Objects.equals(this.noharmCls, fireRiskV2Response.noharmCls) &&
        Objects.equals(this.noharmModel, fireRiskV2Response.noharmModel) &&
        Objects.equals(this.riskDesc, fireRiskV2Response.riskDesc) &&
        Objects.equals(this.risk50, fireRiskV2Response.risk50) &&
        Objects.equals(this.severity, fireRiskV2Response.severity) &&
        Objects.equals(this.frequency, fireRiskV2Response.frequency) &&
        Objects.equals(this.community, fireRiskV2Response.community) &&
        Objects.equals(this.damage, fireRiskV2Response.damage) &&
        Objects.equals(this.mitigation, fireRiskV2Response.mitigation) &&
        Objects.equals(this.severityGroupElements, fireRiskV2Response.severityGroupElements) &&
        Objects.equals(this.frequencyGroupElements, fireRiskV2Response.frequencyGroupElements) &&
        Objects.equals(this.communityGroupElements, fireRiskV2Response.communityGroupElements) &&
        Objects.equals(this.damageGroupElements, fireRiskV2Response.damageGroupElements) &&
        Objects.equals(this.mitigationGroupElements, fireRiskV2Response.mitigationGroupElements) &&
        Objects.equals(this.geometry, fireRiskV2Response.geometry) &&
        Objects.equals(this.matchedAddress, fireRiskV2Response.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, state, noharmId, noharmCls, noharmModel, riskDesc, risk50, severity, frequency, community, damage, mitigation, severityGroupElements, frequencyGroupElements, communityGroupElements, damageGroupElements, mitigationGroupElements, geometry, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireRiskV2Response {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    noharmId: ").append(toIndentedString(noharmId)).append("\n");
    sb.append("    noharmCls: ").append(toIndentedString(noharmCls)).append("\n");
    sb.append("    noharmModel: ").append(toIndentedString(noharmModel)).append("\n");
    sb.append("    riskDesc: ").append(toIndentedString(riskDesc)).append("\n");
    sb.append("    risk50: ").append(toIndentedString(risk50)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    damage: ").append(toIndentedString(damage)).append("\n");
    sb.append("    mitigation: ").append(toIndentedString(mitigation)).append("\n");
    sb.append("    severityGroupElements: ").append(toIndentedString(severityGroupElements)).append("\n");
    sb.append("    frequencyGroupElements: ").append(toIndentedString(frequencyGroupElements)).append("\n");
    sb.append("    communityGroupElements: ").append(toIndentedString(communityGroupElements)).append("\n");
    sb.append("    damageGroupElements: ").append(toIndentedString(damageGroupElements)).append("\n");
    sb.append("    mitigationGroupElements: ").append(toIndentedString(mitigationGroupElements)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
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

