

# ValidateEmailAddressInputRow


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userFields** | [**List&lt;GetPostalCodesAPIOutputUserFields&gt;**](GetPostalCodesAPIOutputUserFields.md) | These fields are returned, unmodified, in the user_fields section of the response. |  [optional]
**rtc** | **String** | Enables or disables real-time confirmation. If the deliverability of an email address cannot be determined via our knowledge base, a real-time confirmation can be attempted. |  [optional]
**bogus** | **String** | Specifies whether to check if the email address is fictitious. For example, bgates@microsoft.com. |  [optional]
**role** | **String** | Specifies whether to check if the email address has a non-personal handle, such as info@, sales@, or webmaster@. For example, sales@example.com. |  [optional]
**emps** | **String** | Specifies whether to check if the email address appears on the Direct Marketing Association&#39;s Do Not Email list (Electronic Mail Preference Service). |  [optional]
**fccwireless** | **String** | Specifies whether to check if the email address is associated with a domain that has restrictions on commercial email per the FCC. |  [optional]
**language** | **String** | Specifies whether to check if the email address handle contains derogatory words. |  [optional]
**complain** | **String** | Specifies whether to check if the owner of the email address is known to submit spam complaints. |  [optional]
**disposable** | **String** | Specifies whether to check if the email address originates from a website that provides temporary email addresses, or if the email address appears to be temporary |  [optional]
**atc** | **String** | One character code controlling the advanced suggestion behavior.The possible values are: a, c, and n |  [optional]
**emailAddress** | **String** | The email address you want to validate. |  [optional]
**rtcTimeout** | **String** | Specifies the timeout for real-time confirmation. See the description of the rtc parameter. Specify the timeout value in milliseconds. Valid values are 0 to 4000. By default, the system allows 1200 milliseconds for this check. |  [optional]



