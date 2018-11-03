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
import io.pharmatrace.api.scin.public.model.Locations;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContainerApi
 */
@Ignore
public class ContainerApiTest {

    private final ContainerApi api = new ContainerApi();

    
    /**
     * Location History
     *
     * Returns the location history of a container or a individually labeled pharmaceutical
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void locationHistoryGetTest() throws ApiException {
        String containerId = null;
        Integer offset = null;
        Integer limit = null;
        Locations response = api.locationHistoryGet(containerId, offset, limit);

        // TODO: test validations
    }
    
}
