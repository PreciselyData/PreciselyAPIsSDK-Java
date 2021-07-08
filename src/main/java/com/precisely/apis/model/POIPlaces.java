/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.1
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
import com.precisely.apis.model.BusinessId;
import com.precisely.apis.model.Distance;
import com.precisely.apis.model.DomesticUltimateBusiness;
import com.precisely.apis.model.EmployeeCount;
import com.precisely.apis.model.Geometry;
import com.precisely.apis.model.GlobalUltimateBusiness;
import com.precisely.apis.model.ParentBusiness;
import com.precisely.apis.model.PoiClassification;
import com.precisely.apis.model.PoiContactDetails;
import com.precisely.apis.model.SalesVolume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * POIPlaces
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-07T18:04:20.881+05:30")
public class POIPlaces   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("poiId")
  private String poiId = null;

  @SerializedName("pbkey")
  private String pbkey = null;

  @SerializedName("parentPbkey")
  private String parentPbkey = null;

  @SerializedName("geocodeConfidence")
  private String geocodeConfidence = null;

  @SerializedName("ceoName")
  private String ceoName = null;

  @SerializedName("ceoTitle")
  private String ceoTitle = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("brandName")
  private String brandName = null;

  @SerializedName("tradeName")
  private String tradeName = null;

  @SerializedName("franchiseName")
  private String franchiseName = null;

  @SerializedName("open24Hours")
  private String open24Hours = null;

  @SerializedName("distance")
  private Distance distance = null;

  @SerializedName("businessId")
  private BusinessId businessId = null;

  @SerializedName("relevanceScore")
  private String relevanceScore = null;

  @SerializedName("contactDetails")
  private PoiContactDetails contactDetails = null;

  @SerializedName("poiClassification")
  private PoiClassification poiClassification = null;

  @SerializedName("salesVolume")
  private List<SalesVolume> salesVolume = new ArrayList<SalesVolume>();

  @SerializedName("employeeCount")
  private EmployeeCount employeeCount = null;

  @SerializedName("yearStart")
  private String yearStart = null;

  @SerializedName("goodsAgentCode")
  private String goodsAgentCode = null;

  @SerializedName("goodsAgentCodeDescription")
  private String goodsAgentCodeDescription = null;

  @SerializedName("legalStatusCode")
  private String legalStatusCode = null;

  @SerializedName("organizationStatusCode")
  private String organizationStatusCode = null;

  @SerializedName("organizationStatusCodeDescription")
  private String organizationStatusCodeDescription = null;

  @SerializedName("subsidaryIndicator")
  private String subsidaryIndicator = null;

  @SerializedName("subsidaryIndicatorDescription")
  private String subsidaryIndicatorDescription = null;

  @SerializedName("parentBusiness")
  private ParentBusiness parentBusiness = null;

  @SerializedName("domesticUltimateBusiness")
  private DomesticUltimateBusiness domesticUltimateBusiness = null;

  @SerializedName("globalUltimateIndicator")
  private String globalUltimateIndicator = null;

  @SerializedName("globalUltimateBusiness")
  private GlobalUltimateBusiness globalUltimateBusiness = null;

  @SerializedName("familyMembers")
  private String familyMembers = null;

  @SerializedName("hierarchyCode")
  private String hierarchyCode = null;

  @SerializedName("tickerSymbol")
  private String tickerSymbol = null;

  @SerializedName("exchangeName")
  private String exchangeName = null;

  @SerializedName("geometry")
  private Geometry geometry = null;

  public POIPlaces id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public POIPlaces poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * Get poiId
   * @return poiId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public POIPlaces pbkey(String pbkey) {
    this.pbkey = pbkey;
    return this;
  }

   /**
   * Get pbkey
   * @return pbkey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPbkey() {
    return pbkey;
  }

  public void setPbkey(String pbkey) {
    this.pbkey = pbkey;
  }

  public POIPlaces parentPbkey(String parentPbkey) {
    this.parentPbkey = parentPbkey;
    return this;
  }

   /**
   * Get parentPbkey
   * @return parentPbkey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentPbkey() {
    return parentPbkey;
  }

  public void setParentPbkey(String parentPbkey) {
    this.parentPbkey = parentPbkey;
  }

  public POIPlaces geocodeConfidence(String geocodeConfidence) {
    this.geocodeConfidence = geocodeConfidence;
    return this;
  }

   /**
   * Get geocodeConfidence
   * @return geocodeConfidence
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGeocodeConfidence() {
    return geocodeConfidence;
  }

  public void setGeocodeConfidence(String geocodeConfidence) {
    this.geocodeConfidence = geocodeConfidence;
  }

  public POIPlaces ceoName(String ceoName) {
    this.ceoName = ceoName;
    return this;
  }

   /**
   * Get ceoName
   * @return ceoName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCeoName() {
    return ceoName;
  }

  public void setCeoName(String ceoName) {
    this.ceoName = ceoName;
  }

  public POIPlaces ceoTitle(String ceoTitle) {
    this.ceoTitle = ceoTitle;
    return this;
  }

   /**
   * Get ceoTitle
   * @return ceoTitle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCeoTitle() {
    return ceoTitle;
  }

  public void setCeoTitle(String ceoTitle) {
    this.ceoTitle = ceoTitle;
  }

  public POIPlaces name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public POIPlaces brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * Get brandName
   * @return brandName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public POIPlaces tradeName(String tradeName) {
    this.tradeName = tradeName;
    return this;
  }

   /**
   * Get tradeName
   * @return tradeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTradeName() {
    return tradeName;
  }

  public void setTradeName(String tradeName) {
    this.tradeName = tradeName;
  }

  public POIPlaces franchiseName(String franchiseName) {
    this.franchiseName = franchiseName;
    return this;
  }

   /**
   * Get franchiseName
   * @return franchiseName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFranchiseName() {
    return franchiseName;
  }

  public void setFranchiseName(String franchiseName) {
    this.franchiseName = franchiseName;
  }

  public POIPlaces open24Hours(String open24Hours) {
    this.open24Hours = open24Hours;
    return this;
  }

   /**
   * Get open24Hours
   * @return open24Hours
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOpen24Hours() {
    return open24Hours;
  }

  public void setOpen24Hours(String open24Hours) {
    this.open24Hours = open24Hours;
  }

  public POIPlaces distance(Distance distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "")
  public Distance getDistance() {
    return distance;
  }

  public void setDistance(Distance distance) {
    this.distance = distance;
  }

  public POIPlaces businessId(BusinessId businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * Get businessId
   * @return businessId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BusinessId getBusinessId() {
    return businessId;
  }

  public void setBusinessId(BusinessId businessId) {
    this.businessId = businessId;
  }

  public POIPlaces relevanceScore(String relevanceScore) {
    this.relevanceScore = relevanceScore;
    return this;
  }

   /**
   * Get relevanceScore
   * @return relevanceScore
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRelevanceScore() {
    return relevanceScore;
  }

  public void setRelevanceScore(String relevanceScore) {
    this.relevanceScore = relevanceScore;
  }

  public POIPlaces contactDetails(PoiContactDetails contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Get contactDetails
   * @return contactDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public PoiContactDetails getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(PoiContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }

  public POIPlaces poiClassification(PoiClassification poiClassification) {
    this.poiClassification = poiClassification;
    return this;
  }

   /**
   * Get poiClassification
   * @return poiClassification
  **/
  @ApiModelProperty(example = "null", value = "")
  public PoiClassification getPoiClassification() {
    return poiClassification;
  }

  public void setPoiClassification(PoiClassification poiClassification) {
    this.poiClassification = poiClassification;
  }

  public POIPlaces salesVolume(List<SalesVolume> salesVolume) {
    this.salesVolume = salesVolume;
    return this;
  }

   /**
   * Get salesVolume
   * @return salesVolume
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SalesVolume> getSalesVolume() {
    return salesVolume;
  }

  public void setSalesVolume(List<SalesVolume> salesVolume) {
    this.salesVolume = salesVolume;
  }

  public POIPlaces employeeCount(EmployeeCount employeeCount) {
    this.employeeCount = employeeCount;
    return this;
  }

   /**
   * Get employeeCount
   * @return employeeCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public EmployeeCount getEmployeeCount() {
    return employeeCount;
  }

  public void setEmployeeCount(EmployeeCount employeeCount) {
    this.employeeCount = employeeCount;
  }

  public POIPlaces yearStart(String yearStart) {
    this.yearStart = yearStart;
    return this;
  }

   /**
   * Get yearStart
   * @return yearStart
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getYearStart() {
    return yearStart;
  }

  public void setYearStart(String yearStart) {
    this.yearStart = yearStart;
  }

  public POIPlaces goodsAgentCode(String goodsAgentCode) {
    this.goodsAgentCode = goodsAgentCode;
    return this;
  }

   /**
   * Get goodsAgentCode
   * @return goodsAgentCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGoodsAgentCode() {
    return goodsAgentCode;
  }

  public void setGoodsAgentCode(String goodsAgentCode) {
    this.goodsAgentCode = goodsAgentCode;
  }

  public POIPlaces goodsAgentCodeDescription(String goodsAgentCodeDescription) {
    this.goodsAgentCodeDescription = goodsAgentCodeDescription;
    return this;
  }

   /**
   * Get goodsAgentCodeDescription
   * @return goodsAgentCodeDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGoodsAgentCodeDescription() {
    return goodsAgentCodeDescription;
  }

  public void setGoodsAgentCodeDescription(String goodsAgentCodeDescription) {
    this.goodsAgentCodeDescription = goodsAgentCodeDescription;
  }

  public POIPlaces legalStatusCode(String legalStatusCode) {
    this.legalStatusCode = legalStatusCode;
    return this;
  }

   /**
   * Get legalStatusCode
   * @return legalStatusCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLegalStatusCode() {
    return legalStatusCode;
  }

  public void setLegalStatusCode(String legalStatusCode) {
    this.legalStatusCode = legalStatusCode;
  }

  public POIPlaces organizationStatusCode(String organizationStatusCode) {
    this.organizationStatusCode = organizationStatusCode;
    return this;
  }

   /**
   * Get organizationStatusCode
   * @return organizationStatusCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationStatusCode() {
    return organizationStatusCode;
  }

  public void setOrganizationStatusCode(String organizationStatusCode) {
    this.organizationStatusCode = organizationStatusCode;
  }

  public POIPlaces organizationStatusCodeDescription(String organizationStatusCodeDescription) {
    this.organizationStatusCodeDescription = organizationStatusCodeDescription;
    return this;
  }

   /**
   * Get organizationStatusCodeDescription
   * @return organizationStatusCodeDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationStatusCodeDescription() {
    return organizationStatusCodeDescription;
  }

  public void setOrganizationStatusCodeDescription(String organizationStatusCodeDescription) {
    this.organizationStatusCodeDescription = organizationStatusCodeDescription;
  }

  public POIPlaces subsidaryIndicator(String subsidaryIndicator) {
    this.subsidaryIndicator = subsidaryIndicator;
    return this;
  }

   /**
   * Get subsidaryIndicator
   * @return subsidaryIndicator
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubsidaryIndicator() {
    return subsidaryIndicator;
  }

  public void setSubsidaryIndicator(String subsidaryIndicator) {
    this.subsidaryIndicator = subsidaryIndicator;
  }

  public POIPlaces subsidaryIndicatorDescription(String subsidaryIndicatorDescription) {
    this.subsidaryIndicatorDescription = subsidaryIndicatorDescription;
    return this;
  }

   /**
   * Get subsidaryIndicatorDescription
   * @return subsidaryIndicatorDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubsidaryIndicatorDescription() {
    return subsidaryIndicatorDescription;
  }

  public void setSubsidaryIndicatorDescription(String subsidaryIndicatorDescription) {
    this.subsidaryIndicatorDescription = subsidaryIndicatorDescription;
  }

  public POIPlaces parentBusiness(ParentBusiness parentBusiness) {
    this.parentBusiness = parentBusiness;
    return this;
  }

   /**
   * Get parentBusiness
   * @return parentBusiness
  **/
  @ApiModelProperty(example = "null", value = "")
  public ParentBusiness getParentBusiness() {
    return parentBusiness;
  }

  public void setParentBusiness(ParentBusiness parentBusiness) {
    this.parentBusiness = parentBusiness;
  }

  public POIPlaces domesticUltimateBusiness(DomesticUltimateBusiness domesticUltimateBusiness) {
    this.domesticUltimateBusiness = domesticUltimateBusiness;
    return this;
  }

   /**
   * Get domesticUltimateBusiness
   * @return domesticUltimateBusiness
  **/
  @ApiModelProperty(example = "null", value = "")
  public DomesticUltimateBusiness getDomesticUltimateBusiness() {
    return domesticUltimateBusiness;
  }

  public void setDomesticUltimateBusiness(DomesticUltimateBusiness domesticUltimateBusiness) {
    this.domesticUltimateBusiness = domesticUltimateBusiness;
  }

  public POIPlaces globalUltimateIndicator(String globalUltimateIndicator) {
    this.globalUltimateIndicator = globalUltimateIndicator;
    return this;
  }

   /**
   * Get globalUltimateIndicator
   * @return globalUltimateIndicator
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGlobalUltimateIndicator() {
    return globalUltimateIndicator;
  }

  public void setGlobalUltimateIndicator(String globalUltimateIndicator) {
    this.globalUltimateIndicator = globalUltimateIndicator;
  }

  public POIPlaces globalUltimateBusiness(GlobalUltimateBusiness globalUltimateBusiness) {
    this.globalUltimateBusiness = globalUltimateBusiness;
    return this;
  }

   /**
   * Get globalUltimateBusiness
   * @return globalUltimateBusiness
  **/
  @ApiModelProperty(example = "null", value = "")
  public GlobalUltimateBusiness getGlobalUltimateBusiness() {
    return globalUltimateBusiness;
  }

  public void setGlobalUltimateBusiness(GlobalUltimateBusiness globalUltimateBusiness) {
    this.globalUltimateBusiness = globalUltimateBusiness;
  }

  public POIPlaces familyMembers(String familyMembers) {
    this.familyMembers = familyMembers;
    return this;
  }

   /**
   * Get familyMembers
   * @return familyMembers
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFamilyMembers() {
    return familyMembers;
  }

  public void setFamilyMembers(String familyMembers) {
    this.familyMembers = familyMembers;
  }

  public POIPlaces hierarchyCode(String hierarchyCode) {
    this.hierarchyCode = hierarchyCode;
    return this;
  }

   /**
   * Get hierarchyCode
   * @return hierarchyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHierarchyCode() {
    return hierarchyCode;
  }

  public void setHierarchyCode(String hierarchyCode) {
    this.hierarchyCode = hierarchyCode;
  }

  public POIPlaces tickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
    return this;
  }

   /**
   * Get tickerSymbol
   * @return tickerSymbol
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTickerSymbol() {
    return tickerSymbol;
  }

  public void setTickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
  }

  public POIPlaces exchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
    return this;
  }

   /**
   * Get exchangeName
   * @return exchangeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExchangeName() {
    return exchangeName;
  }

  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }

  public POIPlaces geometry(Geometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POIPlaces pOIPlaces = (POIPlaces) o;
    return Objects.equals(this.id, pOIPlaces.id) &&
        Objects.equals(this.poiId, pOIPlaces.poiId) &&
        Objects.equals(this.pbkey, pOIPlaces.pbkey) &&
        Objects.equals(this.parentPbkey, pOIPlaces.parentPbkey) &&
        Objects.equals(this.geocodeConfidence, pOIPlaces.geocodeConfidence) &&
        Objects.equals(this.ceoName, pOIPlaces.ceoName) &&
        Objects.equals(this.ceoTitle, pOIPlaces.ceoTitle) &&
        Objects.equals(this.name, pOIPlaces.name) &&
        Objects.equals(this.brandName, pOIPlaces.brandName) &&
        Objects.equals(this.tradeName, pOIPlaces.tradeName) &&
        Objects.equals(this.franchiseName, pOIPlaces.franchiseName) &&
        Objects.equals(this.open24Hours, pOIPlaces.open24Hours) &&
        Objects.equals(this.distance, pOIPlaces.distance) &&
        Objects.equals(this.businessId, pOIPlaces.businessId) &&
        Objects.equals(this.relevanceScore, pOIPlaces.relevanceScore) &&
        Objects.equals(this.contactDetails, pOIPlaces.contactDetails) &&
        Objects.equals(this.poiClassification, pOIPlaces.poiClassification) &&
        Objects.equals(this.salesVolume, pOIPlaces.salesVolume) &&
        Objects.equals(this.employeeCount, pOIPlaces.employeeCount) &&
        Objects.equals(this.yearStart, pOIPlaces.yearStart) &&
        Objects.equals(this.goodsAgentCode, pOIPlaces.goodsAgentCode) &&
        Objects.equals(this.goodsAgentCodeDescription, pOIPlaces.goodsAgentCodeDescription) &&
        Objects.equals(this.legalStatusCode, pOIPlaces.legalStatusCode) &&
        Objects.equals(this.organizationStatusCode, pOIPlaces.organizationStatusCode) &&
        Objects.equals(this.organizationStatusCodeDescription, pOIPlaces.organizationStatusCodeDescription) &&
        Objects.equals(this.subsidaryIndicator, pOIPlaces.subsidaryIndicator) &&
        Objects.equals(this.subsidaryIndicatorDescription, pOIPlaces.subsidaryIndicatorDescription) &&
        Objects.equals(this.parentBusiness, pOIPlaces.parentBusiness) &&
        Objects.equals(this.domesticUltimateBusiness, pOIPlaces.domesticUltimateBusiness) &&
        Objects.equals(this.globalUltimateIndicator, pOIPlaces.globalUltimateIndicator) &&
        Objects.equals(this.globalUltimateBusiness, pOIPlaces.globalUltimateBusiness) &&
        Objects.equals(this.familyMembers, pOIPlaces.familyMembers) &&
        Objects.equals(this.hierarchyCode, pOIPlaces.hierarchyCode) &&
        Objects.equals(this.tickerSymbol, pOIPlaces.tickerSymbol) &&
        Objects.equals(this.exchangeName, pOIPlaces.exchangeName) &&
        Objects.equals(this.geometry, pOIPlaces.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, poiId, pbkey, parentPbkey, geocodeConfidence, ceoName, ceoTitle, name, brandName, tradeName, franchiseName, open24Hours, distance, businessId, relevanceScore, contactDetails, poiClassification, salesVolume, employeeCount, yearStart, goodsAgentCode, goodsAgentCodeDescription, legalStatusCode, organizationStatusCode, organizationStatusCodeDescription, subsidaryIndicator, subsidaryIndicatorDescription, parentBusiness, domesticUltimateBusiness, globalUltimateIndicator, globalUltimateBusiness, familyMembers, hierarchyCode, tickerSymbol, exchangeName, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POIPlaces {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    pbkey: ").append(toIndentedString(pbkey)).append("\n");
    sb.append("    parentPbkey: ").append(toIndentedString(parentPbkey)).append("\n");
    sb.append("    geocodeConfidence: ").append(toIndentedString(geocodeConfidence)).append("\n");
    sb.append("    ceoName: ").append(toIndentedString(ceoName)).append("\n");
    sb.append("    ceoTitle: ").append(toIndentedString(ceoTitle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    tradeName: ").append(toIndentedString(tradeName)).append("\n");
    sb.append("    franchiseName: ").append(toIndentedString(franchiseName)).append("\n");
    sb.append("    open24Hours: ").append(toIndentedString(open24Hours)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    relevanceScore: ").append(toIndentedString(relevanceScore)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    poiClassification: ").append(toIndentedString(poiClassification)).append("\n");
    sb.append("    salesVolume: ").append(toIndentedString(salesVolume)).append("\n");
    sb.append("    employeeCount: ").append(toIndentedString(employeeCount)).append("\n");
    sb.append("    yearStart: ").append(toIndentedString(yearStart)).append("\n");
    sb.append("    goodsAgentCode: ").append(toIndentedString(goodsAgentCode)).append("\n");
    sb.append("    goodsAgentCodeDescription: ").append(toIndentedString(goodsAgentCodeDescription)).append("\n");
    sb.append("    legalStatusCode: ").append(toIndentedString(legalStatusCode)).append("\n");
    sb.append("    organizationStatusCode: ").append(toIndentedString(organizationStatusCode)).append("\n");
    sb.append("    organizationStatusCodeDescription: ").append(toIndentedString(organizationStatusCodeDescription)).append("\n");
    sb.append("    subsidaryIndicator: ").append(toIndentedString(subsidaryIndicator)).append("\n");
    sb.append("    subsidaryIndicatorDescription: ").append(toIndentedString(subsidaryIndicatorDescription)).append("\n");
    sb.append("    parentBusiness: ").append(toIndentedString(parentBusiness)).append("\n");
    sb.append("    domesticUltimateBusiness: ").append(toIndentedString(domesticUltimateBusiness)).append("\n");
    sb.append("    globalUltimateIndicator: ").append(toIndentedString(globalUltimateIndicator)).append("\n");
    sb.append("    globalUltimateBusiness: ").append(toIndentedString(globalUltimateBusiness)).append("\n");
    sb.append("    familyMembers: ").append(toIndentedString(familyMembers)).append("\n");
    sb.append("    hierarchyCode: ").append(toIndentedString(hierarchyCode)).append("\n");
    sb.append("    tickerSymbol: ").append(toIndentedString(tickerSymbol)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

