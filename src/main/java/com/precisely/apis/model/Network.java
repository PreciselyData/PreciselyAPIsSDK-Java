/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3.1
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
import com.precisely.apis.model.Carrier;
import com.precisely.apis.model.OrganizationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Network
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T17:32:51.155+05:30[Asia/Calcutta]")
public class Network {
  public static final String SERIALIZED_NAME_CONNECTION_FROM_HOME = "connectionFromHome";
  @SerializedName(SERIALIZED_NAME_CONNECTION_FROM_HOME)
  private String connectionFromHome;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_CARRIER = "carrier";
  @SerializedName(SERIALIZED_NAME_CARRIER)
  private Carrier carrier;

  public static final String SERIALIZED_NAME_ORGANIZATION_TYPE = "organizationType";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_TYPE)
  private OrganizationType organizationType;

  public static final String SERIALIZED_NAME_CONNECTION_TYPE = "connectionType";
  @SerializedName(SERIALIZED_NAME_CONNECTION_TYPE)
  private String connectionType;

  public static final String SERIALIZED_NAME_LINE_SPEED = "lineSpeed";
  @SerializedName(SERIALIZED_NAME_LINE_SPEED)
  private String lineSpeed;

  public static final String SERIALIZED_NAME_IP_ROUTE_TYPE = "ipRouteType";
  @SerializedName(SERIALIZED_NAME_IP_ROUTE_TYPE)
  private String ipRouteType;

  public static final String SERIALIZED_NAME_HOSTING_FACILITY = "hostingFacility";
  @SerializedName(SERIALIZED_NAME_HOSTING_FACILITY)
  private String hostingFacility;

  public Network() { 
  }

  public Network connectionFromHome(String connectionFromHome) {
    
    this.connectionFromHome = connectionFromHome;
    return this;
  }

   /**
   * Get connectionFromHome
   * @return connectionFromHome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectionFromHome() {
    return connectionFromHome;
  }


  public void setConnectionFromHome(String connectionFromHome) {
    this.connectionFromHome = connectionFromHome;
  }


  public Network organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public Network carrier(Carrier carrier) {
    
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Carrier getCarrier() {
    return carrier;
  }


  public void setCarrier(Carrier carrier) {
    this.carrier = carrier;
  }


  public Network organizationType(OrganizationType organizationType) {
    
    this.organizationType = organizationType;
    return this;
  }

   /**
   * Get organizationType
   * @return organizationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrganizationType getOrganizationType() {
    return organizationType;
  }


  public void setOrganizationType(OrganizationType organizationType) {
    this.organizationType = organizationType;
  }


  public Network connectionType(String connectionType) {
    
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectionType() {
    return connectionType;
  }


  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }


  public Network lineSpeed(String lineSpeed) {
    
    this.lineSpeed = lineSpeed;
    return this;
  }

   /**
   * Get lineSpeed
   * @return lineSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLineSpeed() {
    return lineSpeed;
  }


  public void setLineSpeed(String lineSpeed) {
    this.lineSpeed = lineSpeed;
  }


  public Network ipRouteType(String ipRouteType) {
    
    this.ipRouteType = ipRouteType;
    return this;
  }

   /**
   * Get ipRouteType
   * @return ipRouteType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpRouteType() {
    return ipRouteType;
  }


  public void setIpRouteType(String ipRouteType) {
    this.ipRouteType = ipRouteType;
  }


  public Network hostingFacility(String hostingFacility) {
    
    this.hostingFacility = hostingFacility;
    return this;
  }

   /**
   * Get hostingFacility
   * @return hostingFacility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostingFacility() {
    return hostingFacility;
  }


  public void setHostingFacility(String hostingFacility) {
    this.hostingFacility = hostingFacility;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Network network = (Network) o;
    return Objects.equals(this.connectionFromHome, network.connectionFromHome) &&
        Objects.equals(this.organization, network.organization) &&
        Objects.equals(this.carrier, network.carrier) &&
        Objects.equals(this.organizationType, network.organizationType) &&
        Objects.equals(this.connectionType, network.connectionType) &&
        Objects.equals(this.lineSpeed, network.lineSpeed) &&
        Objects.equals(this.ipRouteType, network.ipRouteType) &&
        Objects.equals(this.hostingFacility, network.hostingFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionFromHome, organization, carrier, organizationType, connectionType, lineSpeed, ipRouteType, hostingFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    sb.append("    connectionFromHome: ").append(toIndentedString(connectionFromHome)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    lineSpeed: ").append(toIndentedString(lineSpeed)).append("\n");
    sb.append("    ipRouteType: ").append(toIndentedString(ipRouteType)).append("\n");
    sb.append("    hostingFacility: ").append(toIndentedString(hostingFacility)).append("\n");
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

