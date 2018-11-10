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


package io.pharmatrace.api.scin.pub.api;

import io.pharmatrace.api.scin.pub.ApiException;
import io.pharmatrace.api.scin.pub.model.Error;
import io.pharmatrace.api.scin.pub.model.InformationQuery;
import io.pharmatrace.api.scin.pub.model.Transaction;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InformationQuerysApi
 */
@Ignore
public class InformationQuerysApiTest {

    private final InformationQuerysApi api = new InformationQuerysApi();

    
    /**
     * 
     *
     * Creates a new informationquery
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInformationQueryTest() throws ApiException {
        InformationQuery informationQuery = null;
        InformationQuery response = api.addInformationQuery(informationQuery);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * deletes a single informationquery based on the ID supplied
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInformationQueryTest() throws ApiException {
        Long id = null;
        api.deleteInformationQuery(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all informationquerys from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findInformationQuerysTest() throws ApiException {
        List<String> tags = null;
        Integer limit = null;
        List<InformationQuery> response = api.findInformationQuerys(tags, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a informationquery based on the ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findInformationqueryByIdTest() throws ApiException {
        Long id = null;
        InformationQuery response = api.findInformationqueryById(id);

        // TODO: test validations
    }
    
}
