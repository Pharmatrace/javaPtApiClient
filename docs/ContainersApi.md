# ContainersApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContainer**](ContainersApi.md#addContainer) | **POST** /containers | 
[**deleteContainer**](ContainersApi.md#deleteContainer) | **DELETE** /containers/{id} | 
[**findContainerById**](ContainersApi.md#findContainerById) | **GET** /containers/{id} | 
[**findContainers**](ContainersApi.md#findContainers) | **GET** /containers | 


<a name="addContainer"></a>
# **addContainer**
> Container addContainer(container)



Creates a new container

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ContainersApi;


ContainersApi apiInstance = new ContainersApi();
Container container = new Container(); // Container | Container to create
try {
    Container result = apiInstance.addContainer(container);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainersApi#addContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **container** | [**Container**](Container.md)| Container to create |

### Return type

[**Container**](Container.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContainer"></a>
# **deleteContainer**
> deleteContainer(id)



deletes a single container based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ContainersApi;


ContainersApi apiInstance = new ContainersApi();
Long id = 56L; // Long | ID of container to delete
try {
    apiInstance.deleteContainer(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainersApi#deleteContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of container to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findContainerById"></a>
# **findContainerById**
> Container findContainerById(id)



Returns a container based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ContainersApi;


ContainersApi apiInstance = new ContainersApi();
Long id = 56L; // Long | ID of container to fetch
try {
    Container result = apiInstance.findContainerById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainersApi#findContainerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of container to fetch |

### Return type

[**Container**](Container.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findContainers"></a>
# **findContainers**
> List&lt;Container&gt; findContainers(tags, limit)



Returns all containers from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ContainersApi;


ContainersApi apiInstance = new ContainersApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<Container> result = apiInstance.findContainers(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainersApi#findContainers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;Container&gt;**](Container.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

