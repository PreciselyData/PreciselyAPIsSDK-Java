
# ValidateEmailAddressOutput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userFields** | [**List&lt;ValidateMailingAddressInputRowUserFields&gt;**](ValidateMailingAddressInputRowUserFields.md) | These fields are returned, unmodified, in the user_fields section of the response. |  [optional]
**EMAIL** | **String** | The email address submitted for verification. |  [optional]
**FINDING** | **String** | One character code indicating the validity of the submitted email address. |  [optional]
**COMMENT** | **String** | The comment string pertaining to the result of the submitted email address. |  [optional]
**COMMENT_CODE** | **String** | A short code which maps to each returned COMMENT field value. |  [optional]
**SUGG_EMAIL** | **String** | Suggested correction for submitted email address, if found. A suggestion will only be provided if it is valid and SafeToDeliver. |  [optional]
**SUGG_COMMENT** | **String** | This field contains suggestion not SafeToDeliver when ValidateEmailAddress corrected the address and the corrected version of the email address failed one or more SafeToDeliver process checks. |  [optional]
**ERROR_RESPONSE** | **String** | Pre-formatted response intended to be provided to user. |  [optional]
**ERROR** | **String** | Field reserved for special features only. |  [optional]
**status** | **String** |  |  [optional]
**statusCode** | **String** |  |  [optional]
**statusDescription** | **String** |  |  [optional]



