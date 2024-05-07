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


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.PhoneVerification;
import com.precisely.apis.model.ValidatePhoneNumberAPIRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PhoneVerificationServiceApi
 */
@Ignore
public class PhoneVerificationServiceApiTest {

    private final PhoneVerificationServiceApi api = new PhoneVerificationServiceApi();

    
    /**
     * Phone verification.
     *
     * This service accepts a phone number as input and returns details distinguishing landline and wireless numbers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validatephonenumberTest() throws ApiException {
        ValidatePhoneNumberAPIRequest validatePhoneNumberAPIRequest = null;
                PhoneVerification response = api.validatephonenumber(validatePhoneNumberAPIRequest);
        // TODO: test validations
    }
    
}
