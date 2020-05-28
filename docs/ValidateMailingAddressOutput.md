
# ValidateMailingAddressOutput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userFields** | [**List&lt;ValidateMailingAddressInputRowUserFields&gt;**](ValidateMailingAddressInputRowUserFields.md) | These fields are returned, unmodified, in the user_fields section of the response. |  [optional]
**addressLine1** | **String** | The first line of the validated address. |  [optional]
**addressLine2** | **String** | The second line of the validated address. |  [optional]
**firmName** | **String** | The validated firm or company name. |  [optional]
**city** | **String** | The validated city name. |  [optional]
**postalCode** | **String** | The validated ZIP Code or postal code. |  [optional]
**country** | **String** | The country name in English. |  [optional]
**stateProvince** | **String** | The validated state or province abbreviation. |  [optional]
**blockAddress** | **String** | The formatted address, as it would appear on a physical mail piece. |  [optional]
**additionalInputData** | **String** | Input data not used by the address validation process. |  [optional]
**postalCodeBase** | **String** | The 5-digit ZIP Code. |  [optional]
**postalCodeAddOn** | **String** | The 4-digit add-on part of the ZIP Code. |  [optional]
**status** | **String** | Reports the success or failure of the match attempt. |  [optional]
**statusCode** | **String** | Reason for failure, if there is one. |  [optional]
**statusDescription** | **String** | Description of the problem, if there is one. |  [optional]



