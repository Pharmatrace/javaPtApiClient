# TransportsApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTransport**](TransportsApi.md#addTransport) | **POST** /transports | 
[**deleteTransport**](TransportsApi.md#deleteTransport) | **DELETE** /transports/{id} | 
[**findTransportById**](TransportsApi.md#findTransportById) | **GET** /transports/{id} | 
[**findTransports**](TransportsApi.md#findTransports) | **GET** /transports | 


<a name="addTransport"></a>
# **addTransport**
> Transport addTransport(transport)



Creates a new transport

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.TransportsApi;


TransportsApi apiInstance = new TransportsApi();
Transport transport = new Transport(); // Transport | Transport to create
try {
    Transport result = apiInstance.addTransport(transport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransportsApi#addTransport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transport** | [**Transport**](Transport.md)| Transport to create |

### Return type

[**Transport**](Transport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTransport"></a>
# **deleteTransport**
> deleteTransport(id)



deletes a single transport based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.TransportsApi;


TransportsApi apiInstance = new TransportsApi();
Long id = 56L; // Long | ID of transport to delete
try {
    apiInstance.deleteTransport(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TransportsApi#deleteTransport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of transport to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTransportById"></a>
# **findTransportById**
> Transport findTransportById(id)



Returns a transport based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.TransportsApi;


TransportsApi apiInstance = new TransportsApi();
Long id = 56L; // Long | ID of transport to fetch
try {
    Transport result = apiInstance.findTransportById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransportsApi#findTransportById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of transport to fetch |

### Return type

[**Transport**](Transport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTransports"></a>
# **findTransports**
> List&lt;Transport&gt; findTransports(tags, limit)



Returns all transports from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.TransportsApi;


TransportsApi apiInstance = new TransportsApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<Transport> result = apiInstance.findTransports(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransportsApi#findTransports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;Transport&gt;**](Transport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

