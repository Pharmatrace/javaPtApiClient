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

import io.pharmatrace.api.scin.pub.ApiCallback;
import io.pharmatrace.api.scin.pub.ApiClient;
import io.pharmatrace.api.scin.pub.ApiException;
import io.pharmatrace.api.scin.pub.ApiResponse;
import io.pharmatrace.api.scin.pub.Configuration;
import io.pharmatrace.api.scin.pub.Pair;
import io.pharmatrace.api.scin.pub.ProgressRequestBody;
import io.pharmatrace.api.scin.pub.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.pharmatrace.api.scin.pub.model.Error;
import io.pharmatrace.api.scin.pub.model.Locations;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainerApi {
    private ApiClient apiClient;

    public ContainerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContainerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for locationHistoryGet
     * @param containerId container id of the tracked container. (optional)
     * @param offset Offset the list of returned results by this amount. Default is zero. (optional)
     * @param limit Number of items to retrieve. Default is 5, maximum is 100. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call locationHistoryGetCall(String containerId, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/locationHistory";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (containerId != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("container_id", containerId));
        }

        if (offset != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call locationHistoryGetValidateBeforeCall(String containerId, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = locationHistoryGetCall(containerId, offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Location History
     * Returns the location history of a container or a individually labeled pharmaceutical
     * @param containerId container id of the tracked container. (optional)
     * @param offset Offset the list of returned results by this amount. Default is zero. (optional)
     * @param limit Number of items to retrieve. Default is 5, maximum is 100. (optional)
     * @return Locations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Locations locationHistoryGet(String containerId, Integer offset, Integer limit) throws ApiException {
        ApiResponse<Locations> resp = locationHistoryGetWithHttpInfo(containerId, offset, limit);
        return resp.getData();
    }

    /**
     * Location History
     * Returns the location history of a container or a individually labeled pharmaceutical
     * @param containerId container id of the tracked container. (optional)
     * @param offset Offset the list of returned results by this amount. Default is zero. (optional)
     * @param limit Number of items to retrieve. Default is 5, maximum is 100. (optional)
     * @return ApiResponse&lt;Locations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Locations> locationHistoryGetWithHttpInfo(String containerId, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = locationHistoryGetValidateBeforeCall(containerId, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<Locations>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Location History (asynchronously)
     * Returns the location history of a container or a individually labeled pharmaceutical
     * @param containerId container id of the tracked container. (optional)
     * @param offset Offset the list of returned results by this amount. Default is zero. (optional)
     * @param limit Number of items to retrieve. Default is 5, maximum is 100. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call locationHistoryGetAsync(String containerId, Integer offset, Integer limit, final ApiCallback<Locations> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = locationHistoryGetValidateBeforeCall(containerId, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Locations>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}