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
import com.precisely.apis.model.AddressType;
import com.precisely.apis.model.Geometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddressesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-25T12:02:09.428568400+05:30[Asia/Calcutta]")
public class AddressesDTO {
  public static final String SERIALIZED_NAME_PB_KEY = "pbKey";
  @SerializedName(SERIALIZED_NAME_PB_KEY)
  private String pbKey;

  public static final String SERIALIZED_NAME_ADDRESS_NUMBER = "addressNumber";
  @SerializedName(SERIALIZED_NAME_ADDRESS_NUMBER)
  private String addressNumber;

  public static final String SERIALIZED_NAME_STREET_NAME = "streetName";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private String streetName;

  public static final String SERIALIZED_NAME_UNIT_TYPE = "unitType";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPE)
  private String unitType;

  public static final String SERIALIZED_NAME_UNIT_VALUE = "unitValue";
  @SerializedName(SERIALIZED_NAME_UNIT_VALUE)
  private String unitValue;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AddressType type;

  public static final String SERIALIZED_NAME_AREA_NAME1 = "areaName1";
  @SerializedName(SERIALIZED_NAME_AREA_NAME1)
  private String areaName1;

  public static final String SERIALIZED_NAME_AREA_NAME2 = "areaName2";
  @SerializedName(SERIALIZED_NAME_AREA_NAME2)
  private String areaName2;

  public static final String SERIALIZED_NAME_AREA_NAME3 = "areaName3";
  @SerializedName(SERIALIZED_NAME_AREA_NAME3)
  private String areaName3;

  public static final String SERIALIZED_NAME_AREA_NAME4 = "areaName4";
  @SerializedName(SERIALIZED_NAME_AREA_NAME4)
  private String areaName4;

  public static final String SERIALIZED_NAME_POST_CODE = "postCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  private String postCode;

  public static final String SERIALIZED_NAME_POST_CODE_EXT = "postCodeExt";
  @SerializedName(SERIALIZED_NAME_POST_CODE_EXT)
  private String postCodeExt;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private Geometry geometry;

  public static final String SERIALIZED_NAME_PROPERTY_TYPE = "propertyType";
  @SerializedName(SERIALIZED_NAME_PROPERTY_TYPE)
  private String propertyType;

  public static final String SERIALIZED_NAME_PROPERTY_TYPE_DESCRIPTION = "propertyTypeDescription";
  @SerializedName(SERIALIZED_NAME_PROPERTY_TYPE_DESCRIPTION)
  private String propertyTypeDescription;

  public static final String SERIALIZED_NAME_PARENT_PB_KEY = "parentPbKey";
  @SerializedName(SERIALIZED_NAME_PARENT_PB_KEY)
  private String parentPbKey;

  public static final String SERIALIZED_NAME_GEO_ID = "geoId";
  @SerializedName(SERIALIZED_NAME_GEO_ID)
  private String geoId;

  public AddressesDTO() { 
  }

  public AddressesDTO pbKey(String pbKey) {
    
    this.pbKey = pbKey;
    return this;
  }

   /**
   * Get pbKey
   * @return pbKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPbKey() {
    return pbKey;
  }


  public void setPbKey(String pbKey) {
    this.pbKey = pbKey;
  }


  public AddressesDTO addressNumber(String addressNumber) {
    
    this.addressNumber = addressNumber;
    return this;
  }

   /**
   * Get addressNumber
   * @return addressNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressNumber() {
    return addressNumber;
  }


  public void setAddressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
  }


  public AddressesDTO streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public AddressesDTO unitType(String unitType) {
    
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitType() {
    return unitType;
  }


  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }


  public AddressesDTO unitValue(String unitValue) {
    
    this.unitValue = unitValue;
    return this;
  }

   /**
   * Get unitValue
   * @return unitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitValue() {
    return unitValue;
  }


  public void setUnitValue(String unitValue) {
    this.unitValue = unitValue;
  }


  public AddressesDTO type(AddressType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressType getType() {
    return type;
  }


  public void setType(AddressType type) {
    this.type = type;
  }


  public AddressesDTO areaName1(String areaName1) {
    
    this.areaName1 = areaName1;
    return this;
  }

   /**
   * Get areaName1
   * @return areaName1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName1() {
    return areaName1;
  }


  public void setAreaName1(String areaName1) {
    this.areaName1 = areaName1;
  }


  public AddressesDTO areaName2(String areaName2) {
    
    this.areaName2 = areaName2;
    return this;
  }

   /**
   * Get areaName2
   * @return areaName2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName2() {
    return areaName2;
  }


  public void setAreaName2(String areaName2) {
    this.areaName2 = areaName2;
  }


  public AddressesDTO areaName3(String areaName3) {
    
    this.areaName3 = areaName3;
    return this;
  }

   /**
   * Get areaName3
   * @return areaName3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName3() {
    return areaName3;
  }


  public void setAreaName3(String areaName3) {
    this.areaName3 = areaName3;
  }


  public AddressesDTO areaName4(String areaName4) {
    
    this.areaName4 = areaName4;
    return this;
  }

   /**
   * Get areaName4
   * @return areaName4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName4() {
    return areaName4;
  }


  public void setAreaName4(String areaName4) {
    this.areaName4 = areaName4;
  }


  public AddressesDTO postCode(String postCode) {
    
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCode() {
    return postCode;
  }


  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public AddressesDTO postCodeExt(String postCodeExt) {
    
    this.postCodeExt = postCodeExt;
    return this;
  }

   /**
   * Get postCodeExt
   * @return postCodeExt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCodeExt() {
    return postCodeExt;
  }


  public void setPostCodeExt(String postCodeExt) {
    this.postCodeExt = postCodeExt;
  }


  public AddressesDTO country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public AddressesDTO geometry(Geometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geometry getGeometry() {
    return geometry;
  }


  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  public AddressesDTO propertyType(String propertyType) {
    
    this.propertyType = propertyType;
    return this;
  }

   /**
   * Get propertyType
   * @return propertyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropertyType() {
    return propertyType;
  }


  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }


  public AddressesDTO propertyTypeDescription(String propertyTypeDescription) {
    
    this.propertyTypeDescription = propertyTypeDescription;
    return this;
  }

   /**
   * Get propertyTypeDescription
   * @return propertyTypeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropertyTypeDescription() {
    return propertyTypeDescription;
  }


  public void setPropertyTypeDescription(String propertyTypeDescription) {
    this.propertyTypeDescription = propertyTypeDescription;
  }


  public AddressesDTO parentPbKey(String parentPbKey) {
    
    this.parentPbKey = parentPbKey;
    return this;
  }

   /**
   * Get parentPbKey
   * @return parentPbKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentPbKey() {
    return parentPbKey;
  }


  public void setParentPbKey(String parentPbKey) {
    this.parentPbKey = parentPbKey;
  }


  public AddressesDTO geoId(String geoId) {
    
    this.geoId = geoId;
    return this;
  }

   /**
   * Get geoId
   * @return geoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGeoId() {
    return geoId;
  }


  public void setGeoId(String geoId) {
    this.geoId = geoId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressesDTO addressesDTO = (AddressesDTO) o;
    return Objects.equals(this.pbKey, addressesDTO.pbKey) &&
        Objects.equals(this.addressNumber, addressesDTO.addressNumber) &&
        Objects.equals(this.streetName, addressesDTO.streetName) &&
        Objects.equals(this.unitType, addressesDTO.unitType) &&
        Objects.equals(this.unitValue, addressesDTO.unitValue) &&
        Objects.equals(this.type, addressesDTO.type) &&
        Objects.equals(this.areaName1, addressesDTO.areaName1) &&
        Objects.equals(this.areaName2, addressesDTO.areaName2) &&
        Objects.equals(this.areaName3, addressesDTO.areaName3) &&
        Objects.equals(this.areaName4, addressesDTO.areaName4) &&
        Objects.equals(this.postCode, addressesDTO.postCode) &&
        Objects.equals(this.postCodeExt, addressesDTO.postCodeExt) &&
        Objects.equals(this.country, addressesDTO.country) &&
        Objects.equals(this.geometry, addressesDTO.geometry) &&
        Objects.equals(this.propertyType, addressesDTO.propertyType) &&
        Objects.equals(this.propertyTypeDescription, addressesDTO.propertyTypeDescription) &&
        Objects.equals(this.parentPbKey, addressesDTO.parentPbKey) &&
        Objects.equals(this.geoId, addressesDTO.geoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pbKey, addressNumber, streetName, unitType, unitValue, type, areaName1, areaName2, areaName3, areaName4, postCode, postCodeExt, country, geometry, propertyType, propertyTypeDescription, parentPbKey, geoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressesDTO {\n");
    sb.append("    pbKey: ").append(toIndentedString(pbKey)).append("\n");
    sb.append("    addressNumber: ").append(toIndentedString(addressNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    unitValue: ").append(toIndentedString(unitValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    areaName1: ").append(toIndentedString(areaName1)).append("\n");
    sb.append("    areaName2: ").append(toIndentedString(areaName2)).append("\n");
    sb.append("    areaName3: ").append(toIndentedString(areaName3)).append("\n");
    sb.append("    areaName4: ").append(toIndentedString(areaName4)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postCodeExt: ").append(toIndentedString(postCodeExt)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    propertyTypeDescription: ").append(toIndentedString(propertyTypeDescription)).append("\n");
    sb.append("    parentPbKey: ").append(toIndentedString(parentPbKey)).append("\n");
    sb.append("    geoId: ").append(toIndentedString(geoId)).append("\n");
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

