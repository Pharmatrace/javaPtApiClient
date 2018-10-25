# SystemInformationsApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSystemInformation**](SystemInformationsApi.md#addSystemInformation) | **POST** /systeminformations | 
[**deleteSystemInformation**](SystemInformationsApi.md#deleteSystemInformation) | **DELETE** /systeminformations/{id} | 
[**findSystemInformations**](SystemInformationsApi.md#findSystemInformations) | **GET** /systeminformations | 
[**findSysteminformationById**](SystemInformationsApi.md#findSysteminformationById) | **GET** /systeminformations/{id} | 


<a name="addSystemInformation"></a>
# **addSystemInformation**
> SystemInformation addSystemInformation(systemInformation)



Creates a new systeminformation

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.SystemInformationsApi;


SystemInformationsApi apiInstance = new SystemInformationsApi();
SystemInformation systemInformation = new SystemInformation(); // SystemInformation | SystemInformation to create
try {
    SystemInformation result = apiInstance.addSystemInformation(systemInformation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemInformationsApi#addSystemInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemInformation** | [**SystemInformation**](SystemInformation.md)| SystemInformation to create |

### Return type

[**SystemInformation**](SystemInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSystemInformation"></a>
# **deleteSystemInformation**
> deleteSystemInformation(id)



deletes a single systeminformation based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.SystemInformationsApi;


SystemInformationsApi apiInstance = new SystemInformationsApi();
Long id = 56L; // Long | ID of systeminformation to delete
try {
    apiInstance.deleteSystemInformation(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemInformationsApi#deleteSystemInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of systeminformation to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findSystemInformations"></a>
# **findSystemInformations**
> List&lt;SystemInformation&gt; findSystemInformations(tags, limit)



Returns all systeminformations from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.SystemInformationsApi;


SystemInformationsApi apiInstance = new SystemInformationsApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<SystemInformation> result = apiInstance.findSystemInformations(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemInformationsApi#findSystemInformations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;SystemInformation&gt;**](SystemInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findSysteminformationById"></a>
# **findSysteminformationById**
> SystemInformation findSysteminformationById(id)



Returns a systeminformation based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.SystemInformationsApi;


SystemInformationsApi apiInstance = new SystemInformationsApi();
Long id = 56L; // Long | ID of systeminformation to fetch
try {
    SystemInformation result = apiInstance.findSysteminformationById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemInformationsApi#findSysteminformationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of systeminformation to fetch |

### Return type

[**SystemInformation**](SystemInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

