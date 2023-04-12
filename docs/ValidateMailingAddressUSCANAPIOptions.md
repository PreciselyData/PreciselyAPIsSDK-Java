

# ValidateMailingAddressUSCANAPIOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outputAddressBlocks** | **String** | Specifies whether to return a formatted version of the address. |  [optional]
**performUSProcessing** | **String** | Specifies whether or not to process U.S. addresses. |  [optional]
**performDPV** | **String** | Delivery Point Validation (DPV®) validates that a specific address exists |  [optional]
**outputFormattedOnFail** | **String** | Specifies whether to return a formatted address when an address cannot be validated. |  [optional]
**outputPostalCodeSeparator** | **String** | Specifies whether to use separators (spaces or hyphens) in ZIP™ Codes or Canadian postal codes. |  [optional]
**outputCountryFormat** | **String** | Specifies the format to use for the country name returned in the Country output field. |  [optional]
**keepMultimatch** | **String** | Indicates whether to return multiple address for input addresses that have more than one possible matches. |  [optional]
**outputCasing** | **String** | Specifies the casing of the output address. M for mixed case and U for upper case. |  [optional]
**maximumResults** | **String** | Specifies a number between 1 and 10 that indicates the maximum number of addresses to be returned. |  [optional]
**outputRecordType** | **String** | Specifies the type of the output record. |  [optional]
**outputFieldLevelReturnCodes** | **String** | Identifies which output addresses are candidate addresses as value if Y for OutputFieldLevelReturnCodes. |  [optional]
**dpVDetermineNoStat** | **String** | Determines the no stat status of an address which means it exists but cannot receive mails. |  [optional]
**streetMatchingStrictness** | **String** | Specifies the algorithm to determe if an input address matches in the postal database. |  [optional]
**canFrenchApartmentLabel** | **String** | Specifies the default apartment label for the output if there is no apartment label in the input address. This is specific to French address.  |  [optional]
**outputAbbreviatedAlias** | **String** | Specifies whether to use a street&#39;s abbreviated alias in the output if the output address line is longer than 31 characters. |  [optional]
**dpVSuccessfulStatusCondition** | **String** | Selecting the match condition where a DPV result does NOT cause a record to fail. |  [optional]
**standardAddressPMBLine** | **String** | Specifies where Private Mailbox (PMB) information is placed. |  [optional]
**firmMatchingStrictness** | **String** | Specifies the algorithm to determining if an input address matches in the postal database. |  [optional]
**canRuralRouteFormat** | **String** | Specifies where to place rural route delivery information. |  [optional]
**canPreferHouseNum** | **String** | Specifies whether to select a house number of postal code in case of conflict. |  [optional]
**outputPreferredAlias** | **String** | Specifies whether to use a street&#39;s preferred alias in the output. |  [optional]
**directionalMatchingStrictness** | **String** | Specifies the algorithm to determine if an input address matches in the postal database. |  [optional]
**extractFirm** | **String** | Specifies whether to extract the firm name from AddressLine1 through AddressLine4 and place it in the FirmName output field. |  [optional]
**failOnCMRAMatch** | **String** | Specifies whether to consider Treat Commercial Mail Receiving Agency (CMRA) matches as failures? |  [optional]
**canNonCivicFormat** | **String** | Specifies whether or not non-civic keywords are abbreviated in the output.  |  [optional]
**canSSLVRFlg** | **String** | Changes the civic and/or suite information to match the LVR or single-single record. |  [optional]
**outputStreetNameAlias** | **String** | Specifies how to handle street name aliases used in the input. This is specific to US. |  [optional]
**performEWS** | **String** | Specifies the Early Warning System (EWS) that uses the USPS EWS File to validate addresses that are not in the ZIP + 4 database. |  [optional]
**canOutputCityFormat** | **String** | Specifies whether to use the long, medium, or short version of the city if the city has a long name. |  [optional]
**dualAddressLogic** | **String** | Specifies how to return a match if multiple non-blank address lines are present or multiple address types are on the same address line. (U.S. addresses only.) |  [optional]
**performSuiteLink** | **String** | Specifies whether to perform SuiteLink processing. |  [optional]
**canStandardAddressFormat** | **String** | Specifies where to place secondary address information in the output address. |  [optional]
**outputPreferredCity** | **String** | Specifies whether the preferred last line city name should be stored. |  [optional]
**outputMultinationalCharacters** | **String** | Specifies whether to return multinational characters, including diacritical marks such as umlauts or accents. |  [optional]
**canDeliveryOfficeFormat** | **String** | Specifies where to place station information. |  [optional]
**performLACSLink** | **String** | Facilitates the conversion of rural route address converting into street-style address using the LACS. |  [optional]
**canDualAddressLogic** | **String** | Specifies whether ValidateMailingAddressUSCAN should return a street match or a PO Box/non-civic match when the address contains both civic and non-civic information. |  [optional]
**extractUrb** | **String** | Specifies whether to extract the urbanization name from AddressLine1 through AddressLine4 and place it in the USUrbanName output field.  |  [optional]
**standardAddressFormat** | **String** | Specifies where to place secondary address information for U.S. addresses. |  [optional]
**canFrenchFormat** | **String** | Specifies how to determine the language (English or French) to use to format the address and directional. |  [optional]
**dpVDetermineVacancy** | **String** | Determines if the location has been unoccupied for at least 90 days. |  [optional]
**canEnglishApartmentLabel** | **String** | Specifies the default apartment label to use in the output if there is no apartment label in the input address. rhis is specific to English addresses. |  [optional]
**suppressZplusPhantomCarrierR777** | **String** | Specifies whether to supress addresses with Carrier Route R777. |  [optional]
**canOutputCityAlias** | **String** | Specifies whether or not to return the city alias when the alias is in the input address. |  [optional]
**outputShortCityName** | **String** | Specifies how to format city names that have short city name or non-mailing city name alternatives. |  [optional]



