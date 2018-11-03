# InformationQuerysApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInformationQuery**](InformationQuerysApi.md#addInformationQuery) | **POST** /informationquerys | 
[**deleteInformationQuery**](InformationQuerysApi.md#deleteInformationQuery) | **DELETE** /informationquerys/{id} | 
[**findInformationQuerys**](InformationQuerysApi.md#findInformationQuerys) | **GET** /informationquerys | 
[**findInformationqueryById**](InformationQuerysApi.md#findInformationqueryById) | **GET** /informationquerys/{id} | 


<a name="addInformationQuery"></a>
# **addInformationQuery**
> InformationQuery addInformationQuery(informationQuery)



Creates a new informationquery

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.InformationQuerysApi;


InformationQuerysApi apiInstance = new InformationQuerysApi();
InformationQuery informationQuery = new InformationQuery(); // InformationQuery | InformationQuery to create
try {
    InformationQuery result = apiInstance.addInformationQuery(informationQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InformationQuerysApi#addInformationQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **informationQuery** | [**InformationQuery**](InformationQuery.md)| InformationQuery to create |

### Return type

[**InformationQuery**](InformationQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInformationQuery"></a>
# **deleteInformationQuery**
> deleteInformationQuery(id)



deletes a single informationquery based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.InformationQuerysApi;


InformationQuerysApi apiInstance = new InformationQuerysApi();
Long id = 56L; // Long | ID of informationquery to delete
try {
    apiInstance.deleteInformationQuery(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InformationQuerysApi#deleteInformationQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of informationquery to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findInformationQuerys"></a>
# **findInformationQuerys**
> List&lt;InformationQuery&gt; findInformationQuerys(tags, limit)



Returns all informationquerys from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.InformationQuerysApi;


InformationQuerysApi apiInstance = new InformationQuerysApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<InformationQuery> result = apiInstance.findInformationQuerys(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InformationQuerysApi#findInformationQuerys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;InformationQuery&gt;**](InformationQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findInformationqueryById"></a>
# **findInformationqueryById**
> InformationQuery findInformationqueryById(id)



Returns a informationquery based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.InformationQuerysApi;


InformationQuerysApi apiInstance = new InformationQuerysApi();
Long id = 56L; // Long | ID of informationquery to fetch
try {
    InformationQuery result = apiInstance.findInformationqueryById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InformationQuerysApi#findInformationqueryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of informationquery to fetch |

### Return type

[**InformationQuery**](InformationQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

