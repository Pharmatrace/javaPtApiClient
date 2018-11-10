# RepackagesApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRepackage**](RepackagesApi.md#addRepackage) | **POST** /repackages | 
[**deleteRepackage**](RepackagesApi.md#deleteRepackage) | **DELETE** /repackages/{id} | 
[**findRepackageById**](RepackagesApi.md#findRepackageById) | **GET** /repackages/{id} | 
[**findRepackages**](RepackagesApi.md#findRepackages) | **GET** /repackages | 


<a name="addRepackage"></a>
# **addRepackage**
> Repackage addRepackage(repackage)



Creates a new repackage

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.RepackagesApi;


RepackagesApi apiInstance = new RepackagesApi();
Repackage repackage = new Repackage(); // Repackage | Repackage to create
try {
    Repackage result = apiInstance.addRepackage(repackage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepackagesApi#addRepackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repackage** | [**Repackage**](Repackage.md)| Repackage to create |

### Return type

[**Repackage**](Repackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRepackage"></a>
# **deleteRepackage**
> deleteRepackage(id)



deletes a single repackage based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.RepackagesApi;


RepackagesApi apiInstance = new RepackagesApi();
Long id = 56L; // Long | ID of repackage to delete
try {
    apiInstance.deleteRepackage(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RepackagesApi#deleteRepackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of repackage to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findRepackageById"></a>
# **findRepackageById**
> Repackage findRepackageById(id)



Returns a repackage based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.RepackagesApi;


RepackagesApi apiInstance = new RepackagesApi();
Long id = 56L; // Long | ID of repackage to fetch
try {
    Repackage result = apiInstance.findRepackageById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepackagesApi#findRepackageById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of repackage to fetch |

### Return type

[**Repackage**](Repackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findRepackages"></a>
# **findRepackages**
> List&lt;Repackage&gt; findRepackages(tags, limit)



Returns all repackages from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.RepackagesApi;


RepackagesApi apiInstance = new RepackagesApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<Repackage> result = apiInstance.findRepackages(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepackagesApi#findRepackages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;Repackage&gt;**](Repackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

