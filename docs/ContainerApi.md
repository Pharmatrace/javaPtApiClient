# ContainerApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationHistoryGet**](ContainerApi.md#locationHistoryGet) | **GET** /locationHistory | Location History


<a name="locationHistoryGet"></a>
# **locationHistoryGet**
> Locations locationHistoryGet(containerId, offset, limit)

Location History

Returns the location history of a container or a individually labeled pharmaceutical

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.ContainerApi;


ContainerApi apiInstance = new ContainerApi();
String containerId = "containerId_example"; // String | container id of the tracked container.
Integer offset = 56; // Integer | Offset the list of returned results by this amount. Default is zero.
Integer limit = 56; // Integer | Number of items to retrieve. Default is 5, maximum is 100.
try {
    Locations result = apiInstance.locationHistoryGet(containerId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#locationHistoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| container id of the tracked container. | [optional]
 **offset** | **Integer**| Offset the list of returned results by this amount. Default is zero. | [optional]
 **limit** | **Integer**| Number of items to retrieve. Default is 5, maximum is 100. | [optional]

### Return type

[**Locations**](Locations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

