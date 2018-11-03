/*
 * PharmaTrace Supply Chain Information Network API
 * The PharmaTrace SCIN API provides network members a resource and process oriented access to the blockchain backed market and inventory information. It represents a layer of abstraction above the Hyperledger network to facilitate a business focused development of clients and integration systems without the need to directly connect to Hyperledger nodes.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: api@pharmatrace.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.pharmatrace.api.scin.public.api;

import io.pharmatrace.api.scin.public.ApiException;
import io.pharmatrace.api.scin.public.model.Error;
import io.pharmatrace.api.scin.public.model.Profile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * User Profile
     *
     * The User Profile endpoint returns information about the PharmaTrace user that has authorized with the application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void meGetTest() throws ApiException {
        Profile response = api.meGet();

        // TODO: test validations
    }
    
}