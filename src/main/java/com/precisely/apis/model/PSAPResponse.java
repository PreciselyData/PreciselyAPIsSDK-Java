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
import com.precisely.apis.model.AHJmailingAddress;
import com.precisely.apis.model.ContactPerson;
import com.precisely.apis.model.County;
import com.precisely.apis.model.Coverage;
import com.precisely.apis.model.SiteDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PSAPResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-25T12:02:09.428568400+05:30[Asia/Calcutta]")
public class PSAPResponse {
  public static final String SERIALIZED_NAME_PSAP_ID = "psapId";
  @SerializedName(SERIALIZED_NAME_PSAP_ID)
  private String psapId;

  public static final String SERIALIZED_NAME_FCC_ID = "fccId";
  @SerializedName(SERIALIZED_NAME_FCC_ID)
  private String fccId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_AGENCY = "agency";
  @SerializedName(SERIALIZED_NAME_AGENCY)
  private String agency;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_COUNTY = "county";
  @SerializedName(SERIALIZED_NAME_COUNTY)
  private County county;

  public static final String SERIALIZED_NAME_COVERAGE = "coverage";
  @SerializedName(SERIALIZED_NAME_COVERAGE)
  private Coverage coverage;

  public static final String SERIALIZED_NAME_CONTACT_PERSON = "contactPerson";
  @SerializedName(SERIALIZED_NAME_CONTACT_PERSON)
  private ContactPerson contactPerson;

  public static final String SERIALIZED_NAME_SITE_DETAILS = "siteDetails";
  @SerializedName(SERIALIZED_NAME_SITE_DETAILS)
  private SiteDetails siteDetails;

  public static final String SERIALIZED_NAME_MAILING_ADDRESS = "mailingAddress";
  @SerializedName(SERIALIZED_NAME_MAILING_ADDRESS)
  private AHJmailingAddress mailingAddress;

  public PSAPResponse() { 
  }

  public PSAPResponse psapId(String psapId) {
    
    this.psapId = psapId;
    return this;
  }

   /**
   * Get psapId
   * @return psapId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPsapId() {
    return psapId;
  }


  public void setPsapId(String psapId) {
    this.psapId = psapId;
  }


  public PSAPResponse fccId(String fccId) {
    
    this.fccId = fccId;
    return this;
  }

   /**
   * Get fccId
   * @return fccId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFccId() {
    return fccId;
  }


  public void setFccId(String fccId) {
    this.fccId = fccId;
  }


  public PSAPResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PSAPResponse count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public PSAPResponse agency(String agency) {
    
    this.agency = agency;
    return this;
  }

   /**
   * Get agency
   * @return agency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAgency() {
    return agency;
  }


  public void setAgency(String agency) {
    this.agency = agency;
  }


  public PSAPResponse phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public PSAPResponse county(County county) {
    
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public County getCounty() {
    return county;
  }


  public void setCounty(County county) {
    this.county = county;
  }


  public PSAPResponse coverage(Coverage coverage) {
    
    this.coverage = coverage;
    return this;
  }

   /**
   * Get coverage
   * @return coverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Coverage getCoverage() {
    return coverage;
  }


  public void setCoverage(Coverage coverage) {
    this.coverage = coverage;
  }


  public PSAPResponse contactPerson(ContactPerson contactPerson) {
    
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Get contactPerson
   * @return contactPerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactPerson getContactPerson() {
    return contactPerson;
  }


  public void setContactPerson(ContactPerson contactPerson) {
    this.contactPerson = contactPerson;
  }


  public PSAPResponse siteDetails(SiteDetails siteDetails) {
    
    this.siteDetails = siteDetails;
    return this;
  }

   /**
   * Get siteDetails
   * @return siteDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SiteDetails getSiteDetails() {
    return siteDetails;
  }


  public void setSiteDetails(SiteDetails siteDetails) {
    this.siteDetails = siteDetails;
  }


  public PSAPResponse mailingAddress(AHJmailingAddress mailingAddress) {
    
    this.mailingAddress = mailingAddress;
    return this;
  }

   /**
   * Get mailingAddress
   * @return mailingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AHJmailingAddress getMailingAddress() {
    return mailingAddress;
  }


  public void setMailingAddress(AHJmailingAddress mailingAddress) {
    this.mailingAddress = mailingAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PSAPResponse psAPResponse = (PSAPResponse) o;
    return Objects.equals(this.psapId, psAPResponse.psapId) &&
        Objects.equals(this.fccId, psAPResponse.fccId) &&
        Objects.equals(this.type, psAPResponse.type) &&
        Objects.equals(this.count, psAPResponse.count) &&
        Objects.equals(this.agency, psAPResponse.agency) &&
        Objects.equals(this.phone, psAPResponse.phone) &&
        Objects.equals(this.county, psAPResponse.county) &&
        Objects.equals(this.coverage, psAPResponse.coverage) &&
        Objects.equals(this.contactPerson, psAPResponse.contactPerson) &&
        Objects.equals(this.siteDetails, psAPResponse.siteDetails) &&
        Objects.equals(this.mailingAddress, psAPResponse.mailingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(psapId, fccId, type, count, agency, phone, county, coverage, contactPerson, siteDetails, mailingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PSAPResponse {\n");
    sb.append("    psapId: ").append(toIndentedString(psapId)).append("\n");
    sb.append("    fccId: ").append(toIndentedString(fccId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    siteDetails: ").append(toIndentedString(siteDetails)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
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

