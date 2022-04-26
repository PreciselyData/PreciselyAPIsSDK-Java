

# ValidateMailingAddressProOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userFields** | [**List&lt;GetPostalCodesAPIOutputUserFields&gt;**](GetPostalCodesAPIOutputUserFields.md) | These fields are returned, unmodified, in the user_fields section of the response. |  [optional]
**addressLine1** | **String** | The first line of the validated address. |  [optional]
**addressLine2** | **String** | The second line of the validated address. |  [optional]
**firmName** | **String** | The validated firm or company name. |  [optional]
**changeScore** | **String** | A value of 0 and 100 that reflects how much the address has changed to make it valid. |  [optional]
**locality** | **String** | Generally a locality is a village in rural areas or it may be a suburb in urban areas. |  [optional]
**suburb** | **String** | The suburb name. |  [optional]
**addressType** | **String** | A single letter code that indicates the type of address. |  [optional]
**deliverability** | **String** | An estimate of confidence that an item mailed or shipped to this address would be successfully delivered. |  [optional]
**addressQuality** | **String** | A two character code indicating overall quality of the resulting address. |  [optional]
**couldNotValidate** | **String** | Mentions the address component that could not be validated, in case no match is found. |  [optional]
**city** | **String** | The validated city name. |  [optional]
**postalCode** | **String** | The validated ZIP Code or postal code. |  [optional]
**country** | **String** | The country in the format determined by what you selected. |  [optional]
**stateProvince** | **String** | The validated state or province abbreviation. |  [optional]
**blockAddress** | **String** | The formatted address, as it would appear on a physical mail piece. |  [optional]
**additionalInputData** | **String** | Input data that could not be matched to a particular address component. |  [optional]
**postalCodeBase** | **String** | The 5-digit ZIP Code. |  [optional]
**postalCodeAddOn** | **String** | The 4-digit add-on part of the ZIP Code. |  [optional]
**status** | **String** | Reports the success or failure of the match attempt. |  [optional]
**statusCode** | **String** | Reason for failure, if there is one. |  [optional]
**statusDescription** | **String** | Description of the problem, if there is one. |  [optional]



