# InformationQueryResponsesApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInformationQueryResponse**](InformationQueryResponsesApi.md#addInformationQueryResponse) | **POST** /informationqueryresponses | 
[**deleteInformationQueryResponse**](InformationQueryResponsesApi.md#deleteInformationQueryResponse) | **DELETE** /informationqueryresponses/{id} | 
[**findInformationQueryResponses**](InformationQueryResponsesApi.md#findInformationQueryResponses) | **GET** /informationqueryresponses | 
[**findInformationqueryresponseById**](InformationQueryResponsesApi.md#findInformationqueryresponseById) | **GET** /informationqueryresponses/{id} | 


<a name="addInformationQueryResponse"></a>
# **addInformationQueryResponse**
> InformationQueryResponse addInformationQueryResponse(informationQueryResponse)



Creates a new informationqueryresponse

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.InformationQueryResponsesApi;


InformationQueryResponsesApi apiInstance = new InformationQueryResponsesApi();
InformationQueryResponse informationQueryResponse = new InformationQueryResponse(); // InformationQueryResponse | InformationQueryResponse to create
try {
    InformationQueryResponse result = apiInstance.addInformationQueryResponse(informationQueryResponse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InformationQueryResponsesApi#addInformationQueryResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **informationQueryResponse** | [**InformationQueryResponse**](InformationQueryResponse.md)| InformationQueryResponse to create |

### Return type

[**InformationQueryResponse**](InformationQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInformationQueryResponse"></a>
# **deleteInformationQueryResponse**
> deleteInformationQueryResponse(id)



deletes a single informationqueryresponse based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.InformationQueryResponsesApi;


InformationQueryResponsesApi apiInstance = new InformationQueryResponsesApi();
Long id = 56L; // Long | ID of informationqueryresponse to delete
try {
    apiInstance.deleteInformationQueryResponse(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InformationQueryResponsesApi#deleteInformationQueryResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of informationqueryresponse to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findInformationQueryResponses"></a>
# **findInformationQueryResponses**
> List&lt;InformationQueryResponse&gt; findInformationQueryResponses(tags, limit)



Returns all informationqueryresponses from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.InformationQueryResponsesApi;


InformationQueryResponsesApi apiInstance = new InformationQueryResponsesApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<InformationQueryResponse> result = apiInstance.findInformationQueryResponses(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InformationQueryResponsesApi#findInformationQueryResponses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;InformationQueryResponse&gt;**](InformationQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findInformationqueryresponseById"></a>
# **findInformationqueryresponseById**
> InformationQueryResponse findInformationqueryresponseById(id)



Returns a informationqueryresponse based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.InformationQueryResponsesApi;


InformationQueryResponsesApi apiInstance = new InformationQueryResponsesApi();
Long id = 56L; // Long | ID of informationqueryresponse to fetch
try {
    InformationQueryResponse result = apiInstance.findInformationqueryresponseById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InformationQueryResponsesApi#findInformationqueryresponseById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of informationqueryresponse to fetch |

### Return type

[**InformationQueryResponse**](InformationQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

